package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws Throwable {

		System.out.println("The Automation Testing Started");
		
		System.out.println("Setting up the driver for chrome browser");
		        WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();

				
				System.out.println("Chrome browser started");
				
				driver.manage().window().maximize();
				
				//accessing the URL
				driver.get("http://leaftaps.com/opentaps/control/main");
				System.out.println("URL accessed successfully");
				
				//enter the username
				WebElement eusername = driver.findElement(By.id("username"));
				eusername.sendKeys("Demosalesmanager");
				System.out.println("Username entered Successfully");
				
				//enter the password
				WebElement epassword = driver.findElement(By.id("password"));
				epassword.sendKeys("crmsfa");
				System.out.println("Password entered Successfully");
				
				//click on login button
				WebElement login = driver.findElement(By.className("decorativeSubmit"));
				login.click();
				
				System.out.println("Logged in Successfully");

				
				//click on link
				WebElement link = driver.findElement(By.linkText("CRM/SFA"));
				link.click();
				System.out.println("Clicked on Link Successfully");
				Thread.sleep(5000);
				
				//Click on Leads option
				WebElement Leads = driver.findElement(By.linkText("Leads"));
				Leads.click();
				System.out.println("Clicked on Leads link Successfully");
				Thread.sleep(2000);
				
				//Click on find Leads
				WebElement fLeads = driver.findElement(By.linkText("Find Leads"));
				fLeads.click();
				System.out.println("Clicked on Find Leads link Successfully");
				Thread.sleep(2000);
				//click on phone tab
				WebElement Phone = driver.findElement(By.linkText("Phone"));
				Phone.click();
				System.out.println("Clicked on Phone successfully");
				
				
				//enter phone number
				WebElement phoneno = driver.findElement(By.xpath("//input[@type='text' and @name='phoneNumber']"));
				phoneno.sendKeys("5555555555");
				System.out.println("Entered phone number");
				
				//click on find Leads
				WebElement fleads = driver.findElement(By.xpath("//button[text()='Find Leads']"));	
				fleads.click();
				Thread.sleep(2000);
				
				//find first Lead ID
				WebElement firstlead = driver.findElement(By.xpath("//div[text()='Lead ID']//following::a[@class='linktext']"));
				String findfirstleadID = firstlead.getText();
				System.out.println(findfirstleadID);
				firstlead.click();
				
				//click on delete button
				WebElement dlead = driver.findElement(By.linkText("Delete"));
				dlead.click();
				Thread.sleep(5000);
				
				//Click on find Leads
				WebElement fLeads1 = driver.findElement(By.linkText("Find Leads"));
				fLeads1.click();
				System.out.println("Clicked on Find Leads link Successfully");
				
				//click on phone tab
				WebElement Phone1 = driver.findElement(By.linkText("Phone"));
				Phone1.click();
				System.out.println("Clicked on Phone successfully");
				
				
				//enter phone number
				WebElement phoneno1 = driver.findElement(By.xpath("//input[@type='text' and @name='phoneNumber']"));
				phoneno1.sendKeys("5555555555");
				System.out.println("Entered phone number");
				
				//click on find Leads
				WebElement fleads1 = driver.findElement(By.xpath("//button[text()='Find Leads']"));	
				fleads1.click();
				System.out.println("Clicked Find Leads");
				Thread.sleep(3000);
				String msg = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
				System.out.println(msg);
				
				
				driver.quit();
				
				
				
				
	}

}
