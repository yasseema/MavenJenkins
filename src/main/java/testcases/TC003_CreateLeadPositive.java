package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLeadPositive extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003";
		testCaseName = "TC003_CreateLead (Positive)";
		testDescription = "To create a Lead";
		category= "Sanity";
		authors	="Yasmine";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void loginPage(String userName, String passWord, String compName, String firstName, String lastName , String sName, String mName,String expectedText) {
		
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMFSAlnk()
		.clickLeadLnk()
		.clickCreateLeadLnk()
		.enterCompName(compName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.selectSourceId(sName)
		.selectMarketingId(mName)
		.clickCreateLeadBtn()
		.verifyFirstName(expectedText);
		
	
			
		
	}
}
	 
   



