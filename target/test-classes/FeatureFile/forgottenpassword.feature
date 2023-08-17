Feature: To validate forgottenpassword functionality in Fb 

Scenario:To validate forgottenpassword login using valid email and invalid password
Given user have to be in fb login page
And user have to maximize screen
When user have to click forgottenpassword
And user have to Enter valide Email
|1234567890|hari@gmail|4553325678998|
And user have to click search 
And user have to click continu
And user have to enter the invalide code
And user have to click continue
Then user have to be in  doesn match your code page

