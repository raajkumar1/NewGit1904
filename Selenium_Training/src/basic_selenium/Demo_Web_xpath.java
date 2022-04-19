package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Web_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");

		//
		//		WebElement Section44=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[2]/div/div[2]/div[3]/div[2]/input"));
		//		Section44.click();
		//
		//		WebElement Section46=driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
		//		Section46.click();
		//		WebElement Section45=driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
		//		Section45.click();
		//
		//		WebElement Section47=driver.findElement(By.xpath("//label[text()='Excellent']"));
		////		Section47.click(); //xpath by text
		//		WebElement Section48=driver.findElement(By.xpath("//input[@value='Search']"));
		//		Section48.click(); //xpath by attribute

		//		WebElement Section49=driver.findElement(By.xpath("//a[contains(text(),'downloads')]"));
		//		Section49.click(); //xpath by contains text

		//		WebElement Section50=driver.findElement(By.xpath("//a[contains(@value,'Search')]"));
		//		Section50.click(); //error




	}

}
