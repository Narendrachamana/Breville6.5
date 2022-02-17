package accelerators;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;



public class Actiondriver extends Base {
	

public static boolean blnEventReport = false;
	
	public static long lSleep_Low=2000;
	public static long lSleep_Medium=3000;
	public static long lSleep_High=10000;
	public static  long lWait_Medium=20;
	public static  long lWait_Slow=10;
	
	/****************************************************************************************************************************
	 * Function Name		:	gf_Click()
	 * Description			:	 Clicks An an element 
	****************************************************************************************************************************/
	
	
	public static boolean gf_Click(WebElement objLocator, String strLocatorName) throws Throwable 
	{
		boolean blnFlag = false;
		try 
		{	

			objLocator.click();
			blnFlag = true;
			return blnFlag;
		}
		catch (Exception e) 
		{
			logger.log(Status.FAIL, e.getMessage());
			log.info(e.getMessage());
			return blnFlag;
		}
		finally
		{
			if(!blnFlag)
			{
				logger.log(Status.FAIL,"Failed to click on "+strLocatorName);
			    log.info("Failed to click on "+strLocatorName);
			}
			else if(blnFlag)
			{
				logger.log(Status.PASS,"Successfully clicked on "+strLocatorName );
			    log.info("Successfully clicked on "+strLocatorName );
			    
			    
			}
		}
	}

	/****************************************************************************************************************************
	 * Function Name		:	gf_JsClick
	 * Description			:	 Clicks An an element using java executor
	****************************************************************************************************************************/
	

