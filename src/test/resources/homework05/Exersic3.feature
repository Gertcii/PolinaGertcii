Feature: User Table page ex3

  Scenario: Ivans vip checkbox
    Given I open JDI GitHub site
    And I login as user 'ROMAN IOVLEV'
    And I click on "Service" button in Header
    And I click on "User Table" button in Service dropdown
    When I select 'vip' checkbox for "Sergey Ivan"
    Then 1 log row has "Vip: condition changed to true" text in log section