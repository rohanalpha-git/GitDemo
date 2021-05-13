package qsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	static {
		System.setProperty("webdriver.chrome.driver", "C://Users//Rohan//Desktop/drivers/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	WebElement userTF = driver.findElement(By.id("email"));
	WebElement passTF = driver.findElement(By.id("pass"));
	int heightUN = userTF.getSize().getHeight();
	int widthUN = userTF.getSize().getWidth();
	System.out.println("height = "+heightUN);
	System.out.println("Width = "+widthUN);
	int heightPW = passTF.getSize().getHeight();
	int widthPW = passTF.getSize().getWidth();
	System.out.println("height = "+heightPW);
	System.out.println("Width = "+widthPW);
	boolean displayed = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
	System.out.println(displayed);
	driver.close();
	
	
}
}
