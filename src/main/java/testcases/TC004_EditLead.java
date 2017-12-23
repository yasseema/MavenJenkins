package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC004";
		testCaseName = "TC004_EditLead";
		testDescription = "To edit a lead";
		category= "Smoke";
		authors	="Sindhu";
		browserName ="chrome";
	}

	@Test(dataProvider="fetchData")
	public void editLead(String uName, String pwd,  String firstName, String updatecName,String companyName) {

		new LoginPage(driver,test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMFSAlnk()
		.clickLeadLnk()
		.clickFindLeadsLnk()
		.enterFirstName(firstName)
		.clickFindLeadsBtn()
		.clickFirstResLead()
		.clickEditLeadBtn()
		.enterCompName(updatecName)
		.clickUpdateBtn()
		.verifyCompName(companyName);
	}

}