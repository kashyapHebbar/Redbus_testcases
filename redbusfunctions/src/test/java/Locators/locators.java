package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import browser.Browser;

public class locators extends Browser {
	 /*
	 * Method to get enter element into From text box 
	 */
	
	
	public static WebElement fromTextBox() {
		WebElement fromTextBox= driver.findElement(By.xpath("//input[@id='src']"));
		return fromTextBox;
	}
	
	/*
	 * Method to get enter element into To text box 
	 */
	public static WebElement toTextBox()
	{
		WebElement toTextBox=driver.findElement(By.xpath("//input[@id='dest']"));
		return toTextBox;
	}
	/*
	 * Method to Enter Onward date in to the textbox 
	 */
	public static WebElement OnwardDate()
	{
		
		
		//WebElement OnwardDate =	driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label"));
		 WebElement OnwardDate= driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[3]/div/label"));
		//*[@id="rb-calendar_onward_cal"]/table/tbody/tr[3]/td[2]
		return OnwardDate;
	}
	/*
	 * Method to Search buses after entering details
	 */
	public static WebElement submit() throws Exception { // reading the path from config properties //
		String Button = browser.Browser.getwebEl("submit");
		//WebElement submitButton = driver.findElement(By.xpath(Button));
		 WebElement submitButton=locators.driver.findElement(By.xpath(Button));
		//WebElement submitButton = driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/button"));
		return submitButton;
	}
	/*
	 * Method to get element of Sort List accoring to departure of the bus
	 */
	public static WebElement sortListDepartuer() {
		WebElement sortListDepartuer = driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/div/div[2]/div[2]/div[2]/div[2]/a"));
		return sortListDepartuer;
}
	/*
	 * Method to get element of Sort List accoring to duration of the bus
	 */
	public static WebElement sortListDuration() {
		WebElement sortDuration = driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/div/div[2]/div[2]/div[2]/div[3]/a"));
		return sortDuration;
	}
		/*
		 *Method to sort elements based on Arrival of the bus
		 */
	public static WebElement sortListArrival() {
		WebElement sortArrival = driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/div/div[2]/div[2]/div[2]/div[4]/a"));
		return sortArrival;	
	}
	/*
	 *Method to sort element based on the Ratings
	 */
	public static WebElement sortListRatings() {
		WebElement sortRatings = driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/div/div[2]/div[2]/div[2]/div[5]/a"));
		return sortRatings;
	}
	/*
	 *Method to sort elements based on the Fare 
	 */
	public static WebElement sortListFare() {
		WebElement sortFare = driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/div/div[2]/div[2]/div[2]/div[6]/a"));
		return sortFare;
	}

	/*
	 *Method to sort element based on the seats available
	 */
	public static WebElement sortListSeatsavailable() {
		WebElement sortSeats = driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/div/div[2]/div[2]/div[2]/div[7]/a"));
		return sortSeats;
	}
		
}
	

