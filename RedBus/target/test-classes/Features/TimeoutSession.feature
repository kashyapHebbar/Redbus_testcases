Feature: Book a ticket
Scenario: To verify that if the user doesn't pay the bill amount in the given time, the session will expire;
Given a user is on redbus site
And user is booking one or more tickets
And user is filling passenger details form
And is on payment page
When user doesn't book the ticket in the given time
Then the session will timeout
And the user will be on the main page again