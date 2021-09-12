package com.CucumberPractice.UiStore;

import org.openqa.selenium.By;

public class LoginPageUi {

	public By EmailAddress=By.cssSelector("input[id=\"email\"]");
	public By Password=By.cssSelector("input[name=\"passwd\"]");
	public By LoginBtn=By.cssSelector("button[name=\"SubmitLogin\"]");
}
