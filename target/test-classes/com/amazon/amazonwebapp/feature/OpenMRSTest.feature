@MRSTest
Feature: MRS application

Scenario Outline: MRS app test
Given user is logged in to MRS app
|username|userpassword|
|Admin|Admin123|
When user clicks on option "<location>"
And user clicks on login button
And clicks on Apppoinment Scheduling
Then user is navigated to "<title>" page
|location|title|
|Inpatient Ward|OpenMRS Electronic Medical Record|

Given user is logged in to MRS app
When user clicks on option "<location>"
And user clicks on login button
And user clicks on Apppoinment Scheduling
And user clicks on Manage Service Types
Then user should be able to view a tabular list of Services
Examples:
|location|
|Inpatient Ward|
