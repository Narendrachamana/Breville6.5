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

public class EditAddresses_SubscriptionInMyDashboard  extends Actiondriver {
	
    public static BrevilleProduct_OR brevilleproduct;
    public static BrevilleTransactions_OR brevilletransactions;
    public static BrevilleAddressDetailsPage_OR brevilleaddress;
    public static Brevilleloginpage_OR brevilleLogin;
    public static BrevilleMyDashboard_OR brevilleMyDashoard;
    public static BrevilleHomepage_OR brevilleHome;

	@BeforeTest
	@Parameters({"WorkbookName"})
	public void invokeExcel(String workbookName) throws Exception

	{
		brevilleTestData = ExcelDataProvider.getData(System.getProperty("user.dir") + File.separator + "Testdata" + File.separator + workbookName, "USA_TestData");
		
	}


	@Test(dataProvider = "TestData")
	public void editBillAndShipAddress(String data[]) throws Throwable
	{
     logger.assignAuthor("pavan");  
		brevilleproduct = PageFactory.initElements(driver, BrevilleProduct_OR.class);
        brevilletransactions = PageFactory.initElements(driver, BrevilleTransactions_OR.class);
        brevilleaddress = PageFactory.initElements(driver, BrevilleAddressDetailsPage_OR.class);
        brevilleLogin = PageFactory.initElements(driver, Brevilleloginpage_OR.class);
        brevilleMyDashoard = PageFactory.initElements(driver, BrevilleMyDashboard_OR.class);
        brevilleHome = PageFactory.initElements(driver, BrevilleHomepage_OR.class);
        
        brevilleHome.clickonMyBreville();
        brevilleMyDashoard.clickonMySubscriptions();
        brevilleMyDashoard.clickonEditSubscription();
        brevilleMyDashoard.clickonEditBillingAddressLink();
        brevilleMyDashoard.editBillingAddressDetailsInMySubscriptions(data[10], data[11], data[12], data[13], data[14], data[15], data[16], data[17]);
        brevilleMyDashoard.clickonSaveinBillingAddress();
        brevilleMyDashoard.clickonEditShippingAddressLink();
        brevilleMyDashoard.editShippingAddressDetailsInMySubscriptions(data[10], data[11], data[18], data[19], data[20], data[21], data[22], data[23]);
        brevilleMyDashoard.clickonSaveinShippingAddress();
	}
	
		@DataProvider(name = "TestData")
	public Object[][] getData() throws Exception {

		Object[][] data = brevilleTestData;
		return data;
	}
}
