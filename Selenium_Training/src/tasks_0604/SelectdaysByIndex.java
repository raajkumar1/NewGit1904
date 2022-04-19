package tasks_0604;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectdaysByIndex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.fb.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement day = driver.findElement(By.id("day"));
		Select options= new Select(day);
		options.selectByIndex(2);
		System.out.println("The selected option is 3");
		Thread.sleep(3000);
		driver.close();

	}

}
