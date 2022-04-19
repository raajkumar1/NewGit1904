package selenium_tryout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization_implicitlyWait {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("raaj_alpha");
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("9750364246");
		driver.findElement(By.tagName("//button[@type='submit']")).click();



	}

}
