package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc14 {

	@Test
	public void backToProductBtnEnable() throws Exception {
		WebDriver driver = new ChromeDriver();
		PageObjectClass tc14 = new PageObjectClass(driver);
		tc14.launchBrowser();
		tc14.username();
		tc14.password();
		tc14.loginBtn();
		tc14.productBL();
		boolean backProductEnable = tc14.backProduct.isEnabled();
		if (backProductEnable == true) {
			System.out.println("Back to Product Button enabled");
		} else {
			System.out.println("Back to Product Button disabled");
		}
		Thread.sleep(1000);
		tc14.logout();
		tc14.closeBrowser();
	}

}
