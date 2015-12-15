package homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import homepage.launch_config;

public class homepage_test extends launch_config{
	
	//Test homepage content
	@Test
	public void check_titl() throws Exception{
		
		System.out.println("homepage.check_title executing...........");
		System.out.println(driver);
		String title = driver.getTitle();
		System.out.println("Entered");
		assertEquals(Util.HOME_TITLE, title);
		System.out.println("Passed");
		String methName = "check_titl";
		int count = 0;
		imp_methods.getscreenshot(methName, count++);
		System.out.println("Passed Screen");
		System.out.println("homepage.check_title executed !!!!!!!!!!!");
	}
	@Test
	public void check_skip(){
		WebElement skip_url = driver.findElement(By.className("skip_content"));
		skip_url.click();
		String url =  driver.getCurrentUrl();
		System.out.println(url);
		assertEquals(Util.SKIP_URL, url);
	}
	@Test
	public void login(){
		WebElement login_btn = driver.findElement(By.className("ac-login"));
		login_btn.click();
		all_ids.login_txt_fld.sendKeys("9560444710");
		all_ids.login_btn.click();
		all_ids.otp_txt_fld.sendKeys("123456");
		all_ids.otp_btn.click();
		
	}
	
}
