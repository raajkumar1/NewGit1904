package mama_earth;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_op {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://mamaearth.in/");

		driver.findElement(By.xpath("//button[@id='wzrk-cancel-id']")).click();
		Thread.sleep(1000);
		
		WebElement elements= driver.findElement(By.xpath("//input[@placeholder='Search for products...']"));
		elements.clear();
		elements.sendKeys("Baby oil");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='addTocart_desktop']")).click();
		Thread.sleep(2000);
		
		WebElement element= driver.findElement(By.xpath("//input[@placeholder='Search for products...']"));
		element.clear();
		element.sendKeys("face");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='addTocart_desktop']")).click();
		Thread.sleep(3000);

		WebElement element1= driver.findElement(By.xpath("//input[@placeholder='Search for products...']"));
		element1.clear();
		element1.sendKeys("face wash");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='addTocart_desktop']")).click();
		Thread.sleep(3000);
		
		WebElement element2= driver.findElement(By.xpath("//input[@placeholder='Search for products...']"));
		
		element2.clear();
		element2.sendKeys("gift");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='addTocart_desktop']")).click();
		Thread.sleep(3000);
		
		WebElement element3= driver.findElement(By.xpath("//input[@placeholder='Search for products...']"));
		element3.clear();
		element3.sendKeys("Hand cream");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='addTocart_desktop']")).click();
		Thread.sleep(3000);
		
		WebElement element4= driver.findElement(By.xpath("//input[@placeholder='Search for products...']"));
		element4.clear();
		element4.sendKeys("Conditioner");
		Thread.sleep(3000);
		
		
//		driver.findElement(By.xpath("//span[@class='addTocart_desktop']")).click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='icon-label']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@class='icon-holder'])[3]")).click();
		Thread.sleep(3000);
		
		
		
//		driver.switchTo().defaultContent();
//		driver.close();


}
}
