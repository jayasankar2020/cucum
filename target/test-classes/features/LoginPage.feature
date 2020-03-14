Feature: verifying facebook details

  Scenario Outline: verifying login details
    Given I am verifying user facebook page
    When i am verifying user entes "<userName>","<passWord>"
    Then user should click login button

    Examples: 
      | userName | passWord |
      | jaisanka | 45678989 |
      | samraj   | 09876    |
      | sankar   | 456fhj   |
