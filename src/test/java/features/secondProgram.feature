

Feature: Application Login

#Background is at Feature level- 
Background:
When Launch the browser from config variables
And Hit the home page url of banking site

#//Beforehook -> Background-> Scenario-> Afterhook


@RegressionTest @NetBanking
Scenario: User Page default login

Given User is on NetBanking landing page
When User login into application with "user" and "5555"
Then Home page is displayed
And Cards are displayed

 @SmokeTest @RegressionTest @Mortgage
Scenario Outline: Mortgage User Page default login

Given User is on NetBanking landing page
When User login into application with "<username>" and "<password>"
Then Home page is displayed
And Cards are displayed

Examples:
  | username   |  password  |
  | debituser  |  hello123  | 
  | credituser |  hello999  | 
  
