package com.demo.testNG.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestNG {
	String ActualErrMsg="";
	@Test(groups={"TestNG","demo","TC001","parameters"})
	@Parameters({"browsername","appURL"})
	public void parameters(String browserNmae,String appURL) {
		
		TestBaseSetup base= new TestBaseSetup();
		WebDriver driver = base.setDriver( browserNmae, appURL);
		/*	System.out.println("The current browser is "+browserNmae);
		System.out.println("the platform is "+platform);
		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://opensource.demo.orangehrmlive.com/";
		driver.get(baseUrl);*/
		//driver.manage().window().maximize();//maximize browser

		String ExpectedErrorMsg="Invalid credentials";
		WebElement userName= driver.findElement(By.id("txtUsername"));//By id 
		WebElement password= driver.findElement(By.name("txtPassword"));//By name 
		WebElement submit= driver.findElement(By.className("button"));//By name 

		userName.sendKeys("Admin");
		password.sendKeys("admin");
		submit.click();
		try{

			WebElement errMsg= driver.findElement(By.xpath("//div[span='Invalid credentials']"));//By xpath
			ActualErrMsg=errMsg.getText();
		}catch (Exception e){
			e.printStackTrace();
		}

		if (ActualErrMsg.contentEquals(ExpectedErrorMsg))
			System.out.println("Test case passed");
		else
			System.out.println("Test case failed");

		driver.close();

	}
}