package pageActions;

import org.openqa.selenium.WebDriver;

import pageElements.LoginPageElements;

public class LoginPageActions extends LoginPageElements {

	public LoginPageActions(WebDriver driver) {
		super(driver);
	}
	
	public void setPassword(String password) {
		pass.clear();
		pass.sendKeys(password);
	}
	
	public void setEmail(String eml) {
		email.clear();
		email.sendKeys(eml);
	}
	
	public void clickLogin() {
		clickMethod(login);
	}
	
	public void clickLogout() {
		clickMethod(logout);
	}
	
	
}
