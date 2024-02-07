package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc11 {

	@Test
	public void remove() throws Exception {
		WebDriver driver = new ChromeDriver();
		PageObjectClass tc11 = new PageObjectClass(driver);
		tc11.launchBrowser();
		tc11.username();
		tc11.password();
		tc11.loginBtn();
		tc11.backpackAddBtn();
		tc11.jacketAddBtn();
		tc11.removeBPbtn();
		tc11.removejacketbtn();
		tc11.logout();
		tc11.closeBrowser();	
	}

}
