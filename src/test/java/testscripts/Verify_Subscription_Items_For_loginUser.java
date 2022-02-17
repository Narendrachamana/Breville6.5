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

public class Verify_Subscription_Items_For_loginUser extends Actiondriver {

        public static BrevilleProduct_OR brevilleproduct;
        public static BrevilleTransactions_OR brevilletransactions;
        public static BrevilleAddressDetailsPage_OR brevilleaddress;
        public static Brevilleloginpage_OR brevillelogin;

        @BeforeTest
        @Parameters({"WorkbookName"})
        public void invokeExcel(String workbookName) throws Exception {
            brevilleTestData = ExcelDataProvider.getData(System.getProperty("user.dir") + File.separator + "Testdata" + File.separator + workbookName, "USA_TestData");

        }

        @Test(dataProvider = "TestData")
        public void verifySubscriptionProductToCartOnCartPage(String data[]) throws Throwable {
            logger.assignAuthor("Narendra");
            brevilleproduct = PageFactory.initElements(driver, BrevilleProduct_OR.class);
            brevilletransactions = PageFactory.initElements(driver, BrevilleTransactions_OR.class);
            brevilleaddress = PageFactory.initElements(driver, BrevilleAddressDetailsPage_OR.class);
            brevillelogin = PageFactory.initElements(driver, Brevilleloginpage_OR.class);

            brevilleproduct.clickonProducts();
            brevilleproduct.selectSubscriptionsproduct1(data[25],"One-time purchase");
            Actiondriver.hardWait(5000);
            brevilleproduct.updateSubscriptionEveryOnCartPage("3 Month Plan");
            Actiondriver.hardWait(5000);
            brevillelogin.verifyCreateLogin();
            Actiondriver.hardWait(5000);
            brevilleproduct.proceedtoCheckout();
            Actiondriver.hardWait(2000);
            brevillelogin.verifyCheckoutEmail();
        }

        @DataProvider(name = "TestData")
        public Object[][] getData() throws Exception {

            Object[][] data = brevilleTestData;
            return data;
        }
}
