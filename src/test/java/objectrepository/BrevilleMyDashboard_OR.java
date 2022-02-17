package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;

import accelerators.Actiondriver;

public class BrevilleMyDashboard_OR extends Actiondriver {

	@FindBy(xpath = "(//li[@class='cmp-side-navigation__group__item'])[4]")
	public static WebElement mySubscriptions;

	@FindBy(xpath = "//a[normalize-space()='Account Details']")
	public static WebElement myAccount;

	@FindBy(xpath = "//a[@data-testid='addresses-list-link']")
	public static WebElement myaccountsavedaddress;

	@FindBy(xpath = "//div[contains(@id,'spinner__dialog')and(contains(@style,'none'))]")
	public static WebElement loaderImage;

	@FindBy(xpath = "(a[class='react-button react-button--size-medium react-button react-button--textType-normal react-button--type-button react-button--color-scheme-green'])")
	public static WebElement editSubscription;

	@FindBy(xpath = "(//div[@id='shipping-address-22af11c0-8c60-36c-375e-a11e1a9b9b3e']//button[@class='link react-button react-button--size-medium react-button react-button--textType-normal react-button--type-link react-button--color-scheme-green'])")
	public static WebElement editShippingAddress;

	@FindBy(xpath = "(//div[@id='billing-address-22af11c0-8c60-36c-375e-a11e1a9b9b3e']//button[@class='link react-button react-button--size-medium react-button react-button--textType-normal react-button--type-link react-button--color-scheme-green'])")
	public static WebElement editBillingAddress;

	@FindBy(xpath = "//input[@id='firstName']")
	private static WebElement firstName;

	@FindBy(xpath = "//input[@id='lastName']")
	private static WebElement lastName;

	@FindBy(xpath = "//input[@id='address1']")
	private static WebElement address1;

	@FindBy(xpath = "//input[@id='address2']")
	private static WebElement address2;

	@FindBy(xpath = "//input[@id='city']")
	private static WebElement city;

	@FindBy(xpath = "//select[@id='state']")
	private static WebElement state;

	@FindBy(xpath = "//input[@id='zipCode']")
	private static WebElement zipcode;

	@FindBy(xpath = "//input[@id='phone']")
	private static WebElement phonenumber;

	@FindBy(xpath = "//button[@class='form-button react-button react-button--size-medium react-button react-button--textType-bold react-button--type-submit react-button--color-scheme-green']")
	private static WebElement saveButton;
	
	@FindBy(xpath = "//button[@type='submit']")
	private static WebElement myaccaddresssave;
	
	

	@FindBy(xpath = "//button[@class='cmp-button react-button react-button--size-medium react-button react-button--textType-normal react-button--type-button react-button--color-scheme-green']")
	private static WebElement cancelButton;

	@FindBy(xpath = "//select[@name='timeframe']")
	private static WebElement pauseSubscription;

	@FindBy(xpath = "//button[@class='btn-cta-link btn-big-cta react-button react-button--size-medium react-button react-button--textType-normal react-button--type-link react-button--color-scheme-green']")
	private static WebElement cancelSubscription;

	@FindBy(xpath = "//button[@class='btn-cta-link btn-big-cta react-button react-button--size-medium react-button react-button--textType-normal react-button--type-link react-button--color-scheme-green'][1]")
	private static WebElement resumeSubscription;

	@FindBy(xpath = "//button[@class='action-modal__btn cta react-button react-button--size-medium react-button react-button--textType-normal react-button--type-button react-button--color-scheme-green']")
	private static WebElement confirm;

	@FindBy(xpath = "//button[@class='action-modal__btn cancel react-button react-button--size-medium react-button react-button--textType-normal react-button--type-button react-button--color-scheme-green']")
	private static WebElement cancel;

	@FindBy(xpath = "(//span[@class='label-font-weight-bold status--active']")
	public static WebElement isActive;

	@FindBy(xpath = "(//span[@class='label-font-weight-bold status--paused']")
	public static WebElement isPaused;

	@FindBy(xpath = "(//span[@class='label-font-weight-bold status--cancelled']")
	public static WebElement isCancelled;

	@FindBy(xpath = "//a[@class='cmp-mybreville__add-address-button react-button react-button--size-medium react-button react-button--textType-normal react-button--type-button react-button--color-scheme-green']")
	public static WebElement myaccountaddNewAddress;
	
	

	@FindBy(xpath = "//a[normalize-space()='Personal Details']")
	public static WebElement editpersonaldetails;
	
	

