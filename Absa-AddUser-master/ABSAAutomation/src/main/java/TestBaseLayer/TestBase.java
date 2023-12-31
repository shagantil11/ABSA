package TestBaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Parameters;

import TestUtilites.WebEventListner;





public class TestBase 

{
	public static WebDriver driver;
	public static Properties prop;

	public static EventFiringWebDriver e_driver;
	
	public static WebEventListner eventListener;
	
	public TestBase()
	{
		try
			{
			prop= new Properties();
			FileInputStream fis = new FileInputStream("E:\\Laxmi Shaganti\\ABSAAutomation\\src\\main\\java\\Config\\Config1");
			prop.load(fis);
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			catch(NullPointerException e)
			{
				e.printStackTrace();
			}
			//System.out.println(prop.getProperty("browser"));
		}
	
	
	
	public static void initialization( )
	{
	String browserName = prop.getProperty("browser");
	if(browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","E:\\SLN\\chromedriver.exe");
	driver= new ChromeDriver();
	}
	else
	if(browserName.equalsIgnoreCase("firefox"))
	{
	System.setProperty("webdriver.gecko.driver","E:\\SLN\\geckodriver.exe");
	driver= new FirefoxDriver();
	
	}
	
	e_driver = new EventFiringWebDriver(driver);
	
	
	WebEventListner eventListener = new WebEventListner();
	e_driver.register(eventListener);
	driver = e_driver;
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	

	driver.get(prop.getProperty("url"));
	

	}
	


}
