package pageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Main;

public class HomePage extends Main{
	// create WebElements -> e.g WebElement username = driver.findElement(By.name(""));
	@FindBy(linkText="Flights")
	WebElement flightsLink;
	@FindBy(linkText="SIGN-ON")
	WebElement signOnLink;
	@FindBy(linkText="REGISTER")
	WebElement registerLink;
	@FindBy(name="userName")
	WebElement usernameTxtField;
	@FindBy(name="password")
	WebElement passwordTxtField;
	@FindBy(name="submit")
	WebElement submitBtn;
	@FindBy(xpath="//input[@name='password']/following-sibling::span")
	WebElement loginErrorMsg;
	
	// initialize pageFactory
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	// define functions for WebElements or others
	public void clickFlightsLink() {
		flightsLink.click();
	}
	public void clickSignOnLink() {
		signOnLink.click();
	}
	public void clickRegisterLink() {
		registerLink.click();
	}
	public boolean validateVisibilityUsernameTxtField() {
		return usernameTxtField.isDisplayed();
	}
	public boolean validateFunctionalityUsernameTxtField() {
		return usernameTxtField.isEnabled();
	}
	public void enterUsernameTxtField(String username) {
		usernameTxtField.sendKeys(username);
	}
	public boolean validateVisibilityPasswordTxtField() {
		return passwordTxtField.isDisplayed();
	}
	public boolean validateFunctionalityPasswordTxtField() {
		return passwordTxtField.isEnabled();
	}
	public void enterPasswordTxtField(String password) {
		passwordTxtField.sendKeys(password);
	}
	public boolean validateVisibilitySubmitBtn() {
		return submitBtn.isDisplayed();
	}
	public boolean validateFunctionalitySubmitBtn() {
		return submitBtn.isEnabled();
	}
	public void clickSubmitBtn() {
		submitBtn.click();
	}
	public void enterOnSubmitBtn() {
		submitBtn.sendKeys(Keys.ENTER);
	}
	public String validateHomePage() {
		return driver.getTitle();
	}
	
	public boolean validateLoginErrorMsg() {
		return loginErrorMsg.isDisplayed();
	}
}
