package objectrepository;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import accelerators.Actiondriver;
import org.testng.Assert;

public class Brevilleloginpage_OR extends Actiondriver {

	public Brevilleloginpage_OR() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email-address")
	private static WebElement emailaddres;

	@FindBy(xpath = "//*[text()='Logout']")
	private static WebElement Logout;

	@FindBy(xpath = "//a[contains(@class,'LoginLink')]")
	private static WebElement loginhere;

	/*
	 * @FindBy(xpath = "//input[@name='Username']") private static WebElement
	 * email_loginhere;
	 */
	@FindBy(xpath = "//input[@name='password']")
	private static WebElement password_loginhere;

	@FindBy(xpath = "//button[@id='btn-login']")
	private static WebElement login_loginhere;

	@FindBy(xpath = "//input[@name='password']")
	private static WebElement password_CreateAccount;

	@FindBy(xpath = "//div[contains(@id,'spinner__dialog')and(contains(@style,'none'))]")
	public static WebElement loaderImage;

	@FindBy(xpath = "//*[@id='_evidon-accept-button']")
	public static WebElement Accept;

	@FindBy(xpath = "(//*[@id='form-container--signup']/div[6]/button/span")
	public static WebElement newspopupbutton;

	@FindBy(xpath = "//*[@id='createAccount']")
	public static WebElement createAccount;

	@FindBy(xpath = "//div[@aria-label='main menu navigation']")
	public static WebElement Navigation3slachess;

	@FindBy(xpath = "(//*[text()='My Dashboard'])[2]")
	public static WebElement Dashboardpage;

	@FindBy(xpath = "//*[text()='Welcome']")
	public static WebElement welcome;

	@FindAll(@FindBy(xpath = "//ul[@class='cmp-side-navigation__group']/li/a"))
	private static List<WebElement> menuitems;

	@FindAll(@FindBy(xpath = "//h2[normalize-space()='My Dashboard']"))
	private static List<WebElement> existingloginMydashboard;

	@FindBy(xpath = "//a[@class='cmp-side-navigation__group__item-active active']")
	private static WebElement mydashboard;

	@FindBy(xpath = "//h2[@class='cmp-mybreville__page-title']")
	private static WebElement myaccountdashboardtitle;


	@FindBy(xpath = "//ul[@class='cmp-side-navigation__group']/li[2]")
	private static WebElement accountdetails;

	@FindBy(xpath = "//ul[@class='cmp-side-navigation__group']/li[3]")
	private static WebElement myorders;

	@FindBy(xpath = "//ul[@class='cmp-side-navigation__group']/li[4]")
	private static WebElement mysubscriptions;

	@FindBy(xpath = "//ul[@class='cmp-side-navigation__group']/li[5]")
	private static WebElement support;

	@FindBy(xpath = "//ul[@class='cmp-side-navigation__group']/li[6]")
	private static WebElement logout;

	@FindBy(xpath = "//button[@class='login-button']")
	private static WebElement continue_CreateAccount;

	@FindBy(xpath = "//*[text()='Continue with Google']")
	private static WebElement continuewithGoogle;

	@FindBy(xpath = "//*[text()='Continue with Facebook']")
	private static WebElement continuewithFacebook;

	@FindBy(xpath = "//a[@class='forgot-ps-link']")
	private static WebElement forgotpassword;

	@FindBy(xpath = "(//*[name()='svg'][@role='img'])[1]")
	private static WebElement createaccount1;

	@FindBy(xpath = "//span[@id='createAccountMobile']")
	private static WebElement createaccountorlogin;

	@FindBy(xpath = "//span[@id='createAccount']")
	private static WebElement createaccount_Login;

	@FindBy(xpath = "(//button[@class='action-modal__btn cta react-button react-button--size-medium react-button react-button--textType-normal react-button--type-button react-button--color-scheme-green'])[1]")
	private static WebElement verifiedyouremailpopupclose;


	@FindBy(xpath = "//*[text()='Enter Password.']")
	private static WebElement enterPassword;

	@FindBy(xpath = "(//*[text()='My Dashboard'])[2]")
	private static WebElement dashboardpage1;

	@FindBy(xpath = "//*[text()='Enter Email.']")
	private static WebElement enterEmail;

	@FindBy(xpath = "//input[@id='email']")
	private static WebElement email_CreateAccount;

	@FindBy(id = "onetimeloggedinSignup")
	private static WebElement oneTimeLoggedInSignup;

	@FindBy(xpath = "//div[@id='signup-container']//a[@class='signup-link']")
	private static WebElement signup;

	@FindBy(xpath = "//span[@id='email-error-message']")
	private static WebElement emailerrormessage;

	@FindBy(id = "headerImg")
	private static WebElement brevillelogo;

