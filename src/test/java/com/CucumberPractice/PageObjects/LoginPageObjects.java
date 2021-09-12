package com.CucumberPractice.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.CucumberPractice.UiStore.LoginPageUi;


public class LoginPageObjects {
	WebDriver driver;
	LoginPageUi l=new LoginPageUi();
	public LoginPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement enteremail()
	{
		return driver.findElement(l.EmailAddress);
	}
	
	public WebElement enterpass()
	{
		return driver.findElement(l.Password);
	}
	
	public WebElement clickLoginbtn()
	{
		return driver.findElement(l.LoginBtn);
	}
}
