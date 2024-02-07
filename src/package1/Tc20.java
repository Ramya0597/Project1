package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc20 {
	
	@Test
	public void yourcartRemoveBtn() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		PageObjectClass tc20 = new PageObjectClass(driver);
		tc20.launchBrowser();
		tc20.username();
		tc20.password();
		tc20.loginBtn();
		tc20.bLAddBtn();
		tc20.backpackAddBtn();
		tc20.cartBtn();
		tc20.removeBPbtn();
		tc20.logout();
		tc20.closeBrowser();
	}
	
}
