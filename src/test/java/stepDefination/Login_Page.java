package stepDefination;

import com.VaccineLedger.Pages.LoginPage;
import com.VaccineLedger.Utility.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Page {

	@Given("User launches browser")
	public void user_launches_browser() {
		BaseClass.launchbrowser();
	}

	@Given("User enters url {string}")
	public void user_enters_url(String string) {
		BaseClass.openapplication(string);
	}

	@When("User enters Email id {string}")
	public void user_enters_Email_id(String string) {
		LoginPage.login(string);
	}

	@Then("User clicks on Sign In button")
	public void user_clicks_on_Sign_In_button() {
		LoginPage.clickon_SignIn();
	}

	@Then("Enter OTP here")
	public void enter_OTP_here() {
		LoginPage.otp_Verification();
	}

	@Then("Click on Verificar button")
	public void click_on_Verificar_button() {
		LoginPage.btn_Verifiacar();
	}
}
