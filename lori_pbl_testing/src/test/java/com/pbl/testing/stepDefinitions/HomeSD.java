package com.pbl.testing.stepDefinitions;

import com.pbl.testing.utils.GlobalVarianbles;
import org.openqa.selenium.WebDriver;

import com.pbl.testing.utils.TestBase;
import com.pbl.testing.pages.HomeObjs;

import io.cucumber.java.en.Given;


import static com.pbl.testing.stepDefinitions.Hooks.addScreenCapture;
import static com.pbl.testing.utils.configUtils.getEnvUrl;


public class HomeSD 
{
	private TestBase base;
	HomeObjs homeObj;
	WebDriver driver;
	
	public HomeSD(TestBase base)
	{
		this.base = base;
		this.driver = base.getDriver();
		homeObj = new HomeObjs(base);
	}
	
	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Throwable 
	{
		String url = getEnvUrl();
		driver.get(url);
		addScreenCapture();
	}
}
