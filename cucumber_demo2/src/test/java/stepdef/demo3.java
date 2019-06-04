package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demo3 {
	WebDriver driver = null;
	
	@Given("user is open the application")
	public void user_is_open_the_application() {
		  System.setProperty("webdriver.chrome.driver", "C:\\ruchi\\seleniumjar\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://10.232.237.143:443/TestMeApp/");
			driver.manage().window().maximize();
		 
	}

	@When("user clicks on the signin application")
	public void user_clicks_on_the_signin_application() {
		driver.findElement(By.linkText("SignIn")).click();
		System.out.println("the title of the page is"+driver.getTitle());  
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		  driver.findElement(By.name("password")).sendKeys(password);
		  driver.findElement(By.name("Login")).click();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
		  driver.close();
	}

	@Then("message displayed login successfully")
	public void message_displayed_login_successfully() {
	   
	}


}
