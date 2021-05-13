package com.actitime.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
public WebDriver driver;
@Parameters("browser")
@BeforeTest
public void openBrowser(String browser)
{
	if (browser.equals("chrome"))
	{
		driver = new ChromeDriver();
		Reporter.log("Open Chrome Browser", true);
	}
	else if (browser.equals("firefox"))
	{
		driver = new FirefoxDriver();
		Reporter.log("Open Firefox Browser", true);
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.DAYS);
	}
@AfterTest
public void closeBrowser()
{
	Reporter.log("Closed Browser", true);
	driver.close();
	}
@BeforeMethod
public void Login()
{
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	Reporter.log("Logged in");
	
}
@AfterMethod
public void Logout()
{
	driver.findElement(By.id("logoutLink")).click();
	}
}
