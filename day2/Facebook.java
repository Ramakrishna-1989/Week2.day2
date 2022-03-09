package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws Throwable {

		System.out.println("The Automation Testing Started");
		
		System.out.println("Setting up the driver for chrome browser");
		        WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();

				//accessing the URL
				driver.get("https://en-gb.facebook.com/");
				System.out.println("URL accessed successfully");
				
				//click on create new button
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				WebElement clckbtn = driver.findElement(By.linkText("Create New Account"));
				clckbtn.click();
				
				//enter firstname
				WebElement fname = driver.findElement(By.name("firstname"));
				fname.sendKeys("julie");
				
			
				//enter secondname
				WebElement lname = driver.findElement(By.name("lastname"));
				lname.sendKeys("tamara");
				
				System.out.println("Entered Firstname and Lastname Successfully");

				
				//register email id
				WebElement regmail = driver.findElement(By.name("reg_email__"));
				regmail.sendKeys("rebba123@gmail.com");
				Thread.sleep(2000);
				
				//re-enter email id
				WebElement email = driver.findElement(By.xpath("//input[@type='text' and @name='reg_email_confirmation__']"));
				email.sendKeys("rebba123@gmail.com");
				
				System.out.println("Entered and re-entered Email address Successfully");
				
				
				//new password
				WebElement pw = driver.findElement(By.id("password_step_input"));
				pw.sendKeys("Test@123");
				
				System.out.println("Entered Password Successfully");
				
				Select day = new Select(driver.findElement(By.id("day")));
				day.selectByValue("11");
				
				Select month = new Select(driver.findElement(By.id("month")));
				month.selectByValue("12");
				
				Select year = new Select(driver.findElement(By.id("year")));
				year.selectByVisibleText("1988");
				
				System.out.println("Entered date of bith details successfully");
				
				WebElement gender = driver.findElement(By.xpath("//input[@type='radio' and @class='_8esa' and @value='1']"));
				gender.click();
				
				System.out.println("Selected gender successfully");
				
				//click on signup
				WebElement submit = driver.findElement(By.xpath("//button[@type='submit' and @name='websubmit']"));
				submit.click();
				
				System.out.println("Signed up Successfully");
				
				Thread.sleep(5000);
				System.out.println(driver.getTitle());
				
				driver.quit();
				
	}

}
