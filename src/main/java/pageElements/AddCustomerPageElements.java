package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mainFrame.MainFrame;

public class AddCustomerPageElements extends MainFrame {

	public AddCustomerPageElements(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='#']/span[text() = 'Customers']")
	public WebElement link_customers_menu;
	
	@FindBy(xpath = "//a[@class = 'menu-item-link']//span[text() = 'Customers']")
	public WebElement link_customer_menu_item;
	
	@FindBy(xpath = "//a[@class = 'btn bg-blue']")
	public WebElement add_new_link;
	
   @FindBy(id = "Email")
   public WebElement emailtxt;
   
   @FindBy(id = "Password")
   public WebElement passtxt;
   
   @FindBy(id = "FirstName")
   public WebElement fNametxt;
   
   @FindBy(id = "LastName")
   public WebElement lNametxt;
   
   @FindBy(id = "Gender_Male")
   public WebElement male;
   
   @FindBy(xpath = "//button[@name = 'save']")
   public WebElement saveBtn;
   
}
