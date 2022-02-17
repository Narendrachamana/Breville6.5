package testscripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import accelerators.Actiondriver;
import objectrepository.BrevilleHomepage_OR;
import objectrepository.BrevilleMyDashboard_OR;

public class ResumeSubscription extends Actiondriver {
	
    public static BrevilleMyDashboard_OR brevilleMyDashoard;
    public static BrevilleHomepage_OR brevilleHome;

    @Test
	public void resumeSubscription(String data[]) throws Throwable
	{
    	logger.assignAuthor("pavan");
		brevilleMyDashoard = PageFactory.initElements(driver, BrevilleMyDashboard_OR.class);  
        brevilleHome = PageFactory.initElements(driver, BrevilleHomepage_OR.class);
        
        brevilleHome.clickonMyBreville();
        brevilleMyDashoard.clickonMySubscriptions();      
        brevilleMyDashoard.clickonEditSubscription();
        brevilleMyDashoard.clickonResumeSubscription();
	}
}
