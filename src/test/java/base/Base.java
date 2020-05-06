package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageActions.AddCustomerPageActions;
import pageActions.LoginPageActions;

public class Base {

	public WebDriver driver;
	public LoginPageActions loginPage;
	public AddCustomerPageActions addCus;
	public Logger logger;
	public Properties prop;

	@Before
	public void setUp() throws IOException {
		logger = Logger.getLogger("noCommerce");
	    PropertyConfigurator.configure("log4j.properties");
		InputStream input = new FileInputStream("config.properties");
		prop = new Properties();
		prop.load(input);

		String br = prop.getProperty("browser");

		if (br.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}else if (br.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/Drivers/geckodriver.exe");
				driver = new FirefoxDriver(); 
	}
		
	}

}
