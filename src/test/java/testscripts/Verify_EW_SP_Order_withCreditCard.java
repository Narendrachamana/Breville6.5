package testscripts;

import java.io.File;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import accelerators.Actiondriver;
import objectrepository.BrevilleAddressDetailsPage_OR;
import objectrepository.BrevilleProduct_OR;
import objectrepository.BrevilleTransactions_OR;
import utilities.ExcelDataProvider;

public class Verify_EW_SP_Order_withCreditCard extends Actiondriver {

	

	public static BrevilleProduct_OR brevilleproduct;
	public static BrevilleTransactions_OR brevilletransactions;
	public static BrevilleAddressDetailsPage_OR brevilleaddress;
	
	
	

	@BeforeTest
	@Parameters({"WorkbookName"})
	public void invokeExcel(String workbookName) throws Exception

	{
		brevilleTestData = ExcelDataProvider.getData(System.getProperty("user.dir") + File.separator + "Testdata" + File.separator + workbookName, "USA_TestData");
		
	}
	
	@Test(dataProvider="TestData")
	public void verifyCreationoforderwith_EW_SP(String data[]) throws Throwable
	{
		logger.assignAuthor("SaiGiridhar");
		brevilleproduct=PageFactory.initElements(driver, BrevilleProduct_OR.class);
		brevilletransactions=PageFactory.initElements(driver, BrevilleTransactions_OR.class);
		brevilleaddress=PageFactory.initElements(driver, BrevilleAddressDetailsPage_OR.class);
		
		

		brevilleproduct.clickonProducts();
		brevilleproduct.verifyOrderwith_EW_SP(data[1],data[3],data[4]);
		  brevilleproduct.proceedtoCheckout();
		 brevilleaddress.enterShippingAddressDetailsWithGuestUser(data[10],
		  data[11], data[12], data[13], data[14], data[15], data[16], data[17]);
		  brevilleaddress.clickOnNextPayment();
		  brevilletransactions.payWithCreditCard();
		  brevilletransactions.reviewOrder("NA"); 
		  brevilletransactions.orderDetails();
		 
		
		}	

	

	

	@DataProvider(name ="TestData")
	public Object[][] getData() throws Exception {
		
		Object[][] data =brevilleTestData;
		return data;

	}
}
