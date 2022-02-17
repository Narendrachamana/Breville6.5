package testscripts;

import accelerators.Actiondriver;
import objectrepository.BrevilleAddressDetailsPage_OR;
import objectrepository.BrevilleProduct_OR;
import objectrepository.BrevilleTransactions_OR;
import objectrepository.Brevilleloginpage_OR;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Verify_FG_SB_EW_RemoveOneProduct extends Actiondriver {

    public static BrevilleProduct_OR brevilleproduct;
    public static BrevilleTransactions_OR brevilletransactions;
    public static BrevilleAddressDetailsPage_OR brevilleaddress;
    public static Brevilleloginpage_OR brevilleLogin;

    @Test(dataProvider = "TestData")
    public void FG_Subscription_EW_RemoveOneProduct(String data[]) throws Throwable {
        logger.assignAuthor("Narendra");
        brevilleproduct = PageFactory.initElements(driver, BrevilleProduct_OR.class);
        brevilletransactions = PageFactory.initElements(driver, BrevilleTransactions_OR.class);
        brevilleaddress = PageFactory.initElements(driver, BrevilleAddressDetailsPage_OR.class);
        brevilleLogin = PageFactory.initElements(driver, Brevilleloginpage_OR.class);

        brevilleproduct.clickonProducts();

        brevilleproduct.addmultipleproducts("Nespresso Machines", data[1],data[25],data[26]);
    	brevilleproduct.removeItemandVerifythecount(3);
       
    }

    @DataProvider(name = "TestData")
    public Object[][] getData() throws Exception {

        Object[][] data = brevilleTestData;
        return data;

    }
}
