package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import junit.framework.Assert;
import page.DashboardPage;
import page.LoginPage;
import page.QuickDraftPage;
import util.BroweserFactory;

public class LoginTest {

	WebDriver driver;
	@Test
	
	public void validuserShouldableToLogin() throws InterruptedException {
		
		driver = BroweserFactory.startBroweser();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUsername("opensourcecms");
		loginPage.enterpassword("opensourcecms");
		loginPage.clickOnSigninButton();
		
		QuickDraftPage draftPage = PageFactory.initElements(driver, QuickDraftPage.class);
		Thread.sleep(3000);
	
		draftPage.Title("it is working");
		draftPage.writecontent("keep up the good work");
		draftPage.clickOnSaveDraft();
		Thread.sleep(3000);
		draftPage.YourRecentDraft();
		draftPage.mydraftisDisplayed();
		
		
		/*DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.Wait();
		dashboardPage.clickOnPosts();
		dashboardPage.clickOnAllPosts();*/
		driver.close();
		driver.quit();
	}
}	

