package qsel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJob {
	static {
		System.setProperty("webdriver.chrome.driver", "C://Users//Rohan//Desktop/drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Wipro jobs"+Keys.ENTER);
		List<WebElement> allJobs = driver.findElements(By.xpath("//a"));
		Thread.sleep(3000);
		System.out.println(allJobs.size()); 
		for(WebElement a:allJobs)
		{
			System.out.println(a.getAttribute("href"));
		}
			
	}

}
