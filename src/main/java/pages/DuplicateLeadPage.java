package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods{
	
	public DuplicateLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);				
	}
	
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleVerifyTxt;
	public DuplicateLeadPage verifyFirstName(String expectedText) {
		verifyExactText(eleVerifyTxt,expectedText);
		return this;
	}
	
	@FindBy(how=How.ID,using="sectionHeaderTitle_leads")
	private WebElement eleVerifyTitle;
	public DuplicateLeadPage verifyPageTitle(String expectedTitle){
		verifyTitle(expectedTitle);
		return this;
	}
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleCreatLeadBtn;
	public ViewLeadPage  clickCreateLeadBtn(){
		click(eleCreatLeadBtn);
		return new ViewLeadPage(driver, test);
	}
}