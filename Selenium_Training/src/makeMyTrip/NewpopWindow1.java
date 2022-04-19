package makeMyTrip;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewpopWindow1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("file:///C:/Users/Lenovo/Videos/Notes/MultipleWindow.html");
		WebElement Element_01 = driver.findElement(By.xpath("//input[@type='button']"));
		Element_01.click();
		Set<String> w= driver.getWindowHandles();
		String title="Easy Recipes, Healthy Eating Ideas and Chef Recipe Videos | Food Network";
//		driver.close();
		Thread.sleep(3000);
		for(String t:w) {
			driver.switchTo().window(t);
			
			
			
			if(title.equalsIgnoreCase(driver.getTitle())) {
				driver.manage().window().maximize();
			}else {
				driver.close();
			}
		}


	}

}
