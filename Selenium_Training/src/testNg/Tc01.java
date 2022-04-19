package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc01 {
//	@Test public void demo(){
//		System.out.println("hello");
//	}
//	@Test(priority =1) public void demo1(){
//		System.out.println("hello One");
//	}
//	@Test(priority =-1) public void demo2(){
//		System.out.println("hello One");
//	}
//	@Test(priority =2) public void demo3(){
//		System.out.println("hello One");
//	}
	
	@Test public void demo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.close();
	}
		

}