	@FindBy(id = "header-section-welcome-id")
	private static WebElement headertitle;

	@FindBy(id = "success-message-icon-id")
	private static WebElement headerparaOnforgotpasswordpage;

	@FindBy(id = "email")
	private static WebElement emailtextboxOnforgotpasswordpage;

	@FindBy(id = "btn-login")
	private static WebElement sendemailbtnonforgotpswpage;

	@FindBy(xpath = "/html//a[@id='back-to-previous']")
	private static WebElement backtobrevilleonforgotpswpage;


	// login details under checkout page
	@FindBy(xpath = "//button[@class='cmp-cart-button react-button react-button--size-medium react-button react-button--textType-normal react-button--type-button react-button--color-scheme-black']")
	private static WebElement checkout_createOrLoginButton;

	@FindBy(xpath = "(//label[@for='email']//following::input[@name='email'])[1]")
	private static WebElement checkout_email;

	@FindBy(xpath = "(//label[@for='password']//following::input[@name='password'])[1]")
	private static WebElement checkout_password;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private static WebElement loginAndCheckoutButton;

	@FindBy(xpath = "//span[@id='password-error-message']")
	private static WebElement passworderrormessage;


	public void verifyloginpageUI(String email, String password) throws Throwable {

		Actiondriver.gf_WaitForVisiblityofElement(welcome, "Welcome", 12, 3);

		Actiondriver.gf_WaitForVisiblityofElement(forgotpassword, "Forgot password?", 12, 3);

		Actiondriver.gf_WaitForVisiblityofElement(continuewithGoogle, "ContinuewithGoogle", 12, 3);

		Actiondriver.gf_WaitForVisiblityofElement(continuewithFacebook, "Continue with Facebook", 12, 3);

	}

	public void verifyloginpageUI() throws Throwable {
		Actiondriver.gf_WaitForVisiblityofElement(welcome, "Welcome", 12, 3);
		Actiondriver.gf_WaitForVisiblityofElement(forgotpassword, "Forgot password?", 12, 3);
		Actiondriver.gf_WaitForVisiblityofElement(continuewithGoogle, "ContinuewithGoogle", 12, 3);
		Actiondriver.gf_WaitForVisiblityofElement(continuewithFacebook, "Continue with Facebook", 12, 3);
	}

	public void clickoncreateloginbutton() throws Throwable {

		boolean flag1;

		flag1 = Actiondriver.gf_WaitForElementtoPresent(createaccount1, "createAccount", 4, 2);

		if (flag1) {

			Actiondriver.gf_JsClick((createaccountorlogin), "Create account / Log in");
		} else {

			Actiondriver.gf_WaitForElementtoPresent(createaccount_Login, "createAccount", 4, 2);
			Actiondriver.gf_JsClick((createaccount_Login), "createAccount");
		}

	}


	public void verifyUserMenuitems() throws Throwable {

		Actiondriver.gf_WaitForVisiblityofElement(mydashboard, "My Dashboard", 12, 3);
		Actiondriver.gf_WaitForVisiblityofElement(accountdetails, "My AccountDetails", 12, 3);
		Actiondriver.gf_WaitForVisiblityofElement(myorders, "Myorders", 12, 3);
		Actiondriver.gf_WaitForVisiblityofElement(mysubscriptions, "My Subcriptions", 12, 3);
		Actiondriver.gf_WaitForVisiblityofElement(support, "support", 12, 3);
		Actiondriver.gf_WaitForVisiblityofElement(logout, "logout", 12, 3);

	}

	public void verifiedyouremailpopupclose() throws Throwable {


		Actiondriver.gf_WaitForElementtoPresent(verifiedyouremailpopupclose, "Close", 12, 7);
		Actiondriver.gf_JsClick((verifiedyouremailpopupclose), "Close");

	}

	public void verifymyaccountonlydashboardtitle() throws Throwable {

		Actiondriver.gf_WaitForVisiblityofElement(myaccountdashboardtitle, "My Dashboard", 12, 3);

	}

