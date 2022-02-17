package testscripts;

import accelerators.Actiondriver;
import objectrepository.BrevilleAddressDetailsPage_OR;
import objectrepository.BrevilleProduct_OR;
import objectrepository.BrevilleTransactions_OR;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Verify_FG_CB_Order_withCreditCard extends Actiondriver {

    public static BrevilleProduct_OR brevilleproduct;
    public static BrevilleTransactions_OR brevilletransactions;
    public static BrevilleAddressDetailsPage_OR brevilleaddress;

    @Test(dataProvider = "TestData")
    public void verifyCreationOrderWith_FG_CB(String data[]) throws Throwable {
        logger.assignAuthor("Narendra");
        brevilleproduct = PageFactory.initElements(driver, BrevilleProduct_OR.class);
        brevilletransactions = PageFactory.initElements(driver, BrevilleTransactions_OR.class);
        brevilleaddress = PageFactory.initElements(driver, BrevilleAddressDetailsPage_OR.class);

        brevilleproduct.clickonProducts();
        brevilleproduct.OrderWith_FG_CB(data[0], data[2]);
        brevilleproduct.proceedtoCheckout();

        brevilleaddress.enterShippingAddressDetailsWithGuestUser(data[10],
                data[11], data[12], data[13], data[14], data[15], data[16], data[17]);
        brevilleaddress.clickOnNextPayment();

        brevilletransactions.payWithCreditCard();
        brevilletransactions.reviewOrder("CoffeBag");
        brevilletransactions.orderDetails();
    }

    @DataProvider(name = "TestData")
    public Object[][] getData() throws Exception {

        Object[][] data = brevilleTestData;
        return data;

    }
}
