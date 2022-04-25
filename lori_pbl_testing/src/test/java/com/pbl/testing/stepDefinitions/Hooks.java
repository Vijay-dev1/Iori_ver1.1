package com.pbl.testing.stepDefinitions;


import com.pbl.testing.utils.TestBase;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.service.ExtentTestManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks
{
	WebDriver driver;
	static TestBase base;
	
	public Hooks(TestBase base)
	{
		this.base = base;
	}
	
	public static String getBase64Screenshot()
	{
		return ((TakesScreenshot) base.getDriver()).getScreenshotAs(OutputType.BASE64);
	}


	@Before
	public void bf()
	{
		base.setDriver();
	}
	
    	
	@After
	public void af(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			ExtentTestManager.getTest().addScreenCaptureFromBase64String(getBase64Screenshot());
		}
		base.getDriver().quit();
	}
	static public void addScreenCapture() throws InterruptedException {
		Thread.sleep(2000);
		ExtentTestManager.getTest().addScreenCaptureFromBase64String(getBase64Screenshot());
	}
	
}
