Feature: Flight booking scenario

  Scenario: validate the departue return select flight trip details and enter passanger information
    Given Launch the Url
    When Click the trip
    And Enter from city or town or airport = "Chennai, India"
    And Enter to city or town or airport = "New York, NY"
    And Enter a departure date = "01/10/2024"
    And Enter a return date = "01/19/2024"
    And click traveler economy
    And Select number of adults
    And Select number of senior
    And Select number of childen
    And Select number of infant in laps
    And Select the class ="C"
    And Click the search flight button
    And close the popup
    And Select the departing flight
    And Selct the Returning flight
    And Review the trip detail and click continue