	public static boolean gf_JsClick(WebElement objLocator, String strLocatorName) throws Throwable {
		boolean blnFlag = false;
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", objLocator);
			blnFlag = true;
			return blnFlag;
		} catch (Exception e) {
			
			log.info(e.getMessage());
			return blnFlag;
		}
		finally
		{
			if(!blnFlag) {
				logger.log(Status.FAIL, "Failed to click on "+strLocatorName);
			    log.info("Failed to click on "+strLocatorName );}
			else if(blnFlag) {
				logger.log(Status.PASS,"Successfully clicked on "+strLocatorName );
			    log.info("Successfully clicked on "+strLocatorName );}
		} 
	}

	/****************************************************************************************************************************
	 * Function Name		:	gf_Type
	 * Description			:	This method used type value in to text box or text area
	****************************************************************************************************************************/
	

	public static boolean gf_Type(WebElement objLocator, String strTestdata, String strLocatorName) throws Throwable 
	{
		boolean blnFlag = false;
		try
		{
			objLocator.clear();
			objLocator.sendKeys(strTestdata);
			blnFlag = true;
			return blnFlag;
		}
		catch (Exception e) 
		{
			//logger.log(Status.FAIL, e.getMessage());
			log.info(e.getMessage());
			return blnFlag;
		}
		finally
		{
			if(!(strTestdata.equalsIgnoreCase("")||strTestdata==null))
			{
				if(!blnFlag) {
					logger.log(Status.FAIL,"Failed to enter data"+ strLocatorName + strTestdata);
					log.info("Failed to enter data"+ strLocatorName + strTestdata);}
				else if(blnFlag) {
					logger.log(Status.PASS,"Data "+strLocatorName + strTestdata +" entered successfully.");
					log.info("Data "+strLocatorName + strTestdata +" entered successfully.");}
			}
		}
	}
	

	/****************************************************************************************************************************
	 * Function Name		:	gf_WaitForElementPresent
	 * Description			:	Wait for an ElementPresent
	****************************************************************************************************************************/
	

	public static boolean gf_WaitForElementPresent(WebElement objLocator) throws Throwable 
	{
		boolean blnFlag = false;
		try
		{
			for (int i = 0; i < 40; i++) 
			{
				boolean value=objLocator.isDisplayed();
				if (value) {
					blnFlag = true;
					break;}
				
			}
						
			return blnFlag;
		} 
		catch (Exception e) 
		{
			//logger.log(Status.FAIL, e.getMessage());
			log.info(e.getMessage());
			return blnFlag;
		}
		finally
		{
			if(!blnFlag) {
				logger.log(Status.FAIL,"Element not present.");
			log.info("Element not present.");}
			else if(blnFlag) {
				logger.log(Status.PASS,"Element present" );
			log.info("Element present");}
		}
	}

	/****************************************************************************************************************************
	 * Function Name		:	gf_SelectByIndex
	 * Description			:	select value by using index
	****************************************************************************************************************************/
	

	public static boolean gf_SelectByIndex(WebElement objLocator, int valueIndex) throws Throwable 
	{
		boolean blnFlag = false;
		try {
			Select s = new Select(objLocator);
			s.selectByIndex(valueIndex);
			//String value=values.get(i).getText();
			String selectedValue=objLocator.getText();
			logger.log(Status.PASS,"Successfully selected the value : "+selectedValue+" from drop down.");
			log.info("Successfully selected the value : "+selectedValue+" from drop down.");
			blnFlag = true;
			return blnFlag;
		}
		catch(Exception e)
		{
			//logger.log(Status.FAIL, e.getMessage());
			log.info(e.getMessage());
			return blnFlag;
		}
		finally
		{
			if(!blnFlag) {
				logger.log(Status.FAIL,"Failed to select the from drop down.");
				log.info("Failed to select the from drop down.");
			}
			else if(blnFlag) {
				logger.log(Status.PASS,"Successfully selected the value from drop down.");
				log.info("Successfully selected the value from drop down.");
				}
		}
	}

	/****************************************************************************************************************************
	 * Function Name		:	gf_SelectByValue
	 * Description			:	select value from DD by using value
	****************************************************************************************************************************/
	

	public static boolean gf_SelectByValue(WebElement objLocator, String strValue, String strLocatorName) throws Throwable 
	{
		boolean blnFlag = false;
		try {
			Select s = new Select(objLocator);
			s.selectByValue(strValue);
			blnFlag = true;
			return blnFlag;
		}
		catch(Exception e)
		{
			//logger.log(Status.FAIL, e.getMessage());
			log.info(e.getMessage());
			return blnFlag;
		}
		finally
		{
			if(!blnFlag) {
				logger.log(Status.FAIL,"Failed to select the" +strValue+" from drop down.");
				log.info("Failed to select the" +strValue+" from drop down.");
			}
			else if(blnFlag) {
				logger.log(Status.PASS,"Successfully selected the value : "+strValue+" from drop down.");
				log.info("Successfully selected the value : "+strValue+" from drop down.");
				}
		}
	}

	/****************************************************************************************************************************
	 * Function Name		:	gf_Selectvaluefromdropdown
	 * Description			:	select value from DD  select tag is not Available
	****************************************************************************************************************************/
	

	public static boolean gf_Selectvaluefromdropdown(By objLocator, String stringName) throws Throwable 
	{
		boolean blnFlag = false;
		try {
			List<WebElement> values=driver.findElements(objLocator);
			
			for(int i=0;i<values.size();i++)
			{
				String value=values.get(i).getText();
				
				if(value.equalsIgnoreCase(stringName))
				{
					values.get(i).click();
					blnFlag=true;
					break;
			     }
			}
			return blnFlag;
		  }
		catch(Exception e)
		{
			//logger.log(Status.FAIL, e.getMessage());
			log.info(e.getMessage());
			return blnFlag;
		}
		finally
		{
			if(!blnFlag) {
				logger.log(Status.FAIL,"Failed to select the" +stringName+" from drop down.");
				log.info("Failed to select the" +stringName+" from drop down.");
				}
			else if(blnFlag) {
				logger.log(Status.PASS,"Successfully selected the value : "+stringName+" from drop down.");
				log.info("Successfully selected the value : "+stringName+" from drop down.");
				}
		}
		
	}

	
	/****************************************************************************************************************************
	 * Function Name		:	gf_Selectvaluesfromlist
	 * Description			:	This method is used to select the Values from List of Webelements.
	****************************************************************************************************************************/
	

	public static boolean gf_Selectvaluesfromlist(List<WebElement> objLocator, String stringName) throws Throwable 
	{
		boolean blnFlag = false;
		try {
			
			
			for(int i=0;i<objLocator.size();i++)
			{
				String value=objLocator.get(i).getText().trim();
				
			if(value.contains(stringName.trim()))
				
				{
				gf_JsClick(objLocator.get(i),stringName);
				   // objLocator.get(i).click();
					blnFlag=true;
					break;
			     }
			}
			return blnFlag;
		  }
		catch(Exception e)
		{
			//logger.log(Status.FAIL, e.getMessage());
			log.info(e.getMessage());
			return blnFlag;
		}
		finally
		{
			if(!blnFlag) {
				
				logger.log(Status.FAIL,"Failed to Click the" +stringName+" from the List.");
				log.info("Failed to Click the" +stringName+" from the List.");	
			}
			else if(blnFlag) {
				logger.log(Status.PASS,"Successfully Clicked on "+stringName+" from the List.");
				log.info("Successfully Clicked on "+stringName+" from the List.");}
		}
		
	}



	/****************************************************************************************************************************
	 * Function Name		:	gf_SelectByVisibleText
	 * Description			:	select value from DropDown by using selectByVisibleText.
	****************************************************************************************************************************/
	

	
	public static boolean gf_SelectByVisibleText(WebElement objLocator, String strVisibletext,String strLocatorName) throws Throwable 
	{
		boolean blnFlag = false;
		try {
			Select dropDown = new Select(objLocator);           

			List<WebElement> Options = dropDown.getOptions();
			for(WebElement option:Options)
			{
			
				if(option.getText().trim().replace("\n", "").replaceAll("[^a-zA-Z0-9_-]", "").equals(strVisibletext.trim().replace("\n", "").replaceAll("[^a-zA-Z0-9_-]", "")))
				{
					option.click();
					blnFlag = true;
					return blnFlag;
				}
			}
			return blnFlag;
		} catch (Exception e) {
			//logger.log(Status.FAIL, e.getMessage());
			log.info(e.getMessage());
			return blnFlag;
		}
		finally
		{
			if(!blnFlag) {
				logger.log(Status.FAIL,"Failed to select the" +strVisibletext+" from drop down.");
				log.info("Failed to select the" +strVisibletext+" from drop down.")	;
			}
			else if(blnFlag) {
				logger.log(Status.PASS,"Successfully selected the value : "+strVisibletext+" from drop down.");
				log.info("Successfully selected the value : "+strVisibletext+" from drop down.");
			}
		}
	}

	/****************************************************************************************************************************
	 * Function Name		:	gf_IsVisible
	 * Description			:	Element visible or not
	****************************************************************************************************************************/
	

	public Boolean gf_IsVisible(WebElement objLocator, String strLocatorName) throws Throwable {
		Boolean blnFlag = false;
		try {
			blnFlag = objLocator.isDisplayed();
			return blnFlag;
		} catch (NoSuchElementException e) {
			//logger.log(Status.FAIL, e.getMessage());
			log.info(e.getMessage());
			return blnFlag;
		}
		finally
		{
			if(!blnFlag) {
				logger.log(Status.FAIL,strLocatorName+ "element  is not Visible.");
			log.info(strLocatorName+ "element  is not Visible.");}
			else if(blnFlag) {
				logger.log(Status.PASS,strLocatorName+ "element  is Visible.");
				log.info(strLocatorName+ "element  is Visible.");
				}
		}
	}


	/****************************************************************************************************************************
	 * Function Name		:	gf_SwitchToFrameByLocator
	 * Description			:	This method switch the to frame using frame Name.
	****************************************************************************************************************************/
	

	public static boolean gf_SwitchToFrameByLocator(WebElement objLocator,String strLocatorName)throws Throwable
	{   
		boolean blnFlag=false;
		try
		{
			driver.switchTo().frame(objLocator);
			blnFlag=true;
			return blnFlag;
		}
		catch(Exception e)
		{
			//logger.log(Status.FAIL, e.getMessage());
			log.info(e.getMessage());
			return blnFlag;
		}
		finally
		{
			if(!blnFlag) {
				logger.log(Status.FAIL,"fail to switch  frame by webelement "+strLocatorName);
				log.info("fail to switch  frame by webelement "+strLocatorName);
			}
			else if( blnFlag) {
				logger.log(Status.PASS,"Successfully switch to frame by webelement "+strLocatorName);
				log.info("Successfully switch to frame by webelement "+strLocatorName);	
			}
		}
	}


	/****************************************************************************************************************************
	 * Function Name		:	gf_ImplicitWait())
	 * Description			:	This method wait selenium until element present on web page.
	****************************************************************************************************************************/
	

	public static void gf_ImplicitWait(){

		driver.manage().timeouts().implicitlyWait(lWait_Medium, TimeUnit.SECONDS);
	}
	

	/****************************************************************************************************************************
	 * Function Name		:	gf_WaitForVisibilityOfElement
	 * Description			:	This method wait selenium until visibility of Elements on WebPage.
	****************************************************************************************************************************/
	

	public static boolean gf_WaitForVisibilityOfElement(WebElement objLocator, String strLocatorName) throws Throwable{
		boolean blnFlag = false;
		try{
			WebDriverWait objWait = new WebDriverWait(driver, 40);
			objWait.until(ExpectedConditions.visibilityOf(objLocator));
			blnFlag = true;
			return blnFlag;
		}
		catch(Exception e)
		{
			//logger.log(Status.FAIL, e.getMessage());
			log.info(e.getMessage());
			return blnFlag;
		}
		finally
		{
			
				if(!blnFlag) {
					logger.log(Status.FAIL,strLocatorName+ "element  is not Visible.");
					log.info(strLocatorName+ "element  is not Visible.");	
				}
				else if(blnFlag) {
					logger.log(Status.PASS,"Successfully "+strLocatorName + " element  is Visible.");
					log.info("Successfully "+strLocatorName + " element  is Visible.");	
				}

		}
	}
	
	/****************************************************************************************************************************
	 * Function Name		:	gf_WaitForVisibilityOfElement
	 * Description			:	This method wait Selenium until visibility of Elements on WebPage.
	 *  Parameters			:	WebElement,Locator,Time
	****************************************************************************************************************************/
	
	public static boolean gf_WaitForVisibilityOfElement(WebElement objLocator, String strLocatorName,long lTime) throws Throwable{
		boolean blnFlag = false;
		try{
			WebDriverWait objWait = new WebDriverWait(driver, lTime);
			objWait.until(ExpectedConditions.visibilityOf(objLocator));
			blnFlag = true;
			return blnFlag;
		}
		catch(Exception e)
		{
			//logger.log(Status.FAIL, e.getMessage());
			log.info(e.getMessage());
			return blnFlag;
		}
		finally
		{
			
				if(!blnFlag) {
					logger.log(Status.FAIL,strLocatorName+ "element  is not Visible.");
					log.info(strLocatorName+ "element  is not Visible.");	
				}
				else if(blnFlag) {
					logger.log(Status.PASS,"Successfully "+strLocatorName + " element  is Visible.");
					log.info("Successfully "+strLocatorName + " element  is Visible.");	
				}

		}
	}

	public static boolean gf_WaitForInVisibilityOfElement(WebElement objLocator, String strLocatorName) throws Throwable{
		boolean blnFlag = false;
		try{
			WebDriverWait objWait = new WebDriverWait(driver, 60);
			objWait.until(ExpectedConditions.invisibilityOf(objLocator));
			blnFlag = true;
			return blnFlag;
		}
		catch(Exception e)
		{
			//logger.log(Status.FAIL, e.getMessage());
			log.info(e.getMessage());
			return blnFlag;
		}
		finally
		{
			
				if(!blnFlag) {
					logger.log(Status.FAIL,strLocatorName+ "element  is  Visible.");
					log.info(strLocatorName+ "element  is  Visible.");	
				}
				else if(blnFlag) {
					logger.log(Status.PASS,"Successfully "+strLocatorName + " element  is Not Visible.");
					log.info(strLocatorName + " element  is Not Visible.");	
				}

		}
	}
	
	/****************************************************************************************************************************
	 * Function Name		:	gf_ElementtobeClickable
	 * Description			:	This method wait selenium until Elements to be Clickable on WebPage.
	****************************************************************************************************************************/
	

	public static boolean gf_ElementtobeClickable(WebElement objLocator, String strLocatorName) throws Throwable{
		boolean blnFlag = false;
		try{
			WebDriverWait objWait = new WebDriverWait(driver, 20);
			objWait.until(ExpectedConditions.elementToBeClickable(objLocator));
			blnFlag = true;
			return blnFlag;
		}
		catch(Exception e)
		{
			//logger.log(Status.FAIL, e.getMessage());
			log.info(e.getMessage());
			return blnFlag;
		}
		finally
		{
			
				if(!blnFlag) {
					logger.log(Status.FAIL,strLocatorName+ "element  is not Clickable.");
					log.info(strLocatorName+ "element  is not Clickable.");
				}
				else if(blnFlag) {
					logger.log(Status.PASS,"Successfully "+strLocatorName + " element  is Clickable.");
					log.info("Successfully "+strLocatorName + " element  is Clickable.");
				}

		}
	}


	/****************************************************************************************************************************
	 * Function Name		:	gf_ElementtobeClickable
	 * Description			:	This method wait selenium until Elements to be Clickable on WebPage.
	 * Parameters			:	WebElement,Locator,Time
	****************************************************************************************************************************/
	
	public static boolean gf_ElementtobeClickable(WebElement objLocator, String strLocatorName,long lTime) throws Throwable{
		boolean blnFlag = false;
		try{
			WebDriverWait objWait = new WebDriverWait(driver, lTime);
			objWait.until(ExpectedConditions.elementToBeClickable(objLocator));
			blnFlag = true;
			return blnFlag;
		}
		catch(Exception e)
		{
			//logger.log(Status.FAIL, e.getMessage());
			log.info(e.getMessage());
			return blnFlag;
		}
		finally
		{
			
				if(!blnFlag) {
					logger.log(Status.FAIL,strLocatorName+ "element  is not Clickable.");
					log.info(strLocatorName+ "element  is not Clickable.");
				}
				else if(blnFlag) {
					logger.log(Status.PASS,"Successfully "+strLocatorName + " element  is Clickable.");
					log.info("Successfully "+strLocatorName + " element  is Clickable.");
				}

		}
	}



	/****************************************************************************************************************************
	 * Function Name		:	gf_IsElementNotVisibile
	 * Description			:	This method wait selenium until visibility of Elements on WebPage.
	****************************************************************************************************************************/
	

	public static boolean gf_IsElementNotVisibile(WebElement objLocator, String strLocatorName) throws Throwable{
		boolean blnFlag = true;
		try{
			WebDriverWait objWait = new WebDriverWait(driver, 2);
			objWait.until(ExpectedConditions.visibilityOf(objLocator));
			blnFlag = false;
			return blnFlag;
		}
		catch(Exception e)
		{
			//logger.log(Status.FAIL, e.getMessage());
			log.info(e.getMessage());
			return blnFlag;
		}
		finally
		{
			if(!blnFlag) {
					logger.log(Status.PASS,strLocatorName+ "element  is not Visible.");
					log.info(strLocatorName+ "element  is not Visible.");		
			}
				else if(blnFlag) {
					logger.log(Status.FAIL,"Successfully "+strLocatorName+ "element  is Visible.");
					log.info("Successfully "+strLocatorName+ "element  is Visible.");	
				}

		}
	}

	/****************************************************************************************************************************
	 * Function Name		:	gf_IsElementPresent
	 * Description			:	This method returns check existence of element.
	****************************************************************************************************************************/
	

	public static boolean gf_IsElementPresent(WebElement objLocator,String strDesc) throws Throwable 
	{
		boolean blnFlag = false;
		try 
		{			
			objLocator.isDisplayed();
			blnFlag=true;
			return blnFlag;
		} catch (NoSuchElementException e) {
			//logger.log(Status.FAIL, e.getMessage());
			log.info(e.getMessage());
			return blnFlag;
		}
		finally
		{ 
			if(!blnFlag) {
				logger.log(Status.FAIL, strDesc +" is not present");
				log.info(strDesc +" is not present");	
			}
			else if(blnFlag) {
				logger.log(Status.PASS,"Successfully "+strDesc+ "element  is present");
				log.info("Successfully "+strDesc+ "element  is present");	
			}
		}

	}		


	/****************************************************************************************************************************
	 * Function Name		:	gf_IsElementToBeClickable
	 * Description			:	This method wait selenium until Elements to be Clickable on WebPage.
	****************************************************************************************************************************/
	

	public static boolean gf_IsElementToBeClickable(WebElement objLocator, String strLocatorName) throws Throwable{
		boolean blnFlag = false;
		try{
			WebDriverWait objWait = new WebDriverWait(driver, 60);
			objWait.until(ExpectedConditions.elementToBeClickable(objLocator));
			blnFlag = true;
			return blnFlag;
		}
		catch(Exception e)
		{
			//logger.log(Status.FAIL, e.getMessage());
			log.info(e.getMessage());
			return blnFlag;
		}
		finally
		{
			if(!blnFlag) {
				logger.log(Status.FAIL,"Element is not clickable. ");
				log.info("Element is not clickable.");
			}
			else if(blnFlag) {
				logger.log(Status.PASS,strLocatorName+" Element is clickable");
				log.info(strLocatorName+" Element is clickable");	
			}
		}
	}

	

	/****************************************************************************************************************************
	 * Function Name		:	gf_SwitchWindowByTitle
	 * Description			:	This method is used to Switch window using window index
	****************************************************************************************************************************/
	

	public static boolean gf_SwitchWindowById(int intCount) throws Throwable 
	{
		boolean blnFlag = false;
		try {
			Set<String> windowList = driver.getWindowHandles();
			//int windowCount = windowList.size();

			String[] array = windowList.toArray(new String[0]);

			//for (int i = 0; i <=windowCount; i++) {

				driver.switchTo().window(array[intCount-1]);
				//if (driver.getTitle().contains(strWindowTitle))
				//{
					blnFlag = true;
					return blnFlag;
				//}
			//}
			//return blnFlag;
		} catch (Exception e) {
			//logger.log(Status.FAIL, e.getMessage());
			log.info(e.getMessage());
			return blnFlag;
		}
		finally
		{
			if(!blnFlag) {
				logger.log(Status.FAIL,"Failed to switch between windows by title");
				log.info("Failed to switch between windows by title");}
			else if(blnFlag) {
				logger.log(Status.PASS,"Succeessfully switched to window");
				log.info("Succeessfully switched to window");
				}
		}
	}

	/****************************************************************************************************************************
	 * Function Name		:	gf_SwitchToFrameByIndex
	 * Description			:	This method switch the  frame using frame index
	****************************************************************************************************************************/
	

	public static boolean gf_SwitchToFrameByIndex(int intIndex) throws Throwable
	{   
		boolean blnFlag=false;
		try
		{
			driver.switchTo().frame(intIndex);
			blnFlag=true;
			return blnFlag;
		}
		catch(Exception e)
		{
			//logger.log(Status.FAIL, e.getMessage());
			log.info(e.getMessage());
			return blnFlag;
		}
		finally
		{
			if(!blnFlag) {
				logger.log(Status.FAIL,"Failed to switch between windows");
				log.info("Failed to switch between windows");
			}
			else if(blnFlag)
				logger.log(Status.PASS,"Succeessfully switched to window");
			    log.info("Succeessfully switched to window");
		}
	}
	
	

	/****************************************************************************************************************************
	 * Function Name		:	gf_GetTextvalue
	 * Description			:	This method is used to get the Text Value with Object Name
	****************************************************************************************************************************/
	

	
	
	public static String gf_GetTextvalue(WebElement objlocator)
			throws Throwable {
		String text =objlocator.getText();
		return text;
		}
		

	/****************************************************************************************************************************
	 * Function Name		:	gf_GetText
	 * Description			:	This method is used to get the Text Value with Object Name and Locator Name
	****************************************************************************************************************************/
	


	public static String gf_GetText(WebElement objlocator,String locatorName)
			throws Throwable {
		String text = "";
		if (gf_WaitForVisibilityOfElement(objlocator,locatorName)) {
			text = objlocator.getText();
		}
		return text;
	}

	/****************************************************************************************************************************
	 * Function Name		:	gf_VerifyText
	 * Description			:	Validate text 
	****************************************************************************************************************************/
	


