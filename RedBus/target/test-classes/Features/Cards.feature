Feature: Book a ticket
Scenario: To verify the user can save the card for the future;
Given a user is on redbus site
And user is booking one or more tickets
And user is filling passenger details form
And user clicks on a Proceed to pay button
And is on payment page
When user is entering the card details
And the user selects "save card for future use" button
Then the card details will be saved