package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc13 {
	
	@Test
	public void cartBtn() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		PageObjectClass tc13 = new PageObjectClass(driver);
		tc13.launchBrowser();
		tc13.username();
		tc13.password();
		tc13.loginBtn();
		tc13.cartBtn();
		tc13.logout();
		tc13.closeBrowser();		
	}

}
