Feature: Book a ticket
Scenario: To verify if the insurance fees is added in the total amount if the user selects the insurance option
Given a user is on redbus site
And user is booking one or more tickets
And user is filling passenger details form
When user opts for insurance in passengers details form
Then insurance amount will be added to the total amount