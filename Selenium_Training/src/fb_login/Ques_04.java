package fb_login;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\ECLworkspace\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		List<WebElement> element = driver.findElements(By.xpath("//a"));
		System.out.println(element.size());
		
		List<WebElement> a = driver.findElements(By.tagName("a"));
	    for( WebElement s:a) {
	    	System.out.println(s.getAttribute("href")+": "+s.getText());}
	    driver.close();

	}

	
}
