package pageFactory;

import org.openqa.selenium.support.PageFactory;

import base.Main;

public class SignOnPage extends Main{

	public SignOnPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateSignOnPage() {
		return driver.getTitle();
	}
}
