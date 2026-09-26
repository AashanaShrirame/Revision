pipeline {
    agent any

 /*  Schedule	Cron expression
Every day at 2 AM	H 2 * * *
Every hour	H * * * *
Every 15 minutes	H/15 * * * *
Every weekday at 9 AM	H 9 * * 1-5
Every Monday at 6 AM	H 6 * * 1*/

    triggers { 
		cron('H/15 * * * *') // runs after each 15 min
	}

    tools {
        maven 'mymaven'   // Name must match what you configured in Manage Jenkins > Tools
        jdk 'myjava'      // Same here
    }

    options {
        timestamps()
        buildDiscarder(logRotator(numToKeepStr: '10'))
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/AashanaShrirame/Revision.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package -DskipTests'
            }
        }

        stage('Archive') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo 'Build succeeded!'
        }
        failure {
            echo 'Build failed — check console output.'
        }
    }
}