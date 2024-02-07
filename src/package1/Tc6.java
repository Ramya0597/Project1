package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc6 {

	@Test
	public void checkbtn() throws Exception {
		WebDriver driver = new ChromeDriver();
		PageObjectClass tc6 = new PageObjectClass(driver);

		tc6.launchBrowser();
		tc6.username();
		tc6.password();
		tc6.loginBtn();
		tc6.backpackAddBtn();
		tc6.jacketAddBtn();
		tc6.cartBtn();
		boolean checkoutbtn = tc6.checkout.isEnabled();
		if (checkoutbtn == true) {
			System.out.println("Checkout button is enabled");
		} else {
			System.out.println("Checkout button disabled");
		}
		tc6.logout();
		tc6.closeBrowser();
	}
}
