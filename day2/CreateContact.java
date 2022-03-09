package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

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
				
				Thread.sleep(2000);
				//click on contacts
				WebElement contacts = driver.findElement(By.linkText("Contacts"));
				contacts.click();
				System.out.println("Clicked on contacts");
				
				//click on create contact
				WebElement ccontact = driver.findElement(By.linkText("Create Contact"));
				ccontact.click();
				
				//enter firstname
				WebElement fname = driver.findElement(By.id("firstNameField"));
				fname.sendKeys("Ramakrishna");
				System.out.println("Firstname entered Successfully");
				
				//enter Lastname
				WebElement lname = driver.findElement(By.id("lastNameField"));
				lname.sendKeys("Duvuri");
				System.out.println("Lastname entered Successfully");
				
				//enter firstname-local
				WebElement fnamel = driver.findElement(By.id("createContactForm_firstNameLocal"));
				fnamel.sendKeys("Ram");
				System.out.println("Firstname-local entered Successfully");
				
				//enter Lastname-local
				WebElement lnamel = driver.findElement(By.id("createContactForm_lastNameLocal"));
				lnamel.sendKeys("DV");
				System.out.println("Lastname-local entered Successfully");
				
				//enter department
				WebElement dept = driver.findElement(By.id("createContactForm_departmentName"));
				dept.sendKeys("Testin");
				System.out.println("Department entered Successfully");
				
				//Enter description 
				WebElement desc = driver.findElement(By.xpath("//textarea[@class='inputBox' and @name='description']"));
				desc.sendKeys("Verify the contacts creation in the page");
				System.out.println("Description Added Successfully");
				
				//enter email field
				WebElement email = driver.findElement(By.id("createContactForm_primaryEmail"));
				email.sendKeys("Test@gmail.com");
				System.out.println("Entered Email Successfully");
				
				//Enter state/province
				Select state = new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
				state.selectByVisibleText("Florida");
				System.out.println("Selected State Successfully");
				
				//click on create contact button
				WebElement contact = driver.findElement(By.xpath("//input[@type='submit']"));
				contact.click();
				System.out.println("Clicked on create contact Successfully");
				
				Thread.sleep(2000);
				
				//Click on Edit 
				WebElement edit = driver.findElement(By.linkText("Edit"));
				edit.click();
				System.out.println("clicked on edit button successfully");
				
				Thread.sleep(2000);
				//Enter description 
				WebElement desc1 = driver.findElement(By.xpath("//textarea[@class='inputBox' and @name='description']"));
				System.out.println("Description Added Successfully");
				desc1.clear();
				
				//enter important note field
				WebElement impnote = driver.findElement(By.id("updateContactForm_importantNote"));
				impnote.sendKeys("important note to verify the test laps portal functionality");
				System.out.println("important note entered successfully");
				
				//click on update button
				WebElement update = driver.findElement(By.xpath("//input[@type='submit' and @value='Update']"));
				update.click();
				System.out.println("Clicked on Update Successfully");
				
				Thread.sleep(2000);
				
				// get title
				
				System.out.println(driver.getTitle());
				
				driver.quit();
				
		}

}
