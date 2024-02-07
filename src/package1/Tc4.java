package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc4 {

	@Test
	public void addBtn() throws Exception {
		WebDriver driver = new ChromeDriver();
		PageObjectClass tc4 = new PageObjectClass(driver);

		tc4.launchBrowser();
		tc4.username();
		tc4.password();
		tc4.loginBtn();
		tc4.backpackAddBtn();
		tc4.logout();
		tc4.closeBrowser();

	}

}
