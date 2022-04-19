package mama_earth;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Max_op {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.maxfashion.in/in/en/department/maxmen");
		
		WebElement Element1 = driver.findElement(By.xpath("//input[@id='js-site-search-input']"));
		Element1.clear();
		Element1.sendKeys("Men tshirts");
//		Thread.sleep(1000);
		Element1.click();
		
//		driver.findElement(By.xpath("//a[@tabindex='0']")).click();
//		driver.findElement(By.xpath("(//span[@class='MuiButton-label'])")).click();
		Thread.sleep(3000);
		
//		WebElement Element2 = driver.findElement(By.xpath("//input[@id='js-site-search-input']"));
//		Element2.clear();
//		Element2.sendKeys("Men jeans");
//		Thread.sleep(3000);
		
//		driver.close();
		

	}

}
