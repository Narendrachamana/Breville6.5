package accelerators;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


import javax.mail.MessagingException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.BrevilleHomepage_OR;
import utilities.DateUtil;
import utilities.EmailSend;
import utilities.ExcelDataProvider;
import utilities.Excellib;
import utilities.Property;
import utilities.ScreenShot;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Base {

	public static ExtentSparkReporter html;
	public static ExtentReports report;
	public static ExtentTest logger;
	public static WebDriver driver;
	// public static RemoteWebDriver driver = null;

	public static Property configProps = new Property(System.getProperty("user.dir")+ File.separator + "config.properties");
	public static String browser;
	
	protected static Logger log;
	public static String reportfol;

	public static XSSFSheet objInputSheet, objAssertionSheet = null;

	public static Object[][] brevilleTestData;
	public static BrevilleHomepage_OR brevillehome;

	public List<String> data=new ArrayList<String>();
	@BeforeSuite
	public void createhtmlreport() {
		String datetime = DateUtil.Datetime();
		// reportfol=".//Breville"+datetime+".html";
		reportfol = System.getProperty("user.dir") + "Breville.html";
		html = new ExtentSparkReporter(reportfol);
		report = new ExtentReports();
		report.attachReporter(html);

	}

	@BeforeClass
	@Parameters({ "selectcountry" })
	public void invokeexcel(String country) throws Exception {
		
		logger = report.createTest(getClass().getSimpleName());
		html.config().setReportName("Breville 6.5 Regression Test Report for" + country);
		html.config().setDocumentTitle(country);
	

	}

	

	@BeforeMethod

	@Parameters({ "selectregion", "selectcountry","instance"})
	public void setUp(String region, String country,String runinstance, Method testMethod,ITestContext ctx) throws Throwable {

		
		String testName = ctx.getCurrentXmlTest().getName();
		log = LogManager.getLogger(testName);
		if(runinstance.equalsIgnoreCase("Docker")) {
			String hostToTest = configProps.getProperty("host"); ;
			String browserToTest = System.getProperty("BROWSER");
			switch (browserToTest) {
			case "chrome":

				
				  DesiredCapabilities dc = DesiredCapabilities.chrome();
				  dc.setCapability("resolution", "1920x1080");
				  
				  ChromeOptions options = new ChromeOptions();
				  options.addArguments("--disable-dev-shm-usage");
				   options.addArguments("--incognito");
		      options.addArguments("start-maximized");
		      options.addArguments("enable-automation");
		      options.addArguments("--disable-infobars");
		    	  options.addArguments("--disable-browser-side-navigation");
		      options.addArguments("--disable-gpu");
		      options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		      options.addArguments("--disable-gpu");
		      options.addArguments("disable-features=NetworkService");
		      options.addArguments("--force-device-scale-factor=1");
				  dc.setCapability(ChromeOptions.CAPABILITY, options);
				  
				  if (System.getProperty("HUB_HOST") != null && !System.getProperty("HUB_HOST").isEmpty()) 
				  { 
					  hostToTest =System.getProperty("HUB_HOST"); 
				  }
				   
				  String completeUrl = "http://" + hostToTest + ":4444/wd/hub";
				  driver = new RemoteWebDriver(new URL(completeUrl), dc);
				  
				break;
			case "firefox":
				DesiredCapabilities dc1 = DesiredCapabilities.firefox();
				if (System.getProperty("HUB_HOST") != null && !System.getProperty("HUB_HOST").isEmpty()) {
					hostToTest = System.getProperty("HUB_HOST");
				}
				

				String completeUrl1 = "http://" + hostToTest + ":4444/wd/hub";
				driver = new RemoteWebDriver(new URL(completeUrl1), dc1);
				
				break;

			default:
				System.out.println("Do not know how to start : starting chrome.");
				if (System.getProperty("HUB_HOST") != null && !System.getProperty("HUB_HOST").isEmpty()) {
					hostToTest = System.getProperty("HUB_HOST");
				}
				

				String completeUrl2 = "http://" + hostToTest + ":4444/wd/hub";
				DesiredCapabilities dc2 = DesiredCapabilities.chrome();
				driver = new RemoteWebDriver(new URL(completeUrl2), dc2);
				
				break;
			}
			
			  driver.manage().window().fullscreen();
			  driver.manage().deleteAllCookies();
			 // driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			  driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
			  driver.get(configProps.getProperty(System.getProperty("ENVIRONMENT")));
			
			}
			else
			{
				WebDriverManager.chromedriver().setup();
			      ChromeOptions options = new ChromeOptions();
				  options.addArguments("ignore-certificate-errors");
			      options.addArguments("--incognito");
			      options.addArguments("start-maximized");
			      options.addArguments("enable-automation");
			      options.addArguments("--disable-infobars");
			      options.addArguments("--disable-dev-shm-usage");
			      options.addArguments("--disable-browser-side-navigation");
			      options.addArguments("--disable-gpu");
			      options.setPageLoadStrategy(PageLoadStrategy.EAGER);
			      options.addArguments("--disable-gpu");
			      options.addArguments("disable-features=NetworkService");
			      options.addArguments("--force-device-scale-factor=1");
			    
			      driver = new ChromeDriver(options);
				  driver.manage().window().maximize();
				  driver.manage().deleteAllCookies();
				 // driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
				  driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
				  driver.get(configProps.getProperty("UAT"));
			}
		  
		 brevillehome=PageFactory.initElements(driver, BrevilleHomepage_OR.class);
		  brevillehome.selectregions(region,country);
		 
		 

	}

	@AfterMethod
	public void quitebrowser(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {

			logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder
					.createScreenCaptureFromPath(ScreenShot.TakeScreenShot(driver, result.getName())).build());
		}
		driver.quit();

	}

	@AfterTest
	public void quitbrowser() throws IOException {
		ExcelDataProvider.closeworkbook();
	}

	@AfterSuite
	public void teardown() throws MessagingException, InterruptedException {
		report.flush();

		// EmailSend.SendEmail();

	}

}
