package qsel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropdown {

	static {
		System.setProperty("webdriver.chrome.driver", "C://Users//Rohan//Desktop/drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Rohan/Desktop/hotel2.html");
		WebElement CPlistBox = driver.findElement(By.id("cp"));
		Select s = new Select(CPlistBox);
		List<WebElement> OptionList = s.getOptions();
		s.selectByIndex(0);
		s.selectByValue("v");
		//s.selectByVisibleText("Idly");
		if (s.isMultiple()) {
			s.deselectAll();
			s.deselectByIndex(0);
			s.deselectByValue("v");
			//s.deselectByVisibleText("Idly");
		}
		ArrayList li = new ArrayList();
		HashSet hs = new HashSet();
		String text;
		for (WebElement a : OptionList) {
			li.add(a.getText());
			hs.add(a.getText());
		}

		HashSet hs2 = new HashSet();
		Object text2 = null;
		//System.out.println(li);
		for (int i = 0; i < li.size(); i++) {
			text2 = (String) li.get(i);
			for (int j = 0; j < li.size(); j++) {
				String t3 = (String) li.get(j);
				if (t3.equals(text2))
				{
					hs2.add(t3);

				}

			}
		}
		System.out.println(hs2);
		
		for (Object b : hs) 
		 {
			 //System.out.println(b);
		 }
		driver.close(); 
	}

}
