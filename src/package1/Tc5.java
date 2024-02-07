package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc5 {

	@Test
	public void productCart() throws Exception {
		WebDriver driver = new ChromeDriver();
		PageObjectClass tc5 = new PageObjectClass(driver);

		tc5.launchBrowser();
		tc5.username();
		tc5.password();
		tc5.loginBtn();
		tc5.backpackAddBtn();
		tc5.jacketAddBtn();
		tc5.cartBtn();
		tc5.logout();
		tc5.closeBrowser();

	}

}
