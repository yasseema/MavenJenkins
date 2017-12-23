package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{

		public FindLeadsPage(RemoteWebDriver driver,ExtentTest test) {
			this.driver = driver;
			this.test = test;

			PageFactory.initElements(driver, this);		

		}


		

		@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[2]")
		private WebElement eleFirstName;
		public FindLeadsPage enterFirstName(String firstName){
			type(eleFirstName, firstName);
			return this;
		}

		@FindBy(how=How.XPATH ,using="//span[text()='Phone']")
		private WebElement elePhone;
		public FindLeadsPage clickPhone() {
			click(elePhone);
			return this;
		}

		@FindBy(how=How.XPATH ,using="//input[@name='phoneAreaCode']")
		private WebElement elePhAreaCode;
		public FindLeadsPage enterPhAreaCode(String areaCode) {
			type(elePhAreaCode, areaCode);
			return this;
		}

		@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
		private WebElement elePhNum;
		public FindLeadsPage enterPhNum(String phoneNum){
			type(elePhNum, phoneNum);
			return this;
		}
		@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Lead')]")
		private WebElement eleFindLeadsBtn;
		public FindLeadsPage clickFindLeadsBtn() {
			click(eleFindLeadsBtn);
			return this;
		}
		
		@FindBy(how=How.XPATH ,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
		private WebElement eleFirstResLead;
		public ViewLeadPage clickFirstResLead() {
			click(eleFirstResLead);
			return new ViewLeadPage(driver, test);
		
		}
		
		@FindBy(how=How.XPATH,using="//input[@name='id']")
		private WebElement eleLeadId;
		public FindLeadsPage enterLeadId(String capturedId){
			type(eleLeadId, capturedId);
			return this;
		}
		
		
		@FindBy(how=How.XPATH,using="//div[text() = 'No records to display']")
		private WebElement eleVerifyErrMsg;
		public FindLeadsPage verifyErrMsg(String expectedText){
		verifyPartialText(eleVerifyErrMsg, expectedText);
		return this;
		}
		
		@FindBy(how=How.LINK_TEXT,using="Email")
		private WebElement eleEmail;
		public FindLeadsPage clickEmail(){
			click(eleEmail);
			return this;
		}
		
		@FindBy(how=How.NAME,using="emailAddress")
		private WebElement eleEmailId;
		public FindLeadsPage enterEmailId(String emailId){
			type(eleEmailId,emailId);
			return this;
		}
		
		//Capture First Resulting LeadId for DeleteLead
		@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
		private WebElement elefirstResLead;
		public String captureLeadId(){
			String leadId =  getText(elefirstResLead);
			return leadId;
		}
		//Capture the name of First Resulting lead
		
		@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")
		private WebElement elefirstResName;
		public String captureLeadName(){
			String leadName =  getText(elefirstResName);
			return leadName;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}