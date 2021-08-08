package stepDefinationPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookLoginFunctionality {
	
	WebDriver driver = null; 
	@Given("^open instagram page$")
	public void open_facebook_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
	    
	}
	

	@When("^Enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void enter_username_as_and_password_as(String username, String password) throws Throwable {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		Thread.sleep(5000);
		
		Boolean b = driver.findElement(By.name("username")).isEnabled();
		System.out.println(b);
	    driver.findElement(By.name("username")).sendKeys(username);
	    
	    driver.findElement(By.name("password")).sendKeys(password);
	    
	    driver.findElement(By.id("loginForm")).click();
	    Thread.sleep(8000);
	    }

	@Then("^login should be unsuccesful$")
	public void login_should_be_unsuccesful() throws Throwable {
		String expectedUrl = "https://www.instagram.com/";
	    //driver.get(expectedUrl);
	    
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	    
	    if(expectedUrl.equals(driver.getCurrentUrl()))
	    {
	        System.out.println("Fail");
	    }
	    else
	    {
	        System.out.println("Pass");
	    }
	    driver.close();
	}

	
	
	
	

}
