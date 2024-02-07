package package1;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObjectClass {
	WebDriver driver;

	public PageObjectClass(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	// Repository
	@FindBy(id = "user-name")
	WebElement un;
	@FindBy(id = "password")
	WebElement pwd;
	@FindBy(id = "login-button")
	WebElement login;
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement addBackpack;
	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	WebElement addJacket;
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	WebElement addBL;
	@FindBy(xpath = "//button[text()=\"Add to cart\"]")
	List<WebElement> addbutton;
	@FindBy(className = "shopping_cart_link")
	WebElement cartSybl;
	@FindBy(id="continue-shopping")
	WebElement ContinueShpngBtn;
	@FindBy(id = "remove-sauce-labs-backpack")
	WebElement removeBackpack;
	@FindBy(id = "remove-sauce-labs-fleece-jacket")
	WebElement removeJacket;
	@FindBy(xpath = "//div[text()=\"Sauce Labs Bike Light\"]")
	WebElement bikeLight;
	@FindBy(id="back-to-products")
	WebElement backProduct;
	@FindBy(id = "checkout")
	WebElement checkout;
	@FindBy(id="cancel")
	WebElement cancelbtn;	
	@FindBy(id = "first-name")
	WebElement firstname;
	@FindBy(id = "last-name")
	WebElement lastname;
	@FindBy(id = "postal-code")
	WebElement zip;
	@FindBy(id = "continue")
	WebElement continuebutton;
	@FindBy(id = "react-burger-menu-btn")
	WebElement menu;
	@FindBy(id = "logout_sidebar_link")
	WebElement logout;

	public void launchBrowser() throws Exception {

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	public void username() {
		un.sendKeys("standard_user");
	}

	public void password() {
		pwd.sendKeys("secret_sauce");
	}

	public void loginBtn() throws Exception {
		login.click();
		Thread.sleep(2000);
	}

	public void alert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public void backpackAddBtn() throws Exception {
		addBackpack.click();
		Thread.sleep(3000);
	}

	public void jacketAddBtn() throws Exception {
		addJacket.click();
		Thread.sleep(3000);
	}

	public void bLAddBtn() throws Exception {
		addBL.click();
		Thread.sleep(3000);
	}

	
	/*
	 * public void scrollBy() throws Exception { JavascriptExecutor js =
	 * (JavascriptExecutor) driver; js.executeScript("window.scrollBy(150, 1003)");
	 * Thread.sleep(1000); }
	 */

	public void filter() throws Exception {
		WebElement filter = driver.findElement(By.className("product_sort_container"));
		Select s = new Select(filter);
		s.selectByValue("lohi");
		Thread.sleep(2000);
	}

	public void removeBPbtn() throws Exception {
		removeBackpack.click();
		Thread.sleep(1000);
	}

	public void removejacketbtn() throws Exception {
		removeJacket.click();
		Thread.sleep(1000);
	}

	public void productBL() throws Exception {
		bikeLight.click();
		Thread.sleep(1000);
	}
	
	public void backProductBtn() {
		backProduct.click();
	}

	public void cartBtn() throws Exception {
		cartSybl.click();
		Thread.sleep(1000);
	}
	
	public void continueShopping() throws Exception {
		ContinueShpngBtn.click();
		Thread.sleep(1000);
	}
		
	public void checkoutBtn() throws Exception {
		checkout.click();
		Thread.sleep(1000);
	}
	
	public void cancelBtn() throws Exception {
		cancelbtn.click();
		Thread.sleep(1000);
	}
	
	public void firstName() {
		firstname.sendKeys("standard");
	}

	public void lastName() {
		lastname.sendKeys("user");
	}

	public void postalcode() {
		zip.sendKeys("503433");
	}

	public void continueBtn() throws Exception {
		continuebutton.click();
		Thread.sleep(1000);
	}

	public void logout() throws Exception {
		menu.click();
		Thread.sleep(1000);
		logout.click();
		Thread.sleep(1000);
	}

	public void closeBrowser() {
		driver.close();
	}

}
