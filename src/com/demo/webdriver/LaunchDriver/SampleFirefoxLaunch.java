package com.demo.webdriver.LaunchDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleFirefoxLaunch {
	static WebDriver driver ;
	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.gecko.driver","\\Grid\\geckodriver.exe");
		driver = new FirefoxDriver();
		String baseUrl = "http://opensource.demo.orangehrmlive.com/";
		String expectedTitle = "OrangeHRM1";
		String actualTitle = "";
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		driver.close();


	}
}