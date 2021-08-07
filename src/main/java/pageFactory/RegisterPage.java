package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Main;

public class RegisterPage extends Main{
	@FindBy(name="email")
	WebElement emailTxtField;
	
	@FindBy(name="password")
	WebElement passwordTxtField;
	
	@FindBy(name="confirmPassword")
	WebElement confirmPasswordTxtField;
	
	@FindBy(name="submit")
	WebElement submitBtnRegistrationPage;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateRegisterPage() {
		return driver.getTitle();
	}
	
	public String registerPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public void enterEmailAdd(String emailAdd) {
		emailTxtField.sendKeys(emailAdd);
	}
	
	public void enterPasswordTxtField(String password) {
		passwordTxtField.sendKeys(password);
	}
	
	public void enterConfirmPasswordTxtField(String confirmPassword) {
		confirmPasswordTxtField.sendKeys(confirmPassword);
	}
	
	public void clickSubmitBtnRegisterPage() {
		submitBtnRegistrationPage.click();
	}
}
