@SearchFlights @InvalidReturnDates
Feature: Invalid Return Dates
  As a MarsAir Sales Director (Mark)
  I want to prevent potential customers from searching for invalid trips
  So that they don’t waste time, and book valid ones

  Scenario Outline: Return date less than 1 year from the departure date
    Given User is on book ticket page
    When User performs to select Departure date as "<departure>"
    And User performs to select Return date as "<return>"
    And User clicks on Search button
    Then User should be able to see Search Result as "<invalidDate>"
    And User should able to see the Back button
    When User clicks on Back button
    Then User is able to see the search form is navigated back
    Examples:
      | departure | return | invalidDate                                                     |
      | 0         | 1      | Unfortunately, this schedule is not possible. Please try again. |
      | 1         | 1      | Unfortunately, this schedule is not possible. Please try again. |
      | 3         | 0      | Unfortunately, this schedule is not possible. Please try again. |
      | 4         | 5      | Unfortunately, this schedule is not possible. Please try again. |