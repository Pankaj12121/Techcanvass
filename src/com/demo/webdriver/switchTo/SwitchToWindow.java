package com.demo.webdriver.switchTo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow {

	static WebDriver driver ;
	static WebElement loginButton;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseUrl = "http://icicidirect.com";
		driver.get(baseUrl);
		String BaseTitle=driver.getTitle();
		
		try{
			SwitchToWindow Obj= new SwitchToWindow();
			WebElement cusService=driver.findElement(By.linkText("Customer Service"));
			cusService.click();
			String title="NSE - National Stock Exchange of India Ltd.";
			WebElement nselink=driver.findElement(By.linkText("NSE"));
			bringElementintoView(nselink);
			nselink.click();
			Obj.switchToWindow(title);
			Thread.sleep(3000);
			WebElement searchKeyword=driver.findElement(By.id("keyword"));
			searchKeyword.click();
			searchKeyword.sendKeys("bajaj");
			System.out.println("Switched to new window successful");
			driver.close();
			Obj.switchToWindow(BaseTitle);
			String baseTitle="ICICI Direct Customer Service";
			//Obj.switchToWindow(baseTitle);
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			WebElement loginlink=driver.findElement(By.linkText("Login"));
			bringElementintoView(loginlink);
			loginlink.click();
			WebElement uName=driver.findElement(By.id("txtUserId"));
			WebElement passWord=driver.findElement(By.id("txtPass"));
			WebElement dob=driver.findElement(By.id("txtDOB"));
			WebElement loginButton=driver.findElement(By.id("lbtLogin"));
			uName.sendKeys("Test123");
			passWord.sendKeys("pass1234");
			dob.sendKeys("12122001");
			loginButton.click();
			System.out.println("switch back to default window successful");
			driver.quit();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Element not displayed");

		}
	}
	public void switchToWindow(String title){
		Set<String> handles=driver.getWindowHandles();

		for(String handle:handles){
			driver.switchTo().window(handle);
			//driver.manage().window().maximize();

			if(driver.getTitle().contains(title)){
				break;
			}
		}

	}
	
	public static void bringElementintoView(WebElement element){
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
		
	}
}