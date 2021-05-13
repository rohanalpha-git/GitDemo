package qsel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadHandling {
	static {
		System.setProperty("webdriver.gecko.driver", "C://Users//Rohan//Desktop/drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//div[@class='split-section container dark-background']/div[2]/p[1]/a")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
	}

}
