package stepDefination;

import com.VaccineLedger.Pages.SignUpPage;
import com.VaccineLedger.Utility.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUp_Page {

	@Given("User lauches browser")
	public void user_lauches_browser() {
		BaseClass.launchbrowser();
	}
	@When("Click on SignUp Link")
	public void click_on_SignUp_Link() {
		SignUpPage.click_SignUp();
	}
	@Then("Enter Username and Lastname {string}, {string}")
	public void enter_Username_and_Lastname(String string1, String string2) {
		SignUpPage.enter_UserName_and_Password(string1, string2);
	}

	@Then("User Enter Email Id {string}")
	public void user_Enter_Email_Id(String string) {
		SignUpPage.enter_EmailID(string);
	}

	@Then("User Enter Mobile Number {string}")
	public void user_Enter_Mobile_Number(String string) {
		SignUpPage.enter_MobileNo(string);
	}

	@When("Select Tipo de Organization {string}")
	public void select_Tipo_de_Organization(String string) throws Exception {
		SignUpPage.enter_TipoDe_Organization(string);
	}

	@When("Select Nombre de la Organization {string}")
	public void select_Nombre_de_la_Organization(String string) {
		SignUpPage.enter_Nambre_Organization(string);
	}

	@Then("User clicks on Continuar")
	public void user_clicks_on_Continuar() {
		SignUpPage.click_Continuar();
	}

}
