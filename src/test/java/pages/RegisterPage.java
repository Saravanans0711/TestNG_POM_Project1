package pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import baseclass.BeforeAndAfter;

public class RegisterPage extends BeforeAndAfter {

	public By oRegisterAccount = By.xpath("//a/small[text()='Register For Account']");
	public By oFirstName = By.id("firstName");
	public By oTitleDropDown = By.id("title");
	public By oMiddleNameOrInt = By.id("middleName");
	public By oLastName = By.id("lastName");
	public By oSex = By.id("sex");
	public By oEmployeeStatus = By.id("employmentStatus");
	public By oAge = By.id("age");
	public By oMaritalStatus = By.id("maritalStatus");
	public By oNoOfDependents = By.id("numberOfDependents");
	public By oUserName = By.id("username");
	public By oEmailAddress = By.id("email");
	public By oPassword = By.id("password");
	public By oRegisterButton = By.xpath("//button[text()='Register']");
	public By oUIFamily = By.xpath("//h2[text()=' Welcome To The UiBank Family! ']");
	public By oLoginOption = By.xpath("//li/a[text()=\"Login\"]");
	
	public RegisterPage() {
		this.driver=BeforeAndAfter.driver;
	}
	
	public int oRandomValue() {
		Random oNest=new Random();
		return oNest.nextInt(1000);
		 
	}

	public void clickRegisterLink() throws Exception {
		Thread.sleep(4000);
		driver.findElement(oRegisterAccount).click();
	}

	public boolean verifyElementRegPage() {
		if (driver.findElement(oFirstName).isDisplayed() && driver.findElement(oTitleDropDown).isDisplayed()
				&& driver.findElement(oMiddleNameOrInt).isDisplayed() && driver.findElement(oLastName).isDisplayed()
				&& driver.findElement(oSex).isDisplayed() && driver.findElement(oEmployeeStatus).isDisplayed()
				&& driver.findElement(oAge).isDisplayed() && driver.findElement(oMaritalStatus).isDisplayed()
				&& driver.findElement(oNoOfDependents).isDisplayed() && driver.findElement(oUserName).isDisplayed()
				&& driver.findElement(oEmailAddress).isDisplayed() && driver.findElement(oPassword).isDisplayed()
				&& driver.findElement(oRegisterButton).isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void typeInitialFirstName(String oName) {
		// public RegisterPage typeFirstName(String oName) {
		driver.findElement(oFirstName).sendKeys(oName);
		// return this;
	}

	public RegisterPage selectTitleOption() {
		WebElement oref = driver.findElement(oTitleDropDown);
		Select obj1 = new Select(oref);
		obj1.selectByVisibleText("Mr");
		return this;
	}

	public RegisterPage typeMiddleNameOrInitialName(String oMnInt) {
		driver.findElement(oMiddleNameOrInt).sendKeys(oMnInt);
		return this;
	}

	public RegisterPage typeLastName(String lastName) {
		driver.findElement(oLastName).sendKeys(lastName);
		return this;
	}

	public RegisterPage selectSexType() {
		WebElement oJen = driver.findElement(oSex);
		Select oSelect = new Select(oJen);
		oSelect.selectByVisibleText("Male");
		return this;
	}

	public RegisterPage selectEmployeeStatus() {
		WebElement oEmp = driver.findElement(oEmployeeStatus);
		Select oEStatus = new Select(oEmp);
		oEStatus.selectByVisibleText("Full-time");
		return this;
	}

	public RegisterPage typeAge(String oDOB) {
		driver.findElement(oAge).sendKeys(oDOB);
		return this;
	}

	public RegisterPage selectMaritialStatus() {
		WebElement oMrg = driver.findElement(oMaritalStatus);
		Select oMStatus = new Select(oMrg);
		oMStatus.selectByVisibleText("Single");
		return this;
	}

	public RegisterPage typeNumberOfDependant(String oValue) {
		driver.findElement(oNoOfDependents).sendKeys(oValue);
		return this;
	}

	public RegisterPage typeUserName(String oUN) {
		driver.findElement(oUserName).sendKeys(oUN);
		return this;
	}

	public RegisterPage typeEmailAddress(String oEA) {
		driver.findElement(oEmailAddress).sendKeys(oEA);
		return this;
	}

	public RegisterPage typePasswordField(String oPF) {
		driver.findElement(oPassword).sendKeys(oPF);
		return this;
	}

	public RegisterPage clickSubmitButton() throws Exception {
		driver.findElement(oRegisterButton).click();
		Thread.sleep(5000);
		String xwindowHandle = driver.getWindowHandle();
		driver.switchTo().window(xwindowHandle);
		return this;
	}

	public UIBankLoginPage welcomeUIBank() {
		System.out.println(driver.getCurrentUrl());
		if (driver.findElement(oUIFamily).isDisplayed()) {
			System.out.println("You Registration is successful !!");
		} else {
			System.out.println("Your Registration is Failed !!");
		}
		return new UIBankLoginPage();
	}

	public UIBankLoginPage oLoginButton() {
		driver.findElement(oLoginOption).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	return new UIBankLoginPage();
	}
	
	public UIBankLoginPage redirectToNextWindow() {
		String zwindowHandle = driver.getWindowHandle();
		driver.switchTo().window(zwindowHandle);
		String oJoin=driver.getCurrentUrl();
		driver.get(oJoin);
		return new UIBankLoginPage();
	}
}