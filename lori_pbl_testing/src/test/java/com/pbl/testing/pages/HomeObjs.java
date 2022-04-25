package com.pbl.testing.pages;

import com.pbl.testing.utils.CommonWrapper;
import com.pbl.testing.utils.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class HomeObjs
{
	By shopNowBtn = By.xpath("(//div[@class='slider-contain']//a)[3]");
	
	public HomeObjs(TestBase base)
	{
	    PageFactory.initElements(base.getDriver(), this);
	}
	
	public void clickShopNowBtn()
	{
		CommonWrapper.click(shopNowBtn);
	}

}