public static boolean gf_VerifyText(WebElement objLocator, String strText,String strLocatorName) throws Throwable {
		boolean blnFlag = false;
		try {
			String vtxt=gf_GetText(objLocator, strLocatorName).trim();		
			if(vtxt.equals(strText.trim()))
				blnFlag = true;
			return blnFlag;
		} catch (Exception e) {
			//logger.log(Status.FAIL, e.getMessage());
			log.info(e.getMessage());
			return blnFlag;
		}
		finally
		{
			if(!blnFlag) {
				logger.log(Status.FAIL,strText +" is not present and Failed to verify.");
				log.info(strText +" is not present and Failed to verify.");
			}
			else if(blnEventReport && blnFlag) {
				logger.log(Status.PASS,"Successfully "+strText+" text is present and Successfully verified.");
				log.info("Successfully "+strText+" text is present and Successfully verified.");
			}
		}
	}

/****************************************************************************************************************************
 * Function Name		:	gf_IsTextPresent
 * Description			:	Text present or not.
****************************************************************************************************************************/


public static boolean  gf_IsTextPresent(String strText) throws Throwable {
	boolean blnFlag = false;
	try {
		Thread.sleep(lSleep_Low);
		blnFlag = driver.getPageSource().contains(strText);
		return blnFlag;
	} catch (Exception e) {
		//logger.log(Status.FAIL, e.getMessage());
		log.info(e.getMessage());
		return blnFlag;
	}
	finally
	{

		if(!blnFlag) {
			logger.log(Status.FAIL,strText +" is not present and Failed to verify.");
			log.info(strText +" is not present and Failed to verify.");
		}
		else if(blnEventReport && blnFlag) {
			logger.log(Status.PASS,"Successfully "+strText+" text is present and Successfully verified.");
			log.info(strText+" text is present and Successfully verified.");	
		}
	}
}


