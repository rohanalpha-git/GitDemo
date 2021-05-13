package qsel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopup {
	static {
		System.setProperty("webdriver.gecko.driver", "C://Users//Rohan//Desktop/drivers/geckodriver.exe");
	}
public static void main(String[] args) throws AWTException {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_P);
	r.keyRelease(KeyEvent.VK_CONTROL);
	
}

}