	public void verifyforgotPassword(String email) throws Throwable {

		Actiondriver.gf_WaitForVisiblityofElement(welcome, "Welcome", 12, 3);

		Actiondriver.gf_WaitForVisiblityofElement(forgotpassword, "Forgot password?", 12, 3);
		hardWait(5000);
		Actiondriver.gf_Click(forgotpassword, "forgotpassword");

		Actiondriver.gf_WaitForVisiblityofElement(backtobrevilleonforgotpswpage, "backtobrevilleonforgotpswpage", 12, 3);
		Actiondriver.gf_WaitForVisiblityofElement(brevillelogo, "brevillelogo", 12, 3);
		Actiondriver.gf_WaitForElementtoPresent(brevillelogo, "brevillelogo", 12, 3);
		Actiondriver.gf_WaitForElementtoPresent(headertitle, "headertitleOnforgotpasswordpage", 12, 3);
		Actiondriver.gf_WaitForElementtoPresent(headerparaOnforgotpasswordpage, "headerparaOnforgotpasswordpage", 12, 3);
		Actiondriver.gf_WaitForElementtoPresent(emailtextboxOnforgotpasswordpage, "emailtextboxOnforgotpasswordpage", 12, 3);
		Actiondriver.gf_WaitForElementtoPresent(backtobrevilleonforgotpswpage, "backtobrevilleonforgotpswpage", 12, 3);

		Actiondriver.gf_Type(emailtextboxOnforgotpasswordpage, email, "Email");
		Actiondriver.gf_JsClick(sendemailbtnonforgotpswpage, "sendemailbtnonforgotpswpage");
		Assert.assertEquals(headertitle.getText(), "Forgot Your Password?");
		Assert.assertEquals(sendemailbtnonforgotpswpage.getText(), "Send Email");

//  @Todo   Email validation

	}


	public void verifylogin(String email, String password) throws Throwable {
		Actiondriver.gf_WaitForVisiblityofElement(email_CreateAccount, "email", 12, 3);
		Actiondriver.gf_Type(email_CreateAccount, email, "Email");
		Actiondriver.gf_Type(password_CreateAccount, password, "Password");
		Actiondriver.gf_JsClick(login_loginhere, "login");

	}

	public void clickonCreateAccountLogin() throws Throwable {
		Actiondriver.gf_WaitForElementToBeClickable(oneTimeLoggedInSignup, "Create/loginbutton", 12, 3);
		Actiondriver.gf_Click(oneTimeLoggedInSignup, "Create/loginbutton");

	}


	public void verifyCreateLogin()throws Throwable
	{
		Actiondriver.gf_AssertElementDisplayed(checkout_createOrLoginButton,"Create Account / log In");
	}

	public void verifyCheckoutEmail()throws Throwable
	{
		Actiondriver.gf_AssertElementDisplayed(checkout_email,"email");
	}
	
	public void clickonsignup() throws Throwable {
		hardWait(2000);
		Actiondriver.gf_WaitForElementtoEnabled(signup, "Create/loginbutton",12,3);
		;
		Actiondriver.gf_Click(signup, "Create/loginbutton");

	}
	
	public void invalidemailid(String saltchars) throws Throwable {
		Actiondriver.gf_AssertElementDisplayed(email_CreateAccount, "Newemailid");
		Actiondriver.gf_Type(email_CreateAccount, "test" + saltchars + "", "Emailid");
	}
	
	public void enterNewEmailid(String saltchars) throws Throwable {
		Actiondriver.gf_WaitForElementtoEnabled(email_CreateAccount, "Newemailid",12,3);
		Actiondriver.gf_Type(email_CreateAccount, "test" + saltchars + "@yopmail.com", "Emailid");
	}

	
	public void clickOnCheckoutCreateAndLogin() throws Throwable {


		Actiondriver.gf_AssertWaitForElementtoEnabled(checkout_createOrLoginButton, "Create Account / Log in", 12, 4);
		Actiondriver.gf_JsClick((checkout_createOrLoginButton), "Create Account / Log in");

		}
	
	
	public void verifyCheckoutLogin(String email, String password) throws Throwable {
		Actiondriver.gf_AssertWaitForElementtoEnabled(checkout_email, "Email", 12,3);
		   Actiondriver.gf_Type(checkout_email, email, "Email");
		   Actiondriver.gf_Type(checkout_password, password, "Password");
		   Actiondriver.gf_JsClick(loginAndCheckoutButton, "log In & Checkout");
		   

		}
	
	public void enterNewPassword(String strpassword) throws Throwable {
		Actiondriver.gf_Type(password_CreateAccount, strpassword, "1");

	}


	public boolean verifypasswordconditon() throws Throwable {
		return !(passworderrormessage.getText().equalsIgnoreCase("Password is not valid."));
	}

	public boolean verifyemailconditon() throws Throwable {
		return !(emailerrormessage.getText().equalsIgnoreCase("Email is not valid."));
	}
	
	public boolean VerifyincorrectEmail() throws Throwable {
		return !(enterEmail.getText().equalsIgnoreCase("Enter Email."));
	}
	
	

	public void clickonContinue() throws Throwable {
		Actiondriver.gf_Click(continue_CreateAccount, "Continue Button");
		Actiondriver.gf_AssertInVisibilityOfElement(loaderImage, "Loading Image");

	}
	
	

	public void clickonContinueforregisterpage() throws Throwable {
		Actiondriver.gf_Click(continue_CreateAccount, "Continue Button");
	}

}
