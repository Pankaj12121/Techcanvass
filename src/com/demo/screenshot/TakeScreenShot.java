package com.demo.screenshot;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class TakeScreenShot {
	public class takeScreenShotExample{
		public WebDriver driver;

		@Test
		public void openBrowser() throws Exception {
			System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
			driver = new ChromeDriver();//selenium 3
			String baseUrl = "http://opensource.demo.orangehrmlive.com/";
			driver.get(baseUrl);
			try{
				//the below statement will throw an exception as the element is not found, Catch block will get executed and takes the screenshot.
				driver.findElement(By.id("testing")).sendKeys("Admin");

				//if we remove the below comment, it will not return exception and screen shot method will not get executed.
				//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			}
			catch (Exception e){
				System.out.println("I'm in exception");
				//calls the method to take the screenshot.
				getscreenshot();
			}
		}

		public void getscreenshot() throws Exception 
		{   
			String fileName = new String();
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			DateFormat dateFormat = new SimpleDateFormat("hh_mm_ssaadd_MMM_yyyy");
			Date date = new Date();
			fileName = driver.getTitle().replace(":", "").replace("-", "") + dateFormat.format(date) + ".png";
			File destinationFilePath = new File(("C:\\Tosca\\ScreenShot\\" + File.separator + fileName));
			//The below method will save the screen shot in d drive with name "screenshot.png"
			FileUtils.copyFile(scrFile, destinationFilePath);
			driver.quit();
		}
	}

}