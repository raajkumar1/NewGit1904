package selenium_tryout;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sync_CustomWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement element=driver.findElement(By.linkText("apparel"));
		WebElement element2=driver.findElement(By.id("logoutLink"));
		int i=0;
		while(i<=50) {
			try {
			element.click();
			break;
				
			}
			catch(NoSuchElementException e) {
				i++;
			}
			
		}
		
		

	}

}
