package stepdefination;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Locators.locators;
import browser.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class button extends Browser {
	 /*
	 *User is on the redbus homepage
	 */
	@Given("user is on Button Homepage")
	public void user_is_on_button_homepage() throws Exception {
		try
		{
	    // Write code here that turns the phrase above into concrete actions
		Browser.setChromeDriver(); //sets browser to chrome
		Browser.getUrl(); //fecthes url from browser 
	   // throw new io.cucumber.java.PendingException();
	}
		catch (Exception e)
		{
			System.out.println("e");
		}
	}
	 /*
	 * Method to click on From textbox
	 */
	@When("user clicks on the fromtextbox")
	public void user_clicks_on_the_fromtextbox() {
		try
		{
	    // Write code here that turns the phrase above into concrete actions
		locators.fromTextBox().click();
	   // throw new io.cucumber.java.PendingException();
	}
		catch (Exception e)
		{
			System.out.println("e");
		}
	}
	 /*
	 * Method to Enter details  on From textbox
	 */
	@Then("he should enter the From place details")
	public void he_should_enter_the_from_place_details() {
	    // Write code here that turns the phrase above into concrete actions
		 try
	       {
			String searchData = excel.Read.readExcel(0, 1); //reads the data from xcel
			WebElement input = locators.fromTextBox();
			input.sendKeys(searchData);
		  //  throw new io.cucumber.java.PendingException();
		}
	       catch(Exception e)
			{
				System.out.println("Input Search Box");
			}
	       driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li[1]")).click(); // clicks on the first suggestion of from textbox
	}
		//locators.fromTextBox().sendKeys("Manglore");
		//driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li[1]")).click();
	   // throw new io.cucumber.java.PendingException();
	
	 /*
	 * Method to click on To textbox
	 */
	@When("user clicks on the Totextbox")
	public void user_clicks_on_the_totextbox(){
		try
		{
	    // Write code here that turns the phrase above into concrete actions
		locators.toTextBox().click();
	    //throw new io.cucumber.java.PendingException();
	}
		catch (Exception e)
		{
			System.out.println("e");
		}
	}
	 /*
	 * Method to Enter details on To textbox
	 */
	@Then("he should enter the to place details")
	public void he_should_enter_the_to_place_details() {
	    // Write code here that turns the phrase above into concrete actions
		try
	       {
			String searchData = excel.Read.readExcel(1, 1); // reads data from xcel
			WebElement input = locators.toTextBox();
			input.sendKeys(searchData);
		  //  throw new io.cucumber.java.PendingException();
		}
	       catch(Exception e)
			{
				System.out.println("Input Search Box");
			}
		 //locators.toTextBox().sendKeys("Bangalore (All Locations)");
	      driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[2]/div/ul/li[1]")).click();// clicks on the first suggestion of to textbox
	  //  throw new io.cucumber.java.PendingException();
	}
	 /*
	 * Method to choose the date 
	 */

	@Then("choose the date")
	public void choose_the_date(){
		try
		{
	    // Write code here that turns the phrase above into concrete actions
		String date = "12";//date of travel to be mentioned (can be changed accordingly)
		String monthyear = "Dec 2021";//month and year to be mentioned (can be chnaged accordingly)
		driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label")).click();
		
		WebElement monthyearPath = driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]"));
				
		while (!monthyearPath.getText().contains(monthyear)) //pickupMonth = "Dec 2021"
		{		
			WebElement navigationPath = driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]"));
			navigationPath.click();
			monthyearPath = driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]"));
		}
		
		//*[@id="rb-calendar_onward_cal"]/table/tbody/tr[3]/td[@class="we day"]
		
		WebElement list = driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[4]"));
		List<WebElement> dateList = list.findElements(By.xpath("./td[@class='we day']"));
		System.out.println(dateList.size());
		for(int i=0; i<dateList.size();i++)
		{
			String dateText = dateList.get(i).getText();	
			if(dateText.equals(date))  
			{		
				dateList.get(i).click();
				break;
			}
		}
		
		}
		catch (Exception e)
		{
			System.out.println("e");
		}
	   // throw new io.cucumber.java.PendingException();
	}
	 /*
	 * Method to click on search button
	 */

	@Then("click on search button")
	public void click_on_search_button() {
		try
		{
	    // Write code here that turns the phrase above into concrete actions
		locators.submit().click();
	   // throw new io.cucumber.java.PendingException();
	}
		catch (Exception e)
		{
			System.out.println("e");
		}
	}

}
