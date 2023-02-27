@SearchFlights @PromotionalCode
Feature: Promotional Code
  As a MarsAir Sales Director (Mark)
  I want to distribute promotional codes to customers
  So that they get discounts and are more tempted to purchase tickets

  @PromotionalCodeVisible
  Scenario Outline: Seats are available with promotional code used
    Given User is on book ticket page
    When User performs to select Departure date as "<departure>"
    And User performs to select Return date as "<return>"
    And User enters the promotional code as "<promotionalCode>"
    And User clicks on Search button
    Then User should be able to see Search Result as "<seatsAvailable>"
    And User should be able to see Search Result as "<callNow>"
    And User should able to see Promotional Code status as "<promoStatus>"
    Examples:
      | departure | return | promotionalCode   | seatsAvailable   | callNow                           | promoStatus                                      |
      | 0         | 5      | AF3-FJK-418       | Seats available! | Call now on 0800 MARSAIR to book! | Promotional code AF3-FJK-418 used: 30% discount! |
      | 0         | 5      | AF0-FJK-415       | Seats available! | Call now on 0800 MARSAIR to book! | Promotional code AF0-FJK-415 used: 00% discount! |
      | 0         | 5      | JJ5-OPQ-320       | Seats available! | Call now on 0800 MARSAIR to book! | Promotional code JJ5-OPQ-320 used: 50% discount! |
      | 0         | 5      | test-wrong-format | Seats available! | Call now on 0800 MARSAIR to book! | Sorry, code test-wrong-format is not valid       |
      | 0         | 5      | JJ9-OPQ-144       | Seats available! | Call now on 0800 MARSAIR to book! | Promotional code JJ9-OPQ-144 used: 90% discount! |

  @PromotionalCodeNotVisible
  Scenario Outline: No seats available with promotional code used
    Given User is on book ticket page
    When User performs to select Departure date as "<departure>"
    And User performs to select Return date as "<return>"
    And User enters the promotional code as "<promotionalCode>"
    And User clicks on Search button
    Then User should be able to see Search Result as "<error>"
    And User should not be able to see Promotional Code status
    Examples:
      | departure | return | error                                                           | promotionalCode |
      | 0         | 2      | Sorry, there are no more seats available.                       | AF3-FJK-418     |
      | 0         | 1      | Unfortunately, this schedule is not possible. Please try again. | AF0-FJK-415     |