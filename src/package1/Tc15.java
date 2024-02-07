package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc15 {

	@Test
	public void backToProductBtnWrking() throws Exception {
		WebDriver driver = new ChromeDriver();
		PageObjectClass tc15 = new PageObjectClass(driver);
		tc15.launchBrowser();
		tc15.username();
		tc15.password();
		tc15.loginBtn();
		tc15.productBL();
		tc15.backProductBtn();
		tc15.logout();
		tc15.closeBrowser();
	}

}
