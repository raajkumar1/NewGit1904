package select_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown_Method1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.linkText("Create New Account")).click();
//
//		WebElement dropDown = driver.findElement(By.id("month"));
//		Select select = new Select(dropDown);
//		select.selectByIndex(20);
//		select.selectByValue("May");
		

		driver.get("file:///C:/Users/Lenovo/Videos/dropDown.html");
//		WebElement dropDown1 = driver.findElement(By.id("s1"));
//		Select sele = new Select(dropDown1);
//		System.out.println(sele.isMultiple());
//		sele.selectByValue("6");
//		Thread.sleep(3000);
//		
//		sele.selectByIndex(3);
//		Thread.sleep(3000);
		WebElement dropDown2 = driver.findElement(By.id("m1"));
		Select sele1 = new Select(dropDown2);
		sele1.getOptions();
		List <WebElement> size=sele1.getOptions();
		for(int i=0;i<=size.size()-1;i++) {
			sele1.selectByIndex(i);
			Thread.sleep(3000);
		}
		System.out.println(sele1.isMultiple());
		sele1.selectByVisibleText("Jackfruit");
		Thread.sleep(3000);
		sele1.selectByIndex(2);
		Thread.sleep(3000);
		sele1.selectByValue("2");
		Thread.sleep(3000);
	
		
		sele1.deselectByVisibleText("Jackfruit");
		Thread.sleep(3000);
		sele1.deselectByIndex(2);
		Thread.sleep(3000);
		sele1.selectByValue("2");
		Thread.sleep(3000);
		sele1.selectByIndex(3);
		sele1.selectByIndex(1);
		sele1.deselectAll();
		
		driver.close();
		
		
		
		
		
		
		
		

	}

}
