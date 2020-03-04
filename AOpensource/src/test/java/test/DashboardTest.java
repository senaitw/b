package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BroweserFactory;

public class DashboardTest {

	WebDriver driver;
@Test
public void clickOnPosts() throws InterruptedException {
	driver = BroweserFactory.startBroweser();
	
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	loginpage.enterUsername("opensourcecms");
	loginpage.enterpassword("opensourcecms");
	loginpage.clickOnSigninButton();
	
	Thread.sleep(6000);
	
	DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
	dashboardpage.Wait();
	dashboardpage.clickOnPosts();
	Thread.sleep(3000);
	dashboardpage.clickOnAllPosts();
	
	driver.close();
	driver.quit();
}
}
