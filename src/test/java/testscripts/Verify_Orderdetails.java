package testscripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import accelerators.Actiondriver;
import objectrepository.Brevilleloginpage_OR;
import objectrepository.MyOrder_OR;

public class Verify_Orderdetails extends Actiondriver {

	public static Brevilleloginpage_OR brevilleloginpage;
	public static MyOrder_OR myorder;

	
	
	
	 @Test(dataProvider = "TestData")
	 	public void getMyOrderDetaila(String data[]) throws Throwable {
	    
	  System.out.println("=========>>>"+MyOrder_OR.getOrderDeatils("40008991","ranjith063@gmail.com", "Ocwen@123"));
	  
	 	        try {
	 	
	 	        }
	 	      catch (Exception e1) {
	 				e1.printStackTrace();
	 			}
		 } 

	@DataProvider(name = "TestData")
	public Object[][] getData() throws Exception {

		Object[][] data = brevilleTestData;
		return data;
	}
}
