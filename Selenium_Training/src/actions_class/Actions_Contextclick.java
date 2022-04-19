package actions_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Contextclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		//driver.switchTo().frame(0);
//		WebElement element1= driver.findElement(By.linkText("Button X"));
		WebElement ele = driver.findElement(By.id("checkbox2"));
	Actions act= new Actions(driver);
	act.contextClick(ele).perform();
//		act.contextClick().moveByOffset(22, 100).click().perform();
		

	}

}
