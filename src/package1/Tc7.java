package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc7 {

	@Test
	public void continueBtn() throws Exception {
		WebDriver driver = new ChromeDriver();
		PageObjectClass tc7 = new PageObjectClass(driver);

		tc7.launchBrowser();
		tc7.username();
		tc7.password();
		tc7.loginBtn();
		tc7.backpackAddBtn();
		tc7.jacketAddBtn();
		tc7.cartBtn();
		tc7.checkoutBtn();
		boolean cntebtn = tc7.continuebutton.isEnabled();
		if (cntebtn == true) {
			System.out.println("Continue button enabled");
		} else {
			System.out.println("Continue button disabled");
		}
		tc7.logout();
		tc7.closeBrowser();
	}
}
