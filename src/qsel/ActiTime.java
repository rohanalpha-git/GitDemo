package qsel;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	static {
		System.setProperty("webdriver.chrome.driver", "C://Users//Rohan//Desktop/drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		String ptab = driver.getWindowHandle();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.xpath("//a[.='About your actiTIME']")).click(); 
		driver.findElement(By.xpath("//a[.='Read Service Agreement']")).click();
		Set<String> allTab = driver.getWindowHandles();
		String chTab = null;
		for(String tab:allTab)
		{
			driver.switchTo().window(tab);
			if (!(driver.getWindowHandle()).equals(ptab))
			{
				chTab=tab;
			}
		}
		driver.switchTo().window(chTab);
		List<WebElement> headings = driver.findElements(By.xpath("//u")); 
		for(WebElement a:headings)
		{
			System.out.println(a.getText());
		}
		
		
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(ptab);
		driver.close();
	}
}
