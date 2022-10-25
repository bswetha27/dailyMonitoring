/**
 * 
 */
package com.sapient.hrsa.automation.stepDefinition.demographic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author hp
 *
 */
public class DemographicPage {
	
	WebDriver driver;
	
	@Given("load the demographic page url")
	public void load_the_demographic_page_url() {
	    
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	       // Maximize the browser
	        // using maximize() method
	        driver.manage().window().maximize();
	     // Launching website
	        driver.get("https://data.hrsa.gov/data/dashboards/demographics");
	}

	@When("demographic page is loaded")
	public void demographic_page_is_loaded() {
	}

	@Then("validate logo of the page")
	public void validate_logo_of_the_page() {
		driver.findElement(By.xpath("//div[@class='page-entry-icon page-entry-icon-red icon icon-dashboards']" )).isDisplayed();
	}

	@Then("validate Title of the page")
	public void validate_title_of_the_page() {
		driver.findElement(By.xpath("//h1[@class='text-title page-entry-title']" )).getText();
	}

	@Then("validate paragraph text")
	public void validate_paragraph_text() {
		driver.findElement(By.xpath("//h1[@class='text-title page-entry-title']" )).getText();
	}

}
