Feature: To validate the login functionality of flipkart site

Scenario: To validate the login functionality of flipkart site
Given To open Microsoft edge browser and maximize the window
When To launch the flipkart Url
And pass the valid mobile number and do not click request opt button
And To check whether the site open or not
Then To close the browser

Scenario Outline: To validate login functionality of G-mail
Given user launch the bowser and maximize the window
When user launch the gamil Url
And user pass vaild mail id to email <"emailid"> field and click next button
And user pass vaild password to the password <"password"> field and click login button
Then user close the entire browser

Examples:
|emailid					|password	|
|abcd123@gmail.com|123456789|
|deepak1@gmail.com|987654321|