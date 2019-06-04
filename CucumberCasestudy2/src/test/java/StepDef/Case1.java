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

public class Case1 {
	WebDriver driver=null;
	@Given("the login page is opened")
	public void the_login_page_is_opened() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-jars\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://10.232.237.143:443/TestMeApp/");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user enters lalitha as username")
	public void user_enters_lalitha_as_username() {
		 driver.findElement(By.id("userName")).sendKeys("lalitha");
	}

	@When("user enters password{int} as password")
	public void user_enters_password_as_password(Integer int1) {
		 driver.findElement(By.id("password")).sendKeys("password123");
	}

	@Then("user will Finds a testmeapp homepage")
	public void user_will_Finds_a_testmeapp_homepage() {
		driver.findElement(By.name("Login")).click();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("Larry added headphone to the cart")
	public void larry_added_headphone_to_the_cart() throws InterruptedException {
		Actions action=new Actions(driver);
		driver.findElement(By.id("myInput")).click();
		Thread.sleep(3000);
		action.sendKeys("Headphone").sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.linkText("Add to cart")).click();
	    
	}

	@When("Checkout for the payment")
	public void checkout_for_the_payment() {
	   driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
	   driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
	}

	@When("fills transaction details")
	public void fills_transaction_details() {
	    driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
	    driver.findElement(By.xpath("//label[contains(text(),'HDFC Bank')]")).click();
	    driver.findElement(By.id("btn")).click();
	}

	@Then("the product is successfully ordered")
	public void the_product_is_successfully_ordered() {
		driver.findElement(By.name("username")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("password123");
		driver.findElement(By.cssSelector(".user-right:nth-child(3)> input")).click();
	}

}
