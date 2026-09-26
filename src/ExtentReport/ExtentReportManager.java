package ExtentReport;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

	 public static ExtentReports getReportObject() {

	        String reportPath = System.getProperty("user.dir")
	                + File.separator + "reports"
	                + File.separator + "ExtentReport.html";

	        ExtentSparkReporter sparkReporter =
	                new ExtentSparkReporter(reportPath);

	        sparkReporter.config().setReportName("Automation Test Report");
	        sparkReporter.config().setDocumentTitle("Selenium Automation Results");

	        ExtentReports extent = new ExtentReports();

	        extent.attachReporter(sparkReporter);

	        extent.setSystemInfo("Tester", "Aashana");
	        extent.setSystemInfo("Environment", "QA");
	        extent.setSystemInfo("Browser", "Chrome");

	        return extent;
	    }
}
