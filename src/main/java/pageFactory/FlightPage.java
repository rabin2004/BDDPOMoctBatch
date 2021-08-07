package pageFactory;

import org.openqa.selenium.support.PageFactory;

import base.Main;

public class FlightPage extends Main{
	
	public FlightPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateFlightPage() {
		return driver.getTitle();
	}

}
