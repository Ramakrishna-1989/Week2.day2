package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeTestAssginment {

	public static void main(String[] args) throws Throwable {

System.out.println("The Automation Testing Started");
		
System.out.println("The Automation Testing Started");

System.out.println("Setting up the driver for chrome browser");
        WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		
		System.out.println("Chrome browser started");
		
		driver.manage().window().maximize();
		
		//accessing the URL
		driver.get("https://acme-test.uipath.com/login");
		System.out.println("URL accessed successfully");
		
		//Entered User credentials
		WebElement usr = driver.findElement(By.id("email"));
		usr.sendKeys("kumar.testleaf@gmail.com");
		WebElement pw = driver.findElement(By.id("password"));
		pw.sendKeys("leaf@12");

		System.out.println("Entered Username and Password Successfully");
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit' and @class='btn btn-primary']"));
		login.click();
		System.out.println("Logged in Successfully");
		
		
		//get page tile and print it.
		System.out.println(driver.getTitle());
		
		//Click on logout
		WebElement logout = driver.findElement(By.linkText("Log Out"));
		logout.click();
		System.out.println("Logged Out Successfully");
		Thread.sleep(2000);
		//close the browser
		driver.close();
		System.out.println("Closed the browser successfully");
}
}