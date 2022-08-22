package stepdefinition;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.WebElement;

import browser.Browser;
import excel.Read;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Locators;

public class ValidGmail extends Browser{

	@Given("user is on signup\\/signin window")
	public void user_is_on_signup_signin_window() throws Exception {
		
		Browser.setChromeDriver();
		Browser.getUrl();
		Locators.icon().click();
		Locators.signup().click();
		Thread.sleep(5000);
		
		System.out.println("User is on signup window");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@When("user enters gmailorphone and gmailpassword")
	public void user_enters_gmailorphone_and_gmailpassword() {
		
		String mainWindowHandle = driver.getWindowHandle();
		   Set<String> allWindowHandles = driver.getWindowHandles();
	       Iterator<String> iterator = allWindowHandles.iterator();
	     System.out.println("Outside While Loop");
	      while (iterator.hasNext()) 
	     {
	        	String ChildWindow = iterator.next();
	        		if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) 
	               {
	             driver.switchTo().window(ChildWindow);
	               System.out.println("Title :"+driver.getTitle());
	               try {
	           		//Invoking method to get the test data value from Excel file
	           			String gmailid = Read.readExcel(0, 0);
	           			WebElement input1 = Locators.gmail_or_phone();
	           			input1.sendKeys(gmailid);
	           			
	           			Locators.gmail_next_button().click();
	           			
	           			String gmailpassword = Read.readExcel(0, 1);
	           			WebElement input2 = Locators.gmpassword();
	           			input2.sendKeys(gmailpassword);
	           			
	           			Locators.gm_password_next().click();
	           		}catch(Exception e)
	           		{
	           			System.out.println("Gmail way is not working");
	           		}
	           	} 
	     }
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("user should navigates to home page of redbus application")
	public void user_should_navigates_to_home_page_of_redbus_application() {
		System.out.println("user navigated to home page of redbus");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

}
