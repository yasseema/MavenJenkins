package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DuplicateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC006";
		testCaseName = "TC006_DuplicateLead";
		testDescription = "To create a duplicate lead";
		category= "Sanity";
		authors	="Sindhu";
		browserName ="chrome";
	}
	

	@Test(dataProvider="fetchData")
	public void duplicateLead(String uName, String pwd,  String emailId, String expectedTitle) {

		new  LoginPage(driver,test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMFSAlnk()
		.clickLeadLnk()
		.clickFindLeadsLnk()
		.clickEmail()
		.enterEmailId(emailId)
		.clickFindLeadsBtn()
		.captureLeadName();

		new FindLeadsPage(driver,test)

		.clickFirstResLead()
		.clickDuplicateLead()
		.verifyPageTitle(expectedTitle)
		.clickCreateLeadBtn()
		.captureFirstName();
	}

}