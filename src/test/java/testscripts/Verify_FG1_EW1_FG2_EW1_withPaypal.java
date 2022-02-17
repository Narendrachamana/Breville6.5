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

public class Verify_FG1_EW1_FG2_EW1_withPaypal extends Actiondriver {

    public static BrevilleProduct_OR brevilleproduct;
    public static BrevilleTransactions_OR brevilletransactions;
    public static BrevilleAddressDetailsPage_OR addressDetailsPage;
    public static Brevilleloginpage_OR brevilleLogin;
    public static Object[][] ewtestdata;
    @BeforeTest
    @Parameters({"WorkbookName"})
    public void invokeExcel(String workbookName) throws Exception {
    	ewtestdata = ExcelDataProvider.getData(System.getProperty("user.dir") + File.separator + "Testdata" + File.separator + workbookName, "EW_TestData");
    }
    @Test(dataProvider = "TestData")
    public void verifyOrder_FG1_EW1_FG2_EW1_withPaypal(String data[]) throws Throwable {
        logger.assignAuthor("Narendra");
        brevilleproduct = PageFactory.initElements(driver, BrevilleProduct_OR.class);
        brevilletransactions = PageFactory.initElements(driver, BrevilleTransactions_OR.class);
        addressDetailsPage = PageFactory.initElements(driver, BrevilleAddressDetailsPage_OR.class);
        brevilleLogin= PageFactory.initElements(driver, Brevilleloginpage_OR.class);

        brevilleproduct.clickonProducts();
        brevilleproduct.verifyOrderWithFG1_EW1_FG2_EW1(data[0],data[1]);

        brevilleLogin.clickOnCheckoutCreateAndLogin();
        brevilleLogin.verifyCheckoutLogin(data[2], data[3]);
        addressDetailsPage.clickOnNextPayment();
        brevilletransactions.payUsingPaypal();
        brevilletransactions.reviewOrder("login");
        brevilletransactions.orderDetails();
    }

    @DataProvider(name = "TestData")
    public Object[][] getData() throws Exception {

        Object[][] data = ewtestdata;
        return data;
    }
}
