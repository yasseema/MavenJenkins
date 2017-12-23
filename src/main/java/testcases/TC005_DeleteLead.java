package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC005";
		testCaseName = "TC005_DeleteLead";
		testDescription = "To delete a lead";
		category= "Sanity";
		authors	="Sindhu";
		browserName ="chrome";
	}

	@Test(dataProvider="fetchData")
	public void deleteLead(String uName, String pwd,  String areaCode, String phoneNum,String expectedText) {

		String flp= new LoginPage(driver,test)
				.enterUserName(uName)
				.enterPassword(pwd)
				.clickLogin()
				.clickCRMFSAlnk()
				.clickLeadLnk()
				.clickFindLeadsLnk()
				.clickPhone()
				.enterPhAreaCode(areaCode)
				.enterPhNum(phoneNum)
				.clickFindLeadsBtn()
				.captureLeadId();
		

		new FindLeadsPage(driver,test)

		.clickFirstResLead()
		.clickDelete()
		.clickFindLeadsLnk()
		.enterLeadId(flp)
		.clickFindLeadsBtn()
		.verifyErrMsg(expectedText);



	}

}