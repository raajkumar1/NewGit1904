package selenium_tryout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_WaitUntil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 60);
//		WebDriverWait1 wait1=new WebDriverWait1(driver, 40);
		
		wait.until(ExpectedConditions.alertIsPresent());
		wait.until(ExpectedConditions.titleContains("actitimee"));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("taskSearchField"),null));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("FormModifiedDivButton")));
		wait.until(ExpectedConditions.urlContains("https://demo.actitime.com/user/submit_tt.do"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Logout")));
		
		
		WebElement logoutLink=driver.findElement(By.linkText("Logout"));
		logoutLink.click();
		

	}

}
