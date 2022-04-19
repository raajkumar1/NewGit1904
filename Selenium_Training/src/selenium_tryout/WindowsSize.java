package selenium_tryout;

import org.openqa.selenium.Dimension;

//import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		Dimension d=new Dimension(200,20);
		driver.manage().window().setSize(d);
		
		Point p= new Point(100,200);
		driver.manage().window().setPosition(p);
		
	}

}
