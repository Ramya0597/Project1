package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc10 {

	@Test
	public void filter() throws Exception  {
		WebDriver driver = new ChromeDriver();
		PageObjectClass tc10 = new PageObjectClass(driver);
		tc10.launchBrowser();
		tc10.username();
		tc10.password();
		tc10.loginBtn();
		tc10.filter();
		tc10.logout();
		tc10.closeBrowser();
	}

}
