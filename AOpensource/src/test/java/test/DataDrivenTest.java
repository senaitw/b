package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BroweserFactory;
import util.ExcelReader;

public class DataDrivenTest {
	
	WebDriver driver;
	ExcelReader reader = new ExcelReader("./data/opensource1.xlsx");
	String username = reader.getCellData("sheet1", "UserName", 1);
	String password = reader.getCellData("sheet1", "Password", 1);
	
	
  @Test
  public void dataDrivenframeworkExcel() {
	driver = BroweserFactory.startBroweser();
	LoginPage login = PageFactory.initElements(driver, LoginPage.class);
	login.logintoopensource(username, password);
  
  }
}
