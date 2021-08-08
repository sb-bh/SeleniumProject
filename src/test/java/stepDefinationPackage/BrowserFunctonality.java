package stepDefinationPackage;


import java.util.Set;
import java.util.concurrent.TimeUnit;

//import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BrowserFunctonality {

	WebDriver driver = null;
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/about");
		
		
	   System.out.println("Welcome to my world"); 
	}

	@Given("some other precondition")
	public void some_other_precondition() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Welcome to my world");
			
	}

	@When("enter the user details")
	public void i_complete_action() throws InterruptedException {
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Create an account")).click();// create account
		
		
		Thread.sleep(1000);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		for(String createaccount : driver.getWindowHandles())
		{	
			driver.switchTo().window(createaccount);
		}
		System.out.println(driver.getTitle());
		//driver.switchTo().window(null);
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		//Thread.sleep(1000);
	    
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("shweta");
		
		
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("bharaske");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("s.bharaske36");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("s@1234567890");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("s@1234567890");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();//click on next btn
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.findElement(By.xpath("//*[@id=\"phoneNumberId\"]")).sendKeys("7066621686");
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();//click on next btn
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();//call instead
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();//verify
		System.out.println("Welcome to my world");
	}

	@When("some other action")
	public void some_other_action() {
		
		 System.out.println("Welcome to my world");
	}

	@When("yet another action")
	public void yet_another_action() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Welcome to my world");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Welcome to my world");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Welcome to my world");
	}
	
}
