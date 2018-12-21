package org.sele.pro.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Sample 
{
	static WebDriver driver;
	@Given("browser launch")
	public void browser_launch() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\seleniumNew\\SeleniumDay3\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@When("Search for text selenium")
	public void search_for_text_selenium() 
	{
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);		
	}

	@Then("check the search page")
	public void check_the_search_page() 
	{
		Assert.assertTrue(driver.getCurrentUrl().contains("search"));
	}
}
