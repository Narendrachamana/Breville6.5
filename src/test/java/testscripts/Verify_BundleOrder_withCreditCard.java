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
import objectrepository.Brevilleloginpage_OR;
import utilities.ExcelDataProvider;

public class Verify_BundleOrder_withCreditCard extends Actiondriver{
	

	public static BrevilleProduct_OR brevilleproduct;
	public static BrevilleTransactions_OR brevilletransactions;
	public static BrevilleAddressDetailsPage_OR brevilleaddress;
	public static Brevilleloginpage_OR brevillelogin;
	
	

	@BeforeTest
	@Parameters({"WorkbookName"})
	public void invokeExcel(String workbookName) throws Exception

	{
		brevilleTestData = ExcelDataProvider.getData(System.getProperty("user.dir") + File.separator + "Testdata" + File.separator + workbookName, "USA_TestData");
		
	}
	
	
	@Test(dataProvider="TestData")
	public void verifyCreationofBundleorder_CC(String data[]) throws Throwable
	{
		logger.assignAuthor("Naveen");
		brevilleproduct=PageFactory.initElements(driver, BrevilleProduct_OR.class);
		brevilletransactions=PageFactory.initElements(driver, BrevilleTransactions_OR.class);
		brevilleaddress=PageFactory.initElements(driver, BrevilleAddressDetailsPage_OR.class);
		brevillelogin=PageFactory.initElements(driver, Brevilleloginpage_OR.class);
		

		brevilleproduct.clickonProducts();
		
		brevilleproduct.selectbundleproduct(data[2]);
		
		brevillelogin.clickOnCheckoutCreateAndLogin();
		brevillelogin.verifyCheckoutLogin("mahesh_n_14@yopmail.com","Test12345");
		  brevilleaddress.clickOnNextPayment();
		  brevilletransactions.payWithCreditCard();
		  brevilletransactions.reviewOrder("login"); 
		  brevilletransactions.orderDetails();
		 
		
		}	

	

	

	@DataProvider(name ="TestData")
	public Object[][] getData() throws Exception {
		
		Object[][] data =brevilleTestData;
		return data;

	}


}
