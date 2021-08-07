package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Main;

public class RegistrationSuccessPage extends Main{

	@FindBy(xpath="//table[@width='492']/tbody/tr[3]/td/p[3]")
	WebElement registrationSuccessMsg;
	
	public RegistrationSuccessPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean validateRegistrationSuccessMsg() {
		return registrationSuccessMsg.isDisplayed();
	}
}
