package tasks_0604;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFirstHalfinMultipleDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("file:///C:/Users/Lenovo/Videos/dropDown.html");
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement option = driver.findElement(By.id("m1"));
		Select select= new Select(option);
		int size=select.getOptions().size()-1;
		for(int i=0;i<size/2;i++) {
			select.selectByIndex(i);
		}
		System.out.println("The Selected options are");
		List<WebElement> value = select.getAllSelectedOptions();
		for(WebElement v:value) {
			System.out.println(v.getText());
		}
		Thread.sleep(3000);
		driver.close();

	}

}
