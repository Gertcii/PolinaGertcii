Feature: different elements page element
  In order to check page elements
  As a user "Roman Iovlev"
  I want to navigate via top navigation bar and assert that elements can be selected

  Scenario: check page elements on Different Elements page
    Given I open JDI GitHub site
    Then Page title is 'Home Page'
    When I login with 'Roman' login and 'Jdi1234' password
    Then User name is 'ROMAN IOVLEV'
    When I open 'Different Elements' page via top navigation bar
    And I click on a 'Water' checkbox
    And I click on a 'Wind' checkbox
    And I click on a 'Selen' radio
    And I click on a color dropdown and select 'Yellow' color
    Then 4 log rows is displayed
    Then 'Water: condition changed to true' log row for water is displayed
    Then 'Wind: condition changed to true' log row for wind is displayed
    Then 'metal: value changed to  Selen' log row for selen is displayed
    Then 'Colors: value changed to Yellow' log row for yellow color is displayed


