package qsel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkarrtAsugg {
	static {
		System.setProperty("webdriver.chrome.driver", "C://Users//Rohan//Desktop/drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@tabindex='-1']/div//button)[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("i phone");
		Thread.sleep(3000);
		List<WebElement> allSuggestion = driver.findElements(By.xpath("(//button)[2]"));
		int count = allSuggestion.size();
		System.out.println(count);
		for(WebElement a:allSuggestion)
		{
			System.out.println(a.getText());
		}
		(allSuggestion.get(allSuggestion.size()-1)).click();
		Thread.sleep(5000);
		driver.close();	
		}
	}


