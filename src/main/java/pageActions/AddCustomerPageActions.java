package pageActions;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageElements.AddCustomerPageElements;

public class AddCustomerPageActions extends AddCustomerPageElements {

	public AddCustomerPageActions(WebDriver driver) {
		super(driver);
	}
	
    public void getCustomerInfo() {
    	String email = RandomStringUtils.randomAlphabetic(5)+ "@gmail.com";
    	sendKeysMethod(emailtxt, email);
    	sendKeysMethod(fNametxt, "john");
    	sendKeysMethod(lNametxt, "aka");
    	clickMethod(male);
    }
    
    public void click_customer_menu() {
    	clickMethod(link_customers_menu);

    }
    
    public void click_customer_menu_item() {
    	clickMethod(link_customer_menu_item);
 }
    public void add_new_customer_link() {
    	clickMethod(add_new_link);

    }
    
    public void click_save() {
    	clickMethod(saveBtn);

    }

}
