package qsel;

import java.io.FileInputStream;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jdk.internal.vm.compiler.word.impl.WordBoxFactory;

public class readingExcel {
	static {
		System.setProperty("webdriver.chrome.driver", "C://Users//Rohan//Desktop/drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("");
		Set<String> allWh = driver.getWindowHandles();
		for(String wh:allWh)
		{
			driver.switchTo().window(wh);
			driver.close();
		}
		
	}

}
