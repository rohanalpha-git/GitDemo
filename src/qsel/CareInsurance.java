package qsel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsurance {
	static {
		System.setProperty("webdriver.chrome.driver", "C://Users//Rohan//Desktop/drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement Year = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/select[2]"));
		Select s = new Select(Year);
		s.selectByValue("1995");
		WebElement month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/select[1]"));
		Select m =new Select(month);
		m.selectByVisibleText("Feb");
		driver.findElement(By.xpath("//td[.='2']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("7703886850");
		Thread.sleep(3000);
		driver.findElement(By.id("renew_policy_submit"));
		Thread.sleep(3000);
		driver.close();
		
		
		
		
	}

}
