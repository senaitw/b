package page;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class QuickDraftPage {

	WebDriver driver;
	public QuickDraftPage(WebDriver driver) {
		this.driver = driver;
		}
	
	
	@FindBy(how=How.XPATH,using="//input[@id='title']")
	WebElement title;
	
	@FindBy(how=How.XPATH,using="//textarea[@id='content']")
    WebElement content;
	
	@FindBy(how=How.XPATH,using="//input[@id='save-post']")
	WebElement saveDraft;
	
	@FindBy(how=How.XPATH,using="//h2[text()='Your Recent Drafts']")
	WebElement recenttitle;
	
	@FindBy(how=How.XPATH,using="//a[text()='it is working']")
	WebElement recent;
	
	
	public void Title(String writeTitle) {
		title.sendKeys(writeTitle);
	}
	public void writecontent(String writeContent) {
		content.sendKeys(writeContent);	
	}
	public void clickOnSaveDraft() {
		saveDraft.click();
	}	
	public void YourRecentDraft() {
		recenttitle.isDisplayed();
	}	
	//Validate the post appeared below under "Your recent Drafts"
	public void mydraftisDisplayed() {
		recent.click();
		
	}
	
}
