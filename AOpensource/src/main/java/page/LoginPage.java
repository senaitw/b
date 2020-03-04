package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
	this.driver =driver;
	}
	//element library
	@FindBy(how=How.ID,using = "user_login")
	WebElement userName_Field;
	
	@FindBy(how=How.ID,using = "user_pass")
	WebElement password_Field;
	
	@FindBy(how=How.ID, using ="wp-submit")
	WebElement Submit_Field;
	
	//method to interact with the element
public void enterUsername(String username) {
	userName_Field.sendKeys(username);
}
public void enterpassword(String password) {
	password_Field.sendKeys(password);
}
	public void clickOnSigninButton() {
	Submit_Field.click();
}
public void logintoopensource(String username, String password) {
	userName_Field.sendKeys(username);
	password_Field.sendKeys(password);
	Submit_Field.click();
}

}

