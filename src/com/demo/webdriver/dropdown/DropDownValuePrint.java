package com.demo.webdriver.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownValuePrint {
	static WebDriver driver ;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseUrl = "https://www.upsrtconline.co.in/#";
		String expectedTitle = "OrangeHRM1";
		String actualTitle = "";
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		WebElement frmName= driver.findElement(By.name("fromstop"));
		frmName.sendKeys("AGRA");
		dropDownselect();
		/*frmName.sendKeys(Keys.ARROW_DOWN);
			frmName.sendKeys(Keys.ARROW_DOWN);
			frmName.sendKeys(Keys.TAB);*/

		driver.close();

	}

	public static void dropDownselect(){
		List<WebElement> optionsToSelect = driver.findElements(By.tagName("li"));
		for(WebElement option : optionsToSelect){
			System.out.println(option.getText());
			if(option.getText().equals("AGRA(AGR)")) {
				System.out.println("Trying to select: ");
				option.click();
				break;
			}
		}
	}

}


