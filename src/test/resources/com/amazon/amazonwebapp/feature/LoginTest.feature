@login
Feature: Amazon website Login

Background: user is on Amazon homepage
    Given user is on Amazon home page       
	When user clicks login button
	
Scenario Outline: Successful Login Test
And user enters username "<username>"
And user enters password "<password>"
When user clicks signin
Then user is redirected to user home page

Examples:
|username|password|
|puneetsapaliga@gmail.com|Greent$7|


@negative_test
Scenario Outline: Successful Login Test
And user enters incorrect username "<username>"
And user enters incorrect password "<password>"
When user clicks signin
Then an error message "<errorMessage>" is displayed

Examples:
|homePageURL|username|password|errorMessage|
|https://www.amazon.com/|puneetsapaliga21@gmail.com|password|Your password is incorrect|
