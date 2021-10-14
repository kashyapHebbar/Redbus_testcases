Feature: Book a ticket
Scenario: To verify if the user can redeem a discount offer using a valid offer/voucher code;
Given a user is on redbus site
And user is booking one or more tickets
And user is filling passenger details form
And is on payment page
When user enters a valid offer/voucher code
Then the user gets the respective deal or discount