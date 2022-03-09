package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) throws Throwable {

		System.out.println("The Automation Testing Started");

		System.out.println("Setting up the driver for chrome browser");
		        WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();

				
				System.out.println("Chrome browser started");
				
				driver.manage().window().maximize();
				
				//accessing the URL
				driver.get("http://leafground.com/pages/Link.html");
				System.out.println("URL accessed successfully");
				
				//Click on Go To Homepage Link
				WebElement HomeLink = driver.findElement(By.linkText("Go to Home Page"));
				HomeLink.click();
				Thread.sleep(2000);
				System.out.println(driver.getTitle());
				
				//Click on Link to display button page
				WebElement btnlink = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
				btnlink.click();
	}

}