	/*
	 * @FindBy(xpath =
	 * "//button[@class='action-modal__btn cancel react-button react-button--size-medium react-button react-button--textType-normal react-button--type-button react-button--color-scheme-green']"
	 * ) private static WebElement noKeepitButton;
	 * 
	 * @FindBy(xpath =
	 * "//button[@class='action-modal__btn cta react-button react-button--size-medium react-button react-button--textType-normal react-button--type-button react-button--color-scheme-green']"
	 * ) private static WebElement yesCancelitButton;
	 */
	public void clickonMySubscriptions() throws Throwable {
		Actiondriver.gf_AssertElementDisplayed(mySubscriptions, "My Subscriptions");
		Actiondriver.gf_JsClick(mySubscriptions, "My Subscriptions");
	}

	public void clickonMyAccount() throws Throwable {

		Actiondriver.gf_WaitForElementPresent(myAccount, Actiondriver.gf_GetTextvalue(myAccount), 10, 5000);
		Actiondriver.gf_WaitForElementPresent(myAccount, "Account Details", 10, 5000);
		Actiondriver.gf_JsClick(myAccount, "Account Details");
	}
	
	public void editpersonaldetails() throws Throwable {

		Actiondriver.gf_WaitForElementPresent(editpersonaldetails, Actiondriver.gf_GetTextvalue(editpersonaldetails), 10, 15000);
		Actiondriver.gf_WaitForElementPresent(editpersonaldetails, "Personal Details", 10, 5000);
		Actiondriver.gf_JsClick(editpersonaldetails, "Personal Details");
	}

	public void myaccountAddNewAddress() throws Throwable {
		Actiondriver.gf_WaitForElementPresent(myaccountaddNewAddress, Actiondriver.gf_GetTextvalue(myAccount), 10,
				5000);
		Actiondriver.gf_AssertElementDisplayed(myaccountaddNewAddress, "Account Details");
		Actiondriver.gf_JsClick(myaccountaddNewAddress, "Account Details");
	}

	public void isSubscriptionActive() throws Throwable {
		Actiondriver.gf_IsElementPresent(isActive, "Active");
	}

	/*
	 * public void clickonEditSubscription() throws Throwable {
	 * if(Actiondriver.gf_IsElementPresent(isActive, "Active")) {
	 * Actiondriver.gf_AssertElementDisplayed(editSubscription,
	 * "Edit Subscription"); Actiondriver.gf_JsClick(editSubscription,
	 * "Edit Subscription"); } else {
	 * logger.log(Status.FAIL,"Subscription is not Active.");
	 * log.info("Subscription is not Active.");
	 * 
	 * } }
	 */
	public void clickonEditSubscription() throws Throwable {
		Actiondriver.gf_AssertElementDisplayed(editSubscription, "Edit Subscription");
		Actiondriver.gf_JsClick(editSubscription, "Edit Subscription");
	}

	public void clickonEditShippingAddressLink() throws Throwable {
		Actiondriver.gf_AssertElementDisplayed(editShippingAddress, "Edit_ShippingAdress");
		Actiondriver.gf_JsClick(editShippingAddress, "Edit_ShippingAddress");
	}

	public void clickonEditBillingAddressLink() throws Throwable {
		Actiondriver.gf_AssertElementDisplayed(editBillingAddress, "Edit_BillingAdress");
		Actiondriver.gf_JsClick(editBillingAddress, "Edit_BillingAddress");
	}
	
	public void clickonsavebuttonafterfillingaddress() throws Throwable {
		Actiondriver.gf_AssertElementDisplayed(myaccaddresssave, "Save");
		Actiondriver.gf_JsClick(myaccaddresssave, "Save");
	}
	
	

	public void editShippingAddressDetailsInMySubscriptions(String shipFirstName, String shipLastName,
			String shipAddress1, String shipAddress2, String shipCity, String shipZipCode, String shipState,
			String shipPhoneNumber) throws Throwable {
		Actiondriver.gf_AssertElementDisplayed(firstName, "First Name");
		Actiondriver.gf_Type(firstName, shipFirstName, "First Name");
		Actiondriver.gf_Type(lastName, shipLastName, "Last Name");
		Actiondriver.gf_Type(address1, shipAddress1, "Address1");
		Actiondriver.gf_Type(address2, shipAddress2, "Address2");
		Actiondriver.gf_Type(city, shipCity, "City/Town");
		Actiondriver.gf_SelectByVisibleText(state, shipState, "State");
		Actiondriver.gf_Type(zipcode, shipZipCode, "Zip Code");
		Actiondriver.gf_Type(phonenumber, shipPhoneNumber, "Phone number");
	}

