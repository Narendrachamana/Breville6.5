package testscripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import accelerators.Actiondriver;
import objectrepository.BrevilleAddressDetailsPage_OR;
import objectrepository.BrevilleProduct_OR;

public class Sample {
	
	@Test(groups={"smoke"})
	public void test1()
	{
		System.out.println("Smoke");
	}
	@Test(groups={"smoke"})
	public void test2()
	{
		System.out.println("Smoke");
	}
	@Test(groups={"smoke"})
	public void test3()
	{
		System.out.println("Smoke");
	}
	@Test(dependsOnGroups = {"smoke"})
	public void test0()
	{
		System.out.println("main Smoke");
	}
}
