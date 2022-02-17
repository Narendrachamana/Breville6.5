package testscripts;

import accelerators.Actiondriver;
import objectrepository.BrevilleAddressDetailsPage_OR;
import objectrepository.BrevilleProduct_OR;
import objectrepository.BrevilleTransactions_OR;
import objectrepository.Brevilleloginpage_OR;
import utilities.ExcelDataProvider;

import java.io.File;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Verify_FG_Subscription_Order_withPaypal extends Actiondriver {

    public static BrevilleProduct_OR brevilleproduct;
    public static BrevilleTransactions_OR brevilletransactions;
    public static BrevilleAddressDetailsPage_OR brevilleaddress;
    public static Brevilleloginpage_OR brevilleLogin;
    public static BrevilleAddressDetailsPage_OR addressDetailsPage;

    
    

	@BeforeTest
	@Parameters({"WorkbookName"})
	public void invokeExcel(String workbookName) throws Exception

	{
		brevilleTestData = ExcelDataProvider.getData(System.getProperty("user.dir") + File.separator + "Testdata" + File.separator + workbookName, "USA_TestData");
		
	}
	
    
    @Test(dataProvider = "TestData")
    public void verifyCreationOrderWith_FG_Subscription(String data[]) throws Throwable {
        logger.assignAuthor("Narendra");
        brevilleproduct = PageFactory.initElements(driver, BrevilleProduct_OR.class);
        brevilletransactions = PageFactory.initElements(driver, BrevilleTransactions_OR.class);
        brevilleaddress = PageFactory.initElements(driver, BrevilleAddressDetailsPage_OR.class);
        brevilleLogin = PageFactory.initElements(driver, Brevilleloginpage_OR.class);
        addressDetailsPage =PageFactory.initElements(driver,BrevilleAddressDetailsPage_OR.class);

        brevilleproduct.clickonProducts();
        brevilleproduct.verifyOrderWithFG_Subscription(data[0],data[25],data[26]);

        brevilleLogin.clickOnCheckoutCreateAndLogin();
        brevilleLogin.verifyCheckoutLogin(data[8], data[9]);
        addressDetailsPage.enterBillingAddressDetailsWithLoggedInUser(data[10], data[11], data[18],data[19],data[20],data[22],data[21],data[23]);
      //  brevilleproduct.proceedtoCheckout();

        brevilleaddress.clickOnNextPayment();

        brevilletransactions.payUsingPaypal();
        brevilletransactions.reviewOrder("login");
        brevilletransactions.orderDetails();
    }

    @DataProvider(name = "TestData")
    public Object[][] getData() throws Exception {

        Object[][] data = brevilleTestData;
        return data;

    }
}
