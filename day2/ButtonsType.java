package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonsType {

	public static void main(String[] args) throws Throwable {

		System.out.println("The Automation Testing Started");

		System.out.println("Setting up the driver for chrome browser");
		        WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();

				
				System.out.println("Chrome browser started");
				
				driver.manage().window().maximize();
				
				//accessing the URL
				driver.get("http://leafground.com/pages/Button.html");
				System.out.println("URL accessed successfully");
				
				//click on button to navigate to homepage
				WebElement cbtn=driver.findElement(By.id("home"));
				cbtn.click();
				System.out.println(driver.getTitle());
				
				driver.navigate().back();
				
				//find position of button x and y
				WebElement posbtn = driver.findElement(By.id("position"));
				Point pos=posbtn.getLocation();
				System.out.println(pos);
				
				Thread.sleep(2000);
				
				//color of button
				WebElement color = driver.findElement(By.id("color"));
				String col = color.getCssValue("background-color");
				System.out.println(col);
				
				
				//size of button
				WebElement size = driver.findElement(By.id("size"));
				Dimension sz = size.getSize();
				System.out.println(sz);
				
				

				
	}

}
