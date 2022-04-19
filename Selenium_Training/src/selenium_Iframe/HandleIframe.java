package selenium_Iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.tripodeal.com/hotels");
		WebElement frameElement = driver.findElement(By.id("tpcwl_iframe"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.id("hotels-dates-checkin-prepop-whitelabel_en")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("mewtwo-datepicker-2022-4-30")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
