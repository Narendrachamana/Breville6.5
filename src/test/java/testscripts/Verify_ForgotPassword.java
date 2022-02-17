package testscripts;

import java.io.File;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import accelerators.Actiondriver;
import objectrepository.Brevilleloginpage_OR;
import objectrepository.MyOrder_OR;
import utilities.ExcelDataProvider;
import utilities.GenericUtility;
import org.testng.Assert;
public class Verify_ForgotPassword extends Actiondriver {

	public static Brevilleloginpage_OR brevilleloginpage;
	public static MyOrder_OR myorder;
	

	@BeforeTest
	@Parameters({"WorkbookName"})
	public void invokeExcel(String workbookName) throws Exception

	{
		brevilleTestData = ExcelDataProvider.getData(System.getProperty("user.dir") + File.separator + "Testdata" + File.separator + workbookName, "USA_TestData");
		
	}

	  @Test(dataProvider = "TestData")
	  public void verifyforgotPassword(String
	  data[]) throws Throwable { brevilleloginpage =
	  PageFactory.initElements(driver, Brevilleloginpage_OR.class);
	  brevilleloginpage.clickoncreateloginbutton();
	  brevilleloginpage.verifyforgotPassword(data[8]);
	  
	  try {
	  
	 } catch (Exception e1) { e1.printStackTrace(); } }
	 
	
	

	@DataProvider(name = "TestData")
	public Object[][] getData() throws Exception {

		Object[][] data = brevilleTestData;
		return data;
	}
}
