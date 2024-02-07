package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc1 {

	@Test
	public void textEnable() throws Exception {
		WebDriver driver = new ChromeDriver();
		PageObjectClass p = new PageObjectClass(driver);
		p.launchBrowser();
		
		boolean unEnable = p.un.isEnabled();
		if (unEnable == true) {
			System.out.println("Username field enabled");
		} else {
			System.out.println("Username field disabled");
		}
		Thread.sleep(1000);
		
		boolean pwdEnable = p.pwd.isEnabled();
		if (pwdEnable == true) {
			System.out.println("password field enabled");
		} else {
			System.out.println("password field disabled");
		}
		p.closeBrowser();
	}

}
