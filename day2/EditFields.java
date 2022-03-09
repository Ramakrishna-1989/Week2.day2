package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) throws Throwable {

		System.out.println("The Automation Testing Started");

		System.out.println("Setting up the driver for chrome browser");
		        WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();

				
				System.out.println("Chrome browser started");
				
				driver.manage().window().maximize();
				
				//accessing the URL
				driver.get("http://leafground.com/pages/Edit.html");
				System.out.println("URL accessed successfully");
				
				//Enter email address
				WebElement email = driver.findElement(By.id("email"));
				email.sendKeys("Test@123");
				System.out.println("Entered Email successfully");
				
				//Append text and press tab
				WebElement append = driver.findElement(By.xpath("//input[@type='text' and @value='Append ']"));
				append.sendKeys("Text area" + Keys.END);
				append.sendKeys(Keys.TAB);
				
				//Get the default text.
				WebElement dtext = driver.findElement(By.xpath("//input[@type='text' and @name='username' and @value='TestLeaf']"));
				dtext.getAttribute("TestLeaf");
				System.out.println("Got the default text succesfully");
				
				//clear text
				WebElement ctext = driver.findElement(By.xpath("//input[@type='text' and @name='username' and @value='Clear me!!']"));
				ctext.clear();
				System.out.println("Text Cleared Successfully");
				
				//text field disabled check
				boolean textfield = driver.findElement(By.xpath("//input[@type='text' and @disabled='true']")).isEnabled();
				if(textfield==false) {
					System.out.println("Text field is Disabled");
				}else {
					System.out.println("Text Field is Enabled");
				}
				
				Thread.sleep(2000);
				
				driver.close();
				
	}

}
