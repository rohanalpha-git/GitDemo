package sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("line 1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohan\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size());
		System.out.println("line 2");
		List <WebElement> checkoption = driver.findElements(By.cssSelector("[type='checkbox']"));
		System.out.println(checkoption);
		System.out.println("line 3");
		for (WebElement Cop : checkoption) {
				Cop.click();
				System.out.println("line if sataement");
				
		}
		System.out.println("line 4");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
	    List <WebElement>options = driver.findElements(By.cssSelector("[id='ui-id-1'] a"));
	    for(WebElement option:options) {
		    if (option.getText().equalsIgnoreCase("India")) {
			      option.click();
			      break;
			}
		
	}
	}

}
/*System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");

WebDriver driver =new ChromeDriver();

driver.get("http://spicejet.com"); //URL in the browser

Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());*/