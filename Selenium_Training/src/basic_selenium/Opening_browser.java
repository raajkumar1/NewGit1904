package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opening_browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.reddit.com/");
//		driver.get("http://demowebshop.tricentis.com/");
//		String title=driver.getTitle();
//		System.out.println(title);
//		
//		String URL=driver.getCurrentUrl();
//		System.out.println(URL);
		
//		driver.navigate().to("file:///C:/Users/Lenovo/Videos/Notes/Selenium/new.html");
		driver.get("file:///C:/Users/Lenovo/Videos/Notes/Selenium/new.html");
//		driver.findElement(By.name("name")).click();
//		driver.findElement(By.linkText("name")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.tagName("label")).click();
		driver.findElement(By.className("namef")).click();
//		driver.close();
		
		

	}

}
