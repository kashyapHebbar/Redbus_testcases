package stepdefination;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Locators.locators;
import browser.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class To extends Browser{
	 /*
	 * user is on the redbus homepage
	 */
	@Given("user is on To Homepage")
	public void user_is_on_to_homepage() throws Exception {
		try
		{
	    // Write code here that turns the phrase above into concrete actions
		Browser.setChromeDriver(); //sets the browser to chrome
		Browser.getUrl(); // fecthes url from browser
		}
		catch (Exception e)
		{
			System.out.println("e");
		}
	    //throw new io.cucumber.java.PendingException();
	}

	 /*
	 * Method to click on To textbox
	 */
	@When("user clicks on Totextbox")
	public void user_clicks_on_totextbox() {
		try
		{
	    // Write code here that turns the phrase above into concrete actions
		locators.toTextBox().click(); //clicks on to textbox
		}
		catch (Exception e)
		{
			System.out.println("e");
		}
	    //throw new io.cucumber.java.PendingException();
	}
	 /*
	 * Method to Enter details on To textbox
	 */
	@Then("he should enter the To details")
	public void he_should_enter_the_to_details() {
	    // Write code here that turns the phrase above into concrete actions
		try
	       {
			String searchData = excel.Read.readExcel(1, 1); //fecthes the data from xcel
			WebElement input = locators.toTextBox();
			input.sendKeys(searchData);
		  //  throw new io.cucumber.java.PendingException();
		}
	       catch(Exception e)
			{
				System.out.println("Input Search Box");
			}
		// locators.toTextBox().sendKeys("Bangalore (All Locations)");
	      driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[2]/div/ul/li[1]")).click();//clicks on first suggestion of to textbox
	   // throw new io.cucumber.java.PendingException();
	}




}
