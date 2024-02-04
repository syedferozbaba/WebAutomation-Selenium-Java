package com.automation.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
	//public WebElement login;
	
	
	WebDriver driver;
	
	public loginpage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By username=By.xpath("//input[@name=\"username\"]");
	By password=By.xpath("//input[@type=\"password\"]");
	By submit=By.xpath("//button[@type=\"submit\"]");
	
	public void logintohomepage(String userinput, String userpwd) throws InterruptedException
	{
		driver.findElement(username).sendKeys(userinput);
		driver.findElement(password).sendKeys(userpwd);
		driver.wait(1000);
		driver.findElement(submit).click();
		
	}


}
