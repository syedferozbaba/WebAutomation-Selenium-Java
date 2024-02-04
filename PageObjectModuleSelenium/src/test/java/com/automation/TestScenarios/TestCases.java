package com.automation.TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.PageObjects.loginpage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases {
	WebDriver driver;
	@BeforeTest
	public void setbrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test
	public void logintohomepage() throws InterruptedException
	{
		loginpage login=new loginpage(driver);
		login.logintohomepage("Admin", "admin123");
		
	}
	
	@AfterTest
	public void closebrowser()
	{
		driver.quit();
	}
	

}
