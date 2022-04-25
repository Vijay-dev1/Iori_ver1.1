package com.pbl.testing.utils;

public class GlobalVarianbles
{
	public static final String GLUE = "com.pbl.testing.stepDefinitions";
	public static final String TAGS = "@SmokeTest";
	public static final String FEATURES = "src/test/resources/features";
	public final static String MAC_CHROME_DRIVER = System.getProperty("user.dir") + "//drivers//chromedriverm";
	public final static String WINDOWS_CHROME_DRIVER = System.getProperty("user.dir") + "//drivers//chromedriver.exe";
	public static String envConfigFile = "src/test/resources/env/qaweb.xml";
	public static String envDriverPath = "src/test/resources/webdriver/";
	public String env = "stg";
	public static String device = "win";
}
