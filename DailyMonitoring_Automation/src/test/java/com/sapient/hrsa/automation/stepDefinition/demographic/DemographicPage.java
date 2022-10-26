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
	
	@Then("validate the date")
	public void validate_the_date() {
		driver.findElement(By.xpath("//div[@class='dashboard-text']" )).getText();
	}

	@Then("validate the About this Dashboard PDF")
	public void validate_the_about_this_dashboard_pdf() {
		 driver.findElement(By.xpath("//a[@href='/Content/Documents/topics/About the Demographics Dashboard.pdf']" )).click();
	}
	
	
		@Then("Verify the header")
		public void verify_the_header() {
			driver.findElement(By.xpath("//h2[contains(text(),'Explore Demographics')]" )).getText();
		    
		}

		@Then("Verify the dashboard")
		public void verify_the_dashboard() {
			driver.findElement(By.xpath("//div[@id='vizContainer']" )).getText();
		   
		}
		
		@Then("Verify the About HRSA header")
		public void verify_the_about_hrsa_header() {
			driver.findElement(By.xpath("//h2[contains(text(),'About HRSA')]")).getText();
		}

		@Then("Verify the Paragraph")
		public void verify_the_paragraph() {
			driver.findElement(By.xpath("//div[@class='footer-hrsa-content']")).getText();
		}

		@Then("Verify the learn more about HRSA link")
		public void verify_the_learn_more_about_hrsa_link() {
			driver.findElement(By.xpath("//a[@href='https://www.hrsa.gov']" )).click();
		}
		
		@Then("About us")
		public void about_us() {
			 driver.findElement(By.xpath("//a[@title='About Us']" )).click();
		}

		@Then("About the data")
		public void about_the_data() {
			driver.findElement(By.xpath("//ul[@class='footer-links']//a[@title='About the Data']")).click();
		}

		@Then("A-Z index")
		public void a_z_index() {
			 driver.findElement(By.xpath("//ul[@class='footer-links']//a[@title='A to Z Index']")).click();
		}

		@Then("Site map")
		public void site_map() {
			driver.findElement(By.xpath("//ul[@class='footer-links']//a[@title='Site Map']")).click();
		}

		@Then("What's new")
		public void what_s_new() {
			driver.findElement(By.xpath("//a[@title='Whats New']")).click();
		    
		}

		@Then("Verify HRSA logo")
		public void verify_hrsa_logo() {
			driver.findElement(By.xpath("//img[@src='/Content/Images/hrsa-data-warehouse-logo.png']"
            		)).isDisplayed();
		}

		@Then("Verify Department of health and human serivces logo")
		public void verify_department_of_health_and_human_serivces_logo() {
			driver.findElement(By.xpath("//img[@src='/Content/Images/department-of-health-and-human-services-logo.png']")).isDisplayed();		
			}

		@Then("quit")
		public void quit() {
		    driver.quit();
		}
}
