package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc12 {

	@Test
	public void productAddbtn() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		PageObjectClass tc12 = new PageObjectClass(driver);
		tc12.launchBrowser();
		tc12.username();
		tc12.password();
		tc12.loginBtn();
		tc12.productBL();
		tc12.bLAddBtn();
		tc12.logout();
		tc12.closeBrowser();
	}

}
