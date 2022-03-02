package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import baseclass.BeforeAndAfter;

public class UIBankLoginPage extends BeforeAndAfter {

	WebDriver driver=RegisterPage.driver;
	public By zUserName = By.xpath("//div/input[@id='username']");
	public By zPassword = By.xpath("//div/input[@id='password']");
	public By zSignIn = By.xpath("//button[@type='submit']");
	
	public UIBankLoginPage() {
		this.driver=RegisterPage.driver;
	}

	public UIBankLoginPage loginUserName() {
		driver.findElement(zUserName).sendKeys("saro");
		return this;
	}

	public UIBankLoginPage LoginPassword() {
		driver.findElement(zPassword).sendKeys("sara@123");
		return this;
	}

	public UIBankLoginPage clickSubmitButton() throws Exception {
		driver.findElement(zSignIn).click();
		Thread.sleep(5000);
		return new UIBankLoginPage();
	}
}