Feature: Test  flow

  @wp
  Scenario Outline: Test Home flow navigation and IMessage Content
    Given I login and navigate to the "<pageName>" page
    When I hover the mouse over Kiwisaver link in the menu bar
    When I click Get Started Button on Calculators page
    When I Click information icon besides Current age
    Then I the msg should be "This calculator has an age limit of 18 to 64 years old."
    Examples:
      | pageName          | pageName1                  |
      | Westpac Home Page | Retirement Calculator Page |

  @wp
  Scenario Outline: Test that the Employed users are able to plan their investments better.
    Given I login and navigate to the "<pageName>" page
    When I hover the mouse over Kiwisaver link in the menu bar
    When I click Get Started Button on Calculators page
    When I fill in Current age as 30
    When I select Employee Status as "Employed"
    When I Input Salary as 82000
    When I Select Kiwisaver Contribution as 4
    When I Select Risk Profile as "Defensive"
    When I Click View Projections
    Then I shoudl see the message "At age 65, your KiwiSaver balance is estimated to be:"
    Examples:
      | pageName          | pageName1                  |
      | Westpac Home Page | Retirement Calculator Page |

  @wp
  Scenario Outline: Test that the Self-Employed users are able to plan their investments better.
    Given I login and navigate to the "<pageName>" page
    When I hover the mouse over Kiwisaver link in the menu bar
    When I click Get Started Button on Calculators page
    When I fill in Current age as 45
    When I select Employee Status as "Self-Employed"
    When I fill my Kiwisaver balance as 100000
    And I Choose Voluntary Contributions of $90
    And I choose Voluntary Contributions frequency as "Fortnightly"
    When I Select Risk Profile as "Conservative"
    And I fill saving goals requirement of $290000
    And I Click View Projections
    Then I shoudl see the message "At age 65, your KiwiSaver balance is estimated to be:"
    Examples:
      | pageName          | pageName1                  |
      | Westpac Home Page | Retirement Calculator Page |

  @wp
  Scenario Outline: Test that the Not Employed users are able to plan their investments better.
    Given I login and navigate to the "<pageName>" page
    When I hover the mouse over Kiwisaver link in the menu bar
    When I click Get Started Button on Calculators page
    When I fill in Current age as 55
    When I select Employee Status as "Not Employed"
    When I fill my Kiwisaver balance as 140000
    And I Choose Voluntary Contributions of $10
    And I choose Voluntary Contributions frequency as "Annually"
    When I Select Risk Profile as "Balanced"
    And I fill saving goals requirement of $200000
    And I Click View Projections
    Then I shoudl see the message "At age 65, your KiwiSaver balance is estimated to be:"
    Examples:
      | pageName          | pageName1                  |
      | Westpac Home Page | Retirement Calculator Page |






