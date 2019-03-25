import org.junit.Assert;
import org.junit.Ignore;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefsForLoanApplication {
	private LoanApplicationPage page = new LoanApplicationPage();
	
	
	@Given("^I am on the loan application screen$")
	public void i_am_on_the_loan_application_screen() throws Exception {
		
		page.goTo();
		Assert.assertTrue(page.isAt());
	}
	
	
	@Given("^I enter a first name of Sarah$")
	public void i_enter_a_first_name_of_Sarah() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		page.setFirstName("Sarah");
	}

	@Given("^I enter a second name of Smith$")
	public void i_enter_a_second_name_of_Smith() throws Exception {
		page.setLastName("Smith");
	}

	@Given("^I select that I have an existing loan account$")
	public void i_select_that_I_have_an_existing_loan_account() throws Exception {
//		TODO Add method to check if user has selected loan	
	}

	@Given("^I confirm my acceptance of the terms and conditions$")
	public void i_confirm_my_acceptance_of_the_terms_and_conditions() throws Exception {
		page.AcceptTermsAndConditions();
	}

	@When("^I submit my application$")
	public void i_submit_my_application() throws Exception {
//		page.SubmitApplication();
	}

	@Then("^I should see the application complete confirmation for Sarah$")
	public void i_should_see_the_application_complete_confirmation_for_Sarah() throws Exception {
		// Write code here that turns the phrase above into concrete actions
//		TODO	Please check if on submission of application, you receive name as Sarah
	}
	
	@After
	public void tearDown(){
		
		Browser.close();
	}
	
	
	
	
	
	
	
}
