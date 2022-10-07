Feature: To test the functionality of Content Management Module

    Scenario: User is able to search Message Template
      Given User is able to login and redirect to dashboard
      When select Message Template and search Message Template
      Then Verify Message Template
