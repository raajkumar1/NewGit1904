package selenium_Iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_Mail_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("Devops235@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Robinson@999");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("rd_write")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class=\"rd_inp_to as-input\"]")).sendKeys("Devops235@rediffmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class=\"rd_inp_sub rd_subject_datacmp2\"]")).sendKeys("IMPORTANT MAIL");
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']")).sendKeys("Dear Raj I am writing today to inquire about the possibility of applying for a position as a teaching assistant at your university. This summer, I will be moving to your area. I was given your name by Dr. Nelson who was one of my professors at the University of Northern Realms.");
//		Thread.sleep(1000);
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class=\"cke_wysiwyg_frame cke_reset\"]"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//body[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]")).sendKeys("Dear Raj I am writing today to inquire about the possibility of applying for a position as a teaching assistant at your university. This summer, I will be moving to your area. I was given your name by Dr. Nelson who was one of my professors at the University of Northern Realms.");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
//		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[@class='send_ng_compo rd_btn_cmp_send']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='rd_active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//cite[@class=\"rd_mail_tickbox\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\'rd_fil_del\']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		Thread.sleep(3000);
//		driver.close();
		

		
	}

}
