package com.demo.webdriver.switchTo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {
	static WebDriver driver;
	public static void main(String[] args) {
		SwitchToFrame Objswitchclass=new SwitchToFrame();
		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://merchant.juspay.in/merchant/iframe-demo");
		//driver.manage().window().maximize();
		Objswitchclass.totalNumberOfFramesByJavaScript();
		Objswitchclass.totalNumberOfFramesByTagName();

		//Action in default frame
		WebElement returnURL=driver.findElement(By.name("returnUrl"));
		returnURL.sendKeys("http://");

		//SwitchTo NewFrame
		Objswitchclass.switchToFramebyIndex(0);

		//Action in New frame
		WebElement cardNumber=driver.findElement(By.name("cardNumberMask"));
		cardNumber.sendKeys("1234566");

		//SwitchTo default frame
		driver.switchTo().defaultContent();

		//Action in default frame
		WebElement css=driver.findElement(By.name("customStylesheet"));
		css.sendKeys("css");
		driver.close();
	}

	public int totalNumberOfFramesByJavaScript(){
		//By executing a java script
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes using javascript on the page are " + numberOfFrames);

		return numberOfFrames;
	}
	public int totalNumberOfFramesByTagName(){
		//By finding all the web elements using iframe tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes using tagname are " + iframeElements.size());
		Integer numberOfFrames =iframeElements.size();
		return numberOfFrames;
	}

	public void switchToFramebyIndex(int i){
		driver.switchTo().frame(i);
	}

	public void switchToFramebyName(){
		driver.switchTo().frame("guest");
	}

	public void switchToFramebyWebElement(){
		WebElement webelement=driver.findElement(By.name("cardNumberMask"));
		driver.switchTo().frame(webelement);
	}
}
