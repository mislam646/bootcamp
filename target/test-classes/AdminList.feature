@bootcamp
Feature: Verify Admin list is visible for Orange HRM 

Scenario: Able to select admin under user role 
	Given user go to Orange HRM home page 
	And user enter username and password 
	When user click on the login button
	And user verify "Dashboardj" word on page
#	And user verify page title as "OrangeHRM" 
#	Then user click on the admin tab 
#	And user select "Admin" under user role 
#	And user click on search button 
#	Then user verify "Dominic Chase" is dis played in result set 
#	And user logout of Orange HRM