/****************************************************************************************************************************
 * Function Name		:	gf_ClickAndWaitForElementPresent
 * Description			:	This method Click on element and wait for an element
****************************************************************************************************************************/


public static boolean gf_ClickAndWaitForElementPresent(WebElement objLocator, WebElement objWaitElement, String strLocatorName,String strwaitelementName) throws Throwable 

{
	boolean blnFlag = false;
	try
	{
		gf_Click(objLocator, strLocatorName);
		gf_WaitForElementPresent(objWaitElement );
		blnFlag = true;
		return blnFlag;
	}
	catch(Exception e)
	{
		//logger.log(Status.FAIL, e.getMessage());
		log.info(e.getMessage());
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			logger.log(Status.FAIL,strwaitelementName+" Element is not present");
			log.info(strwaitelementName+" Element is not present");
		}
		else if(blnFlag) {
			logger.log(Status.PASS,strwaitelementName+" Element is present");
			log.info(strwaitelementName+" Element is present");
		}
	}
}


/****************************************************************************************************************************
 * Function Name		:	gf_AssertElementvisible
 * Description			:	This method Assert Element Visibility on We page
****************************************************************************************************************************/


public static boolean gf_AssertElementvisible(WebElement objLocator,String strLocatorName) throws Throwable {
	boolean blnFlag = false;
	try {
		Assert.assertTrue(gf_WaitForVisibilityOfElement(objLocator,strLocatorName));
		blnFlag = true;
		return blnFlag;
	} catch (Exception e) {
		//logger.log(Status.FAIL, e.getMessage());
		log.info(e.getMessage());
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			logger.log(Status.FAIL,"Failed to Assert");
			log.info("Failed to Assert");
		}
		else if(blnFlag) {
			logger.log(Status.PASS, "Successfully Asserted.");
			log.info("Successfully Asserted.");
			}
	}
}


/****************************************************************************************************************************
 * Function Name		:	gf_AssertElementPresent
 * Description			:	This method Assert Element Present on We page
****************************************************************************************************************************/


