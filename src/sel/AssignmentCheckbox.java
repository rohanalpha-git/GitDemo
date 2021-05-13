package sel;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AssignmentCheckbox {
		public static void main(String[] args) throws InterruptedException {
			System.out.println("line 1");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohan\\Desktop\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.findElement(By.id("checkBoxOption1")).click();
			System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
			driver.findElement(By.id("checkBoxOption1")).click();
			System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
			List <WebElement> sol= driver.findElements(By.cssSelector("[type='checkbox']"));
			System.out.println(sol.size());

    }
}
