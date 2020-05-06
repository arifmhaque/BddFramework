package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActions.AddCustomerPageActions;
import pageActions.LoginPageActions;

public class Steps {
	
	public WebDriver driver;
	public LoginPageActions loginPage;
	public AddCustomerPageActions addCus;
	
	@Given("User launch firefox browser")
	public void user_launch_firefox_browser() {
	    System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
	    driver = new FirefoxDriver();
	    loginPage = new LoginPageActions(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(url);
	}

	@When("User enters emails as {string} and password as {string}")
	public void user_enters_emails_as_and_password_as(String email, String pass) {
	   loginPage.setEmail(email);
	   loginPage.setPassword(pass);
	}

	@When("Click login")
	public void click_login() {
	    loginPage.clickLogin();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
	    if(driver.getPageSource().contains("Login was unsuccessful.")) {
	    	Assert.assertTrue(false);
	    }else {
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
		 loginPage.clickLogout();
	}
    
	@Then("Page title shoule be {string}")
	public void page_title_shoule_be(String string) {
	    
	}
	
	@Then("Close the browser")
	public void close_the_browser() {
	    driver.quit();
	}
	
	@Then("User can veiw Dashboard")
	public void user_can_veiw_Dashboard() {
		addCus = new AddCustomerPageActions(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration", addCus.getTitle());
		
	    
	}

	@When("User Click Customer Menu")
	public void user_Click_Customer_Menu() {
	    addCus.click_customer_menu();
	}

	@When("Click on Customer Item")
	public void click_on_Customer_Item() {
	    addCus.click_customer_menu_item();
	}

	@When("Click on Add New Menu")
	public void click_on_Add_New_Menu() {
	    addCus.add_new_customer_link();
	}

	@Then("User can veiw Add new Customer page")
	public void user_can_veiw_Add_new_Customer_page() {
		Assert.assertEquals("Add a new customer / nopCommerce administration", addCus.getTitle());
	    
	}

	@When("user enter customer info")
	public void user_enter_customer_info() {
	      addCus.getCustomerInfo();
	}

	@When("click on save button")
	public void click_on_save_button() {
		addCus.click_save();
	    
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String msg) {
	   Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully"));
	}



}
