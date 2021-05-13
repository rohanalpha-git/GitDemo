package qsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSourceBillingremove {
	static {
		System.setProperty("webdriver.chrome.driver", "C://Users//Rohan//Desktop/drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.opensourcebilling.org/en/users/sign_in");
		WebElement emialWebEl = driver.findElement(By.id("email"));
		emialWebEl.clear();
		driver.close();
	}

}
