Feature: Create a Natianality
  Scenario:  Citizenship creating

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameters
    And Click on citizenship
    And Click on plus icon
    And Type the citizenship name "CucumberCitizen111"
    And Type the shortName "CucCit111"
    When Click on save button
    Then "CucumberCitizen111" should be displayed
    And remove the
