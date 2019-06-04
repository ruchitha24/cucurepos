package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demo1 {
	WebDriver driver = null;
	
	@Given("the login page is opened")
	public void the_login_page_is_opened() {
	   System.setProperty("webdriver.chrome.driver", "C:\\ruchi\\seleniumjar\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://10.232.237.143:443/TestMeApp/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("SignIn")).click();
	System.out.println("the title of the page i"+driver.getTitle());
	}

	@When("user enters lalitha as username")
	public void user_enters_lalitha_as_username() {
	   driver.findElement(By.id("userName")).sendKeys("Lalitha");
	}

	@When("user enters password{int} as password")
	public void user_enters_password_as_password(Integer int1) {
	   driver.findElement(By.id("password")).sendKeys("password123");
	   
	}

	@Then("user will find A TESTMEAPP homepage")
	public void user_will_find_A_TESTMEAPP_homepage() {
	  driver.findElement(By.name("Login")).click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
	}


}
