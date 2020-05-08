package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mainFrame.MainFrame;

public class LoginPageElements extends MainFrame{

	public LoginPageElements(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Email")
	public WebElement email;
	
	@FindBy(id = "Password")
	public WebElement pass;
	
	@FindBy(xpath = "//input [@type = 'submit']")
	public WebElement login;
	
	@FindBy(xpath = "//a[text() = 'Logout']")
	public WebElement logout;
	

}
