package fb_login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques_06 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\ECLworkspace\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("@$123456");
		driver.findElement(By.xpath("//button[@type='button']")).click();

	}

}
