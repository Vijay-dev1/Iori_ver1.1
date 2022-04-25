package com.pbl.testing.stepDefinitions;

import com.pbl.testing.pages.LoginObjs;
import com.pbl.testing.utils.TestBase;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;

public class LoginSD 
{
	TestBase base;
	WebDriver driver;
	LoginObjs loginObj;
	
	public LoginSD(TestBase base)
	{
		this.base = base;
		this.driver = base.getDriver();
		loginObj = new LoginObjs(base);
	}

	@When("I click on Login link")
	public void i_click_on_shop_now_btn() 
	{
		loginObj.clickLoginLnk();
	}
}
