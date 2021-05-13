package qsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSourceBilling {

	static{
		System.setProperty("webdriver.chrome.driver", "C://Users//Rohan//Desktop/drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.opensourcebilling.org/users/sign_in");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("rohankumaralpha@gmail.com");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("BangBang");
	}
}
