package StepDefinition;

import java.io.IOException;
import java.net.MalformedURLException;

import CucumberPageObjectModel.baseclass;
import CucumberPageObjectModel.dashBoardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStepDefinition extends baseclass {
	dashBoardPage dashBoard;
	
	@Given("Browser is open and user navigate to cars website.")
	public void browser_is_open_and_user_navigate_to_cars_website() throws MalformedURLException {
		initialization();
	    System.out.println("hello colorado");
	}
	@When("Select {string} , {string} , {string} , {string} , {string}, {string} and click and Assert filters")
	public void select_and_click_and_Assert_filters(String string, String string2, String string3, String string4, String string5, String string6) {
	    dashBoard = new dashBoardPage();
	    dashBoard.setDashboardFields("Used Cars", "Honda", "Pilot", "$50,000", "100 Miles from", "60008");
	}
	@Then("four filters are displayed next to Clear All and perform assertion")
	public void four_filters_are_displayed_next_to_clear_all_and_perform_assertion() throws InterruptedException {
	System.out.println("Four filters assertions is performed in above method");
	}
	@Then("Select New from New\\/used and then apply assertion on filters")
	public void select_new_from_new_used_and_then_apply_assertion_on_filters() throws InterruptedException {
		dashBoard.moreNewFilters();
		dashBoard.assertNewFilters();
	}

	@Then("Select Touring {int}-Passemger and then apply assertion on filters")
	public void select_touring_passemger_and_then_apply_assertion_on_filters(Integer int1) throws InterruptedException {
		dashBoard.clickonTrimAssert();
	}

	@Then("Select second available car and apply assertion on availability and title")
	public void select_second_available_car_and_apply_assertion_on_availability_and_title() {
		dashBoard.clickon2ndCarAssert();
	}

	@Then("enter first name,last name and email")
	public void enter_first_name_last_name_and_email() {
	    dashBoard.contactSeller("Car", "Owner", "carowner@yahoo.com");
	}

	@Then("Scroll down to payment calculator and take screenshot")
	public void scroll_down_to_payment_calculator_and_take_screenshot() throws IOException {
	    dashBoard.moveToPaymentCalculatorandScreenshot();
	}
}
