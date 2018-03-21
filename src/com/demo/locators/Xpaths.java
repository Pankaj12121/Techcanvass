package com.demo.locators;

import java.util.ArrayList;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {
	private WebElement myBooking;
	private WebElement userName;
	private WebElement password;
	private WebElement signIn;
	private WebElement userNameBox;
	private WebElement registerHere;
	private WebElement forgotPasswd;
	private WebElement login;
	private WebElement login1;
	private WebElement TotalHits;
	private WebElement JourneyDate;
	private WebElement panel;
	private WebElement childNodes;
	private WebElement LoginPreced;
	private WebElement LoginDesed;
	public WebDriver driver;
	public ArrayList<WebElement> objList= new ArrayList<WebElement>();

	public void launchDriver(){
		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseUrl = "https://www.upsrtconline.co.in/#";
		driver.get(baseUrl);
	}

	public void pageElementByXpath(){
		//Xpath by ID
		myBooking= driver.findElement(By.xpath("//a[@id='mybooking']"));
		objList.add(myBooking);
		//Xpath by Name
		userName= driver.findElement(By.xpath("//*[@name='username']"));
		objList.add(userName);
		//Xpath by tag
		userName= driver.findElement(By.xpath("//*[@type='password']"));
		objList.add(userName);
		//Xpath by class
		signIn= driver.findElement(By.xpath("//*[@class='bxI boxPad10']"));
		objList.add(signIn);
		//Xpath by tag
		userNameBox= driver.findElement(By.xpath("//*[@type='password']"));
		objList.add(userNameBox);
		//Xpath by href
		registerHere= driver.findElement(By.xpath("//a[@href='https://www.upsrtconline.co.in/user/newuser']"));
		objList.add(registerHere);
		//Xpath by contains
		forgotPasswd= driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));
		objList.add(forgotPasswd);
		//Xpath by OR 
		login= driver.findElement(By.xpath("//*[@type='submit' or @value='Login']"));
		objList.add(login);
		//Xpath by AND 
		login1= driver.findElement(By.xpath("//*[@type='submit' and @value='Login']"));
		objList.add(login1);
		//Xpath by Starts With
		TotalHits= driver.findElement(By.xpath("//*[starts-with(span,'Total Hits : 193')]"));
		objList.add(TotalHits);
		//Xpath by following
		JourneyDate= driver.findElement(By.xpath("//*[@type='text']//following::input[2]"));
		objList.add(JourneyDate);
		//Xpath by Ancestor
		panel= driver.findElement(By.xpath("//*[@class='bbgI']//ancestor::div"));
		objList.add(panel);
		//Xpath by child
		childNodes= driver.findElement(By.xpath("//div[@class='cb-bd']//child::li"));
		objList.add(childNodes);
		//Xpath by 	Preceding
		LoginPreced= driver.findElement(By.xpath("//*[@value='Login']//preceding::input[2]"));
		objList.add(LoginPreced);
		//Xpath by 	Descendant
		LoginDesed= driver.findElement(By.xpath("//*[@class='inpElement busfrom']//descendant::li[2]"));
		objList.add(LoginDesed);
	}

	
	public void actionOn(){
		for(WebElement element:objList){
			if(element.isDisplayed())
				System.out.println("Element Displayed on the WebPage :: "+element.getText().toString());
			else
				System.out.println("Element Not Displayed on the WebPage :: "+element.getText().toString());	
		}
	}

	public static void main(String[] args) {

		Xpaths obj= new Xpaths();
		obj.launchDriver();
		obj.pageElementByXpath();
		obj.actionOn();
		obj.closeDriver();

	}

	public void closeDriver(){
		driver.close();
	}
}
