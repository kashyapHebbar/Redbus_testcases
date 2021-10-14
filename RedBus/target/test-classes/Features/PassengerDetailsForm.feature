Feature: Book a ticket
Scenario: To verify if the user can book the ticket after filling the passenger details form;
Given a user is on redbus site
And user is booking one or more tickets
And user is filling passenger details form
When user clicks on a Proceed to pay button
Then user is redirected to payment page