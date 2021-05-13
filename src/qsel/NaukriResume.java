package qsel;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriResume {
	static {
		System.setProperty("webdriver.chrome.driver", "C://Users//Rohan//Desktop/drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[.='Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//form[@name ='login-form']/div[2]/input")).sendKeys("rohanbokaro1995@gmail.com");
		driver.findElement(By.xpath("//form[@name ='login-form']/div[3]/input")).sendKeys("Gametheory");
		driver.findElement(By.xpath("//button[.='Login']")).click();
		driver.findElement(By.xpath("//div[@class='btn btn-block btn-large white-text']")).click();
		File f =new File("‪C://Users//Rohan//Desktop//Rohan's Resume.pdf");
		driver.findElement(By.id("attachCV")).sendKeys("C://Users//Rohan//Desktop//Rohan's Resume.pdf");
		
		//driver.close();
		
		
	}
}
