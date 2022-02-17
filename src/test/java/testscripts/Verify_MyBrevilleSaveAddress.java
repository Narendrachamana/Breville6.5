package testscripts;

import java.io.File;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import accelerators.Actiondriver;
import objectrepository.BrevilleAddressDetailsPage_OR;
import objectrepository.BrevilleHomepage_OR;
import objectrepository.BrevilleMyDashboard_OR;
import objectrepository.BrevilleProduct_OR;
import objectrepository.BrevilleTransactions_OR;
import objectrepository.Brevilleloginpage_OR;
import utilities.ExcelDataProvider;
import utilities.GenericUtility;

public class Verify_MyBrevilleSaveAddress  extends Actiondriver {
	
    public static BrevilleProduct_OR brevilleproduct;
    public static BrevilleTransactions_OR brevilletransactions;
    public static BrevilleAddressDetailsPage_OR brevilleaddress;
    public static Brevilleloginpage_OR brevilleLogin;
    public static BrevilleMyDashboard_OR brevilleMyDashoard;
    public static BrevilleHomepage_OR brevilleHome;
    public static Brevilleloginpage_OR brevilleloginpage;

	@BeforeTest
	@Parameters({"WorkbookName"})
	public void invokeExcel(String workbookName) throws Exception

	{
		brevilleTestData = ExcelDataProvider.getData(System.getProperty("user.dir") + File.separator + "Testdata" + File.separator + workbookName, "USA_TestData");
		
	}


	@Test(dataProvider = "TestData")
	public void myAccount_AddNewAddress(String data[]) throws Throwable
	{
     logger.assignAuthor("Ranjithb");  
		
        brevilleloginpage = PageFactory.initElements(driver, Brevilleloginpage_OR.class);
        brevilleMyDashoard = PageFactory.initElements(driver, BrevilleMyDashboard_OR.class);
        brevilleHome = PageFactory.initElements(driver, BrevilleHomepage_OR.class);
        brevilleloginpage.clickoncreateloginbutton();
        brevilleloginpage.verifylogin(data[8], data[9]);
        brevilleloginpage.verifymyaccountonlydashboardtitle();
        brevilleHome.clickonMyBreville();
        hardWait(15000);
        brevilleMyDashoard.clickonMyAccount(); 
        brevilleMyDashoard.clickonSavedaddreses();
        brevilleMyDashoard.myaccountAddNewAddress();
        brevilleMyDashoard.saveMyBrevilleAddress(data[12], data[13], data[14], data[15], data[16]);
        brevilleMyDashoard.clickonsavebuttonafterfillingaddress();
      //  brevilleloginpage.verifiedyouremailpopupclose();
	}
	
	
	
		@DataProvider(name = "TestData")
	public Object[][] getData() throws Exception {

		Object[][] data = brevilleTestData;
		return data;
	}
}
