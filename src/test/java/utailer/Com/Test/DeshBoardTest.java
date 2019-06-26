package utailer.Com.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Utailer.Base.BaseLibs;
import com.Utailer.Pages.DeshBoardPages;
import com.Utailer.Pages.HomePages;
import com.Utailer.Pages.LoginPages;

public class DeshBoardTest extends BaseLibs{
	HomePages homePage;
	LoginPages loginPage;
	DeshBoardPages dashboardPage;

	public DeshBoardTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		
		homePage=new HomePages();
		loginPage=new LoginPages();
		dashboardPage=new DeshBoardPages();
	}

	@Test()
	public void verifyDasboardTitle() {
		dashboardPage.validateDashboardPageTitle();
	}

	@Test(priority=2)
	public void verifyMenLink() throws InterruptedException {
		homePage.clickforLogin();
		dashboardPage= loginPage.login(prop.getProperty("emailId"), prop.getProperty("password"));
		Thread.sleep(2000);
		dashboardPage.clickonMenLink();
		Thread.sleep(2000);
		dashboardPage.checkboxBrand();
	}
	@AfterMethod
	public void closeDriver() throws InterruptedException
	{
		
		
		driver.close();
		Thread.sleep(2000); 
	}
}
