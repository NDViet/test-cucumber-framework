@SearchFlights @LinkToHomePage
Feature: Link To Home Page
  As a MarsAir Sales Director (Mark)
  I want potential customers to be able to go back to the flight search from anywhere on the site
  So that they are guided towards booking trips

  Scenario: Navigate to Home Page by clicking MarsAir logo
    Given User is on book ticket page
    Then User navigate to Report an issue page
    And User is able to see the Report issue screen
    When User clicks on MarsAir logo
    And It take the user to Home page