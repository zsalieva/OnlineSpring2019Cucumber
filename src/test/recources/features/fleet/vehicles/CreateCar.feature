@create_a_car
Feature: Create a Car
  As a user I want to be able to create a car

  Scenario: Create a regular Car
    Given user logs in as a "sales manager"
    Then user navigates to "Fleet" and "Vehicles"
    And user verifies that "All Cars" page name is displayed
    Then user clicks on the create a car button
    And user enters car information:
    |License Plate|Cybertek|
    |Driver|Spartan|
    |Location|Tajikistan|
    |Model Year|2019|
    |Color|Black|
    |Power|500|
    |Vehicle Make|BMW|
    |Vehicle Model|X5m|
    Then user clicks save and close
    #And user verifies that genaral information is displayed