public static boolean gf_AssertElementPresent(WebElement objLocator,String strLocatorName) throws Throwable {
	boolean blnFlag = false;
	try {
		Assert.assertTrue(gf_IsElementPresent(objLocator,strLocatorName));
		blnFlag = true;
		return blnFlag;
	} catch (Exception e) {
		//logger.log(Status.FAIL, e.getMessage());
		log.info(e.getMessage());
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			logger.log(Status.FAIL,"Assert "+strLocatorName+" element is not present.");
			log.info(strLocatorName+" element is not present.");}
		else if(blnFlag) {
			logger.log(Status.PASS,"Assert Successfully "+strLocatorName+" element is present.");
			log.info(strLocatorName+" element is present.");	
		}
	}
}


/****************************************************************************************************************************
 * Function Name		:	gf_AssertText
 * Description			:	This method Assert Text Value in Webpage
****************************************************************************************************************************/


public static boolean gf_AssertText(WebElement objLocator, String strText) throws Throwable {
	boolean blnFlag = false;
	try {
		Assert.assertEquals(gf_GetText(objLocator, strText).trim(), strText.trim());
		blnFlag = true;
		return blnFlag;
	} catch (Exception e) {
		//logger.log(Status.FAIL, e.getMessage());
		log.info(e.getMessage());
		
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			logger.log(Status.FAIL,"Assert "+strText+" text not present.");
			 log.info(strText+" text not present.");
			 }
		else if(blnFlag)
		{
			logger.log(Status.PASS,"Assert Successfully "+strText+" text is present.");
			 log.info(strText+" text is present.");
		}
	}
}


/****************************************************************************************************************************
 * Function Name		:	gf_switchToParentFrame()
 * Description			:	This method is used to Switch to Parent frame
****************************************************************************************************************************/


public static void gf_switchToParentFrame() throws InterruptedException {
    driver.switchTo().defaultContent();
    Thread.sleep(lSleep_Medium);
  }

/****************************************************************************************************************************
 * Function Name		:	driverwait()
 * Description			:	Waits for certain time.
****************************************************************************************************************************/


public static WebDriverWait driverwait(){

	WebDriverWait wait = new WebDriverWait(driver, 30);
	return wait;
}



/****************************************************************************************************************************
 * Function Name		:	gf_Click()
 * Description			:	This method is used to click on button,links...
****************************************************************************************************************************/


public static boolean gf_AssertInVisibilityOfElement(WebElement objLocator,String strLocatorName) throws Throwable {
	boolean blnFlag = false;
	try {
		Assert.assertTrue(gf_WaitForInVisibilityOfElement(objLocator,strLocatorName));
		
		blnFlag = true;
		return blnFlag;
	} catch (Exception e) {
		//logger.log(Status.FAIL, e.getMessage());
		log.info(e.getMessage());
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			logger.log(Status.FAIL,"Failed to Assert");
		     log.info("Failed to Assert");	}
		else if(blnFlag) {
			logger.log(Status.PASS, "Successfully Asserted.");
			log.info("Successfully Asserted.");
		}
	}
}

public static boolean gf_AssertElementDisplayed(WebElement objLocator,String strLocatorName) throws Throwable {
	boolean blnFlag = false;
	try {
		Assert.assertTrue(gf_WaitForVisibilityOfElement(objLocator,strLocatorName));
		Assert.assertTrue(gf_ElementtobeClickable(objLocator,strLocatorName));
		blnFlag = true;
		return blnFlag;
	} catch (Exception e) {
		//logger.log(Status.FAIL, e.getMessage());
		log.info(e.getMessage());
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			logger.log(Status.FAIL,"Failed to Assert");
			 log.info("Failed to Assert");	
		}
		else if(blnFlag) {
			logger.log(Status.PASS, "Successfully Asserted.");
			 log.info("Successfully Asserted.");
		}
	}
}





/****************************************************************************************************************************
 * Function Name		:	gf_verifyBrokenlink
 * Description			:	This method is used to verify broken links
****************************************************************************************************************************/



public static void gf_verifyBrokenlink(String links) throws IOException
{
	URL url=new URL(links);
	HttpURLConnection httpurlconnections=(HttpURLConnection) url.openConnection();
	httpurlconnections.setConnectTimeout(5000);
	httpurlconnections.connect();
	if(httpurlconnections.getResponseCode()>=400)
	{
		logger.log(Status.FAIL, links + httpurlconnections.getResponseCode() +  httpurlconnections.getResponseMessage() +" is broken");
	}
	else
	{
		logger.log(Status.PASS, links + httpurlconnections.getResponseMessage() );
	}
	
}



/****************************************************************************************************************************
 * Function Name		:	gf_Click()
 * Description			:	This method is used to click on button,links...
****************************************************************************************************************************/


public static boolean  verifyStatusoflink(String links) throws IOException
{
	boolean blnflag=false;
	try {
	URL url=new URL(links);
	HttpURLConnection httpurlconnections=(HttpURLConnection) url.openConnection();
	httpurlconnections.setConnectTimeout(5000);
	httpurlconnections.connect();
	if(httpurlconnections.getResponseCode()>=400)
	{
		return blnflag;
	}
	else
	{
		blnflag=true;
		return blnflag;
	}
}
	catch(Exception e)
	{
		//logger.log(Status.FAIL, e.getMessage());
		log.info(e.getMessage());
		return blnflag;
	}
	
	
	
	
}


/****************************************************************************************************************************
 * Function Name		:	gf_WaitForVisibilityOfloaderImage
 * Description			:	This method is used to click on button,links...
****************************************************************************************************************************/


public static boolean gf_WaitForVisibilityOfloaderImage(WebElement objLocator, String strLocatorName) throws Throwable{
	boolean blnFlag = false;
	try{
		objLocator.isDisplayed();
		blnFlag = true;
		return blnFlag;
	}
	catch(Exception e)
	{
		//logger.log(Status.FAIL, e.getMessage());
		return blnFlag;
	}
	
}



/****************************************************************************************************************************
 * Function Name		:	gf_WaitForElementdisplayed
 * Description			:	This method is wait using iterations
****************************************************************************************************************************/



public static boolean gf_WaitForElementdisplayed(WebElement objLocator) throws Throwable 
{
	boolean blnFlag = false;
	try
	{
		for (int i = 0; i <=4; i++) 
		{
			boolean value=objLocator.isDisplayed();
			Thread.sleep(1000);
			if (value) 
			{
			blnFlag = true;
			break;
			}
			
		}
		
		return blnFlag;
	} 
	catch (Exception e) 
	{
		log.info(e.getMessage());
		//System.out.println(e.getMessage());
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			logger.log(Status.FAIL,"Element not present.");
		    log.info("Element not present.");}
		else if(blnFlag) {
			logger.log(Status.PASS,"Element present" );
			log.info("Element present");}
	}
}

