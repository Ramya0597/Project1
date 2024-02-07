package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc19 {

	@Test
	public void cancelButtonWorking() throws Exception {
		WebDriver driver = new ChromeDriver();
		PageObjectClass tc19 = new PageObjectClass(driver);
		tc19.launchBrowser();
		tc19.username();
		tc19.password();
		tc19.loginBtn();
		tc19.jacketAddBtn();
		tc19.backpackAddBtn();
		tc19.cartBtn();
		tc19.checkoutBtn();
		tc19.cancelBtn();
		tc19.logout();
		tc19.closeBrowser();
	}

}
