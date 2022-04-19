package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Web_Shop_Css {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		WebElement Subscribe=driver.findElement(By.cssSelector("input[value='newsletter-subscribe-button']"));
		Thread.sleep(5000);
		Subscribe.click();
		Thread.sleep(5000);


	}

}
