package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class endtoend {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohan\\Desktop\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		driver.findElement(By.xpath("//*[text()='Ahmedabad (AMD)']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")).click();
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_destinationStation1\"]/option[@value='BLR']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i=0;
		while(i<5) {
			driver.findElement(By.id("hreaIncAdt")).click();
			i++;
		}
		while(i>2) {
			driver.findElement(By.id("hrefIncChd")).click();
			i--;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

		
		
	}

}
