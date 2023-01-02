Feature: To Test Login Functionality

Scenario: Login to app With valid credentials
Given launch Browser
Then enter url
Then validate login page is displayed or not
Then enter username
And enter password
Then click on login button
Then validate home page is displayed or not
Then logout from the application