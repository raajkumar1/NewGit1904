package actions_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions_Click {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://mamaearth.in/");
	driver.findElement(By.xpath("//button[@id='wzrk-cancel-id']")).click();
	Thread.sleep(1000);
//	WebElement element1= driver.findElement(By.xpath("//button[@id='wzrk-cancel-id']"));
//	element1.click(); //2
	
	driver.close();
}
}
