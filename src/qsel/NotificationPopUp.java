package qsel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {
static {
	System.setProperty("webdriver.chrome.driver", "C://Users//Rohan//Desktop/drivers/chromedriver.exe");
}
public static void main(String[] args) {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(option);
	driver.get("https://www.cleartrip.com/");
}
}
