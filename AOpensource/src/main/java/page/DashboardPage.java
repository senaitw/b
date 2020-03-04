package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {

	WebDriver driver;
	public DashboardPage(WebDriver driver) {
	this.driver = driver;
	}
	
	@FindBy(how=How.XPATH, using= "//div[text()='Posts']")
	WebElement post;
	
	
	@FindBy(how=How.XPATH, using= "//a[text()='All Posts']")
	WebElement allPosts;
	
	public void Wait() {
	new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfAllElements(post));
	}
	
	public void clickOnPosts() {
	post.click();
	}
	public void clickOnAllPosts() {
	allPosts.click();
	}
}
