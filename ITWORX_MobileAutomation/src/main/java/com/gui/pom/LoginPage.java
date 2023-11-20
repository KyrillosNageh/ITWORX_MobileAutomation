package com.gui.pom;

import org.openqa.selenium.By;


import com.shaft.driver.SHAFT;

public class LoginPage {

	/****************************************************************************
	*  >>	Variables
	*****************************************************************************/
	private static SHAFT.GUI.WebDriver  driver;

	
	/****************************************************************************
	*  >>	Constructor
	*****************************************************************************/
	public LoginPage (SHAFT.GUI.WebDriver  driver)
	{
		LoginPage.driver =driver;
	}
	
	/****************************************************************************
	*  >>	Locators
	*****************************************************************************/
    private final static By getStarted_Btn = By.id("com.itworx.winjigoteacher:id/buttonSignIn");
    private final static By email_Textbox = By.id("com.itworx.winjigoteacher:id/emailView");
    private final static By password_Textbox = By.id("com.itworx.winjigoteacher:id/passwordView");
    private final static By login_Btn = By.id("com.itworx.winjigoteacher:id/buttonLogin");
    
	/****************************************************************************
	*  >>	Keywords
	*****************************************************************************/
    public HomePage login(String username, String Password) {
	   driver.element()
	   .click(getStarted_Btn)
	   .type(email_Textbox, username)
	   .type(password_Textbox, Password)
	   .click(login_Btn);
	   return new HomePage(driver);
   }
}
