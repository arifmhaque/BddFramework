package stepDefinition;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActions.AddCustomerPageActions;
import pageActions.LoginPageActions;

public class Steps extends Base {
	
	
	@Given("User launch firefox browser")
	public void user_launch_firefox_browser() {
	  
	    logger.info("*******Launching Browser*********");
	    loginPage = new LoginPageActions(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
	    logger.info("*******Openning URL*********");
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(url);
	    
	}

	@When("User enters emails as {string} and password as {string}")
	public void user_enters_emails_as_and_password_as(String email, String pass) {
	    logger.info("*******Entering login credentials*********");
        loginPage.setEmail(email);
	    loginPage.setPassword(pass);
	}

	@When("Click login")
	public void click_login() {
	    logger.info("*******Clicking login button*********");
        loginPage.clickLogin();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
	    if(driver.getPageSource().contains("Login was unsuccessful.")) {
		    logger.info("*******Login failed*********");
            Assert.assertTrue(false);
	    }else {
		    logger.info("*******Login passed*********");

	    	Assert.assertEquals(title, driver.getTitle());
	    }
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("User click logout link")
	public void user_click_logout_link() {
	    logger.info("*******click on logout link*********");
	    loginPage.clickLogout();
	}
    
	@Then("Page title shoule be {string}")
	public void page_title_shoule_be(String string) {
	    logger.info("*******Logout successful*********");

	}
	
	@Then("Close the browser")
	public void close_the_browser() {
	    logger.info("*******closing Browser*********");

	    driver.quit();
	}
	
	@Then("User can veiw Dashboard")
	public void user_can_veiw_Dashboard() {
		addCus = new AddCustomerPageActions(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration", addCus.getTitle());
	    logger.info("*******get dashboard*********");

		
	    
	}

	@When("User Click Customer Menu")
	public void user_Click_Customer_Menu() {
	    addCus.click_customer_menu();
	    logger.info("*******Clicked Customer Menu*********");

	}

	@When("Click on Customer Item")
	public void click_on_Customer_Item() {
	    addCus.click_customer_menu_item();
	    logger.info("*******Clicked Customer Item*********");

	}

	@When("Click on Add New Menu")
	public void click_on_Add_New_Menu() {
	    addCus.add_new_customer_link();
	    logger.info("*******Clicked Add New Menu*********");

	}

	@Then("User can veiw Add new Customer page")
	public void user_can_veiw_Add_new_Customer_page() {
		Assert.assertEquals("Add a new customer / nopCommerce administration", addCus.getTitle());
	    logger.info("*******Validated Add New Customer Page*********");

	    
	}

	@When("user enter customer info")
	public void user_enter_customer_info() {
	    logger.info("*******providing customer info*********");
        addCus.getCustomerInfo();
	}

	@When("click on save button")
	public void click_on_save_button() {
		addCus.click_save();
	    logger.info("*******Customer Details saved*********");

	    
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String msg) {
	   Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully"));
	    logger.info("*******get Confirmation with message*********");

	}



}
