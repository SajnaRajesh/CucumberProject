Feature: Facebook Application smoke test automation scripts

Scenario: Verify the login functionality of the application with invalid credentials
Given User should be in Facebook Application
Then User should see the Facebook logo displayed in the header
When User enter the Email address in the emailfield in Login Page
And User enter the password in the passwordFeild in Login Page
And User click on the Login button in the Login Page
And User wait for 3 seconds for page load
Then User should see the Login into Facebook title in the Forgot Password Page