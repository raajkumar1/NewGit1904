package tasks_0604;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GettingAllMonths_inDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.fb.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement month = driver.findElement(By.id("month"));
		Select options= new Select(month);
		System.out.println("All available options in month dropdown are");
		List<WebElement> element = options.getOptions();
		ArrayList<WebElement> a= new ArrayList<WebElement>(element);
		TreeSet<String> b=new TreeSet<String>();
		for(WebElement e:a) {
			b.add(e.getText());
		}
		System.out.println(b);
		driver.close();

	}

}
