package selenium_tryout;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotofWebpage {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		WebElement element = driver.findElement(By.xpath("//img[contains(@alt,'Mivi Duopods F30 with 42 hours battery Fast Charging TWS Bluetooth Headset')]"));
		File SrcFile = element.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		File file=new File("./snap1/screen.png");
		FileHandler.copy(SrcFile,file);


	}

}
