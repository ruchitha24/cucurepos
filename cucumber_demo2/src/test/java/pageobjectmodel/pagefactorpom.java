package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagefactorpom {
public static void main(String args[]) { 
	  System.setProperty("webdriver.chrome.driver", "C:\\ruchi\\seleniumjar\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		pageclass PObject =new pageclass(driver);
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		PObject.clicklink();
		String username = null;
		PObject.typeuname(username);
		String password = null;
		PObject.typepassword(password);
		PObject.clickloginlink();
		System.out.println("title of the page is "+driver.getTitle());
}
}
