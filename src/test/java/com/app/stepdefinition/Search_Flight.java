package com.app.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageex.com.Search_flight_Page_ex;
import pageex.com.Select_flights_pageex;

public class Search_Flight extends Select_flights_pageex {
	

@Given("Launch the Url")
public void launch_the_url() {
	browserlaunch();
}

@When("Click the trip" )
public void select_the_trip() {
	trip();
    
}

@When("Enter from city or town or airport = {string}")
public void enter_from_city_or_town_or_airport(String data) {
	from(data);
}

@When("Enter to city or town or airport = {string}")
public void enter_to_city_or_town_or_airport(String data) {
	to(data);
}

@When("Enter a departure date = {string}")
public void enter_a_departure_date(String data) {
	departure_date(data);
}

@When("Enter a return date = {string}")
public void enter_a_return_date(String data) {
    return_date(data);
}

@When("click traveler economy")
public void click_traveler_economy() {
    options_class();
}

@When("Select number of adults")
public void select_number_of_adults() {
	adults();
}

@When("Select number of senior")
public void select_number_of_senior() {
   seniors();
}

@When("Select number of childen")
public void select_number_of_childen() {
    child();
}

@When("Select number of infant in laps")
public void select_number_of_infant_in_laps() {
    infants();
}


@When("Select the class ={string}")
public void select_the_class(String data) {
	dropdown(data);
}

@When("Click the search flight button")
public void click_the_search_flight_button() {
	search();
}
@When("close the popup")
public void close_the_popup() {
	handles();
    popup();
}


}
