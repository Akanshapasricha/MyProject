package com.Utailer.Base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.Utailer.Utility.UtilsTest;
public class BaseLibs {

	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public BaseLibs() 
	{
		try 
		{
			prop=new Properties();
			FileInputStream fileInputStream=new FileInputStream("C:\\Users\\akansha\\git\\WebProject\\WebProject\\src\\main\\java\\com\\Utailer\\Config\\config.properties");
			prop.load(fileInputStream);
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browserName=prop.getProperty("browser");

		//		if(browserName.equals("chrome")) 
		//		{
		//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\akansha\\eclipse-workspace\\WebProject\\exeFiles\\chromedriver.exe");
		//			driver=new ChromeDriver();
		//			e_driver = new EventFiringWebDriver(driver);
		//			// Now create object of EventListerHandler to register it with EventFiringWebDriver
		//			driver = e_driver;
		//			driver.manage().window().maximize();
		//			driver.manage().window().maximize();
		//			driver.manage().deleteAllCookies();
		//			driver.manage().timeouts().pageLoadTimeout(UtilsTest.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		//			driver.manage().timeouts().implicitlyWait(UtilsTest.IMPLICIT_WAIT, TimeUnit.SECONDS);
		//			driver.get(prop.getProperty("url"));
		//		}
		if (browserName.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\akansha\\git\\WebProject\\WebProject\\exeFiles\\geckodriver.exe");
			driver=new FirefoxDriver();
			e_driver = new EventFiringWebDriver(driver);
			// Now create object of EventListerHandler to register it with EventFiringWebDriver
			driver = e_driver;
			driver.manage().window().maximize();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(UtilsTest.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(UtilsTest.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
	}
}

