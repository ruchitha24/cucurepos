package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demo2 {
	WebDriver driver = null;
	@Given("user login page is opened")
	public void user_login_page_is_opened() {
		   System.setProperty("webdriver.chrome.driver", "C:\\ruchi\\seleniumjar\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://10.232.237.143:443/TestMeApp/");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("SignIn")).click();
			System.out.println("the title of the page i"+driver.getTitle());
	}

	@When("user enters {string} as a username and {string} as password")
	public void user_enters_as_a_username_and_as_password(String string, String string2) {
		driver.findElement(By.id("userName")).sendKeys("Lalitha");
		  driver.findElement(By.id("password")).sendKeys("password123");
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		 driver.findElement(By.name("Login")).click();
	}

	@Then("will find a testmeapp homepage")
	public void will_find_a_testmeapp_homepage() {
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
	}


}
