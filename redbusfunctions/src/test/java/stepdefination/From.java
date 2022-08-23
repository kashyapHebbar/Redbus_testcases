package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Locators.locators;
import browser.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class From extends Browser {
	 /*
	 * user is on the  redbus homepage
	 */
	@Given("user is on  From Homepage")
	public void user_is_on_from_homepage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	try
	{
		Browser.setChromeDriver(); //sets the browser to chrome 
		Browser.getUrl();//fetches url from Browser 
	  //  throw new io.cucumber.java.PendingException();
	}
	catch (Exception e)
	{
		System.out.println("e");
	}
	}
	 /*
		 * Method to click on From textbox
		 */

	@When("user clicks on fromtextbox")
	public void user_clicks_on_fromtextbox() {
	  try
	  {
		locators.fromTextBox().click(); //clicks on from textbox
	    
	}
	catch (Exception e)
	{
		System.out.println("e");
	}
	}
	 /*
	 * Method to Enter details on From textbox
	 */
	@Then("he should enter the from details")
	public void he_should_enter_the_from_details() {
	   
		 try
	       {
			String searchData = excel.Read.readExcel(0, 1); //fecthes data from xcel
			WebElement input = locators.fromTextBox();
			input.sendKeys(searchData);
		  //  throw new io.cucumber.java.PendingException();
		}
	       catch(Exception e)
			{
				System.out.println("Input Search Box");
			}
	       driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li[1]")).click();//chooses first option from the from textbox suggestion
	}
		//locators.fromTextBox().sendKeys("Manglore");
		//driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li[1]")).click();
}





