pipeline {
    agent any

 /*  Schedule	Cron expression
Every day at 2 AM	H 2 * * *
Every hour	H * * * *
Every 15 minutes	H/15 * * * *
Every weekday at 9 AM	H 9 * * 1-5
Every Monday at 6 AM	H 6 * * 1*/

   
    parameters {
        choice(
            name: 'ENVIRONMENT',
            choices: ['dev', 'staging', 'prod'],
            description: 'Select the environment to run tests against'
        )
        choice(
            name: 'BROWSER',
            choices: ['chrome', 'firefox', 'edge'],
            description: 'Select browser for Selenium execution'
        )
        string(
            name: 'BRANCH_NAME',
            defaultValue: 'main',
            description: 'Git branch to checkout'
        )
        booleanParam(
            name: 'SKIP_TESTS',
            defaultValue: false,
            description: 'Check to skip test execution'
        )
        text(
            name: 'RELEASE_NOTES',
            defaultValue: '',
            description: 'Optional release notes for this build'
        )

    }

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
            echo 'Test execution succeeded!'
        }
        failure {
            echo 'Test execution failed — check console output.'
        }
    }
}