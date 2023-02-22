package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(partialLinkText = "ANDREW TORO v. Atwoo")
	private WebElement recentLawsuitsLink;
	
	@FindBy(id="hs-eu-confirmation-button")
	WebElement acceptCookie; 

	public void clickRecentLawsuitsLink() {
		
		acceptCookie.click();
		recentLawsuitsLink.click();
	}

}
