package cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	public LoginPage (WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	private WebElement emailfield;


	public WebElement getEmailfield() {
		return emailfield;
	}
	@FindBy(xpath="//i[@class='fb_logo img sp_U-ZrA51p6aB sx_8a1b62']")
	private WebElement FbLOgo;


	public WebElement getFbLOgo() {
		return FbLOgo;
	}
	@FindBy(name="pass")
	private WebElement passwordfield;

	public WebElement getPasswordfield() {
		return passwordfield;
	
	}
	@FindBy(name="login")
	private WebElement click;

		
	public WebElement getClick() {
		return click;
	}
	

}
