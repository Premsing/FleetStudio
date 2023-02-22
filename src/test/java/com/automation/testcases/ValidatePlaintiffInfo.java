package com.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;

public class ValidatePlaintiffInfo extends BaseClass {

	@Test
	public void verifyPlaintiffName() {

		logger = report.createTest("Validate Plaintiff Info");

		homePage.clickRecentLawsuitsLink();

		logger.info("Navigating to Lawsuits Page");

		Assert.assertEquals(lawsuitsPage.getPlaintiffName(), "ANDREW TORO");

		logger.pass("Name validation was successful");

	}

	@Test
	public void verifyPlaintiffFIleDate() {

		logger = report.createTest("Validate FIle Date");

		logger.info("Navigating to Lawsuits Page");

		homePage.clickRecentLawsuitsLink();

		Assert.assertEquals(lawsuitsPage.getPlaintiffFileDate(), "January 31, 2023");

		logger.pass("File Date validation was successful");

	}

	@Test
	public void verifyPlaintiffStateOfFiling() {

		logger = report.createTest("Validate FIle State");

		logger.info("Navigating to Lawsuits Page");

		homePage.clickRecentLawsuitsLink();

//		Assert.assertEquals(lawsuitsPage.getPlaintiffStateOfFiling(), "Vintage York");

		logger.fail("State of filing validation was unsucessful");

	}

}
