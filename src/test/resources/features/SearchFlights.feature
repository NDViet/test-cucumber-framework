@SearchFlights @SeatsAvailable
Feature: Search for flights
  As a MarsAir Sales Director (Mark)
  I want potential customers to be able to search for flights to Mars
  So that they see what trips are available

  Scenario Outline: There are seats available
    Given User is on book ticket page
    When User performs to select Departure date as "<departure>"
    And User performs to select Return date as "<return>"
    And User clicks on Search button
    Then User should be able to see Search Result as "<seatsAvailable>"
    And User should be able to see Search Result as "<callNow>"
    Examples:
      | departure | return | seatsAvailable   | callNow                           |
      | 0         | 5      | Seats available! | Call now on 0800 MARSAIR to book! |

  Scenario Outline: There are no seats available
    Given User is on book ticket page
    When User performs to select Departure date as "<departure>"
    And User performs to select Return date as "<return>"
    And User clicks on Search button
    Then User should be able to see Search Result as "<noSeats>"
    Examples:
      | departure | return | noSeats                                   |
      | 0         | 2      | Sorry, there are no more seats available. |
      | 0         | 3      | Sorry, there are no more seats available. |
      | 0         | 4      | Sorry, there are no more seats available. |
