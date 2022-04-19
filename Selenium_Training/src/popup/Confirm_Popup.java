package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirm_Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://licindia.in/");

		driver.findElement(By.xpath("//i[@class='fa fa-calculator']")).click();
		Alert alt = driver.switchTo().alert();
		String txt = alt.getText();
		System.out.println(txt);
		Thread.sleep(2000);
		alt.accept();

	}

}
