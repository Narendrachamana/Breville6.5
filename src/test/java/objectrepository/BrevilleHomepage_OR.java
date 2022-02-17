package objectrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import accelerators.Actiondriver;

public class BrevilleHomepage_OR extends Actiondriver {

	@FindAll(@FindBy(xpath = "//nav[@class='location-nav row align-top align-center']/h3"))
	private static List<WebElement> regions;

	@FindAll(@FindBy(xpath = "//li[@class='location-counties__country column']/a"))
	private static List<WebElement> countries;

	@FindBy(xpath = "//button[@aria-label='Close']")
	private static WebElement newsLetterCloseButton;

	@FindBy(id = "_evidon-accept-button")
	private static WebElement evidonAcceptButton;

	@FindBy(xpath = "//a[@class='header__search-icon header--full-height js-search-open']")
	private static WebElement searchIcon;

	@FindBy(id = "prodLink")
	public static WebElement productsLabel;

	@FindBy(xpath = "//span[@id='myBrevilleId']")
	private static WebElement myBrevilleLabel;

	public BrevilleHomepage_OR() {
		PageFactory.initElements(driver, this);
	}

	public void selectRegion(String regionName) throws Throwable {
		Actiondriver.gf_Selectvaluesfromlist(regions, regionName);
	}

	public void selectCountry(String countryname) throws Throwable {
		Actiondriver.gf_Selectvaluesfromlist(countries, countryname);
	}

	public void closesignUp() throws Throwable {
		Actiondriver.gf_AssertWaitForVisiblityofElement(newsLetterCloseButton, "News Letter Signup", 10, 4);
		Actiondriver.gf_Click(newsLetterCloseButton, "SignUp");
	}

	public void clickonAcceptbutton() throws Throwable {
		Actiondriver.gf_AssertWaitForVisiblityofElement(evidonAcceptButton, "Accept", 10,
				4);
		Actiondriver.gf_Click(evidonAcceptButton, Actiondriver.gf_GetTextvalue(evidonAcceptButton));
	}

	public void switchtowindow(int noofwindowsopen) throws Throwable

	{

		Actiondriver.gf_SwitchWindowById(noofwindowsopen);

	}

	public void clickonProducts() throws Throwable {

		Actiondriver.gf_WaitForElementtoPresent(productsLabel, "Product", 12, 3);
		Actiondriver.gf_Click(productsLabel, Actiondriver.gf_GetTextvalue(productsLabel));

	}

	public void clickonSearchIcon() throws Throwable {
		Actiondriver.gf_Click(searchIcon, "SearcIcon");
	}

	public void selectregions(String region, String country) throws Throwable {
		brevillehome.selectRegion(region);
		brevillehome.selectCountry(country);
		brevillehome.switchtowindow(2);
		if (country.equals("USA")) {
			brevillehome.clickonAcceptbutton();
			//brevillehome.closesignUp();
		}
	}

	public void clickonMyBreville() throws Throwable {
		Actiondriver.gf_WaitForElementToBeClickable(myBrevilleLabel, "My Breville", 12, 3);
		Actiondriver.gf_Click(myBrevilleLabel, "My Breville");
	}

}