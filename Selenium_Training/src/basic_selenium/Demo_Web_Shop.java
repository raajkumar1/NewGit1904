package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Web_Shop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		WebElement Top=driver.findElement(By.linkText("Register"));
		Top.click();
		WebElement Top1=driver.findElement(By.partialLinkText("Log"));
		Top1.click();
		WebElement Top2=driver.findElement(By.partialLinkText("Shopping"));
		Top2.click();
		WebElement Top3=driver.findElement(By.linkText("Wishlist"));
		Top3.click();
		Thread.sleep(4000); 
		
		WebElement Section=driver.findElement(By.linkText("BOOKS"));
		Section.click();
		WebElement Section1=driver.findElement(By.linkText("COMPUTERS"));
		Section1.click();
		WebElement Section2=driver.findElement(By.linkText("ELECTRONICS"));
		Section2.click();
		WebElement Section3=driver.findElement(By.partialLinkText("APPAREL"));
		Section3.click(); 
		WebElement Section4=driver.findElement(By.partialLinkText("DIGITAL"));
		Section4.click();
		WebElement Section5=driver.findElement(By.linkText("JEWELRY"));
		Section5.click();
		WebElement Section6=driver.findElement(By.partialLinkText("GIFT"));
		Section6.click();
		Thread.sleep(4000); 
		
		WebElement Categories=driver.findElement(By.linkText("Books"));
		Categories.click();	
		WebElement Categories1=driver.findElement(By.linkText("Computers"));
		Categories1.click();
		WebElement Categories2=driver.findElement(By.linkText("Electronics"));
		Categories2.click();
		WebElement Categories3=driver.findElement(By.partialLinkText("Apparel"));
		Categories3.click();
		WebElement Categories4=driver.findElement(By.partialLinkText("Digital"));
		Categories4.click();
		WebElement Categories5=driver.findElement(By.linkText("Jewelry"));
		Categories5.click();
		WebElement Categories6=driver.findElement(By.partialLinkText("Gift"));
		Categories6.click();

		WebElement Section44=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[1]/strong"));
		Section44.click();
		Thread.sleep(3000); 
		
	}

}
