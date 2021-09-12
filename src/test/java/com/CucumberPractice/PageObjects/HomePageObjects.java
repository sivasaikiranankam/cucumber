package com.CucumberPractice.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.CucumberPractice.UiStore.HomePageUi;

public class HomePageObjects {
	WebDriver driver;
	HomePageUi h=new HomePageUi();
	public HomePageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement Loginlink()
	{
		return driver.findElement(h.login);
	}
	
}
