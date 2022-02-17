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
import utilities.GenericUtility;

public class Verify_functionalityof_UpdateQuantity extends Actiondriver{
	
	

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
	public void verifyCreationoforderwith_FG(String data[]) throws Throwable
	{
		logger.assignAuthor("Naveen");
		brevilleproduct=PageFactory.initElements(driver, BrevilleProduct_OR.class);
		brevilletransactions=PageFactory.initElements(driver, BrevilleTransactions_OR.class);
		brevilleaddress=PageFactory.initElements(driver, BrevilleAddressDetailsPage_OR.class);
		
		

		brevilleproduct.clickonProducts();
		
		brevilleproduct.selectFGproduct(data[0]);
		brevilleproduct.updateQuantity();
		
		}	

	

	

	@DataProvider(name ="TestData")
	public Object[][] getData() throws Exception {
		
		Object[][] data =brevilleTestData;
		return data;

	}

}
