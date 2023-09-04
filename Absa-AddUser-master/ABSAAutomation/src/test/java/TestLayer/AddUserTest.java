package TestLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import ListenersTestNG.ListenerCustom;
import PageLayer.AddUser;

import TestBaseLayer.TestBase;
import TestUtilites.TestUtil;
import TestUtilites.WebEventListner;



public class AddUserTest extends TestBase
{
	public static AddUser user;
	public static TestUtil testutil;
public static EventFiringWebDriver e_driver;
	
	public static WebEventListner eventListener;
	String sheetName="Reg";
	String sheetName1="Sing";
	public AddUserTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void Next()
	{
		initialization();
		user=new AddUser();
		testutil = new TestUtil();
		user.Addbutton();
	}
	
	@DataProvider
	public Object[][] getATestData()
	{
		Object data[][]=TestUtil.getTestData(sheetName1);
		return data;
		
		 
		}
	
@Test(dataProvider="getATestData")
	public void newAddUser1(String Add,String Fss, String laa, String Uss, String Paa, String AA, String Emm, String Mbb)
	{
		
		user.NewAddUser(Add, Fss, laa, Uss, Paa, AA, Emm, Mbb);
		
	}

	




	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
}
