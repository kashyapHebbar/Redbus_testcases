Feature: Book a ticket
Scenario: a user is able to see fare details;
Given a user is on redbus site
And user is booking one or more tickets
When user clicks on "show fare details" button
Then the browser displays fare details