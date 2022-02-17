package testscripts;

import java.io.File;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import accelerators.Actiondriver;
import objectrepository.Brevilleloginpage_OR;
import objectrepository.MyOrder_OR;
import utilities.ExcelDataProvider;
import utilities.GenericUtility;
import org.testng.Assert;

public class Verify_Account_With_loggedinUser extends Actiondriver {

	public static Brevilleloginpage_OR brevilleloginpage;

	@BeforeTest
	@Parameters({ "WorkbookName" })
	public void invokeExcel(String workbookName) throws Exception {
		brevilleTestData = ExcelDataProvider.getData(
				System.getProperty("user.dir") + File.separator + "Testdata" + File.separator + workbookName,
				"USA_TestData");
	}

	@Test(dataProvider = "TestData")
	public void verify_existigloin(String data[]) throws Throwable {
		brevilleloginpage = PageFactory.initElements(driver, Brevilleloginpage_OR.class);
		brevilleloginpage.clickoncreateloginbutton();
		brevilleloginpage.verifylogin(data[9], data[29]);
		Assert.assertTrue(brevilleloginpage.verifypasswordconditon());
		brevilleloginpage.verifylogin(data[30], data[8]);
		Assert.assertTrue(brevilleloginpage.verifyemailconditon());
		brevilleloginpage.verifylogin(data[31], data[9]);
		driver.navigate().refresh();
		System.out.println("VerifyincorrectEmail and refreshed");
		brevilleloginpage.verifylogin(data[8], data[9]);
		brevilleloginpage.verifymyaccountonlydashboardtitle();
		
	}

	@DataProvider(name = "TestData")
	public Object[][] getData() throws Exception {

		Object[][] data = brevilleTestData;
		return data;
	}
}
