package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class all_ids extends launch_config{
	
	WebDriver driver;
	public all_ids(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	//Login
	public WebElement login_txt_fld = driver.findElement(By.id("edit-name--2"));
	public WebElement login_btn = driver.findElement(By.id("edit-submit--2"));
	
	//OTP
	public WebElement otp_txt_fld = driver.findElement(By.id("edit-otp"));
	public WebElement otp_btn = driver.findElement(By.id("edit-submit"));
}