public static boolean gf_AssertElementpresent(WebElement objLocator,String strLocatorName,int count,long milliseconds) throws Throwable {
	boolean blnFlag = false;
	try {
		Assert.assertTrue(gf_WaitForElementPresent(objLocator,strLocatorName,count,milliseconds));
		
		blnFlag = true;
		return blnFlag;
	} catch (Exception e) {
		//logger.log(Status.FAIL, e.getMessage());
		log.info(e.getMessage());
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			
		    log.info("Failed to Assert");}
		else if(blnFlag)
		{
			log.info("Successfully Asserted.");
			
		}
	}
}

public static boolean gf_AssertElementenabled(WebElement objLocator,String strLocatorName,int count,long milliseconds) throws Throwable {
	boolean blnFlag = false;
	try {
		Assert.assertTrue(gf_WaitForElementIsEnabled(objLocator,strLocatorName,count,milliseconds));
		
		blnFlag = true;
		return blnFlag;
	} catch (Exception e) {
		//logger.log(Status.FAIL, e.getMessage());
		log.info(e.getMessage());
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			
		    log.info("Failed to Assert");}
		else if(blnFlag)
		{
			log.info("Successfully Asserted.");
			
		}
	}
}

public static void scrollToViewTillElement(WebElement element) {
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
}

/****************************************************************************************************************************
 * Function Name		:	gf_WaitForElementdisplayed specfic to breville
 * Description			:	This method is wait using iterations
****************************************************************************************************************************/

public static boolean gf_verifyVisibilityOfElement(WebElement objLocator, String strLocatorName) throws Throwable{
	boolean blnFlag = false;
	try{
		WebDriverWait objWait = new WebDriverWait(driver, 5);
		objWait.until(ExpectedConditions.visibilityOf(objLocator));
		blnFlag = true;
		return blnFlag;
	}
	catch(Exception e)
	{     log.info(e.getMessage());
		//logger.log(Status.FAIL, e.getMessage());
		return blnFlag;
	}
	finally
	{
		
			if(!blnFlag)
			{ log.info(strLocatorName+ "element  is not Visible.");
				logger.log(Status.INFO,strLocatorName+ "element  is not Visible.");}
			else if(blnFlag) {
				log.info("Successfully "+strLocatorName + " element  is Visible.");
				logger.log(Status.PASS,"Successfully "+strLocatorName + " element  is Visible.");}

	}
}
/****************************************************************************************************************************
 * Function Name		:	gf_WaitForElementPresent
 * Description			:	Wait for an ElementPresent
 * Parameters           :   Webelement,Locator Name,count to iterate,milliseconds to wait
****************************************************************************************************************************/


public static boolean gf_WaitForElementPresent(WebElement objLocator,String strLocatorName,int count,long milliseconds) throws Throwable 
{
	boolean blnFlag = false;
	try
	{
		for (int i = 0; i <count; i++) 
		{
			hardWait(milliseconds);
			boolean value=(objLocator.isDisplayed());
			if (value) {
				blnFlag = true;
				break;}
			
				
		}
			
		return blnFlag;
	} 
	catch (Exception e) 
	{
		//logger.log(Status.FAIL, e.getMessage());
		log.info(e.getMessage());
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			
		log.info(strLocatorName +"Element not present.");
		logger.log(Status.INFO,strLocatorName +"Element not present.");
		}
		else if(blnFlag) {
			logger.log(Status.PASS,strLocatorName +"Element present" );
		log.info(strLocatorName +"Element present");}
	}
}


/****************************************************************************************************************************
 * Function Name		:	gf_WaitForElementIsEnabled
 * Description			:	Wait for an WaitForElementIsEnabled
 * Parameters           :   Webelement,Locator Name,count to iterate,milliseconds to wait
****************************************************************************************************************************/


public static boolean gf_WaitForElementIsEnabled(WebElement objLocator,String strLocatorName,int count,long milliseconds) throws Throwable 
{
	boolean blnFlag = false;
	try
	{
		for (int i = 0; i <count; i++) 
		{
			hardWait(milliseconds);
			boolean value=objLocator.isEnabled();
			if (value) {
				blnFlag = true;
				break;}
			
		}
					
		return blnFlag;
	} 
	catch (Exception e) 
	{
		//logger.log(Status.FAIL, e.getMessage());
		log.info(e.getMessage());
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			
		log.info(strLocatorName +"Element is not Enabled.");
		logger.log(Status.INFO,strLocatorName +"Element is not Enabled.");
		}
		else if(blnFlag) {
			logger.log(Status.PASS,strLocatorName +"Element is Enabled" );
		log.info(strLocatorName +"Element is Enabled");}
	}
}

/****************************************************************************************************************************
 * Function Name		:	Hardwait
 
 ****************************************************************************************************************************/
public static void hardWait(long milliSeconds) {
try {
	Thread.sleep(milliSeconds);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

public static boolean gf_AssertElementDisplayed(WebElement objLocator,String strLocatorName,long ltime) throws Throwable {
	boolean blnFlag = false;
	try {
		Assert.assertTrue(gf_WaitForVisibilityOfElement(objLocator,strLocatorName,ltime));
		Assert.assertTrue(gf_ElementtobeClickable(objLocator,strLocatorName,ltime));
		blnFlag = true;
		return blnFlag;
	} catch (Exception e) {
		//logger.log(Status.FAIL, e.getMessage());
		log.info(e.getMessage());
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			logger.log(Status.FAIL,"Failed to Assert");
			 log.info("Failed to Assert");	
		}
		else if(blnFlag) {
			logger.log(Status.PASS, "Successfully Asserted.");
			 log.info("Successfully Asserted.");
		}
	}
}


public static boolean gf_deletevaluesfromList(List<WebElement> objLocator, String stringName,int index) throws Throwable 
{
	boolean blnFlag = false;
	try {
		for(int i=index;i<objLocator.size();i++) {
			 objLocator.get(index).click();
			blnFlag=true;
			break;
			 
		}
		return blnFlag;
		
	}
	catch(Exception e)
	{
		//logger.log(Status.FAIL, e.getMessage());
		log.info(e.getMessage());
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			
			logger.log(Status.FAIL,"Failed to Click the" +stringName+" from the List.");
			log.info("Failed to Click the" +stringName+" from the List.");	
		}
		else if(blnFlag) {
			logger.log(Status.PASS,"Successfully Clicked on "+stringName+" from the List.");
			log.info("Successfully Clicked on "+stringName+" from the List.");}
	}
	
}
/************************************Updated by D NaveenKumar ****on 13-01-2022***************************************************/

/****************************************************************************************************************************
 * Function Name		:	Generic method
 
****************************************************************************************************************************/

public static ExpectedCondition<Boolean> elementIsDisplayed(WebElement element)
{
	return new ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driver) {
		boolean blnflag=false;
		try{
			if(element.isDisplayed()) {
				blnflag=true;
			}
		}
		catch(Exception e)
		{
			
		}
		return blnflag;
	}


};
}
/****************************************************************************************************************************
 * Function Name		:	Generic method
 
****************************************************************************************************************************/

public static ExpectedCondition<Boolean> elementIsEnabled(WebElement element)
{
	return new ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driver) {
		boolean blnflag=false;
		try{
			if(element.isEnabled()) {
				blnflag=true;
				return blnflag;
			}
		}
		catch(Exception e)
		{
			
			
		}
		return blnflag;
	}


};
}



