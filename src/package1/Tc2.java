package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc2 {

	@Test
	public void loginEnable()  throws Exception {
		WebDriver driver = new ChromeDriver();
		PageObjectClass tc2 = new PageObjectClass(driver);
		tc2.launchBrowser();
		boolean btnEnable = tc2.login.isEnabled();
		if (btnEnable == true) {
			System.out.println("Login button enabled");
		} else {
			System.out.println("Login button disabled");
		}

		tc2.closeBrowser();

	}

}
