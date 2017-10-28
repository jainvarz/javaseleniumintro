package com.myfirstseleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/varjain/dev/seleniumdrivers/chromedriver");

		// Create a new instance of the FireFox driver
		WebDriver driver = new ChromeDriver();
 
		// Storing the Application Url in the String variable
		String url = "http://www.google.com";
 
		// Launch the ToolsQA WebSite
		driver.get(url);
		
		// Find searchbox and search button
		WebElement searchBox = driver.findElement(By.cssSelector("input[name=q]"));
		WebElement submitSearchButton = driver.findElement(By.cssSelector("input[name=btnK]"));
		
		// Search the keyword India
		searchBox.sendKeys("India");
		submitSearchButton.click();
 
		// Storing Title name in the String variable
		String title = driver.getTitle();

		//Adding artificial delay to see the test running
		Thread.sleep(5000);
 
		// Displaying page title
		System.out.println(title);
 
		//Closing browser
		driver.close();

	}

}
