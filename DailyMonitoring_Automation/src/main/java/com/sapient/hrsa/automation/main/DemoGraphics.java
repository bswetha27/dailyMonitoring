package com.sapient.hrsa.automation.main;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGraphics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\swetha SW\\Chromedriver-win32\\Chromedriver.exe");
	  
	        ChromeDriver driver = new ChromeDriver();
	  
	        // Maximize the browser
	        // using maximize() method
	        driver.manage().window().maximize();
	     // Launching website
	        driver.get("https://data.hrsa.gov/");
	        driver.findElement(By.xpath("//span[normalize-space()='Data']")).click();
	        driver.findElement(By.xpath("//a[contains(text(),'Dashboards')]" )).click(); 
	        driver.findElement(By.xpath("//h4[normalize-space()='Demographics']" )).click();
	        driver.findElement(By.xpath("//div[@class='page-entry-icon page-entry-icon-red icon icon-dashboards']" )).isDisplayed();
	        driver.findElement(By.xpath("//h1[@class='text-title page-entry-title']" )).getText();
	        driver.findElement(By.xpath("//p[@class='lead']" )).getText();
	        driver.findElement(By.xpath("//div[@class='dashboard-text']" )).getText();
	        driver.findElement(By.xpath("//a[@href='/Content/Documents/topics/About the Demographics Dashboard.pdf']" )).click();
	        driver.get("https://data.hrsa.gov/data/dashboards/demographics");
	        driver.findElement(By.xpath("//h2[contains(text(),'Explore Demographics')]" )).getText();
	        driver.findElement(By.xpath("//div[@id='vizContainer']" )).getText();
	        driver.findElement(By.xpath("//a[@href='/Content/Documents/topics/Dashboard_Export_UserGuide_v1.2.pdf']" )).click();
	        driver.get("https://data.hrsa.gov/data/dashboards/demographics");
	        driver.findElement(By.xpath("//h2[contains(text(),'About HRSA')]")).getText();
	        driver.findElement(By.xpath("//div[@class='footer-hrsa-content']")).getText();
	        driver.findElement(By.xpath("//a[@href='https://www.hrsa.gov']" )).click();
	        driver.navigate().to("https://data.hrsa.gov/data/dashboards/demographics");
            driver.findElement(By.xpath("//a[@href='https://data.hrsa.gov/about']" )).click();
            driver.get("https://data.hrsa.gov/data/dashboards/demographics");
            driver.findElement(By.xpath("//a[@href='https://data.hrsa.gov/data/about']" )).click();
            driver.get("https://data.hrsa.gov/data/dashboards/demographics");
            driver.findElement(By.xpath("//a[@href='https://data.hrsa.gov/a-to-z']" )).click();
            driver.get("https://data.hrsa.gov/data/dashboards/demographics");
            driver.findElement(By.xpath("//a[@href='data.hrsa.gov/site-map']" )).click();
            driver.get("https://data.hrsa.gov/data/dashboards/demographics");
            driver.findElement(By.xpath("//a[@href='data.hrsa.gov/whats-new']" )).click();
            driver.get("https://data.hrsa.gov/data/dashboards/demographics");
            driver.findElement(By.xpath("//img[@src='/Content/Images/hrsa-data-warehouse-logo.png']"
            		)).isDisplayed();
            driver.findElement(By.xpath("//img[@src='/Content/Images/department-of-health-and-human-services-logo.png']")).isDisplayed();
           
            
	        
	       
            		

	       

	}

}
