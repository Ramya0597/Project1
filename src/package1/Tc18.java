package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc18 {

	@Test
	public void cancelButton() throws Exception {
		WebDriver driver = new ChromeDriver();
		PageObjectClass tc18 = new PageObjectClass(driver);
		tc18.launchBrowser();
		tc18.username();
		tc18.password();
		tc18.loginBtn();
		tc18.jacketAddBtn();
		tc18.backpackAddBtn();
		tc18.cartBtn();
		tc18.checkoutBtn();
		boolean checkoutbtnEnable = tc18.cancelbtn.isEnabled();
		if (checkoutbtnEnable == true) {
			System.out.println("Cancel Button enabled");
		} else {
			System.out.println("Cancel Button disabled");
		}
		Thread.sleep(1000);
		tc18.logout();
		tc18.closeBrowser();
	}
}
