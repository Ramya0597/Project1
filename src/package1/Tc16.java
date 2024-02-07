package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc16 {

	@Test
	public void ContinueshpngEnable() throws Exception {
		WebDriver driver = new ChromeDriver();
		PageObjectClass tc16 = new PageObjectClass(driver);
		tc16.launchBrowser();
		tc16.username();
		tc16.password();
		tc16.loginBtn();
		tc16.backpackAddBtn();
		tc16.jacketAddBtn();
		tc16.cartBtn();
		boolean continueShpngEnable = tc16.ContinueShpngBtn.isEnabled();
		if (continueShpngEnable == true) {
			System.out.println("Continue Shopping Button enabled");
		} else {
			System.out.println("Continue Shopping Button disabled");
		}
		Thread.sleep(1000);
		tc16.logout();
		tc16.closeBrowser();
	}

}
