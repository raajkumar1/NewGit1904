package demo_actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_actitime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//a[@class='content users']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@class='components_button withPlusIcon']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("createUserPanel_firstNameField")).sendKeys("sdvdv");
		 Thread.sleep(3000);
		 driver.findElement(By.id("createUserPanel_lastNameField")).sendKeys("sdfsdc");
		 Thread.sleep(3000);
         driver.findElement(By.id("createUserPanel_emailField")).sendKeys("sdsd@gmail.com");
		 Thread.sleep(3000);
         driver.findElement(By.className("components_button submitBtn")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@id=\"logoutLink\"]")).click();
		 driver.close();

	}

}
