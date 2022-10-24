@tagtest
Feature: Check demographic page loaded

  @tag1
  Scenario: validate page title
    Given load the demographic page url
    When I complete action
    Then I validate the outcome

