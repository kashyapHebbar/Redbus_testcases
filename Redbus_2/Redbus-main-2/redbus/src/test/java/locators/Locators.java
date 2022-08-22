package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import browser.Browser;

public class Locators extends Browser{

	public static WebElement icon() {
		WebElement icon = driver.findElement(By.xpath("//*[@id=\"i-icon-profile\"]"));
		return icon;
	}
	
	public static WebElement signup() {
		WebElement signup = driver.findElement(By.xpath("//li[@id='signInLink']"));
		return signup;
	}
	
	public static WebElement gmail_link() {
		WebElement gmail_link = driver.findElement(By.xpath("//div[@id='container']/div/div[2]/span"));
		return gmail_link;
	}
	
	public static WebElement gmail_or_phone() {
			WebElement gmail_or_phone = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
			return gmail_or_phone;
	}
	
	public static WebElement gmail_next_button() {
		WebElement gmail_next_button = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
		return gmail_next_button ;									
    }
	
	public static WebElement gmpassword() {
		WebElement gmpassword = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
		return gmpassword;
	}
	
	public static WebElement show_password_checkbox() {
		WebElement selectSizeClick = driver.findElement(By.xpath("//*[@id=\"c3\"]"));
		return selectSizeClick;
	}
	
	public static WebElement gm_password_next() {
		WebElement gm_password_next = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
		return gm_password_next;
	}
	
	
	public static WebElement facebook_link() {
		WebElement facebook_link = driver.findElement(By.xpath("//*[@id=\"newFbId\"]/div[2]"));
		return facebook_link;
	}

			
	public static WebElement fb_email_phone() {
		WebElement fb_email_phone = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		return fb_email_phone;
	}

	
	public static WebElement fb_password() {
		WebElement fb_password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		return fb_password;
	}
	
	public static WebElement fb_checkbox() {
		WebElement fb_checkbox = driver.findElement(By.xpath("//*[@id=\"offline_access\"]"));
		return fb_checkbox;
	}
	
	public static WebElement fb_login_button() {
		WebElement fb_login_button = driver.findElement(By.xpath("//*[@id=\"u_0_0_R7\"]"));
		return fb_login_button;
	}
	
	public static WebElement mobile_textfield() {
		WebElement mobile_textfield = driver.findElement(By.xpath("//*[@id=\"mobileNoInp\"]"));
		return mobile_textfield;
	}
	
	public static WebElement code_dropdown() {
		WebElement code_dropdown = driver.findElement(By.xpath("//*[@id=\"signInView\"]/div[2]/div/div[1]/div[4]/div[1]/span"));
		return code_dropdown;
	}
	
	public static WebElement country_search() {
		WebElement country_search = driver.findElement(By.xpath("//*[@id=\"cntryInput\"]"));
		return country_search;
	}
	
	public static WebElement mob_checkbox() {
		WebElement mob_checkbox= driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[4]"));
		return mob_checkbox;
	}
	
	public static WebElement generate_otp_button() {
		WebElement generate_otp_button = driver.findElement(By.xpath("//*[@id=\"otp-container\"]"));
		return generate_otp_button;
	}
	
	public static WebElement enter_otp() {
		WebElement generate_otp_button = driver.findElement(By.xpath("//*[@id=\"otp\"]"));
		return generate_otp_button;
	}
	
	public static WebElement verify_otp() {
		WebElement verify_otp = driver.findElement(By.xpath("//*[@id=\"verifyUser\"]"));
		return verify_otp;
	}
	
	public static WebElement resend_otp() {
		WebElement resend_otp = driver.findElement(By.xpath("//*[@id=\"resendOTP"));
		return resend_otp;
	}
}
