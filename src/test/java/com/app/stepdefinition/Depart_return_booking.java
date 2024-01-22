package com.app.stepdefinition;

import io.cucumber.java.en.When;
import pageex.com.Select_flights_pageex;

public class Depart_return_booking extends Select_flights_pageex{
	@When("Select the departing flight")
	public void select_the_departing_flight() {
		departing_Flight();
		
		

	}

	@When("Selct the Returning flight")
	public void selct_the_returning_flight() {
		
		returning_Flight();
		
	}

	@When("Review the trip detail and click continue")
	public void review_the_trip_detail_and_click_continue() {
		get_continue();
		
	}
	

}
