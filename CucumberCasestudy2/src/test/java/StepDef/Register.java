package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {
	WebDriver driver=null;
	@Given("registeration page is opened")
	public void registeration_page_is_opened() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignUp")).click();
		driver.findElement(By.name("userName")).sendKeys("haripriya9");
		driver.findElement(By.name("firstName")).sendKeys("hari");
		driver.findElement(By.name("lastName")).sendKeys("priya");
		driver.findElement(By.id("password")).sendKeys("hari123");
		driver.findElement(By.id("pass_confirmation")).sendKeys("hari123");
		driver.findElement(By.xpath("//input[@id='gender'][@value='Female']")).click();
		driver.findElement(By.id("emailAddress")).sendKeys("hari@gmail.com");
		driver.findElement(By.id("mobileNumber")).sendKeys("9547832361");
		driver.findElement(By.name("dob")).sendKeys("29/09/1997");
		driver.findElement(By.id("address")).sendKeys("coimbatore");
		driver.findElement(By.id("securityQuestion")).click();
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.name("answer")).sendKeys("red");
		driver.findElement(By.name("Submit")).click();
	}

	@Given("the user enters  username and password")
	public void the_user_enters_username_and_password() {
		driver.findElement(By.name("userName")).sendKeys("haripriya9");
		driver.findElement(By.id("password")).sendKeys("hari123");
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.name("Login")).click();
	}

	@Then("will find a testmeapp homepage")
	public void will_find_a_testmeapp_homepage() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
	}
}
