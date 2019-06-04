package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class pageimplementation {
@Test
public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\ruchi\\seleniumjar\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		driver.get("http:demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		pomdemo locateElements = PageFactory.initElements(driver, pomdemo.class);
        locateElements.loginmethod("ruchitha.obula@gmail.com","ruchi@497");
        
}
}
