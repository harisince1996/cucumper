@login
Feature: To validate login functionality in Fb

  Background: 
    Given user have to be in fb login page
    And user have to maximize screen
  @smoke @reg
  Scenario: To validate login using valid email and invalid password
    When user have to enter valide Email and invalid password
    |8944657734|harisince@gmail.com|774489971231|
    And user have to click login button
    Then user have to be in password incorrect page
  @reg
  Scenario: To validate login using valid email and invalid password
    When user have to enter invalide email and Valid password
    |ganesh@gamil.com|7766442288|      hgg      |
    |kumae@gmail     |8877223399|sudhan@gmai.com|
    |ram@gmail.com   |8877556623|haran@gamil.com|
    And user have to click login button
    Then user have to be in password incorrect page
  @sanity @smoke
  Scenario: To validate login using valid email and invalid password
    When user have to enter valid number and Invalid pswd
    |Phoneno |8978652345    |
    |Email   |hari@gmail.com|
    |username|sudhan1234.com|
    |Password|Greens1234    | 
    And user have to click login button
    Then user have to be in password incorrect page

  Scenario: To validate login using valid email and invalid Password
    When user have to enter invalide Number  and invalid pass
    |name|Phoneno   |Email           |Password|
    |ram |8946731289|har@gmail.com   |gane345 |
    |Hari|9977673324|                |kumar123|
    |Hara|8877356128|ram@gamil.com   |Tigerkkk|
    And user have to click login button
    Then user have to be in password incorrect page
