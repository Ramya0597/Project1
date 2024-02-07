package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc9 {

	@Test
	public void allAddbtn() throws Exception {
		WebDriver driver = new ChromeDriver();
		PageObjectClass tc9 = new PageObjectClass(driver);
		tc9.launchBrowser();
		tc9.username();
		tc9.password();
		tc9.loginBtn();
		tc9.bLAddBtn();
		tc9.backpackAddBtn();
		tc9.cartBtn();
		tc9.checkoutBtn();
		tc9.continueBtn();
		tc9.logout(); 
		tc9.closeBrowser();
		 
	}

}
