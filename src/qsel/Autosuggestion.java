package qsel;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {
	static {
		System.setProperty("webdriver.chrome.driver", "C://Users//Rohan//Desktop/drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(4000);
		
		List<WebElement> WebElements = driver.findElements(By.xpath("//span[contains(text(),'j')]"));
		int size = WebElements.size();
		System.out.println(size);
		for (WebElement a : WebElements) {
			System.out.println(a.getText());
		}
	}
}
