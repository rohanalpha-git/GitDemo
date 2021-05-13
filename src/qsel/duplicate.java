package qsel;

import java.util.List;
import java.util.HashSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class duplicate {
	static {
		System.setProperty("webdriver.chrome.driver", "C://Users//Rohan//Desktop/drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Rohan/Desktop/Qspiders/Hotel.html");
		WebElement CPlistbox= driver.findElement(By.id("cp"));
		Select s = new Select(CPlistbox);
		HashSet<String> hs = new HashSet<String>();
		List<WebElement> Alloptions = s.getOptions();
		for(WebElement text:Alloptions)
		{
			String texts = text.getText();
			if (hs.add(texts)==true)
			{
				//System.out.println("Set of the elements");
				System.out.println(texts);
			}
			else
			{	
				System.out.println("Duplicate Elements");
				System.out.println(texts);
			}
		}
		
	}

}
