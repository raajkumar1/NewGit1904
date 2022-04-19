package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Selenium_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Email="arrow1791747b@gmail.com";
		String Password="yKwXAfmZWwW9V@Y";

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// Upcasted to webdriver
		driver.manage().window().maximize();//windows maximized
		driver.get("http://demowebshop.tricentis.com/");

		WebElement Login= driver.findElement(By.className("ico-login"));
		Login.click();
		WebElement EmailTextField= driver.findElement(By.id("Email"));
		EmailTextField.clear();
		EmailTextField.sendKeys(Email);
		WebElement PasswordTextField= driver.findElement(By.id("Password"));
		PasswordTextField.clear();
		PasswordTextField.sendKeys(Password);
		WebElement LoginButton=driver.findElement(By.className("login-button"));
		LoginButton.click();

		if(driver.findElement(By.className("ico-logout")).isDisplayed()) {
			System.out.println("User is Logged");
			System.out.println("Testcase passed");
		}







	}

}
