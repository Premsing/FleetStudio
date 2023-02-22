package com.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;

public class ValidateDefendantInfo extends BaseClass {

	@Test
	public void verifyDefendantName() {

		homePage.clickRecentLawsuitsLink();

		Assert.assertEquals(lawsuitsPage.getDefendantName(), "Atwood Distributing, L.P.");

	}

	@Test
	public void verifyDefendantWebsite() {

		homePage.clickRecentLawsuitsLink();

		Assert.assertEquals(lawsuitsPage.getDefendantWebsite(), "www.atwoods.com");

	}

	@Test
	public void verifyDefendantIndustry() {

		homePage.clickRecentLawsuitsLink();

		Assert.assertEquals(lawsuitsPage.getDefendantIndustry(), "Consumer Discretionary");

	}

	@Test
	public void verifyDefendantSummary() {

		homePage.clickRecentLawsuitsLink();

		Assert.assertEquals(lawsuitsPage.getDefendantSummary(),
				"Atwoods Ranch & Home is a home store serving you with 72 stores in Oklahoma, Arkansas, Missouri, Texas, & Kansas.");

	}

}
