package com.gui.pom;

import org.openqa.selenium.By;
import com.shaft.driver.SHAFT;

public class HomePage {

	/****************************************************************************
	*  >>	Variables
	*****************************************************************************/
	private static SHAFT.GUI.WebDriver  driver;

	
	/****************************************************************************
	*  >>	Constructor
	*****************************************************************************/
	public HomePage (SHAFT.GUI.WebDriver  driver)
	{
		HomePage.driver =driver;
	}
	
	/****************************************************************************
	*  >>	Locators
	*****************************************************************************/
    private final static By courses_Btn = By.id("com.itworx.winjigoteacher:id/tab_courses_id");
    private final static By newsFeed_Btn = By.id("com.itworx.winjigoteacher:id/relativeLayoutTab");
    private final static By more_Btn = By.id("com.itworx.winjigoteacher:id/tab_more_id");

    private final static By course_Label(String courseName) {
    	return By.xpath("//*[contains(@text,'"+ courseName +"') and @resource-id='com.itworx.winjigoteacher:id/textViewCourseName']");
    }

	/****************************************************************************
	*  >>	Keywords
	*****************************************************************************/
    public HomePage skip() {
	   driver.element()
	   .touch()
	   .element()
	   .click(courses_Btn)
	   .click(newsFeed_Btn)
	   .click(more_Btn)
	   .click(courses_Btn)
	   .click(newsFeed_Btn);
	   return new HomePage(driver);
   }
    
    public CoursePage selectCourse(String courseName) {
    	driver.element()
    	.click(course_Label(courseName));
    	return new CoursePage(driver);
    }
    
}
