package testscripts;
import accelerators.Actiondriver;
import objectrepository.BrevilleAddressDetailsPage_OR;
import objectrepository.BrevilleProduct_OR;
import objectrepository.BrevilleTransactions_OR;
import objectrepository.Brevilleloginpage_OR;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.ExcelDataProvider;

import java.io.File;

public class Verify_FG_Subscription1_Subscription2_SP_withCreditCard extends Actiondriver {

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
    public void verifyCreationOrderWithCB_FG_Subscription(String data[]) throws Throwable {
        logger.assignAuthor("Narendra");
        brevilleproduct = PageFactory.initElements(driver, BrevilleProduct_OR.class);
        brevilletransactions = PageFactory.initElements(driver, BrevilleTransactions_OR.class);
        brevilleaddress = PageFactory.initElements(driver, BrevilleAddressDetailsPage_OR.class);
        brevilleLogin = PageFactory.initElements(driver, Brevilleloginpage_OR.class);
        addressDetailsPage =PageFactory.initElements(driver,BrevilleAddressDetailsPage_OR.class);

        brevilleproduct.verifyOrderWithFG_SB1_SB2_SP(data[0], data[3], data[4],data[25],data[26],data[27],data[28]);
        brevilleLogin.clickOnCheckoutCreateAndLogin();
        brevilleLogin.verifyCheckoutLogin(data[8], data[9]);
        addressDetailsPage.enterBillingAddressDetailsWithLoggedInUser(data[10], data[11], data[18],data[19],data[20],data[22],data[21],data[23]);

        brevilleaddress.clickOnNextPayment();

        brevilletransactions.payWithCreditCard();
        brevilletransactions.reviewOrder("login");
        brevilletransactions.orderDetails();
    }

    @DataProvider(name = "TestData")
    public Object[][] getData() throws Exception {

        Object[][] data = brevilleTestData;
        return data;
    }
}
