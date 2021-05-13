package qsel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiveElement {
	static {
		System.setProperty("webdriver.chrome.driver", "C://Users//Rohan//Desktop/drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("returnCalendar")).click();

		WebElement activeEl = driver.findElement(By.xpath("//input[@id='returnCalendar']/../div/div/div/div[2]/div/div[1]/div"));
		System.out.println(activeEl.getText());
		
		WebDriverWait web = new WebDriverWait(driver,10);
		web.until(ExpectedConditions.visibilityOfElementLocated(By.id("get_sign_up"))).click();
	}

}