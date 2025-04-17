

Feature: Application Login

#Background is at Feature level- 
Background:
Given Setup the entries in database
When Launch the browser from config variables
And Hit the home page url of banking site

@SmokeTest
Scenario: Admin Page default login

Given User is on NetBanking landing page
When User login into application with "admin" and "1234"
Then Home page is displayed
And Cards are displayed

@SmokeTest @RegressionTest
Scenario: User Page default login

Given User is on NetBanking landing page
When User login into application with "user" and "5555"
Then Home page is displayed
And Cards are displayed

 @MobileTest
Scenario Outline: Mortgage User Page default login

Given User is on NetBanking landing page
When User login into application with "<username>" and "<password>"
Then Home page is displayed
And Cards are displayed

Examples:
  | username   |  password  |
  | debituser  |  hello123  | 
  | credituser |  hello999  | 
  
#Data driven testing - not with using examples - only for one step- List strategy
#only one step for different data in same test-  multiple data in single step

 @RegressionTest @Sanity
Scenario: Signup -User Page default Sign up

Given User is on Practice landing page
When User signup into application 
|teja             |
|k                |
|contact@email.com|
|55664488         |
Then Home page is displayed
And Cards are displayed
 