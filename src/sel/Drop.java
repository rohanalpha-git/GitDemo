package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Drop{
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohan\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 WebElement staticDropdown =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		 Select dropdown = new Select(staticDropdown); 
		 //dropdown.selectByIndex(3);
		 //dropdown.selectByValue("USD");
		 dropdown.selectByVisibleText("USD");//.getText() does not work here because 
		 System.out.println(dropdown.getFirstSelectedOption().getText());
		 
	}
}