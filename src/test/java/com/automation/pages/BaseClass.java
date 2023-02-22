package com.automation.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {

	public HomePage homePage;
	public ChromeDriver driver;
	public LawsuitsPage lawsuitsPage;
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeSuite
	public void reporting() {
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(new File("./Reports/DAL.html"));
		report = new ExtentReports();
		report.attachReporter(reporter);
		
	}

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.accessibility.com/digital-lawsuits");
		homePage = new HomePage(driver);
		lawsuitsPage = new LawsuitsPage(driver);
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws InterruptedException, IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(src, new File("./Screenshots/" + result.getName() + ".png"));

		}

		driver.close();
		report.flush();
	}

}
