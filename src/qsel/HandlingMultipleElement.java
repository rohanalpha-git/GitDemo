package qsel;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElement {
	static {
		System.setProperty("webdriver.chrome.driver", "C://Users//Rohan//Desktop/drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the website URL");
		String input =sc.nextLine();
		WebDriver driver = new ChromeDriver();
		driver.get(input);
		List<WebElement> WebElements = driver.findElements(By.tagName("a"));
		int size = WebElements.size();
		System.out.println(size);
		for (WebElement a : WebElements) {
			System.out.println(a.getText());
		}
	}
}
