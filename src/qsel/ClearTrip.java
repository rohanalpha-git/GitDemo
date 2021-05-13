package qsel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	static {
		System.setProperty("webdriver.chrome.driver", "C://Users//Rohan//Desktop/drivers/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.cleartrip.com/");
	//driver.findElement(By.cssSelector("[id='alertbtn']")).click();
	driver.findElement(By.name("origin")).sendKeys("bangalore"+Keys.ENTER);
	driver.findElement(By.name("destination")).sendKeys("Goa"+Keys.ENTER);
	driver.findElement(By.id("DepartDate")).click();
	driver.findElement(By.xpath("//td[@class=' ui-datepicker-days-cell-over undefined selected']/../td[2]/a")).click();
	driver.findElement(By.id("SearchBtn")).click();
	Thread.sleep(8000);
	//driver.navigate().to("https://www.cleartrip.com/flights/results?origin=Bangalore,+IN+-+Kempegowda+International+Airport+(BLR)&from=BLR&destination=Goa,+IN+-+Dabolim+Airport+(GOI)&to=GOI&depart_date=23/03/2021&adults=1&childs=0&infants=0&class=Economy&airline=&carrier=&intl=n&sd=1616359059721&rnd_one=O\\");
	List<WebElement> list1 = driver.findElements(By.xpath("//span[. = 'Flight details']"));
	String text = null;
	for (WebElement a : list1)
	{
		a.click();
		List<WebElement> innerList = driver.findElements(By.xpath("//div[@class='flex flex-start']/div/p"));
		for(WebElement b:innerList )
		{
			text = b.getAttribute("alt");
			System.out.println(text);
		}
	}
	
    System.out.println(driver.getCurrentUrl());
    
	
	
}
}
