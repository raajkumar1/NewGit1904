package fb_login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ques_05 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\ECLworkspace\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		WebElement dropDown2 = driver.findElement(By.id("day"));
		Select sele1 = new Select(dropDown2);
		sele1.selectByVisibleText("27");
		Thread.sleep(3000);
		WebElement dropDown3 = driver.findElement(By.id("month"));
		Select sele2 = new Select(dropDown3);
		sele2.selectByIndex(5);
		Thread.sleep(3000);
		WebElement dropDown4 = driver.findElement(By.id("year"));
		Select sele3 = new Select(dropDown4);
		sele3.selectByValue("2012");
		Thread.sleep(3000);
		driver.close();
		

	}

}
