Feature: Home feature test

  Scenario: download a book after with login
    Given Shihab opens the application
    And Shihab goes to profile
    And Shihab clicks login with phone
    And Shihab completes login
    And Shihab settings up with personal information
    When Shihab selects "সেরা ফ্রি বই" from homepage
    And Shihab selects second book from the list
    And Shihab clicks download for that book
    Then Shihab starts reading it