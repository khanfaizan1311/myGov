package homepage;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxProfile;


import java.net.MalformedURLException;

import java.io.File;
//Time Unit Import
import java.util.concurrent.TimeUnit;

import homepage.imp_methods;

public class launch_config {
	
	public static WebDriver driver;
	public String baseUrl;
	public imp_methods imp_methods;
	public all_ids all_ids;
	
	//Initialize web driver
	@BeforeSuite
	public void launch_conf() throws MalformedURLException {
		
		System.out.println("hompage.launch_conf executing ..............");
		File pathToBinary = new File(Util.FIREFOX_PATH);
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		driver = new FirefoxDriver(ffBinary, firefoxProfile);

		// Setting Base URL of website Guru99
		baseUrl = Util.BASE_URL;
		driver.manage().timeouts()
				.implicitlyWait(Util.WAIT_TIME, TimeUnit.SECONDS);
		// Go to http://www.mygov.in/
		driver.get(baseUrl);
		driver.manage().window().maximize();
		System.out.println("Launch Conf Done !!!!!!!!");
	}
	
	
	@BeforeClass
	public void set_up(){
		System.out.println("hompage.SetUp executing ..............");
		imp_methods = new imp_methods();
		System.out.println(driver);
		all_ids = new all_ids(driver);
		System.out.println("SetUp Done !!!!!!!!!!!!!!!!!!!!!!");
	}
}
