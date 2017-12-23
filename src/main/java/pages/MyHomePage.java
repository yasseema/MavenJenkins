package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{
	
	public MyHomePage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement eleLeadsLnk;
	public LeadsPage clickLeadLnk() {
		click(eleLeadsLnk);
		return new LeadsPage(driver, test);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
