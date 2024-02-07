package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc8 {

	@Test
	public void checkoutProcess() throws Exception {
		WebDriver driver = new ChromeDriver();
		PageObjectClass tc8 = new PageObjectClass(driver);
		tc8.launchBrowser();
		tc8.username();
		tc8.password();
		tc8.loginBtn();
		tc8.backpackAddBtn();
		tc8.jacketAddBtn();
		tc8.cartBtn();
		tc8.checkoutBtn();
		tc8.firstName();
		tc8.lastName();
		tc8.postalcode();
		tc8.continueBtn();
		tc8.closeBrowser();
	}

}