/****************************************************************************************************************************
 * Function Name		:	Generic method
 
****************************************************************************************************************************/



public static boolean gf_verifyVisibilityOfElement(WebElement objLocator,long timeinseconds) throws Throwable{
	boolean blnFlag = false;
	try{
		WebDriverWait objWait = new WebDriverWait(driver, timeinseconds);
		objWait.until(ExpectedConditions.visibilityOf(objLocator));
		blnFlag = true;
		return blnFlag;
	}
	catch(Exception e)
	{     log.info(e.getMessage());
		
		return blnFlag;
	}
}

/****************************************************************************************************************************
 * Function Name		:Generic method
 
****************************************************************************************************************************/
public static boolean gf_elementTobeClickable(WebElement objLocator,long timeinseconds) throws Throwable{
	boolean blnFlag = false;
	try{
		WebDriverWait objWait = new WebDriverWait(driver, timeinseconds);
		objWait.until(ExpectedConditions.elementToBeClickable(objLocator));
		blnFlag = true;
		return blnFlag;
	}
	catch(Exception e)
	{     log.info(e.getMessage());
		
		return blnFlag;
	}
}
/****************************************************************************************************************************
 * Function Name		:	Generic method
 
****************************************************************************************************************************/

public static boolean gf_invisibleOfElement (WebElement objLocator,long timeinseconds) throws Throwable{
	boolean blnFlag = false;
	try{
		WebDriverWait objWait = new WebDriverWait(driver, timeinseconds);
		objWait.until(ExpectedConditions.invisibilityOf(objLocator));
		blnFlag = true;
		return blnFlag;
	}
	catch(Exception e)
	{     log.info(e.getMessage());
		
		return blnFlag;
	}
}
/****************************************************************************************************************************
 * Function Name		:	Generic method
 
****************************************************************************************************************************/

public static boolean gf_IsElementDisplayed(WebElement objLocator,long timeinseconds) throws Throwable{
	boolean blnFlag = false;
	try{
		WebDriverWait objWait = new WebDriverWait(driver,timeinseconds);
		objWait.until(elementIsDisplayed(objLocator));
		blnFlag = true;
		return blnFlag;
	}
	catch(Exception e)
	{     log.info(e.getMessage());
		
		return blnFlag;
	}
	
}

/****************************************************************************************************************************
 * Function Name		:	Genericmethod
 
****************************************************************************************************************************/
public static boolean gf_IsElementEnabled(WebElement objLocator,long timeinseconds) throws Throwable{
	boolean blnFlag = false;
	try{
		WebDriverWait objWait = new WebDriverWait(driver,timeinseconds);
		objWait.until(elementIsEnabled(objLocator));
		blnFlag = true;
		return blnFlag;
	}
	catch(Exception e)
	{     log.info(e.getMessage());
		
		return blnFlag;
	}
	
}

/****************************************************************************************************************************
 * Function Name		:	gf_WaitForElementToBeClickable()
 * Description			:	This method is used for Element is Clickable
****************************************************************************************************************************/

public static boolean gf_WaitForElementToBeClickable(WebElement objLocator,String strLocatorName,int loopcount,long timeinseconds) throws Throwable 
{
	boolean blnFlag = false;
	try
	{
		for (int i = 0; i <loopcount; i++) 
		{
			
			boolean value=gf_elementTobeClickable(objLocator,timeinseconds);
			if (value) {
				blnFlag = true;
				break;}
					
		}
			
		return blnFlag;
	} 
	catch (Exception e) 
	{
		
		log.info(e.getMessage());
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			
		log.info(strLocatorName +"Element not is clickable.");
		logger.log(Status.INFO,strLocatorName +"Element not is clickable.");
		}
		else if(blnFlag) {
			logger.log(Status.PASS,strLocatorName +"Element is clickable." );
		log.info(strLocatorName +"Element is clickable.");}
	}
}
/****************************************************************************************************************************
 * Function Name		:	gf_WaitForVisiblityofElement()
 * Description			:	This method is used for Element is Visiblity
****************************************************************************************************************************/

public static boolean gf_WaitForVisiblityofElement(WebElement objLocator,String strLocatorName,int loopcount,long timeinseconds) throws Throwable 
{
	boolean blnFlag = false;
	try
	{
		for (int i = 0; i <loopcount; i++) 
		{
			
			boolean value=gf_verifyVisibilityOfElement(objLocator,timeinseconds);
			if (value) {
				blnFlag = true;
				break;}
					
		}
			
		return blnFlag;
	} 
	catch (Exception e) 
	{
		
		log.info(e.getMessage());
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			
		log.info(strLocatorName +"Element not is not displayed.");
		logger.log(Status.INFO,strLocatorName +"Element not is not displayed.");
		}
		else if(blnFlag) {
			logger.log(Status.PASS,strLocatorName +"Element is displayed." );
		log.info(strLocatorName +"Element is displayed.");}
	}
}

/****************************************************************************************************************************
 * Function Name		:	gf_WaitForInVisiblityofElement()
 * Description			:	This method is used for Element is Invisble
****************************************************************************************************************************/
public static boolean gf_WaitForInVisiblityofElement(WebElement objLocator,String strLocatorName,int loopcount,long timeinseconds) throws Throwable 
{
	boolean blnFlag = false;
	try
	{
		for (int i = 0; i <loopcount; i++) 
		{
			
			boolean value=gf_invisibleOfElement(objLocator,timeinseconds);
			if (value) {
				blnFlag = true;
				break;}
					
		}
			
		return blnFlag;
	} 
	catch (Exception e) 
	{
		
		log.info(e.getMessage());
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			
		log.info(strLocatorName +"Element is displayed.");
		logger.log(Status.INFO,strLocatorName +"Element is displayed.");
		}
		else if(blnFlag) {
			logger.log(Status.PASS,strLocatorName +"Element is not displaying." );
		log.info(strLocatorName +"Element is not displaying.");}
	}
}


/****************************************************************************************************************************
 * Function Name		:	gf_WaitForElementtoPresent()
 * Description			:	This method is used for Element is displayed
****************************************************************************************************************************/


public static boolean gf_WaitForElementtoPresent(WebElement objLocator,String strLocatorName,int loopcount,long timeinseconds) throws Throwable 
{
	boolean blnFlag = false;
	try
	{
		for (int i = 0; i <loopcount; i++) 
		{
			
			boolean value=gf_IsElementDisplayed(objLocator,timeinseconds);
			if (value) {
				blnFlag = true;
				break;}
					
		}
			
		return blnFlag;
	} 
	catch (Exception e) 
	{
		
		log.info(e.getMessage());
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			
		log.info(strLocatorName +"Element  is not Present.");
		logger.log(Status.INFO,strLocatorName +"Element  is not Present.");
		}
		else if(blnFlag) {
			logger.log(Status.PASS,strLocatorName +"Element is Present." );
		log.info(strLocatorName +"Element is Present.");}
	}
}

/****************************************************************************************************************************
 * Function Name		:	gf_WaitForElementtoEnabled()
 * Description			:	This method is used for Element is Enabled
****************************************************************************************************************************/

