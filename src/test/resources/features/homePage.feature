Feature: Virgin games Test

  Background: I am On Homepage

  @regression @author_Yatri
  Scenario: User should able to click on homepage
    Given I am on home page
    And I click on allowcookie button
    Then I should be on homepage


  @regression @author_Yatri
  Scenario: User should able to click on Aboutus page
    Given I am on home page
    And I click on allowcookie button
    When I am on aboutus page
    Then I should be verify aboutus link "https://www.virgingames.com/uk/about-us".







