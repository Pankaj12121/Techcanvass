package com.demo.pomFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
		protected WebDriver driver;
		private WebElement userName;
		private WebElement password;
		private WebElement submit;
		
		public LoginPage(WebDriver driver) {
			this.driver = driver;
			userName= driver.findElement(By.id("txtUsername"));//By id 
			password= driver.findElement(By.name("txtPassword"));//By name 
			submit= driver.findElement(By.className("button"));//By name 
		}
		
		public void fillLoginDetails(){
			userName.sendKeys("Admin");
			password.sendKeys("admin");
			submit.click();
			
		}
	
		public String getPageTitle(){
			String title = driver.getTitle();
			return title;
		}
		
		public boolean verifyBasePageTitle() {
			String expectedPageTitle="Google";
			return getPageTitle().contains(expectedPageTitle);
		}
}
