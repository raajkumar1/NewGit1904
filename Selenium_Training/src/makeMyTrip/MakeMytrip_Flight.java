package makeMyTrip;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMytrip_Flight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

		driver.get("https://www.makemytrip.com/");

		//        driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("delhi");
		Actions act=new Actions(driver);
		act.click().perform();
		WebElement flight = driver.findElement(By.xpath("(//span[text()='Flights'])[1]"));
		flight.click();


		LocalDateTime ldt = LocalDateTime.now().plusMonths(6); 
		String month =ldt.getMonth().toString();
		String month1 =month.substring(0,1).toUpperCase()+month.substring(1, 3).toLowerCase();
		int date = ldt.getDayOfMonth(); 
		int year=ldt.getYear();


		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[contains(@aria-label,' "+month1+" ')]/../..//p[text()='"+date+"']")).click();
				driver.close();
				break;
			}catch(Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		//		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		//driver.findElement(By.xpath("//div[contains(@aria-label,' "+month1+" "+date+" "+year+"')]")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
