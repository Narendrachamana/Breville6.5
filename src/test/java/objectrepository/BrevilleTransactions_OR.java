package objectrepository;

import accelerators.Actiondriver;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BrevilleTransactions_OR extends Actiondriver {

    public static long ltime = Long.valueOf("120");

    /***-------paypal-----------****/
    @FindBy(xpath = "//div[@class='payment-selection']//following::div[@class='rc-collapse-header'][2]")
    public static WebElement paypalRadioButton;

    @FindBy(xpath = "//div[@class='paypal-button-label-container']")
    public static WebElement paypalButton;

    @FindBy(xpath = "//input[@id='email']")
    public static WebElement paypalEmailID;

    @FindBy(xpath = "//input[@id='password']")
    public static WebElement paypalPassword;

    @FindBy(xpath = "//button[@id='btnLogin']")
    public static WebElement paypalLoginButton;

    @FindBy(xpath = "//button[@id='payment-submit-btn']")
    public static WebElement paypalAgreeAndPayButton;

    @FindBy(xpath = "//button[@id='REVIEW_ORDER_BTN_ID']")
    public static WebElement paypalSubmitOrder;
    @FindBy(xpath = "//input[@id='termsConditions']")
    public static WebElement paypalTermsAndConditionsCheckBox;
    @FindBy(xpath = "//label[@class='form-checkbox-label' and @for='newsletters']")
    public static WebElement paypalNewsLetterCheckBox;
    @FindBy(xpath = "//button[@id='REVIEW_ORDER_BTN_ID']")
    public static WebElement placeOrder;
    @FindBy(xpath = "//div[@class='rc-collapse-header']/span")
    public static WebElement affirm;


    //Credit Card Related Xpaths
    @FindBy(xpath = "(//div[@class='payment-selection']//div[@class='rc-collapse-header'])[1]")

    private static WebElement creditcard;

    @FindBy(xpath = "//input[contains(@id,'holderName')]")
    private static WebElement nameOnCard;

    @FindBy(xpath = "//input[contains(@id,'encryptedCardNumber')]")
    private static WebElement cardNum;

    @FindBy(xpath = "//input[contains(@id,'encryptedExpiryDate')]")
    private static WebElement expiryDate;

    @FindBy(xpath = "//input[contains(@id,'encryptedSecurityCode')]")
    private static WebElement cvvNum;


    @FindBy(xpath = "//iframe[@title='Iframe for secured card number']")
    private static WebElement cardnumframe;

    @FindBy(xpath = "//iframe[@title='Iframe for secured card expiry date']")
    private static WebElement expiryframe;


    @FindBy(xpath = "//iframe[@title='Iframe for secured card security code']")
    private static WebElement cvvframe;

    @FindBy(xpath = "//button[@id='PAYMENT__BTN_ID']")
    private static WebElement nextRevieworder;


    //Affirm Realted Xpaths
    @FindBy(xpath = "//button[@class='adyen-checkout__button react-button react-button--size-medium react-button react-button--textType-bold react-button--type-button react-button--type-button-underline react-button--color-scheme-green']")

    private static WebElement affirmpaybutton;


    //button[@class='adyen-checkout__button react-button react-button--size-medium react-button react-button--textType-bold react-button--type-button react-button--type-button-underline react-button--color-scheme-green']
    @FindBy(xpath = "//input[@class='focusable-form-field pro21xrFUA4 proIivk4DqO']")
    private static WebElement affirmMobileButton;
    @FindBy(xpath = "//button[@type='submit'and @class='propvHOJQwT pronbkzmGiv pro3LbB6Dcr pro2Wd7Dzib pro1nXU9mlu']")

    private static WebElement affirmContinueButton;
    @FindBy(xpath = "//input[@class='focusable-form-field pro3hEyhkVV proIivk4DqO']")

    private static WebElement affirmOTP;
    @FindAll(@FindBy(xpath = "//div[@class='affirm-container']//div[@class='che1W414-ng']/following::div[@class='che286YTQfY']/span"))
    private static List<WebElement> affirmSubscPlan;
    @FindBy(xpath = "//div[@class='che1O60NO1I che2uav9pZk']")

    private static WebElement affirmindicator;
    @FindBy(xpath = "//button[@id='confirm-submit']")

    private static WebElement affirmcontinue;
    @FindBy(xpath = "//div[@class='che1O60NO1I che1xh5zNal']")

    private static WebElement affirmCheckBox;
    @FindBy(xpath = "//button[@id='confirm-submit']")

    private static WebElement affirmConfirmButton;
    @FindBy(xpath = "//input[@id='newsletters']/parent::div[@class='form-checkbox-wrap']")
    private static WebElement newsletter1;
    @FindBy(xpath = "//input[@id='termsConditions']/parent::div[@class='form-checkbox-wrap']")
    private static WebElement termsandconditions1;
    @FindBy(xpath = "//label[@for='termsConditions']")
    private static WebElement termsandconditions;
    @FindBy(xpath = "//label[@for='newsletters']")
    private static WebElement newsletter;
    @FindBy(xpath = "//button[@id='REVIEW_ORDER_BTN_ID']")
    private static WebElement ReviewOrder;
    @FindBy(xpath = "//button[@id='BEANZ_SUBSCRIPTION_BTN_ID']")
    private static WebElement ReviewSubcriptionOrder;
    @FindBy(xpath = "(//p[@class='order-confirmation__order-info-item'])[1]")
    private static WebElement orderNumber;
    @FindBy(xpath = "(//p[@class='order-confirmation__order-info-item'])[2]")
    private static WebElement OrderDate;
    @FindAll(@FindBy(xpath = "//div[@class='payment-selection']//div[@class='rc-collapse-header']"))
    private static List<WebElement> Payments;
    @FindBy(xpath = "//div[@class='card-type']")
    private static WebElement cardtype;
    @FindBy(xpath = "//div[@class='cmp-cart-order-summary__total']")
    private static WebElement oderTotal;
    @FindBy(xpath = "//iframe[@allowtransparency='true']")
    private WebElement payWithPayPalButtonIframe;

    public void payUsingPaypal() throws Throwable {
        Actiondriver.hardWait(10000);
        Actiondriver.gf_AssertWaitForVisiblityofElement(cardtype, "CardType", 12, 3);
        //Actiondriver.gf_WaitForVisiblityofElement(paypalRadioButton, "PaypalRadiobutton",10,6);
        Actiondriver.gf_Selectvaluesfromlist(Payments, "Pay with Paypal");
        //Actiondriver.scrollToViewTillElement(paypalRadioButton);
        // Actiondriver.gf_JsClick(paypalRadioButton, "PaypalRadiobutton");
        Actiondriver.gf_AssertWaitForVisiblityofElement(payWithPayPalButtonIframe, "PaypalIframe", 12, 3);

        Actiondriver.gf_SwitchToFrameByLocator(payWithPayPalButtonIframe, "PaywithPaypal");
        Thread.sleep(5000);
        Actiondriver.gf_JsClick(paypalButton, "PaywithPaypal");
        Actiondriver.gf_SwitchWindowById(3);
        Actiondriver.gf_AssertWaitForVisiblityofElement(paypalEmailID, "paypalEmailID", 12, 3);
        //  Thread.sleep(1000);
        Actiondriver.gf_Type(paypalEmailID, configProps.getProperty("PaypalEMailid"), "Emailid");
        Actiondriver.gf_Type(paypalPassword, configProps.getProperty("Password"), "Password");
        Actiondriver.gf_JsClick(paypalLoginButton, "Paypallogin");
        Actiondriver.gf_WaitForElementToBeClickable(paypalAgreeAndPayButton, "Agree&pay", 10, 2);
        Actiondriver.gf_JsClick(paypalAgreeAndPayButton, "Agree&pay");
        Actiondriver.gf_SwitchWindowById(2);

        /*
         * Actiondriver.gf_AssertElementDisplayed(paypalTermsAndConditionsCheckBox,
         * "paypalTermsAndConditionsCheckBox");
         * Actiondriver.gf_JsClick(paypalTermsAndConditionsCheckBox,
         * "Terms and Conditions"); Actiondriver.gf_JsClick(paypalSubmitOrder,
         * "Submit Order");
         */
    }

    public void payWithCreditCard() throws Throwable {
        Actiondriver.hardWait(10000);
        Actiondriver.gf_AssertWaitForElementtoEnabled(cardtype, "CardType", 12, 3);

        //Actiondriver.gf_WaitForVisiblityofElement(creditcard, "CreditCard",12,5);
        // Actiondriver.gf_JsClick(creditcard, "PaymentPages");
        //Actiondriver.gf_VerifyelementDisplayedinlist(Payments, "Pay with Credit Card",14,3);
        Actiondriver.gf_Selectvaluesfromlist(Payments, "Pay with Credit Card");
        Actiondriver.gf_AssertWaitForVisiblityofElement(nameOnCard, "Name on the Card",5,3);
        Actiondriver.gf_Type(nameOnCard, configProps.getProperty("CreditcardName"), "cardname");
        Actiondriver.gf_SwitchToFrameByLocator(cardnumframe, "CardNum");
        Actiondriver.gf_Type(cardNum, configProps.getProperty("CreditcardNumber"), "cardnum");
        Actiondriver.gf_switchToParentFrame();
        Actiondriver.gf_SwitchToFrameByLocator(expiryframe, "ExpiryFrame");
        Actiondriver.gf_Type(expiryDate, configProps.getProperty("ExpiryDate"), "ExpiryDate");
        Actiondriver.gf_switchToParentFrame();
        Actiondriver.gf_SwitchToFrameByLocator(cvvframe, "CVVNum");
        Actiondriver.gf_Type(cvvNum, configProps.getProperty("CVV"), "CVV");
        Actiondriver.gf_switchToParentFrame();
        Actiondriver.gf_JsClick(nextRevieworder, "Next Review Order");

    }

    public void affrimPayment() throws Throwable {

        // paymentpages1.get(1).click();
        Actiondriver.gf_AssertWaitForElementtoEnabled(affirm, "Affirm", 10, 3);
        Actiondriver.scrollToViewTillElement(affirm);
        Actiondriver.gf_JsClick(affirm, "Payment page");
        Actiondriver.gf_AssertWaitForElementtoEnabled(affirmpaybutton, "Buy with Affirm", 10, 3);
        Actiondriver.gf_JsClick(affirmpaybutton, "Buy with Affirm");

        Actiondriver.gf_AssertWaitForElementtoEnabled(affirmContinueButton, "Continue Button", 10, 3);
        Actiondriver.gf_Type(affirmMobileButton, configProps.getProperty("MobileNo"), "Affirm Mobile Payment");
        Actiondriver.hardWait(2000);
        Actiondriver.gf_JsClick(affirmContinueButton, "Affirm Continue Button");
        Actiondriver.hardWait(2000);
        Actiondriver.gf_Type(affirmOTP, configProps.getProperty("OTP"), "Affirm OTP");
        Actiondriver.hardWait(20000);
        Actiondriver.gf_Selectvaluesfromlist(affirmSubscPlan, "3 months");
        Actiondriver.hardWait(2000);
        Actiondriver.gf_JsClick(affirmindicator, "Affirm Indicator");
        Actiondriver.hardWait(1000);
        Actiondriver.gf_JsClick(affirmcontinue, "Affirm Continue");
        Actiondriver.hardWait(2000);
        Actiondriver.gf_JsClick(affirmCheckBox, "Check Box");
        Actiondriver.gf_JsClick(affirmConfirmButton, "Affirm Confirm Button");


    }

    public void reviewOrder(String cbag) throws Throwable {
        Actiondriver.gf_AssertWaitForElementtoEnabled(termsandconditions, "Terms and Conditions", 10, 4);
        Thread.sleep(4000);
        Actiondriver.scrollToViewTillElement(termsandconditions);
        Actiondriver.gf_JsClick(termsandconditions, "Terms and Conditions");
        if ((!cbag.equalsIgnoreCase("CoffeBag")) && (!cbag.equalsIgnoreCase("login"))) {
            Actiondriver.gf_JsClick(newsletter, "Newsletter");
        }
        Actiondriver.hardWait(5000);
        Actiondriver.gf_JsClick(ReviewOrder, "Place Order");
    }

    public void orderDetails() throws Throwable {
        Actiondriver.gf_AssertWaitForVisiblityofElement(orderNumber, "Order Number", 10, 6);
        logger.log(Status.INFO, Actiondriver.gf_GetText(orderNumber, "Order Number"));
        logger.log(Status.INFO, Actiondriver.gf_GetText(OrderDate, "Order Date"));
    }

    public void payWithAffirm_CreditCard() throws Throwable {

        Actiondriver.gf_AssertWaitForVisiblityofElement(nameOnCard, "Name on the Card", 10, 5);
        Actiondriver.hardWait(3000);
        Actiondriver.gf_Type(nameOnCard, configProps.getProperty("CreditcardName"), "cardname");
        Actiondriver.gf_SwitchToFrameByLocator(cardnumframe, "CardNum");
        Actiondriver.gf_Type(cardNum, configProps.getProperty("CreditcardNumber"), "cardnum");
        Actiondriver.gf_switchToParentFrame();
        Actiondriver.gf_SwitchToFrameByLocator(expiryframe, "ExpiryFrame");
        Actiondriver.gf_Type(expiryDate, configProps.getProperty("ExpiryDate"), "ExpiryDate");
        Actiondriver.gf_switchToParentFrame();
        Actiondriver.gf_SwitchToFrameByLocator(cvvframe, "CVVNum");
        Actiondriver.gf_Type(cvvNum, configProps.getProperty("CVV"), "CVV");
        Actiondriver.gf_switchToParentFrame();
        Actiondriver.scrollToViewTillElement(ReviewSubcriptionOrder);
        Actiondriver.gf_JsClick(ReviewSubcriptionOrder, "Next Review Order");

    }
}
