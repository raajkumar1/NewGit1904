package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Selenium_Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String FirstName="Raaju";
		String LastName="kumaar";
		String Email="arrow17911747b11@gmail.com";
		String Password="yKwXA1fmZWwW9V@Y1";
		String ConfirmPassword="yKwXA1fmZWwW9V@Y1";
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		WebElement RegisterLinkButton=driver.findElement(By.className("ico-register"));
		RegisterLinkButton.click();
		
		WebElement GenderRadioButton=driver.findElement(By.id("gender-male"));
		GenderRadioButton.click();
		
		WebElement FirstNameButton=driver.findElement(By.id("FirstName"));
		FirstNameButton.clear();
		FirstNameButton.sendKeys(FirstName);
		
		WebElement LastNameButton=driver.findElement(By.id("LastName"));
		LastNameButton.clear();
		LastNameButton.sendKeys(LastName);
		
		WebElement EmailTextField= driver.findElement(By.id("Email"));
		EmailTextField.clear();
		EmailTextField.sendKeys(Email);

		WebElement PasswordTextField= driver.findElement(By.id("Password"));
		PasswordTextField.clear();
		PasswordTextField.sendKeys(Password);

		WebElement ConfirmPasswordTextField= driver.findElement(By.id("ConfirmPassword"));
		ConfirmPasswordTextField.clear();
		ConfirmPasswordTextField.sendKeys(ConfirmPassword);
		
		WebElement RegisterButton=driver.findElement(By.id("register-button"));
		RegisterButton.click();
		
		if(driver.findElement(By.className("ico-logout")).isDisplayed()) {
			System.out.println("User is Registered");
			System.out.println("Testcase passed");
		}

		WebElement RegisterContinueButton=driver.findElement(By.className("register-continue-button"));
		RegisterContinueButton.click();
		
		if(driver.findElement(By.className("ico-logout")).isDisplayed()) {
			System.out.println("You are in Home Page");
		}
		
		
		
	}

}
