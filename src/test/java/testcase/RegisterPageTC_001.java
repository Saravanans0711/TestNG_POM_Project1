package testcase;

import org.testng.annotations.Test;

import pages.RegisterPage;

public class RegisterPageTC_001 extends RegisterPage {

	RegisterPage Ozen = new RegisterPage();

	@Test(priority = 1)
	public void routeToRegisterPageByClick() throws Exception {
		Ozen.clickRegisterLink();
	}
	@Test(priority = 2)
	public void oVerifyElements() {
		Ozen.verifyElementRegPage();
	}
	@Test(priority = 3)
	public void enterTheValuesInFields() {
		Ozen.typeInitialFirstName("saravanan");
		Ozen.selectTitleOption();
		Ozen.typeMiddleNameOrInitialName("Sann");
		Ozen.typeLastName("Sundar");
		Ozen.selectSexType();
		Ozen.selectEmployeeStatus();
		Ozen.typeAge("31");
		Ozen.selectMaritialStatus();
		Ozen.typeNumberOfDependant("3");
		Ozen.typeUserName("Britto"+oRandomValue());
		Ozen.typeEmailAddress("John"+oRandomValue()+"@gmail.com");
		Ozen.typePasswordField("John@uiuy43w3");
		try {
			Ozen.clickSubmitButton();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Ozen.welcomeUIBank();
		Ozen.oLoginButton();
		Ozen.redirectToNextWindow();
	}
	}