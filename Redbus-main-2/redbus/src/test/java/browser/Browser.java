package browser;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

	public static WebDriver driver;
	public static Actions act;
	public static WebDriverWait wait; 
	
	// WebDriver Setup Selection Method
	public static WebDriver setDriver() {
		
				return driver = setChromeDriver();
			
		}
	// ChromeDriver Setup Method
	public static WebDriver setChromeDriver() {
		System.setProperty("webdriver.chrome.driver","/Users/kashyaphebbar/Downloads/chromedriver");
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\MUIKEY\\Downloads\\chromedriver.exe");
			return driver = new ChromeDriver();
		}
	// Url Setup Method
	public static void getUrl() throws Exception {
		try {
		String filelocation = System.getProperty("user.dir") + "//configuration//config.properties";
		File file = new File(filelocation);
		FileInputStream fileinput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileinput);
		driver.get(prop.getProperty("url")); //https://www.redbus.in/
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}catch(Exception e)
		{
		System.out.println("URL Method");
		}
	}
}	

