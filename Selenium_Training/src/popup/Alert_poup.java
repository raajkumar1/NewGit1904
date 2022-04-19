package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_poup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.get("http://demowebshop.tricentis.com/");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert alt=driver.switchTo().alert();
		String txt = alt.getText();
		System.out.println(txt);
		Thread.sleep(1000);
		alt.accept();
		driver.close();



		//		driver.switchTo().frame(0);
		//		WebElement element1= driver.findElement(By.xpath("(//iframe[\"iframeResult\"])[2]"));
		//	    driver.switchTo().frame(0);
		//	    driver.findElement(By.tagName("button")).click();




	}

}
