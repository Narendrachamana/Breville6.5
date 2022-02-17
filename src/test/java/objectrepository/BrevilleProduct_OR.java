package objectrepository;

import accelerators.Actiondriver;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BrevilleProduct_OR extends Actiondriver {


    @FindBy(xpath = "(//button[@class='cmp-dropdown__btn']/span[@class='cmp-navigation__title'])[1]")
    public static WebElement products1;

    @FindBy(xpath = "//li[contains(@class,'item--products')]//span[@class='cmp-navigation__title']")
    public static WebElement products;

    @FindBy(xpath = "//li[contains(@class,'parts')]//span[@class='cmp-navigation__title']")
    public static WebElement partsandaccessories_button;

    @FindAll(@FindBy(xpath = "//li[@class='cmp-navigation__item cmp-navigation__item--products visible-md-up is-open']//a[@class='cmp-item__link']"))
    public static List<WebElement> productListPage;

    @FindAll(@FindBy(xpath = "//li[@class='cmp-navigation__item cmp-navigation__item--parts visible-md-up is-open']//a[@class='cmp-item__link']"))
    public static List<WebElement> partsandaccessoriesListPage;

    @FindAll(@FindBy(xpath = "//h2[@class='cart-bundle-summary__title--desktop']/a"))
    public static List<WebElement> listofitems;

    @FindAll(@FindBy(xpath = "//h3[@class='cmp-producttile__title']"))
    public static List<WebElement> plppage;


    @FindAll(@FindBy(xpath = "//h3[@class='cmp-producttile__title']"))
    public static List<WebElement> partsandaccessoriesplppage;

    @FindAll(@FindBy(xpath = "//h3[@class='cmp-producttile__title']"))
    public static List<WebElement> partsandaccessories;

    @FindBy(xpath = "//h1[@class='primary-product-container__title-label']")
    public static WebElement pdppage;

    @FindBy(xpath = "//div[text()='Relevance']")
    public static WebElement sortbyprice;

    @FindBy(xpath = "//input[@id='Price: Low to High']/following::div[@class='select-box__input-text']")
    public static WebElement lowtohigh;


    @FindBy(xpath = "//button[contains(@class,'cmp-button--cart react-button react-button--size-medium react-button react-button--textType-normal react-button--type-button react-button--color-scheme-green')]")
    public static WebElement addtocart;

    @FindBy(xpath = "//div[@class='mulberry-warranty__options']/button")
    public static WebElement warranty;


    @FindBy(xpath = "//div[@class='cta__action-container']/a[@class='update-shop-this-bundle-url cta__action-link']")
    public static WebElement bundleproduct;

    @FindBy(xpath = "//button[contains(@class,'section-next-button')]")
    public static WebElement nextchoosecoffe;

    @FindBy(xpath = "(//button[@class='cmp-teaser__action-link react-button react-button--size-stretch react-button react-button--textType-normal react-button--type-button react-button--color-scheme-purple'])[2]")
    public static WebElement browsecofee;


    @FindAll(@FindBy(xpath = "//button[contains(@class,'coffee-product-tile__select-button')]"))
    public static List<WebElement> select;


    @FindBy(xpath = "//button[@class='coffee-conf-footer__submit react-button react-button--size-large react-button react-button--textType-bold react-button--type-button react-button--color-scheme-green']")
    public static WebElement next;

    @FindBy(xpath = "//button[@class='bundle-conf__header-add-btn react-button react-button--size-medium react-button react-button--textType-bold react-button--type-button react-button--color-scheme-green']")
    public static WebElement bundleAddtoCart;


    @FindBy(xpath = "//div[@class='breadcrumb']/a")
    public static WebElement returntoplp;

    @FindBy(xpath = "//button[@class='react-button react-button--size-medium react-button react-button--textType-bold react-button--type-button react-button--type-button-underline react-button--color-scheme-green']")
    public static WebElement gotocart;

    @FindBy(xpath = "//h2[@class='cart-bundle-summary__title--desktop']/a")
    public static WebElement yourcart;

    @FindBy(xpath = "//h2[@class='cart-bundle-summary__title--desktop']")
    public static WebElement bundleyourcart;


    @FindBy(xpath = "//div[@class='page-loader-wrapper']/*[local-name()='svg']")
    public static WebElement loadingsymbol;


    @FindBy(xpath = "//p[@class='primary-product-container__model-value']")
    public static WebElement modelno;


    @FindBy(xpath = "//button[@class='cmp-cart-button mb-20 react-button react-button--size-medium react-button react-button--textType-normal react-button--type-button react-button--color-scheme-green']")
    public static WebElement proceedtocheckout;
    @FindBy(xpath = "//h3[@class='cmp-producttile__title']")
    public static WebElement searchsublist;
    @FindBy(xpath = "//select[@class='subscription-select']")
    public static WebElement everyDropdown;
    @FindBy(xpath = "(//button[@title='Remove Item'])[2]")
    public static WebElement removeservicecontract;
    @FindBy(xpath = "(//button[@title='Remove Item'])[4]")
    public static WebElement removewaranty2;
    @FindAll(@FindBy(xpath = "//button[@title='Remove Item']"))
    public static List<WebElement> removeservicecontract1;
    @FindAll(@FindBy(xpath = "//button[@title='Remove Item']"))
    public static List<WebElement> deleteitem;
    @FindBy(xpath = "//button[@class='free-coffee__button-add react-button react-button--size-small react-button react-button--textType-bold react-button--type-button react-button--type-button-underline react-button--color-scheme-black']")
    private static WebElement addcoffeebag;
    @FindBy(xpath = "//input[@name='email']")
    private static WebElement coffeebagemail;
    @FindBy(xpath = "//label[@class='form-checkbox-label']")
    private static WebElement coffeebagcheckbox;
    @FindBy(xpath = "//button[@class='form-button react-button react-button--size-medium react-button react-button--textType-bold react-button--type-submit react-button--color-scheme-green']")
    private static WebElement coffeebagButton;
    @FindBy(xpath = "//li[@class='cmp-navigation__item cmp-navigation__item--search']//span[@class='cmp-item__content cmp-item__search-search']")
    private static WebElement searchOption1;
    @FindBy(xpath = "//button[@class='cmp-dropdown__btn']/span[@class='cmp-item__content cmp-item__search-search']")
    private static WebElement searchOption;
    @FindBy(xpath = "//input[@class='run-search__input']")
    private static WebElement typeHere;
    @FindBy(xpath = "//div[@class='search-dropdown__item']")
    private static WebElement searchList;
    @FindBy(xpath = "//div[@class='search-dropdown__item']")
    private static WebElement searchResult;
    @FindBy(id = "Relevance")
    private WebElement relevanceDropDown;
    @FindBy(xpath = "//input[contains(@id,'Price: Low to High')]")
    private WebElement selectLowToHighPrice;
    @FindBy(xpath = "(//button[contains(@class,'remove')])[2]")
    private WebElement removebutton;
    @FindBy(xpath = "//button[@title='Remove Item']")
    private WebElement removeicon;
    @FindBy(xpath = "(//h2[@class='cmp-title__text'])[1]")
    private WebElement emptymessage;
    @FindBy(xpath = "//h3[@class='extended-warranty__title']")
    private WebElement sc_warranty;
    @FindBy(xpath = "//button[@title='Increase Quantity']")
    private WebElement updatequantity;

    @FindBy(xpath = "//span[@class='quantity__indicator']")
    private WebElement quantity;

    @FindBy(xpath = "//span[@class='cart-quantity-badge__quantity']")
    private WebElement cartIconQuantityText;

    @FindBy(xpath = "//span[@class='quantity__indicator']")
    private WebElement itemQuantityText;

    @FindBy(xpath = "//p[@class='plp-controls__filter-title']")
    private WebElement sortBy;


    @FindBy(xpath = "//h1[@class='plp-sp-ac__header']")
    private WebElement partandaccesoriesheader;

    //subscription on cart page
    @FindBy(xpath = " (//select[@class='form-select every__select'])[1]")
    private WebElement everyOnCartPage;





    public BrevilleProduct_OR() {
        PageFactory.initElements(driver, this);
    }

    public static boolean clickonselect(List<WebElement> objLocator, String stringName) throws Throwable {
        boolean blnFlag = false;
        try {

            for (int i = 0; i < objLocator.size(); i++) {
                boolean value = objLocator.get(i).isEnabled();

                if (value) {

                    objLocator.get(i).click();
                    blnFlag = true;
                    break;
                }
            }
            return blnFlag;

        } catch (Exception e) {
            //logger.log(Status.FAIL, e.getMessage());
            log.info(e.getMessage());
            return blnFlag;
        } finally {
            if (!blnFlag) {

                logger.log(Status.FAIL, "Failed to Click the" + stringName + " from the List.");
                log.info("Failed to Click the" + stringName + " from the List.");
            } else if (blnFlag) {
                logger.log(Status.PASS, "Successfully Clicked on " + stringName + " from the List.");
                log.info("Successfully Clicked on " + stringName + " from the List.");
            }
        }

    }

    public void assertSelectedIteminAddtocart(int index, String productname) throws Throwable {

        WebElement textvalue = driver.findElement(By.xpath("(//h2[@class='cart-bundle-summary__title--desktop']/a)[" + index + "]"));
        Actiondriver.gf_AssertText(textvalue, productname);

    }

    public void clickonProducts() throws Throwable {
        Actiondriver.gf_WaitForVisiblityofElement(products, "Products", 10, 4);
        Actiondriver.gf_JsClick(products, "Products");
    }

    public void clickonpartsandaccessories() throws Throwable {
        Actiondriver.gf_WaitForVisiblityofElement(partsandaccessories_button, "Parts and Accessories", 12, 3);
        Actiondriver.gf_JsClick(partsandaccessories_button, "Parts and Accessories");
    }

    public void selectFGproduct(String fgproduct) throws Throwable {

        Actiondriver.gf_Selectvaluesfromlist(productListPage, fgproduct);
        selectPriceLowToHigh();
        Thread.sleep(3000);
        for (int i = 0; i < plppage.size(); i++) {

            String plpproductname = plppage.get(i).getText();
            Actiondriver.gf_JsClick(plppage.get(i), plpproductname);


            boolean value = Actiondriver.gf_WaitForElementtoEnabled(addtocart, "Add To Cart", 4, 2);
            if (value) {
                data.add(Actiondriver.gf_GetText(pdppage, "ProductName"));
                Actiondriver.gf_JsClick(addtocart, "Add To Cart");
                Actiondriver.gf_AssertWaitForVisiblityofElement(gotocart, "GoTo Cart", 6, 4);
                Actiondriver.gf_JsClick(gotocart, "gotocart");
                Thread.sleep(5000);
                //Actiondriver.gf_AssertText(yourcart,plpproductname);
                break;
            } else {
                Actiondriver.gf_JsClick(returntoplp, "returntoPLP");
                Actiondriver.gf_WaitForVisiblityofElement(sortBy, "SortBy", 10, 4);

            }

        }


    }

    public void selectServiceContract(String servicecontract) throws Throwable {

        Actiondriver.gf_Selectvaluesfromlist(productListPage, servicecontract);
        Actiondriver.gf_WaitForVisiblityofElement(sortBy, "SortBy", 10, 4);
        for (int i = 0; i < plppage.size(); i++) {
            Actiondriver.gf_WaitForVisiblityofElement(sortBy, "SortBy", 10, 4);
            String plpproductname = plppage.get(i).getText();
            Actiondriver.gf_JsClick(plppage.get(i), plpproductname);
            boolean value = Actiondriver.gf_WaitForElementtoEnabled(addtocart, "Add To Cart", 5, 2);
            boolean warnty = Actiondriver.gf_WaitForElementtoEnabled(warranty, "warranty", 5, 2);
            if (value && warnty) {
                data.add(Actiondriver.gf_GetText(pdppage, "ProductName"));
                Actiondriver.gf_JsClick(warranty, "Waranty");
                Actiondriver.hardWait(5000);
                Actiondriver.gf_JsClick(addtocart, "Add To Cart");
                Actiondriver.gf_AssertWaitForVisiblityofElement(gotocart, "GoTo Cart", 6, 3);
                Actiondriver.gf_JsClick(gotocart, "gotocart");
                Actiondriver.hardWait(5000);

                //Actiondriver.gf_AssertText(yourcart,plpproductname);
                break;
            } else {
                Actiondriver.hardWait(2000);
                Actiondriver.gf_JsClick(returntoplp, "returntoPLP");
                Actiondriver.gf_WaitForVisiblityofElement(sortBy, "SortBy", 10, 4);
            }

        }


    }

    public void selectbundleproduct(String productname) throws Throwable {

        Actiondriver.gf_Selectvaluesfromlist(productListPage, productname);
        Actiondriver.gf_WaitForVisiblityofElement(sortBy, "SortBy", 10, 4);
        for (int i = 0; i < plppage.size(); i++) {

            String plpproductname = plppage.get(i).getText();
            Actiondriver.gf_JsClick(plppage.get(i), plpproductname);
            boolean addtocartvalue = Actiondriver.gf_WaitForElementtoEnabled(addtocart, "Add To Cart", 5, 2);
            boolean bundleproductbutton = Actiondriver.gf_WaitForElementtoEnabled(bundleproduct, "bundleproduct", 10, 3);
            if (bundleproductbutton && addtocartvalue) {
                //Thread.sleep(3000);
                Actiondriver.gf_JsClick(bundleproduct, "Shop this bundle");

                boolean nexttochooesebtn = Actiondriver.gf_WaitForElementtoEnabled(nextchoosecoffe, "Next to Choose coffe", 15, 3);
                if (nexttochooesebtn) {
                    Actiondriver.scrollToViewTillElement(nextchoosecoffe);
                    Actiondriver.gf_JsClick(nextchoosecoffe, "Next to Choose coffe");
                    Thread.sleep(3000);
                    Actiondriver.gf_AssertWaitForElementtoEnabled(browsecofee, "Browse Coffee Roasters", 10, 3);
                    Actiondriver.scrollToViewTillElement(browsecofee);
                    Actiondriver.gf_JsClick(browsecofee, "Browse Coffee Roasters");
                    //Actiondriver.gf_WaitForElementIsEnabled(select, "Select",5,8000);
                    //Actiondriver.scrollToViewTillElement(select);
                    Thread.sleep(5000);
                    clickonselect(select, "Select");
                    Actiondriver.gf_AssertWaitForElementtoEnabled(next, "Next", 10, 3);
                    Actiondriver.gf_JsClick(next, "Next");
                    Thread.sleep(10000);
                    Actiondriver.gf_AssertWaitForElementtoEnabled(bundleAddtoCart, "Add To Cart", 5, 2);
                    Actiondriver.gf_JsClick(bundleAddtoCart, "Add To Cart");
                    Thread.sleep(5000);
                    Actiondriver.gf_AssertWaitForElementtoEnabled(proceedtocheckout, "Proceed To CheckOut", 10, 4);
                    Actiondriver.scrollToViewTillElement(proceedtocheckout);
                    break;
                } else {

                    clickonProducts();
                    Actiondriver.gf_Selectvaluesfromlist(productListPage, "Espresso Machines");
                }


            } else {
                Actiondriver.gf_JsClick(returntoplp, "returntoPLP");
                Actiondriver.gf_WaitForVisiblityofElement(sortBy, "SortBy", 10, 4);
            }

        }


    }

    public void selectpartsandAccessories(String partsaccessoriesitem, String partsaccessories) throws Throwable {
        clickonpartsandaccessories();
        Thread.sleep(4000);
        Actiondriver.gf_Selectvaluesfromlist(partsandaccessoriesListPage, partsaccessoriesitem);
        Thread.sleep(5000);
        Actiondriver.gf_WaitForElementtoEnabled(partandaccesoriesheader, "Header", 10, 2);
        Thread.sleep(4000);
        String plpurl = driver.getCurrentUrl();

        for (int i = 0; i < partsandaccessoriesplppage.size(); i++) {

            boolean part = false;
            String partsname = partsandaccessoriesplppage.get(i).getText();
            Actiondriver.gf_JsClick(partsandaccessoriesplppage.get(i), partsname);
            Actiondriver.gf_WaitForVisiblityofElement(sortBy, "SortBy", 10, 4);
            String partsurl = driver.getCurrentUrl();
            for (int j = 0; j < partsandaccessories.size(); j++) {

                String partname = partsandaccessories.get(j).getText();
                Actiondriver.gf_JsClick(partsandaccessories.get(j), partname);
                // driver.manage().deleteAllCookies();
                Actiondriver.gf_WaitForVisiblityofElement(modelno, "modelno", 10, 2);
                String modelnumber = Actiondriver.gf_GetTextvalue(modelno);
                if (modelnumber.contains(partsaccessories)) {
                    data.add(Actiondriver.gf_GetText(pdppage, "ProductName"));
                    boolean addtovalue = Actiondriver.gf_WaitForElementtoEnabled(addtocart, "Add To Cart", 4, 2);
                    if (addtovalue) {
                        Actiondriver.gf_JsClick(addtocart, "Add to Cart");
                        Actiondriver.gf_AssertWaitForVisiblityofElement(gotocart, "Go To Cart", 12, 3);
                        Actiondriver.gf_JsClick(gotocart, "Go to Cart");
                        Actiondriver.hardWait(10000);
                        //Thread.sleep(4000);
                        //Actiondriver.gf_AssertText(yourcart,partname);
                        part = true;
                        break;
                    } else {
                        driver.get(partsurl);
                        Actiondriver.gf_WaitForVisiblityofElement(sortBy, "SortBy", 10, 4);
                    }
                } else {
                    driver.get(partsurl);
                    Actiondriver.gf_WaitForVisiblityofElement(sortBy, "SortBy", 10, 4);
                }
            }
            if (part) {
                break;
            }
            // driver.manage().deleteAllCookies();
            driver.get(plpurl);
            Actiondriver.gf_WaitForElementtoEnabled(partandaccesoriesheader, "Header", 10, 2);
        }

    }


    public void addingCoffeeBag() throws Throwable {
        Actiondriver.gf_AssertElementenabled(addcoffeebag, "Add Coffee Bag", 5, 8000);
        Thread.sleep(2000);
        Actiondriver.gf_JsClick(addcoffeebag, "AddCoffe Bag");
        Actiondriver.gf_WaitForElementIsEnabled(coffeebagemail, "Email", 5, 8000);
        Actiondriver.gf_Type(coffeebagemail, "sai.giridhar@breville.com", "Coffee Email");
        Actiondriver.gf_Click(coffeebagcheckbox, "Coffee CheckBox");
        Actiondriver.gf_Click(coffeebagButton, "COFFEBAG BUTTON");


    }


    public void proceedtoCheckout() throws Throwable {
        Actiondriver.gf_AssertWaitForElementtoEnabled(proceedtocheckout, "Proceed To Check Out", 10, 4);
        Actiondriver.gf_JsClick(proceedtocheckout, "Proceed To Check Out");
    }


    public void selectPriceLowToHigh() throws Throwable {
        Thread.sleep(5000);
        Actiondriver.gf_WaitForElementPresent(relevanceDropDown, "Relevance DropDown", 5, 8000);
        Actiondriver.scrollToViewTillElement(relevanceDropDown);
        Actiondriver.gf_JsClick(relevanceDropDown, "Relevance DropDown");
        Thread.sleep(2000);
        Actiondriver.scrollToViewTillElement(selectLowToHighPrice);
        Actiondriver.gf_JsClick(selectLowToHighPrice, "selectLowToHighPrice");


    }


    public void Orderwith_FG_EW_AC(String fgproduct, String servicecontract, String partsaccessories, String accessories) throws Throwable {
        selectFGproduct(fgproduct);
        clickonProducts();
        Actiondriver.hardWait(5000);
        selectServiceContract(servicecontract);
        clickonProducts();
        Actiondriver.hardWait(5000);
        selectpartsandAccessories(partsaccessories, accessories);

    }

    public void Orderwith_FG_EW(String fgProduct, String serviceContract) throws Throwable {
        selectFGproduct(fgProduct);
        clickonProducts();
        Actiondriver.hardWait(5000);
        selectServiceContract(serviceContract);

    }

    public void verifyOrderwithFG_EW_SP(String fgProduct, String servicecontract, String cofeebag, String partsaccessories, String accessories) throws Throwable {
        selectFGproduct(fgProduct);
        clickonProducts();
        Actiondriver.hardWait(5000);
        selectServiceContract(servicecontract);
        clickonProducts();
        Actiondriver.hardWait(5000);
        selectFGproduct(cofeebag);
        //Actiondriver.hardWait(5000);
        //addingCoffeeBag();
        clickonProducts();
        Actiondriver.hardWait(5000);
        selectpartsandAccessories(partsaccessories, accessories);


    }


    public void verifyOrderWithCB_FG_EW(String fgProduct, String serviceContract, String coffeeBag) throws Throwable {
        Orderwith_FG_EW(fgProduct, serviceContract);
        clickonProducts();
        Actiondriver.hardWait(5000);
        selectFGproduct(coffeeBag);
    }

    public void OrderWith_FG_CB(String fgProduct, String coffeeBag) throws Throwable {
        selectFGproduct(fgProduct);
        clickonProducts();
        Actiondriver.hardWait(5000);
        selectFGproduct(coffeeBag);
    }

    public void orderWith_FG_Bundle(String fgProduct, String productname) throws Throwable {
        selectFGproduct(fgProduct);
        clickonProducts();
        Actiondriver.hardWait(5000);
        selectbundleproduct(productname);
    }

    public void verifyOrderWithSubscription_FG_EW(String fgProduct, String serviceContract, String productName, String plan) throws Throwable {
        //Orderwith_FG_SC(fgProduct,serviceContract);
        selectFGproduct(fgProduct);
        clickonProducts();
        Actiondriver.hardWait(5000);
        selectServiceContract(serviceContract);
        Actiondriver.hardWait(5000);
        selectSubscriptionsproduct1(productName, plan);
    }

    public void verifyOrderWithCB_FG_Subscription(String fgProduct, String coffeeBag, String productName, String plan) throws Throwable {
        OrderWith_FG_CB(fgProduct, coffeeBag);
        Actiondriver.hardWait(5000);
        selectSubscriptionsproduct1(productName, plan);
    }

    public void verifyOrderWithFG_Subscription(String fgProduct, String productName, String plan) throws Throwable {
        selectFGproduct(fgProduct);
        Actiondriver.hardWait(5000);
        selectSubscriptionsproduct1(productName, plan);
    }

    public void verifyOrderWithSubscription_EW(String serviceContract, String productName, String plan) throws Throwable {
        selectServiceContract(serviceContract);
        Actiondriver.hardWait(5000);
        selectSubscriptionsproduct1(productName, plan);
    }

    public void verifyOrderwith_EW_SP(String servicecontract, String partsaccessories, String accessories) throws Throwable {

        selectServiceContract(servicecontract);
        clickonProducts();
        Actiondriver.hardWait(5000);
        selectpartsandAccessories(partsaccessories, accessories);


    }

    public void verifyOrderwithFG_SP(String fgProduct, String partsaccessories, String accessories) throws Throwable {

        selectFGproduct(fgProduct);
        clickonProducts();
        Actiondriver.hardWait(5000);
        selectpartsandAccessories(partsaccessories, accessories);


    }

    public void verifyOrderwith_Subcription_SP(String partsaccessories, String accessories, String productName, String plan) throws Throwable {

        selectSubscriptionsproduct1(productName, plan);
        Actiondriver.hardWait(5000);
        clickonProducts();
        Actiondriver.hardWait(5000);
        selectpartsandAccessories(partsaccessories, accessories);
    }


    public void verifyOrderWithFG1_EW1_FG2_EW1(String ew1, String ew2) throws Throwable {
        selectServiceContract(ew1);
        clickonProducts();
        Actiondriver.hardWait(5000);
        selectServiceContract(ew2);
    }


    public void verifyitemaddedtocart() {
        for (int li = 0; li < data.size(); li++) {
            String nameoftheproduct = data.get(li);

            String addcartname = listofitems.get(li).getText();
            if (nameoftheproduct.equalsIgnoreCase(addcartname)) {
                logger.log(Status.PASS, addcartname + "is displaying in Cart item");
            }

        }
    }


    public void removeitemwithindexvalue(int index) throws Throwable {
        Actiondriver.hardWait(6000);
        Actiondriver.gf_JsClick(deleteitem.get(index), "Delete Item");
        Actiondriver.gf_AssertWaitForElementtoEnabled(removebutton, "Remove Button", 12, 3);
        Actiondriver.gf_JsClick(removebutton, "Remove Button");
        Thread.sleep(10000);
    }

    public void removeItemandVerifythecount(int index) throws Throwable {
        int actualcount = deleteitem.size();
        logger.log(Status.INFO, "Count before deletions is " + actualcount);
        log.info("Count before deletions is " + actualcount);
        Actiondriver.gf_JsClick(deleteitem.get(index), "Delete Item");
        Actiondriver.gf_AssertWaitForVisiblityofElement(removebutton, "Remove Button", 12, 3);
        Actiondriver.gf_JsClick(removebutton, "Remove Button");
        Thread.sleep(10000);
        int countafterdeletions = deleteitem.size();
        if (countafterdeletions < actualcount) {
            logger.log(Status.PASS, "Item has been deleted");
            log.info("Item has been deleted");
            logger.log(Status.PASS, "Count after deletions is " + countafterdeletions);
            log.info("Count after deletions is " + countafterdeletions);
        } else {
            logger.log(Status.FAIL, "Unable to delete the Item");
            log.info("Unable to delete the Item");
            logger.log(Status.FAIL, "Count after deletions is " + countafterdeletions);
            log.info("Count after deletions is " + countafterdeletions);
        }
    }


    public void removeitemsfromAddtocart() throws Throwable {
        int count = deleteitem.size();
        while (count > 0) {
            Actiondriver.gf_JsClick(deleteitem.get(count - 1), "Delete Item");
            Actiondriver.gf_WaitForElementToBeClickable(removebutton, "Remove Button", 12, 3);
            Actiondriver.gf_JsClick(removebutton, "Remove Button");
            Thread.sleep(10000);
            count = deleteitem.size();
        }

    }

    public void addmultipleproducts(String fgProduct, String serviceContract, String productName, String plan) throws Throwable {
        //Orderwith_FG_SC(fgProduct,serviceContract);
        selectFGproduct(fgProduct);
        clickonProducts();
        Actiondriver.hardWait(5000);
        selectServiceContract(serviceContract);
        Actiondriver.hardWait(5000);
        selectSubscriptionsproduct1(productName, plan);

    }

    public void verifywaranty() throws Throwable {
        boolean value = Actiondriver.gf_WaitForVisiblityofElement(sc_warranty, "ServiceContract Warranty", 5, 2);
        if (!value) {
            logger.log(Status.PASS, "FG Product is displaying");
        }


    }

    public void verifyEmptycartMessage() throws Throwable {
        String message = Actiondriver.gf_GetText(emptymessage, "Message");
        if (message.equalsIgnoreCase("Your Cart is Empty")) {
            logger.log(Status.PASS, "Your Cart is Empty");
        }
    }

    public void updateQuantity() throws Throwable {
        Actiondriver.gf_WaitForVisiblityofElement(updatequantity, "Increase Quantity", 12, 2);
        Actiondriver.gf_JsClick(updatequantity, "Increase Quantity");
        Actiondriver.gf_VerifyText(quantity, "2", "Quantity");

    }

    public void updateQuantity(int itemQuantity) throws Throwable {
        int i = 0;
        Actiondriver.gf_WaitForVisiblityofElement(updatequantity, "Increase Quantity", 12, 2);
        for (i = 1; i <= itemQuantity; i++) {
            Actiondriver.gf_JsClick(updatequantity, "Increase Quantity");
            Thread.sleep(1000);
            Actiondriver.gf_VerifyText(cartIconQuantityText, Actiondriver.gf_GetText(itemQuantityText, "Item Quantity"), "Item Quantity");
        }
        String cartQuantityText = Actiondriver.gf_GetText(cartIconQuantityText, "Cart");
        String itemQuantitytext = Actiondriver.gf_GetText(itemQuantityText, "Item Quantity");
        if (Integer.parseInt(cartQuantityText)<=5&& Integer.parseInt(itemQuantitytext)<=5) {
            logger.log(Status.PASS, "Item cart quantity updated upto " + cartQuantityText + "successfully");
        } else {
            logger.log(Status.FAIL, "Item cart quantity updated more than 5");
        }
    }


    public void selectSubscriptionsproduct(int noofSubscriptionstoAdd, String plan) throws Throwable {
        String subscriptionproduct[] = {"ESPRESSO CLEANING TABLETS (8)", "Claro Swiss Water Filter", "the Descaler (pack of 4)"};

        for (int sb = 0; sb < noofSubscriptionstoAdd; sb++) {
            Actiondriver.gf_WaitForVisiblityofElement(searchOption, "Search option", 12, 3);
            Actiondriver.gf_WaitForVisiblityofElement(searchOption, "Search option", 12, 4);
            Actiondriver.gf_Click(searchOption, "Search option");
            Actiondriver.gf_WaitForVisiblityofElement(typeHere, "Type Here", 12, 2);
            Actiondriver.gf_Type(typeHere, subscriptionproduct[sb], subscriptionproduct[sb]);
            typeHere.sendKeys(Keys.ENTER);
            boolean subvalue = Actiondriver.gf_WaitForVisiblityofElement(searchsublist, subscriptionproduct[sb], 12, 2);

            if (subvalue) {
                Actiondriver.gf_Click(searchsublist, subscriptionproduct[sb]);
                boolean addcartval = Actiondriver.gf_WaitForVisiblityofElement(addtocart, "Add to Cart ", 4, 2);

                if (addcartval) {
                    Actiondriver.gf_SelectByValue(everyDropdown, plan, "every");
                    Actiondriver.gf_JsClick(addtocart, "Add To Cart");
                    Actiondriver.gf_WaitForElementToBeClickable(gotocart, "GoTo Cart", 12, 2);
                    Actiondriver.gf_JsClick(gotocart, "gotocart");
                    Thread.sleep(5000);

                } else {
                    noofSubscriptionstoAdd = noofSubscriptionstoAdd + 1;
                }
            } else {
                int count = subscriptionproduct.length;

                if (noofSubscriptionstoAdd < count) {
                    noofSubscriptionstoAdd = noofSubscriptionstoAdd + 1;
                }

            }

        }

    }

    public void verifyOrderWith_SB1_SB2(String prodName1, String plan1, String prodName2, String plan2) throws Throwable {
        selectSubscriptionsproduct1(prodName1, plan1);
        Actiondriver.hardWait(5000);
        selectSubscriptionsproduct1(prodName2, plan2);

    }

    public void verifyOrderwithFG_SC_SP_SB(String fgProduct, String servicecontract,
                                           String partsaccessories, String accessories, String prodName1, String plan1) throws Throwable {
        selectFGproduct(fgProduct);
        clickonProducts();
        Actiondriver.hardWait(5000);
        selectServiceContract(servicecontract);
        clickonProducts();
        Actiondriver.hardWait(5000);
        selectpartsandAccessories(partsaccessories, accessories);
        Actiondriver.hardWait(5000);
        selectSubscriptionsproduct1(prodName1, plan1);


    }


    public void verifyOrderWithFG_SB1_SB2_SP(String fgProduct, String partsaccessories, String accessories, String productName1, String plan1, String productName2, String plan2) throws Throwable {
        selectSubscriptionsproduct1(productName2, plan2);
        clickonProducts();
        Actiondriver.hardWait(5000);
        selectFGproduct(fgProduct);
        clickonProducts();
        Actiondriver.hardWait(5000);
        selectpartsandAccessories(partsaccessories, accessories);
        Actiondriver.hardWait(5000);
        selectSubscriptionsproduct1(productName1, plan1);

    }

    public void selectSubscriptionsproduct1(String data, String value) throws Throwable {
        Actiondriver.gf_WaitForVisiblityofElement(searchOption, "Search option", 12, 8);
        Actiondriver.gf_Click(searchOption, "Search option");
        Actiondriver.gf_WaitForVisiblityofElement(typeHere, "Type Here", 12, 2);
        Actiondriver.gf_Type(typeHere, data, data);
        Actiondriver.hardWait(8000);
        typeHere.sendKeys(Keys.ENTER);
        boolean subvalue = Actiondriver.gf_WaitForVisiblityofElement(searchsublist, data, 3, 3);

        if (subvalue) {
            Actiondriver.hardWait(3000);
            Actiondriver.gf_Click(searchsublist, data);
            boolean addcartval = Actiondriver.gf_WaitForVisiblityofElement(addtocart, "Add to Cart ", 4, 2);

            if (addcartval) {
                Actiondriver.gf_SelectByValue(everyDropdown, value, "every");
                Actiondriver.gf_JsClick(addtocart, "Add To Cart");
                Actiondriver.gf_AssertWaitForVisiblityofElement(gotocart, "GoTo Cart", 12, 2);
                Actiondriver.gf_JsClick(gotocart, "gotocart");
                Thread.sleep(5000);
            } else {
                logger.log(Status.INFO, "No Subscription item is displayed to select");
            }

        } else {
            logger.log(Status.INFO, "No Subscription item is displayed to select");
        }
    }

    public void updateSubscriptionEveryOnCartPage(String value) throws Throwable{
        Actiondriver.gf_SelectByVisibleText(everyOnCartPage,value,"Every");

    }
}
