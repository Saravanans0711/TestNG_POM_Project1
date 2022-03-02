package testcase;
import org.testng.annotations.Test;
import pages.UIBankLoginPage;

public class UIBankLoginPageTC_002 extends UIBankLoginPage {
	
	UIBankLoginPage obin=new UIBankLoginPage();
	RegisterPageTC_001 oVin=new RegisterPageTC_001();
	
  @Test(priority = 4)
  public void loginProcedure() {
	  try {
		oVin.routeToRegisterPageByClick();
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	  oVin.oVerifyElements();
	  oVin.enterTheValuesInFields();
	  obin.loginUserName();
	  obin.LoginPassword();
	  try {
		obin.clickSubmitButton();
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
}