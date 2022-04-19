package select_dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleopt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		((WebElement) driver.findElements(By.className("//input[@class='react-autosuggest__input react-autosuggest__input--open']"))).sendKeys("Bengalore");
		List<WebElement> search1 = driver.findElements(By.xpath("//p[text()="));
		for(WebElement element:search1) {
			System.out.println(element.getText());
		}


	}

}
