package stepdefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import browser.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Date extends Browser {
	 /*
	 * User is on the redbus homepage 
	 */
	@Given("user is on onward Homepage")
	public void user_is_on_onward_homepage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		Browser.setChromeDriver();
		Browser.getUrl();
		}
		catch (Exception e)
		{
			System.out.println("e");
		}
	   // throw new io.cucumber.java.PendingException();
	}
	 /*
	 * Method to select the date 
	 */
	@Then("he should pick the To Date of travel")
	public void he_should_pick_the_to_date_of_travel() {
		try
		{
	    // Write code here that turns the phrase above into concrete actions
		String date = "12"; //date of travel to be mentioned (can be changed accordingly)
		String monthyear = "Dec 2021"; //month and year to be mentioned (can be chnaged accordingly)
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
}
