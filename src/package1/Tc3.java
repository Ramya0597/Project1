package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc3 {

	@Test
	public void textValidData() throws Exception {
		WebDriver driver=new ChromeDriver();
		PageObjectClass tc3=new PageObjectClass(driver);
		
		tc3.launchBrowser();
		tc3.username();
		tc3.password();
		tc3.loginBtn();
		tc3.logout();
		tc3.closeBrowser();	

	}

}
