package com.qa.tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class customListener implements ITestListener {
	
public ExtentSparkReporter sparkreporter;
public ExtentReports extent;
public ExtentTest test;

public void onStart(ITestContext context) {
	sparkreporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/myreport.html");
	sparkreporter.config().setDocumentTitle("Automation Report");
	sparkreporter.config().setReportName("Functional testing");
	sparkreporter.config().setTheme(Theme.DARK);
	
	extent=new ExtentReports();
	extent.attachReporter(sparkreporter);
	extent.setSystemInfo("os","window10");
	extent.setSystemInfo("TesterName","priyanka");
}
public void onTestSuccess(ITestResult result) {
	test=extent.createTest(result.getName());
	test.log(Status.PASS,"Test case Passed is:"+result.getName());
}
public void onTestFailure(ITestResult result) {
	
	test=extent.createTest(result.getName());
	test.log(Status.FAIL,"Test case FAILED is:"+result.getName());
	test.log(Status.FAIL,"Test case FAILED cause is:"+result.getThrowable());
}
public void onTestSkipped(ITestResult result) {
	test=extent.createTest(result.getName());
	test.log(Status.SKIP,"Test case Passed is:"+result.getName());
}
public void onFinish(ITestContext context) {
extent.flush();
}
}

