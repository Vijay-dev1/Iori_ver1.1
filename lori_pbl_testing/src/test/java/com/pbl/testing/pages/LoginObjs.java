package com.pbl.testing.pages;

import com.pbl.testing.utils.CommonWrapper;
import com.pbl.testing.utils.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class LoginObjs 
{

	By userNameId = By.id("nextOrSubmitBtn");

	public LoginObjs(TestBase base)
	{
	    PageFactory.initElements(base.getDriver(), this);
		CommonWrapper commonwrapper = new CommonWrapper(base);
	}
	
	public void clickLoginLnk()
	{
		System.out.println("Tetsing");
		CommonWrapper.click(userNameId);
	}
}
