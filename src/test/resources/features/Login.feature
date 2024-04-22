Feature: Login feature

  Scenario: Login Successful
    Given I open Login Page
    When I enter valid email "nemanja.sijacic@testpro.io"
    And I enter valid password "Vojvodina.021"
    And I click submit
    Then I am logged in