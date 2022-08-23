package stepdefination;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Locators.locators;
import browser.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Sort extends Browser{
	 /*
	 * User is on the homepage redbus
	 */
	@Given("user is on sorting Homepage")
	public void user_is_on_sorting_homepage() throws Exception {
		try
		{
	    // Write code here that turns the phrase above into concrete actions
		Browser.setChromeDriver();
		Browser.getUrl();
		}
	    //throw new io.cucumber.java.PendingException();
		catch (Exception e)
		{
			System.out.println("e");
		}
	}
	 /*
	 * Method to click on From textbox
	 */

	@When("user clicks on the Fromtextbox")
	public void user_clicks_on_the_fromtextbox() {
		try
		{
	    // Write code here that turns the phrase above into concrete actions
		locators.fromTextBox().click();
		}
	    //throw new io.cucumber.java.PendingException();
		catch (Exception e)
		{
			System.out.println("e");
		}
	}
	 /*
	 * Method to enter details on From textbox
	 */

	@Then("he should enter the Fromplace details")
	public void he_should_enter_the_fromplace_details() {
	    // Write code here that turns the phrase above into concrete actions
		 try
	       {
			String searchData = excel.Read.readExcel(0, 1);  //Read From place from the excel //
			WebElement input = locators.fromTextBox();
			input.sendKeys(searchData);
		  //  throw new io.cucumber.java.PendingException();
		}
	       catch(Exception e)
			{
				System.out.println("Input Search Box");
			}
	       driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li[1]")).click(); //used to select first suggestion  from From//
	}
		//locators.fromTextBox().sendKeys("Manglore");
		//driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li[1]")).click();
	    //throw new io.cucumber.java.PendingException();
	
	 /*
	 * Method to click on To textbox
	 */
	@When("user clicks on the To textbox")
	public void user_clicks_on_the_to_textbox() {
		try
		{
	    // Write code here that turns the phrase above into concrete actions
		locators.toTextBox().click();
		}
		catch (Exception e)
		{
			System.out.println("e");
		}
	   // throw new io.cucumber.java.PendingException();
	}
	 /*
	 * Method to Enter details on To textbox
	 */

	@Then("he should enter the Toplace details")
	public void he_should_enter_the_toplace_details() {
	    // Write code here that turns the phrase above into concrete actions
		try
	       {
			String searchData = excel.Read.readExcel(1, 1);   //Read To place from the excel //
			WebElement input = locators.toTextBox();
			input.sendKeys(searchData);
		  //  throw new io.cucumber.java.PendingException();
		}
	       catch(Exception e)
			{
				System.out.println("Input Search Box");
			}
		//locators.toTextBox().sendKeys("Bangalore (All Locations)");
	      driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[2]/div/ul/li[1]")).click(); //used to select first suggestion from To
	    //throw new io.cucumber.java.PendingException();
	}
	 /*
	 * Method to Choose the date of travel
	 */
	@Then("choose the date of travel")
	public void choose_the_date_of_travel() {
		try
		{
	    // Write code here that turns the phrase above into concrete actions
		String date = "12"; //mentioning the date of travel (can be changed accordingly)
		String monthyear = "Dec 2021"; //mentioning the month and the year (can be changed accordingly)
		driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label")).click(); //clicking on the date box
		
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
	    //throw new io.cucumber.java.PendingException();
	
	 /*
	 * Method to click on serachbuses button
	 */
	@Then("click on search Button")
	public void click_on_search_button() {
		try
		{
	    // Write code here that turns the phrase above into concrete actions
		locators.submit().click();
		}
		catch (Exception e)
		{
			System.out.println("e");
		}
	   // throw new io.cucumber.java.PendingException();
	}
	 /*
	 * Sorting according to departure
	 */

	@Then("click on departure sort")
	public void click_on_departure_sort() {
		try
		{
	    // Write code here that turns the phrase above into concrete actions
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		locators.sortListDepartuer().click();
		}
		catch (Exception e)
		{
			System.out.println("e");
		}
	   // throw new io.cucumber.java.PendingException();
	}
	 /*
		 * Sorting according to duration
		 */
	@Then("Then click on the duration sort")
	public void then_click_on_the_duration_sort() {
		try
		{
			
		
	    // Write code here that turns the phrase above into concrete actions
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		locators.sortListDuration().click();
		
		}
		catch (Exception e)
		{
			System.out.println("e");
		}
	   // throw new io.cucumber.java.PendingException();
	}
	 /*
		 * Sorting according to Arrival
		 */

	@Then("Click on the Arrival sort")
	public void click_on_the_arrival_sort() {
		try
		{
	    // Write code here that turns the phrase above into concrete actions
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		locators.sortListArrival().click();
		
		}
		catch (Exception e)
		{
			System.out.println("e");
		}
	  //  throw new io.cucumber.java.PendingException();
	}
	 /*
		 * Sorting according to Ratings
		 */
	@Then("Then click on Ratings sort")
	public void then_click_on_ratings_sort() {
		try
		{
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		locators.sortListRatings().click();
		
		}
		catch (Exception e)
		{
			System.out.println("e");
		}
	   // throw new io.cucumber.java.PendingException();
	}
	 /*
		 * Sorting according to Fare
		 */

	@Then("click on Fare sort")
	public void click_on_fare_sort() {
		try
		{
	    // Write code here that turns the phrase above into concrete actions
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		locators.sortListFare().click();
	
		}
		catch (Exception e)
		{
			System.out.println("e");
		}
	   // throw new io.cucumber.java.PendingException();
	}
	 /*
		 * Sorting according to Seatsavailable
		 */

	@Then("Then click on Seatsavailable sort")
	public void then_click_on_seatsavailable_sort() {
		try
		{
	    // Write code here that turns the phrase above into concrete actions
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		locators.sortListSeatsavailable().click();
		
		}
		catch (Exception e)
		{
			System.out.println("e");
		}
	   // throw new io.cucumber.java.PendingException();
	}

}
