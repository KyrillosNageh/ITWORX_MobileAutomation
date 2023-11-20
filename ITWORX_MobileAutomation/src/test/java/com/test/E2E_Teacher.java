package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.gui.pom.LoginPage;
import com.shaft.driver.SHAFT;

import io.appium.java_client.remote.AutomationName;

public class E2E_Teacher {
	SHAFT.GUI.WebDriver driver;
	SHAFT.TestData.JSON testData;


	@Test
	public void VerifyLoginWithTeacherAccount() {
		new LoginPage(driver).login(testData.getTestData("email"), testData.getTestData("password"))
		.skip()
		.selectCourse(testData.getTestData("course"));
	}
	
    @BeforeClass
    public void beforeClass() {
    	SHAFT.Properties.mobile.set().automationName(AutomationName.ANDROID_UIAUTOMATOR2);
    	SHAFT.Properties.platform.set().executionAddress("localhost:4723");
    	SHAFT.Properties.browserStack.set().deviceName("Nexus6P");
    	SHAFT.Properties.mobile.set().app("src/test/resources/app/tk Teacher 20231181213 staging.apk");

    	driver = new SHAFT.GUI.WebDriver();
        testData = new SHAFT.TestData.JSON("Teacher.json");

    	}
    
    @AfterClass(alwaysRun = true)
    public void afterClass(){
    	driver.quit();
    	}
}
