package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	
	public ViewLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);				
	}
	
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleVerifyTxt;
	public ViewLeadPage verifyFirstName(String expectedText) {
		verifyExactText(eleVerifyTxt,expectedText);
		return this;
	}
	
	//EditLead verify title and click edit lead button
	@FindBy(how=How.ID,using="sectionHeaderTitle_leads")
	private WebElement eleVerifyTitle;
	public ViewLeadPage verifyPageTitle(String expectedTitle){
		verifyTitle(expectedTitle);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleEditLeadBtn;
	public EditLeadPage clickEditLeadBtn() {
		click(eleEditLeadBtn);
		return new EditLeadPage(driver, test);
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleVerifyCname;
	public ViewLeadPage verifyCompName(String expectedText){
		verifyPartialText(eleVerifyCname, expectedText);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eleDelete;
	public LeadsPage clickDelete(){
		click(eleDelete);
		return new LeadsPage(driver, test);
	}
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleDuplicateLead;
	public DuplicateLeadPage clickDuplicateLead(){
		click(eleDuplicateLead);
		return new DuplicateLeadPage(driver, test);
	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleCaptureFirstName;
	public String captureFirstName(){
		String dupliFirstName = getText(eleCaptureFirstName);
		return dupliFirstName;
	}
}