package step_definition;

import java.util.List;

import org.testng.Assert;

import base.Main;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;
import pageFactory.RegisterPage;
import pageFactory.RegistrationSuccessPage;

public class RegistrationFunctionalityTest extends Main{
	HomePage hp;
	RegisterPage rp;
	RegistrationSuccessPage rsp;
	
	@Given("user is in registration page")
	public void user_is_in_registration_page() {
		hp = new HomePage();
		rp = new RegisterPage();
		rsp = new RegistrationSuccessPage();
		hp.clickRegisterLink();
		Assert.assertEquals(rp.registerPageUrl(), prop.getProperty("registrationPageURL"));
	}

	@When("user provides username, password and confirm password")
	public void user_provides_username_password_and_confirm_password() {
		rp.enterEmailAdd("tom123");
		rp.enterPasswordTxtField("123");
		rp.enterConfirmPasswordTxtField("123");
	}
	
	@And ("user clicks submit button in registration page")
	public void user_clicks_submit_button_in_registration_page() {
		rp.clickSubmitBtnRegisterPage();
	}

	@Then("user should be able to register to the application")
	public void user_should_be_able_to_register_to_the_application() {
		Assert.assertTrue(rsp.validateRegistrationSuccessMsg());
	}
	
	// from Tidy Gherkin
//	@When("^user provides (.+), (.+) and (.+)$")
//	public void user_provides_and(String username, String password, String confirmpassword) {
//		driver.findElement(By.name("email")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//		driver.findElement(By.name("confirmPassword")).sendKeys(confirmpassword);
//	}
	
	// snippets
	@When("user provides <username>, <password> and <confirmPassword>")
	public void user_provides_username_password_and_confirm_password(DataTable dataTable) {
		List<String> data = dataTable.asList();
		rp.enterEmailAdd(data.get(0));
		rp.enterPasswordTxtField(data.get(1));
		rp.enterConfirmPasswordTxtField(data.get(2));
	}

	@Then("validate user is in registration page after clicking register link")
	public void validate_user_is_in_registration_page_after_clicking_register_link() {
		Assert.assertEquals(rp.registerPageUrl(), prop.getProperty("registrationPageURL"));
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
