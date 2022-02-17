package objectrepository;

import accelerators.Actiondriver;
import utilities.GenericUtility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BrevilleAddressDetailsPage_OR extends Actiondriver {


    @FindBy(xpath="//input[@type='email']")
    private static WebElement email_Textbox;

    @FindBy(xpath="//input[@name='2_email']")
    private static WebElement emailBillingGuestUser_Textbox;

    @FindBy(xpath = "//input[@name='1_firstName']")
    private static WebElement firstName_Textbox;

    @FindBy(xpath = "//input[@name='2_firstName']")
    private static WebElement firstNameBillingGuestUser_Textbox;

    @FindBy(xpath = "//input[@name='shippingUser_firstName']")
    private static WebElement firstName_Textbox1;

    @FindBy(xpath = "//input[@name='billingUser_firstName']")
    private static WebElement firstNameBillingUser_Textbox1;

    @FindBy(xpath ="//input[@name='1_lastName']")
    private static WebElement lastName_Textbox;

    @FindBy(xpath ="//input[@name='2_lastName']")
    private static WebElement lastNameBillingGuestUser_Textbox;

    @FindBy(xpath ="//input[@name='shippingUser_lastName']")
    private static WebElement lastName_Textbox1;

    @FindBy(xpath ="//input[@name='billingUser_lastName']")
    private static WebElement lastNameBillingUser_Textbox1;

    @FindBy(xpath="//input[@name='1_address1']")
    private static WebElement address1_Textbox;

    @FindBy(xpath="//input[@name='2_address1']")
    private static WebElement address1BillingGuestUser_Textbox;

    @FindBy(xpath="//input[@name='0_address1']")
    private static WebElement address1_Textbox1;

    @FindBy(xpath="//input[@name='4_address1']")
    private static WebElement address1BillingUser_Textbox1;

    @FindBy(xpath="//input[@name='1_address2']")
    private static WebElement address2_Textbox;

    @FindBy(xpath="//input[@name='2_address2']")
    private static WebElement address2BillingGuestUser_Textbox;

    @FindBy(xpath="//input[@name='0_address2']")
    private static WebElement address2_Textbox1;

    @FindBy(xpath="//input[@name='4_address2']")
    private static WebElement address2BillingUser_Textbox1;

    @FindBy(xpath="//input[@name='1_city']")
    private static WebElement city_Textbox;

    @FindBy(xpath="//input[@name='2_city']")
    private static WebElement cityBillingGuestUser_Textbox;

    @FindBy(xpath="//input[@name='0_city']")
    private static WebElement city_Textbox1;

    @FindBy(xpath="//input[@name='4_city']")
    private static WebElement cityBillingUser_Textbox1;

    @FindBy(xpath="//select[@name='1_state']")
    private static WebElement state_Dropdown;

    @FindBy(xpath="//select[@name='2_state']")
    private static WebElement stateBillingGuestUser_Dropdown;

    @FindBy(xpath="//select[@name='0_state']")
    private static WebElement state_Dropdown1;

    @FindBy(xpath="//select[@name='4_state']")
    private static WebElement stateBillingUser_Dropdown1;

    @FindBy(xpath="//input[@name='1_zipCode']")
    private static WebElement zipcode_Textbox;

    @FindBy(xpath="//input[@name='2_zipCode']")
    private static WebElement zipcodeBillingGuestUser_Textbox;

    @FindBy(xpath="//input[@name='0_zipCode']")
    private static WebElement zipcode_Textbox1;

    @FindBy(xpath="//input[@name='4_zipCode']")
    private static WebElement zipcodeBillingUser_Textbox1;

    @FindBy(xpath ="//input[@name='1_phone']")
    private static WebElement phoneNumber_Textbox;

    @FindBy(xpath ="//input[@name='2_phone']")
    private static WebElement phoneNumberBillingGuestUser_Textbox;

    @FindBy(xpath ="//input[@name='shippingUser_phone']")
    private static WebElement phoneNumber_Textbox1;

    @FindBy(xpath ="//input[@name='billingUser_phone']")
    private static WebElement phoneNumberBillingUser_Textbox1;

    @FindBy(xpath="//input[@id='billingChecked']")
    private static WebElement billingChecked_Checkbox;

    @FindBy(xpath="//button[@id='SHIPPING_BTN_ID']")
    private static WebElement nextPaymentButton;
    
    
    

    public BrevilleAddressDetailsPage_OR()
    {
        PageFactory.initElements(driver, this);
    }

    public String newEmailid() throws Throwable
	{
		String email="test" +GenericUtility.generateEmail()+ "@yopmail.com";
		return email;
		
	}
	
    public void enterShippingAddressDetailsWithGuestUser(String firstName,String lastName,String address1,String address2,String city,String zipCode,String state,String phoneNumber)throws Throwable
    {
    	Actiondriver.gf_WaitForElementToBeClickable(email_Textbox, "Email",12,3);
        Actiondriver.gf_Type(email_Textbox, newEmailid(), "Email");
        Actiondriver.gf_Type(firstName_Textbox,firstName,"First Name");
        Actiondriver.gf_Type(lastName_Textbox,lastName,"Last Name");
        Actiondriver.gf_Type(address1_Textbox,address1,"Address1");
        Actiondriver.gf_Type(address2_Textbox,address2,"Address2");
        Actiondriver.gf_Type(city_Textbox,city,"City/Town");
        Actiondriver.gf_SelectByVisibleText(state_Dropdown,state,"State");
        Actiondriver.gf_Type(zipcode_Textbox,zipCode,"Zip Code");
        Actiondriver.gf_Type(phoneNumber_Textbox,phoneNumber,"Phone number");
        //Actiondriver.gf_JsClick(billingChecked_Checkbox,"Use Shipping Address For Billing");
    }

    public void enterShippingAddressDetailsWithNewUser(String firstName,String lastName,String address1,String address2,String city,String state,String zipCode,String phoneNumber)throws Throwable
    {
    	Actiondriver.gf_WaitForElementToBeClickable(firstName_Textbox1, "FirstName",12,3);
        Actiondriver.gf_Type(firstName_Textbox1,firstName,"First Name");
        Actiondriver.gf_Type(lastName_Textbox1,lastName,"Last Name");
        Actiondriver.gf_Type(phoneNumber_Textbox1,phoneNumber,"Phone number");
        Actiondriver.gf_Type(address1_Textbox1,address1,"Address1");
        Actiondriver.gf_Type(address2_Textbox1,address2,"Address2");
        Actiondriver.gf_Type(city_Textbox1,city,"City/Town");
        Actiondriver.gf_SelectByVisibleText(state_Dropdown1,state,"State");
        Actiondriver.gf_Type(zipcode_Textbox1,zipCode,"Zip Code");
        //Actiondriver.gf_JsClick(billingChecked_Checkbox,"Use Shipping Address For Billing");
    }

    public void enterBillingAddressDetailsWithNewUser(String firstName,String lastName,String address1,String address2,String city,String state,String zipCode,String phoneNumber)throws Throwable
    {
    	 Actiondriver.gf_WaitForElementToBeClickable(billingChecked_Checkbox, "Use Shipping Address For Billing",16,2);
        Actiondriver.gf_JsClick(billingChecked_Checkbox,"Use Shipping Address For Billing");
        Actiondriver.gf_Type(firstNameBillingUser_Textbox1,firstName,"First Name");
        Actiondriver.gf_Type(lastNameBillingUser_Textbox1,lastName,"Last Name");
        Actiondriver.gf_Type(phoneNumberBillingUser_Textbox1,phoneNumber,"Phone number");
        Actiondriver.gf_Type(address1BillingUser_Textbox1,address1,"Address1");
        Actiondriver.gf_Type(address2BillingUser_Textbox1,address2,"Address2");
        Actiondriver.gf_Type(cityBillingUser_Textbox1,city,"City/Town");
        Actiondriver.gf_SelectByVisibleText(stateBillingUser_Dropdown1,state,"State");
        Actiondriver.gf_Type(zipcodeBillingUser_Textbox1,zipCode,"Zip Code");
    }

    public void enterBillingAddressDetailsWithGuestUser(String firstName,String lastName,String address1,String address2,String city,String state,String zipCode,String phoneNumber)throws Throwable
    {
        Actiondriver.gf_WaitForElementToBeClickable(billingChecked_Checkbox, "Use Shipping Address For Billing",16,2);
        Actiondriver.gf_JsClick(billingChecked_Checkbox,"Use Shipping Address For Billing");
        Actiondriver.gf_Type(emailBillingGuestUser_Textbox, newEmailid(), "Email");
        Actiondriver.gf_Type(firstNameBillingGuestUser_Textbox,firstName,"First Name");
        Actiondriver.gf_Type(lastNameBillingGuestUser_Textbox,lastName,"Last Name");
        Actiondriver.gf_Type(phoneNumberBillingGuestUser_Textbox,phoneNumber,"Phone number");
        Actiondriver.gf_Type(address1BillingGuestUser_Textbox,address1,"Address1");
        Actiondriver.gf_Type(address2BillingGuestUser_Textbox,address2,"Address2");
        Actiondriver.gf_Type(cityBillingGuestUser_Textbox,city,"City/Town");
        Actiondriver.gf_SelectByVisibleText(stateBillingGuestUser_Dropdown,state,"State");
        Actiondriver.gf_Type(zipcodeBillingGuestUser_Textbox,zipCode,"Zip Code");
    }
    
    
    public void enterBillingAddressDetailsWithLoggedInUser(String firstName,String lastName,String address1,String address2,String city,String state,String zipCode,String phoneNumber)throws Throwable
    {
       
    	Actiondriver.hardWait(25000);
    	Actiondriver.gf_WaitForElementtoEnabled(billingChecked_Checkbox, "Use Shipping Address For Billin",20,2);
        Actiondriver.gf_JsClick(billingChecked_Checkbox,"Use Shipping Address For Billing");
        Actiondriver.gf_Type(firstNameBillingUser_Textbox1,firstName,"First Name");
        Actiondriver.gf_Type(lastNameBillingUser_Textbox1,lastName,"Last Name");
        Actiondriver.gf_Type(phoneNumberBillingUser_Textbox1,phoneNumber,"Phone number");
        Actiondriver.gf_Type(address1BillingUser_Textbox1,address1,"Address1");
        Actiondriver.gf_Type(address2BillingUser_Textbox1,address2,"Address2");
        Actiondriver.gf_Type(cityBillingUser_Textbox1,city,"City/Town");
        Actiondriver.gf_SelectByVisibleText(stateBillingUser_Dropdown1,state,"State");
        Actiondriver.gf_Type(zipcodeBillingUser_Textbox1,zipCode,"Zip Code");
    }
    
    
    public void clickOnNextPayment()throws Throwable
    {
    	Actiondriver.hardWait(25000);
    	Actiondriver.gf_WaitForElementtoEnabled(nextPaymentButton, "Next Payment",12,5);
    	Actiondriver.scrollToViewTillElement(nextPaymentButton);
       	Actiondriver.gf_JsClick(nextPaymentButton,"Next Payment");
    }

    public void verifyEmail()throws Throwable
    {
        Actiondriver.gf_AssertElementDisplayed(email_Textbox,"email");
    }

}
