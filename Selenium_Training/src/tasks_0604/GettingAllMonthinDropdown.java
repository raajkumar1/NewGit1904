package tasks_0604;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GettingAllMonthinDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.fb.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement month = driver.findElement(By.id("month"));
		Select options= new Select(month);
		System.out.println("All available options in month dropdown");
		List<WebElement> element = options.getOptions();
		for(WebElement e:element) {
			System.out.println(e.getText());
		}
		driver.close();

	}

}
