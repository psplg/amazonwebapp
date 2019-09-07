@hpg
Feature: Amazon website homepage access

Scenario Outline: To test amazon website accessibility
Given user has launched the browser
When user enters "<url>"
Then user should be "<title>"

Examples:
|url|title|
|https://www.amazon.com/|Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more|