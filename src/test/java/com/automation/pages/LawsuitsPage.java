package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LawsuitsPage {

	WebDriver driver;

	public LawsuitsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='plaintiff_block']//li[1]")
	WebElement name;

	@FindBy(xpath = "//div[@class='plaintiff_block']//li[2]")
	WebElement filingDate;

	@FindBy(xpath = "//div[@class='plaintiff_block']//li[3]")
	WebElement stateOfFiling;

	@FindBy(xpath = "//div[@class='defendant_block']//li[1]")
	WebElement dName;

	@FindBy(xpath = "//div[@class='defendant_block']//li[2]")
	WebElement website;

	@FindBy(xpath = "//div[@class='defendant_block']//li[3]")
	WebElement industry;

	@FindBy(xpath = "//div[@class='defendant_block']//li[4]")
	WebElement summary;

	public String getPlaintiffName() {

		String text = name.getText();
		return text.substring(6);

	}

	public String getPlaintiffFileDate() {

		String text = filingDate.getText();
		return text.substring(13);

	}

	public String getPlaintiffStateOfFiling() {

		String text = stateOfFiling.getText();
		return text.substring(17);

	}
	
	public String getDefendantName() {

		String text = dName.getText();
		return text.substring(6);

	}
	
	public String getDefendantWebsite() {

		String text = website.getText();
		return text.substring(9);

	}
	
	public String getDefendantIndustry() {

		String text = industry.getText();
		return text.substring(10);

	}
	
	public String getDefendantSummary() {

		String text = summary.getText();
		return text.substring(9);

	}

}
