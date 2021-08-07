package step_definition;

import org.testng.Assert;

import base.Main;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;
import pageFactory.LoginSuccessPage;

public class LoginFunctionalityTest extends Main{
	HomePage hp;
	LoginSuccessPage lsp;
	
	@Given("registered user is in homepage")
	public void registered_user_is_in_homepage() {
		hp = new HomePage();
		lsp = new LoginSuccessPage();
		Assert.assertEquals(hp.validateHomePage(), prop.getProperty("homePageTitle"));
	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
		hp.enterUsernameTxtField("test123");
		hp.enterPasswordTxtField("123");
	}

	@And("user clicks submit button")
	public void user_clicks_submit_button() {
		hp.clickSubmitBtn();
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
		Assert.assertTrue(lsp.validateLoginSuccessMsg());
	}
	
	@And("user is hitting enter key")
	public void user_is_hitting_enter_key() {
		hp.enterOnSubmitBtn();
	}
	
	@When("user enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password() {
		hp.enterUsernameTxtField("test123");
		hp.enterPasswordTxtField("tom123456");
	}

	@Then("user should not be able to login")
	public void user_should_not_be_able_to_login() {
		Assert.assertTrue(hp.validateLoginErrorMsg());
	}
	
	@When("user enter invalid username and valid password")
	public void user_enter_invalid_username_and_valid_password() {
		hp.enterUsernameTxtField("john12345");
		hp.enterPasswordTxtField("123");
	}
	
//	@When("user enter valid {string} and valid {string}")
//	public void user_enter_valid_and_valid(String credential1, String credential2) {
//		driver.findElement(By.name("userName")).sendKeys(credential1);
//		driver.findElement(By.name("password")).sendKeys(credential2);
//	}
	
	@When("^user enter invalid \"([^\"]*)\" and invalid \"([^\"]*)\"$")
	    public void user_enter_invalid_something_and_invalid_something
	    (String invalidusername, String invalidpassword) {
		hp.enterUsernameTxtField(invalidusername);
		hp.enterPasswordTxtField(invalidpassword);
	    }
	
	
	
	
	
}
