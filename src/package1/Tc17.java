package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc17 {

	@Test
	public void continueShpngWorking() throws Exception {
		WebDriver driver = new ChromeDriver();
		PageObjectClass tc17 = new PageObjectClass(driver);
		tc17.launchBrowser();
		tc17.username();
		tc17.password();
		tc17.loginBtn();
		tc17.jacketAddBtn();
		tc17.cartBtn();
		tc17.continueShopping();
		tc17.logout();
		tc17.closeBrowser();
	}

}
