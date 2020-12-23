Feature: Verify the compose email button
Scenario: Verify the compose email
Given User launch the application
When User Click the Gmail link
Then Enter the valid email ID and password [geethapractice7@gmail.com, Automation@123]
And Click the compose button
Then Quit the browser