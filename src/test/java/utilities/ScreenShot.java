package utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;




public class ScreenShot {
	
	
	public static String TakeScreenShot(WebDriver driver,String screenshotName)
	{
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		 
		File source=ts.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"/Screenshots/"+screenshotName +DateUtil.Datetime()+".png";
		File des=new File(path);
		try 
		{
		FileUtils.copyFile(source, des);
		 
		
		} 
		catch (Exception e)
		{
		 
		System.out.println("Exception while taking screenshot "+e.getMessage());
		}
		return path; 
	}

}