public static boolean gf_WaitForElementtoEnabled(WebElement objLocator,String strLocatorName,int loopcount,long timeinseconds) throws Throwable 
{
	boolean blnFlag = false;
	try
	{
		for (int i = 0; i <loopcount; i++) 
		{
			
			boolean value=gf_IsElementEnabled(objLocator,timeinseconds);
			if (value) {
				blnFlag = true;
				break;}
					
		}
			
		return blnFlag;
	} 
	catch (Exception e) 
	{
		
		log.info(e.getMessage());
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			
		log.info(strLocatorName +"Element  is not Enabled.");
		logger.log(Status.INFO,strLocatorName +"Element  is not Enabled.");
		}
		else if(blnFlag) {
			logger.log(Status.PASS,strLocatorName +"Element is Enabled." );
		log.info(strLocatorName +"Element is Enabled.");}
	}
}

/****************************************************************************************************************************
 * Function Name		:	gf_VerifyelementDisplayedinlist()
 * Description			:	This method is used for Elements displayed in set of weblements
****************************************************************************************************************************/

public static boolean gf_VerifyelementDisplayedinlist(List<WebElement> objLocator,String strLocatorName,int loopcount,long timeinseconds) throws Throwable 
{
	boolean blnFlag = false;
	try {
		
		
		for(int i=0;i<objLocator.size();i++)
		{
			String value=objLocator.get(i).getText().trim();
			
		if(value.contains(strLocatorName.trim()))
			
			{
			 
			boolean values=gf_IsElementDisplayed( objLocator.get(i),timeinseconds);
			for (int l = 0; l <loopcount; l++) 
			{
			if(values)
			{
				blnFlag=true;
				break;
			}
		     }
			}
		}
		return blnFlag;
	  }
	catch(Exception e)
	{
		//logger.log(Status.FAIL, e.getMessage());
		log.info(e.getMessage());
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			
			logger.log(Status.FAIL,strLocatorName +" is not displaying in the List.");
			log.info(strLocatorName +" is not displaying in the List.");	
		}
		else if(blnFlag) {
			logger.log(Status.PASS,strLocatorName +" is  displaying in the List.");
			log.info(strLocatorName +" is  displaying in the List.");}
	}
	
}


/****************************************************************************************************************************
 * Function Name		:	gf_AssertWaitForElementDisplayed()
 * Description			:	This method is used to Assert Elements Visible and Enabled
****************************************************************************************************************************/


public static boolean gf_AssertWaitForElementDisplayed(WebElement objLocator,String strLocatorName,int loopcount,long timeinseconds) throws Throwable {
	boolean blnFlag = false;
	try {
		Assert.assertTrue(gf_WaitForVisiblityofElement(objLocator,strLocatorName,loopcount,timeinseconds));
		Assert.assertTrue(gf_WaitForElementtoEnabled(objLocator,strLocatorName,loopcount,timeinseconds));
		blnFlag = true;
		return blnFlag;
	} catch (Exception e) {
		//logger.log(Status.FAIL, e.getMessage());
		log.info(e.getMessage());
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			logger.log(Status.FAIL,"Failed to Assert");
			 log.info("Failed to Assert");	
		}
		else if(blnFlag) {
			logger.log(Status.PASS, "Successfully Asserted.");
			 log.info("Successfully Asserted.");
		}
	}
}

/****************************************************************************************************************************
 * Function Name		:	gf_AssertWaitForVisiblityofElement()
 * Description			:	This method is used to Assert Elements Visible
****************************************************************************************************************************/


public static boolean gf_AssertWaitForVisiblityofElement(WebElement objLocator,String strLocatorName,int loopcount,long timeinseconds) throws Throwable {
	boolean blnFlag = false;
	try {
		Assert.assertTrue(gf_WaitForVisiblityofElement(objLocator,strLocatorName,loopcount,timeinseconds));
		
		blnFlag = true;
		return blnFlag;
	} catch (Exception e) {
		//logger.log(Status.FAIL, e.getMessage());
		log.info(e.getMessage());
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			logger.log(Status.FAIL,"Failed to Assert");
			 log.info("Failed to Assert");	
		}
		else if(blnFlag) {
			logger.log(Status.PASS, "Successfully Asserted.");
			 log.info("Successfully Asserted.");
		}
	}
}

/****************************************************************************************************************************
 * Function Name		:	gf_AssertWaitForElementtoEnabled()
 * Description			:	This method is used to Assert Elements Enable
****************************************************************************************************************************/

public static boolean gf_AssertWaitForElementtoEnabled(WebElement objLocator,String strLocatorName,int loopcount,long timeinseconds) throws Throwable {
	boolean blnFlag = false;
	try {
		
		Assert.assertTrue(gf_WaitForElementtoEnabled(objLocator,strLocatorName,loopcount,timeinseconds));
		blnFlag = true;
		return blnFlag;
	} catch (Exception e) {
		//logger.log(Status.FAIL, e.getMessage());
		log.info(e.getMessage());
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			logger.log(Status.FAIL,"Failed to Assert");
			 log.info("Failed to Assert");	
		}
		else if(blnFlag) {
			logger.log(Status.PASS, "Successfully Asserted.");
			 log.info("Successfully Asserted.");
		}
	}
}

/****************************************************************************************************************************
 * Function Name		:	gf_AssertWaitForElementtoPresent()
 * Description			:	This method is used to Assert Elements Presence
****************************************************************************************************************************/

public static boolean gf_AssertWaitForElementtoPresent(WebElement objLocator,String strLocatorName,int loopcount,long timeinseconds) throws Throwable {
	boolean blnFlag = false;
	try {
		
		Assert.assertTrue(gf_WaitForElementtoPresent(objLocator,strLocatorName,loopcount,timeinseconds));
		blnFlag = true;
		return blnFlag;
	} catch (Exception e) {
		//logger.log(Status.FAIL, e.getMessage());
		log.info(e.getMessage());
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			logger.log(Status.FAIL,"Failed to Assert");
			 log.info("Failed to Assert");	
		}
		else if(blnFlag) {
			logger.log(Status.PASS, "Successfully Asserted.");
			 log.info("Successfully Asserted.");
		}
	}
}

/****************************************************************************************************************************
 * Function Name		:	gf_AssertWaitForElementToBeClickable()
 * Description			:	This method is used to Assert Clicklable events
****************************************************************************************************************************/



public static boolean gf_AssertWaitForElementToBeClickable(WebElement objLocator,String strLocatorName,int loopcount,long timeinseconds) throws Throwable {
	boolean blnFlag = false;
	try {
		
		Assert.assertTrue(gf_WaitForElementToBeClickable(objLocator,strLocatorName,loopcount,timeinseconds));
		blnFlag = true;
		return blnFlag;
	} catch (Exception e) {
		//logger.log(Status.FAIL, e.getMessage());
		log.info(e.getMessage());
		return blnFlag;
	}
	finally
	{
		if(!blnFlag) {
			logger.log(Status.FAIL,"Failed to Assert");
			 log.info("Failed to Assert");	
		}
		else if(blnFlag) {
			logger.log(Status.PASS, "Successfully Asserted.");
			 log.info("Successfully Asserted.");
		}
	}
}



}
