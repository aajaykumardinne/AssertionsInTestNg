package MyTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcases {
	
	// Revised
	
	//hard assertion : hard validation : if a hard assertion is getting failed -> immediately test case will be marked as failed and test cases will be terminated.
	//soft assertion : soft validation : if a soft assertion is getting failed ->  test cases will be marked as passed as well as next lines will be executed.
	//assertAll() :  solution for the soft assertion problem , to mark the test case as failed if any soft assertion is getting failed.
	
	SoftAssert softAssert  = new SoftAssert();
	
	
	@Test
	public void test1() {
		SoftAssert softAssert1  = new SoftAssert();
		System.out.println("Open Browser");
		Assert.assertEquals(true, true);	
		
		System.out.println("Enter Username");
		System.out.println("Enter password");
		System.out.println("Click on sign in button");
		Assert.assertEquals(true, true);
		
		System.out.println("Validate Home page");
		softAssert1.assertEquals(true, false, "home page title is missing"); // soft  assertion
		
		System.out.println("go to deals page");
		System.out.println("create a deal");
		softAssert1.assertEquals(true, false, "not able to create a deal"); // soft  assertion
		
		System.out.println("go to contacts page");
		System.out.println("create a contact");
		softAssert1.assertEquals(true, false , "not able  to create a contact"); // soft  assertion
		
		softAssert1.assertAll();
	}
	
	
	@Test
	public void test2() {
		SoftAssert softAssert2  = new SoftAssert();
		System.out.println("log out");
		
		softAssert2.assertEquals(true, false);
		softAssert2.assertAll();
		
	}
	
	@AfterClass
	public void tearDown() {
		
		
	}

}
