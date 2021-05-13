package qsel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {
		static {
			System.setProperty("webdriver.chrome.driver", "C://Users//Rohan//Desktop/drivers/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
			WebElement listM = driver.findElement(By.id("month"));
			
			Select a =new Select(listM);
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("month")));
			
			a.selectByVisibleText("Dec");
			
			
			
		}

}
