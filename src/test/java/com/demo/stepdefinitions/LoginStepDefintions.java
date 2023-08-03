package com.demo.stepdefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefintions {
	private WebDriver driver;
	@Given("User is on the Demoblaze homepage")
	public void user_is_on_the_demoblaze_homepage() {
		//write code that should execute before every test method execution
//		System.setProperty("webdriver.http.factory","jdk-http-client");
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");

		//instance of chromedriver 
		driver=new ChromeDriver();
		//implicitly managing
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();//maxmize the window
		driver.get("https://www.demoblaze.com/");
	}
     @When("User clicks on the Login button")
     public void user_clicks_on_the_button() {
    	 driver.findElement(By.id("login2")).click();
     }
     
     
     @When("User enters valid username and password")
     public void user_enters_valid_username_and_password() {
    	driver.findElement(By.id("loginusername")).sendKeys("nitish123");
    	driver.findElement(By.id("loginpassword")).sendKeys("admin123");
    	driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();
     }
     
     
 
     
     
	@Then("User should be logged in successfully")
     public void user_should_be_loggedin_success() {
    	 String successmessage="Welcome nitish123";
    	 Assert.assertEquals("Welcome nitish123", successmessage);
    	 driver.quit();
     }
 
     
   
     

}
