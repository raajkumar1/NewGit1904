package mama_earth;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MamaEarthMousehover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://mamaearth.in/");
		driver.findElement(By.xpath("//button[@id='wzrk-cancel-id']")).click();
		Thread.sleep(1000);
		
		WebElement element1= driver.findElement(By.linkText("BEAUTY"));
		Actions act= new Actions(driver);
		act.moveToElement(element1).perform();
//		act.moveByOffset(425, 45).perform();
		//using xy coordinates plugin to click on particular coordinates
//		act.doubleClick().perform();
//		act.contextClick(element1).perform();
		
//		WebElement source=driver.findElement(By.id("draggable"));
//		WebElement dest= driver.findElement(By.id("droppable"));
//		act.dragAndDrop(source, dest);
//		act.dragAndDropBy(source, 270, 150);
//		element1.click();
		driver.close();
		

	}

}
