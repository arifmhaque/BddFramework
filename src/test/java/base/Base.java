package base;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageActions.AddCustomerPageActions;
import pageActions.LoginPageActions;

public class Base {

	public WebDriver driver;
	public LoginPageActions loginPage;
	public AddCustomerPageActions addCus;
	public Logger logger;
	public Properties prop;

	/*
	 * @Before public void setUp() throws IOException {
	 * 
	 * 
	 * logger = Logger.getLogger("noCommerce");
	 * PropertyConfigurator.configure("log4j.properties"); File file = new File(
	 * "C:\\Users\\arif_\\eclipse-workspace\\nopCommerce_oo1_Cucumber\\config.properties"
	 * ); InputStream input = new FileInputStream(file); prop = new Properties();
	 * prop.load(input);
	 * 
	 * String br = prop.getProperty("browser");
	 * 
	 * if (br.equalsIgnoreCase("firefox")) {
	 * System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +
	 * "/Drivers/geckodriver.exe"); driver = new FirefoxDriver(); }else if
	 * (br.equalsIgnoreCase("chrome")) {
	 * System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +
	 * "/Drivers/geckodriver.exe"); driver = new FirefoxDriver(); }
	 * 
	 * }
	 */
	 


}