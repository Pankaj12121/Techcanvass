package com.demo.webdriver.LaunchDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleLocatorsScripts {
	
	static WebDriver driver ;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseUrl = "http://opensource.demo.orangehrmlive.com/";
		driver.get(baseUrl);
		driver.manage().window().maximize();//maximize browser
		
		String ExpectedErrorMsg="Invalid credentials";
		WebElement userName= driver.findElement(By.id("txtUsername"));//By id 
		WebElement password= driver.findElement(By.name("txtPassword"));//By name 
		WebElement submit= driver.findElement(By.className("button"));//By name 
	
		userName.sendKeys("admin");
		password.sendKeys("admin");
		submit.click();
		
		WebElement errMsg= driver.findElement(By.xpath("//div[span='Invalid credentials']"));//By xpath
		String ActualErrMsg=errMsg.getText();
		
		if (ActualErrMsg.contentEquals(ExpectedErrorMsg))
			System.out.println("Test case passed");
		else
			System.out.println("Test case failed");
		
		driver.close();
		
		
	}
	

}
