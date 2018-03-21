package com.demo.testNG.ParallelTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {

	@Test
	public void getFirefox(){

		System.setProperty("webdriver.gecko.driver","\\Grid\\geckodriver.exe");
		System.out.println("GetFirefox Method is running on Thread : " + Thread.currentThread().getId());
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.yahoo.com");
		driver.close();
	}

	@Test
	public void getChorme(){
		
		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		System.out.println("GetChrome Method is running on Thread : " + Thread.currentThread().getId());
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediff.com");
		driver.close();
	}

}