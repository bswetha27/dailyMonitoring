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
    And quit
    
    
    @DataRefreshment
    Scenario: Validating the data Refreshment 
    Given load the demographic page url
    When demographic page is loaded
    Then validate the date
    And validate the About this Dashboard PDF
    And quit
    
    @Dashboard
    Scenario: Verifying the Explore Demographics header
    Given load the demographic page url
    When demographic page is loaded
    Then Verify the header
    And Verify the dashboard
    And quit
    
    @AboutHRSA
    Scenario: Verifying the About HRSA header
    Given load the demographic page url
    When demographic page is loaded
    Then Verify the About HRSA header
    And Verify the Paragraph
    And Verify the learn more about HRSA link
    And quit
    
    @FooterLinks
    Scenario: Validating the footer link About us
    Given load the demographic page url
    Then About us
    And quit
    
    Scenario: Validating the footer link About the data
    Given load the demographic page url
    Then About the data
    And quit
    
    Scenario: Validating the footer link A-Z index
    Given load the demographic page url
    Then A-Z index
    And quit
    
    Scenario: Validating the footer link Site map
    Given load the demographic page url
    Then Site map
    And quit
    
    Scenario: Validating the footer link What's new
    Given load the demographic page url
    Then Site map
    And quit
    
    @FooterLogos
    Scenario: Verifying the footer images
    Given load the demographic page url
    When demographic page is loaded
    Then Verify HRSA logo
    And Verify Department of health and human serivces logo
    And quit
    

