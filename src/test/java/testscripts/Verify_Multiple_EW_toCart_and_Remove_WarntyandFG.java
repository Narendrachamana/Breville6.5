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

public class Verify_Multiple_EW_toCart_and_Remove_WarntyandFG extends Actiondriver{
	
	
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
	public void Add_EWtocartandRemovewaranty(String data[]) throws Throwable
	{
		logger.assignAuthor("Naveen");
		brevilleproduct=PageFactory.initElements(driver, BrevilleProduct_OR.class);
		brevilletransactions=PageFactory.initElements(driver, BrevilleTransactions_OR.class);
		brevilleaddress=PageFactory.initElements(driver, BrevilleAddressDetailsPage_OR.class);
		
		

		brevilleproduct.clickonProducts();
		brevilleproduct.selectServiceContract(data[0]);
		Thread.sleep(8000);
		brevilleproduct.clickonProducts();
		brevilleproduct.selectServiceContract("Nespresso Machines");
		brevilleproduct.removeitemwithindexvalue(0);
		brevilleproduct.removeitemwithindexvalue(1);
		brevilleproduct.verifywaranty();

}
	
	@DataProvider(name ="TestData")
	public Object[][] getData() throws Exception {
		
		Object[][] data =brevilleTestData;
		return data;

	}
}