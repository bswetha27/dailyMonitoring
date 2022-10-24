/**
 * 
 */
package com.sapient.hrsa.automation.drivers;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author hp
 *
 */
public class DriverSettings {
	  
	  public DriverSettings() {
		super();
		System.setProperty( "webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Documents\\chromedriver.exe");
	}

	public DriverSettings(ChromeDriver driver) {
		super();
		System.setProperty( "webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Documents\\chromedriver.exe");
		this.driver = driver;
	}

	ChromeDriver driver = new ChromeDriver();
	  
	  // Maximize the browser // using maximize() method
//	  driver.manage().window().maximize();
	  
	  // Launching website driver.get("https://www.geeksforgeeks.org/"); }
	 

}
