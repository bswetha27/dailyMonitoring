@Regression
Feature: Check demographic page loaded

  @TitleText
  Scenario: Validating Demographic page load
  #https://data.hrsa.gov/data/dashboards/demographics
    Given load the demographic page url
    When demographic page is loaded
    Then validate logo of the page
    And validate Title of the page
    And validate paragraph text

