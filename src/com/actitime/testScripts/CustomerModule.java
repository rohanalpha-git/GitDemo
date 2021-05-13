package com.actitime.testScripts;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class CustomerModule extends BaseClass{
	@Test
	public void createCustomer()
	{
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[.='Add New']")).click();
		driver.findElement(By.xpath("//div[.='+ New Customer']")).click();
        driver.findElement(By.id("//div[@class='customerNameDiv']/input")).sendKeys("Rohan");
        driver.findElement(By.xpath("//div[.='Create Customer']")).click();
		Reporter.log("Customer created", true);
	}

}
