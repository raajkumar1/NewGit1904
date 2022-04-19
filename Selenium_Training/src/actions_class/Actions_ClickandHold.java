package actions_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_ClickandHold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
		Actions act=new Actions(driver);

		WebElement source=driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-arrowthick-2-n-s'])[2]"));
		Thread.sleep(3000);
		act.clickAndHold(source).moveByOffset(185,185).release().perform();
		
//		WebElement dest= driver.findElement(By.id("droppable"));
//		driver.close();

	}

}
