package objectrepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import objectrepository.Brevilleloginpage_OR;



import java.io.IOException;  
import java.util.Properties;

import objectrepository.MyOrder_OR;



import accelerators.Actiondriver;

public class MyOrder_OR extends Actiondriver {
	public static Brevilleloginpage_OR brevilleloginpage;
	public static MyOrder_OR  myorder;

	public MyOrder_OR() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(linkText  = "View Details")
	private static WebElement viewDetailsOnOrderDetailsPage;

	@FindBy(xpath = "//ul[@class='cmp-side-navigation__group']/li[3]")
	private static WebElement myorders;

	@FindBy(xpath = "///button[@innertext='Load More']")
	private static WebElement loadmore;

	@FindBy(xpath = "//?/a[@innertext='Sign up for Newsletter']")
	private static WebElement signUpNewsletter;

	@FindBy(css = ".order-details-summary__container .order-details-summary__row-summary:nth-of-type(1) .order-details-summary__col-summary")

	private static WebElement shippingaddress;

	@FindBy(css = ".order-details-summary__container .order-details-summary__row-summary:nth-of-type(2) .order-details-summary__col-summary")
	private static WebElement payment;

	@FindBy(css = ".order-details-summary__container .order-details-summary__row-summary:nth-of-type(3)")
	private static WebElement ordersummary;

	@FindBy(css = ".price-total")
	private static WebElement ordertotal;

	@FindBy(css = ".tax-border-bottom")
	private static WebElement salestax;

	@FindBy(css = ".order-details-summary__container .order-details-summary__row-summary:nth-of-type(3) .col-summary-totals:nth-child(2)")
	private static WebElement subtotal;

	@FindBy(css = ".order-number p")
	private static WebElement ordernum;

	@FindBy(css = ".order-date p")
	private static WebElement orderdate;

	@FindBy(css = ".order-status p")
	private static WebElement orderstatus;

	@FindBy(css = ".order-details-processing")
	private static WebElement orders;



	/*
	 * @author - Ranjith Kumar RS
	 * Method to fetch the order details from order details page
	 * 
	 */

	public static Map<String, String> getOrderDeatils(String ordernumber, String emailId,String password) throws Throwable {

		myorder = PageFactory.initElements(driver, MyOrder_OR.class);
		brevilleloginpage = PageFactory.initElements(driver, Brevilleloginpage_OR.class);
		Map<String, String> orderdetails = new HashMap<>();
		brevilleloginpage.clickoncreateloginbutton();
		brevilleloginpage.verifylogin(emailId, password);
		myorder.clickonmyOrderleftnav();
		clickonviewDetails(ordernumber);
		Actiondriver.gf_WaitForVisibilityOfElement(viewDetailsOnOrderDetailsPage, "viewDetailsOnOrderDetailsPage");
		viewDetailsOnOrderDetailsPage.click();				
		orderdetails.put("shippingAddressandshippingmethod", shippingaddress.getText());
		orderdetails.put("billingaddressandPaymentmethod", payment.getText());
		orderdetails.put("ordertotal", ordertotal.getText().replace("Order Total:",""));
		orderdetails.put("salestax", salestax.getText().replace("Sales Tax:",""));
		orderdetails.put("subtotal", subtotal.getText().replace("Subtotal:",""));		
		orderdetails.put("ordernumber", ordernum.getText().replace("Order No: ",""));
		orderdetails.put("orderdate", orderdate.getText().replace("Order Date: ",""));
		orderdetails.put("orderstatus", orderstatus.getText().replace("Status: ",""));
		orderdetails.put("orders", orders.getText());

		return orderdetails;

	}


	public void clickonmyOrderleftnav() throws Throwable {


		Actiondriver.gf_Click(myorders,"myorderlink");

	}

	public static void clickonviewDetails(String ordernumber) throws Throwable {


		Actiondriver.gf_Click(myorders,"myorderlink");

		driver.findElement(By.xpath("//a[@href='/us/en/mybreville.html/my-orders/"+ordernumber+"']")).click();

	}



}




