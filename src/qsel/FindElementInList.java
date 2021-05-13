package qsel;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementInList {
	static {
		System.setProperty("webdriver.chrome.driver", "C://Users//Rohan//Desktop/drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Rohan/Desktop/Qspiders/Hotel.html");
		WebElement CPlistBox = driver.findElement(By.id("cp"));
		Select s = new Select(CPlistBox);
		List<WebElement> OptionList = s.getOptions();
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dish name");
		String dish = sc.nextLine().toLowerCase();
		int counter = 0;
		for (WebElement a : OptionList) {
			String text = a.getText().toLowerCase();
			if(text.equals(dish)) {
				counter++;
			}
		}
		if (counter == 0) {
			System.out.println(dish + " is not present");
		} else if (counter == 1) {
			System.out.println(dish + " is present");
		} else {
			System.out.println(dish + " is having duplicate value");
		}
	}
	}

}