	public void editBillingAddressDetailsInMySubscriptions(String billFirstName, String billLastName,
			String billAddress1, String billAddress2, String billCity, String billZipCode, String billState,
			String billPhoneNumber) throws Throwable {
		Actiondriver.gf_AssertElementDisplayed(firstName, "First Name");
		Actiondriver.gf_Type(firstName, billFirstName, "First Name");
		Actiondriver.gf_Type(lastName, billLastName, "Last Name");
		Actiondriver.gf_Type(address1, billAddress1, "Address1");
		Actiondriver.gf_Type(address2, billAddress2, "Address2");
		Actiondriver.gf_Type(city, billCity, "City/Town");
		Actiondriver.gf_SelectByVisibleText(state, billState, "State");
		Actiondriver.gf_Type(zipcode, billZipCode, "Zip Code");
		Actiondriver.gf_Type(phonenumber, billPhoneNumber, "Phone number");
	}

	public void saveMyBrevilleAddress(String billAddress1, String billAddress2, String billCity, String billZipCode,
		String billState) throws Throwable {
		Actiondriver.gf_AssertElementDisplayed(address1, "Address1");
		Actiondriver.gf_Type(address1, billAddress1, "Address1");
		Actiondriver.gf_Type(address2, billAddress2, "Address2");
		Actiondriver.gf_Type(city, billCity, "City/Town");
		Actiondriver.gf_SelectByVisibleText(state, billState, "State");
		Actiondriver.gf_Type(zipcode, billZipCode, "Zip Code");
		hardWait(5000);

	}

	public void personalDetails(String FirstName,String LastName,String PhoneNumber) throws Throwable {
		Actiondriver.gf_AssertElementDisplayed(firstName, "First Name");
		Actiondriver.gf_Type(firstName, FirstName, "First Name");
		Actiondriver.gf_Type(lastName, LastName, "Last Name");
		Actiondriver.gf_Type(phonenumber, PhoneNumber, "Phone number");
	}

	
	public void clickonSaveinBillingAddress() throws Throwable {
		Actiondriver.gf_AssertElementDisplayed(saveButton, "Save in BillingAdress");
		Actiondriver.gf_JsClick(saveButton, "Save in BillingAddress");
	}

	public void clickonSavedaddreses() throws Throwable {
		Actiondriver.gf_AssertElementDisplayed(myaccountsavedaddress, "Saved Addresses");
		Actiondriver.gf_JsClick(myaccountsavedaddress, "Saved Addresses");
	}

	public void clickonSaveinShippingAddress() throws Throwable {
		Actiondriver.gf_AssertElementDisplayed(saveButton, "Save in ShippingAdress");
		Actiondriver.gf_JsClick(saveButton, "Save in ShippingAddress");
	}

	public void selectTimeframeToPauseSubscription(int valueNumber) throws Throwable {
		Actiondriver.gf_AssertElementDisplayed(pauseSubscription, "Pause Subscription");
		// Actiondriver.gf_SelectByVisibleText(pauseSubscription,subscriptionText,"Subscripton
		// Text");
		Actiondriver.gf_SelectByIndex(pauseSubscription, valueNumber);
		Actiondriver.gf_AssertElementDisplayed(confirm, "Confrim in Subscription");
		Actiondriver.gf_JsClick(confirm, "Confrim in Subscription");
		if (Actiondriver.gf_IsElementPresent(isPaused, "Paused")) {
			logger.log(Status.PASS, "Subscription is paused.");
			log.info("Subscription is paused.");
		} else {
			logger.log(Status.FAIL, "Subscription is NOT paused.");
			log.info("Subscription is NOT paused.");
		}
	}

	public void clickonResumeSubscription() throws Throwable {
		Actiondriver.gf_AssertElementDisplayed(resumeSubscription, "Resume Subscription");
		Actiondriver.gf_JsClick(resumeSubscription, "Resume Subscription");
		Actiondriver.gf_AssertElementDisplayed(confirm, "Yes Save it");
		Actiondriver.gf_JsClick(confirm, "Yes Save it");
		if (Actiondriver.gf_IsElementPresent(isActive, "Active")) {
			logger.log(Status.PASS, "Subscription is resumed back.");
			log.info("Subscription is resumed back.");
		} else {
			logger.log(Status.FAIL, "Subscription is NOT resumed.");
			log.info("Subscription is NOT resumed.");
		}
	}

	public void clickonCancelSubscription() throws Throwable {
		Actiondriver.gf_AssertElementDisplayed(cancelSubscription, "Cancel Subscription");
		Actiondriver.gf_JsClick(cancelSubscription, "Cancel Subscription");
		Actiondriver.gf_AssertElementDisplayed(confirm, "Yes Cancel it");
		Actiondriver.gf_JsClick(confirm, "Yes Cancel it");
		if (Actiondriver.gf_IsElementPresent(isCancelled, "Cancelled")) {
			logger.log(Status.PASS, "Subscription is cancelled.");
			log.info("Subscription is cancelled.");
		} else {
			logger.log(Status.FAIL, "Subscription is NOT cancelled.");
			log.info("Subscription is NOT cancelled.");
		}
	}

}
