package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs_Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String Email="standard_user";
//		String Password="secret_sauce";
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement EmailTextField= driver.findElement(By.id("user-name"));
//		EmailTextField.click();
		EmailTextField.clear();
		EmailTextField.sendKeys("standard_user");
		
		WebElement PasswordField= driver.findElement(By.id("password"));
		PasswordField.clear();
		PasswordField.sendKeys("secret_sauce");
		
		WebElement LoginButton=driver.findElement(By.id("login-button"));
		LoginButton.click();
		
		
		
		
		
		

	}

}
