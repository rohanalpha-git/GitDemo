package qsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	static {
		System.setProperty("webdriver.chrome.driver","C://Users//Rohan//Desktop/drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=iphone+12+pro+max%2B&crid=1ZLVI9GM6XZWH&sprefix=iphone+12+pro+max%2Caps%2C-1&ref=nb_sb_ss_ts-doa-p_1_13");
		Thread.sleep(5000);
		WebElement e =driver.findElement(By.xpath("//div[@data-index =1]/div/span/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/div/div/div/div/a/span[1]"));
		System.out.println(e.getText());
		driver.get("https://www.flipkart.com/search?q=mi+band4&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&as-pos=1&as-type=HISTORY&as-backfill=on");
		Thread.sleep(5000);
		WebElement f =driver.findElement(By.xpath("//div[.='mi Smart Band 4']/../../div[2]/div/div/div"));
		System.out.println(f.getText());
		driver.get("https://www.myntra.com/men-tshirts");
		Thread.sleep(5000);
		WebElement g =driver.findElement(By.xpath("//a[@href = 'tshirts/hrx-by-hrithik-roshan/hrx-by-hrithik-roshan-men-yellow-printed-round-neck-t-shirt/1700944/buy']/div[2]/div/span[1]/span[1]"));
		System.out.println(g.getText());
		driver.get("https://www.myntra.com/women-kurtas-kurtis-suits");
		Thread.sleep(5000);
		WebElement h =driver.findElement(By.xpath("//a[@href = 'kurta-sets/libas/libas-women-green-solid-kurta-with-trousers--dupatta/13169116/buy']/div[2]/div/span/span[1]"));
		System.out.println(h.getText());
		driver.get("https://www.myntra.com/boys-jeans-trousers");
		Thread.sleep(5000);
		WebElement i =driver.findElement(By.xpath("//a[@href = 'jeans/pepe-jeans/pepe-jeans-boys-blue-regular-fit-andrew-ip-clean-look-jeans/11273364/buy']/div[2]/div/span/span[1]"));
		System.out.println(i.getText());
		
		
	
	}

}
