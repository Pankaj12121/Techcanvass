package com.demo.webdriver.javascriptExcecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WithoutSendKeys {

		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.co.in");
		WebElement element= driver.findElement(By.name("btnK"));
		((JavascriptExecutor)driver).executeScript("document.getElementById('lst-ib')."
				+ "value='Jobs in selenium'");
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",element);
		driver.close();
		}
		}

