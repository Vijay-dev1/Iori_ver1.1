package com.pbl.testing.utils;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( 
        tags = ("@SmokeTest"),
        glue = {GlobalVarianbles.GLUE},
        features = {GlobalVarianbles.FEATURES})

public class RunCucumberTest extends AbstractTestNGCucumberTests 
{	

}
