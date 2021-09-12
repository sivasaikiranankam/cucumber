package com.CucumberPractice.StepDefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;

import com.CucumberPractice.PageObjects.HomePageObjects;
import com.CucumberPractice.PageObjects.LoginPageObjects;
import com.CucumberPractice.ResuableComponents.Base;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClickLoginStepDefination extends Base{

	@Given("^Open Browser using the Chrome Driver$")
	public void open_Browser_using_the_Chrome_Driver() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=initializedriver();
		logger.info("chrome driver intialized");
	    
	}

	@Given("^navigate to given url$")
	public void navigate_to_given_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		OpenUrl();
		
		logger.info("opened Automation pracctice url ");
	    
	}

	@When("^click on the login button in the HomePage$")
	public void click_on_the_login_button_in_the_HomePage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//ReusableMethods.Implicitwait(driver);
	    HomePageObjects h=new HomePageObjects(driver);
	    h.Loginlink().click();
	   logger.info("clicked on login button");
	}
	 
    @Then("^Enter (.+) and (.+)$")
    public void enter_and(String email, String pass) throws Throwable {
    	   LoginPageObjects l=new LoginPageObjects(driver);
           l.enteremail().sendKeys(email);
           l.enterpass().sendKeys(pass);
           l.clickLoginbtn().click();
         logger.info("Entered email and password ad submitted");
    }
    
    @Then("^Check title$")
    public void check_title() throws Throwable {
        String s=driver.getTitle();
       Assert.assertEquals(s, "My Storee");
        
    }


    

	
}
