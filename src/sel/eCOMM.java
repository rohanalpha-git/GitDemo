package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class eCOMM {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohan\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] basket = {"Brocolli", "Cauliflower", "Carrot", "Beetroot", "Cucumber"};

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		
		List <WebElement> veggies = driver.findElements(By.cssSelector("h4.product-name"));
        for(int i=0;i<veggies.size();i++) {
        	
        	String[] name= veggies.get(i).getText().split("-");
        	
        	String formattedName = name[0].trim();
        	System.out.println(formattedName);
        	List<String> basketList= Arrays.asList(basket);
        	int j =0;
        	if (basketList.contains(formattedName)) {
        		j++;
        		driver.findElements(By.xpath("//*[@div='product-action']/button")).get(i).click();
        	if (j == basketList.size()) {
        		break;
        	}
        	}
        	}
        	
        }
	}












































