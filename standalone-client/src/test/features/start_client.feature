Feature: Start a Client
  In order to do vote
  I, the voter want to start gui client

  Scenario: Start a GUI client
    Given Client not started
    When I start the client
    Then I should see the frame "Vote Client"