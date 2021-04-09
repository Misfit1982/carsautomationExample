# carsautomationExample
The following test was compiled to test https://www.cars.com/ and the below scenario
•	Select `Used Cars`
•	Select Make `Honda`
•	Select Model `Pilot`
•	Select Price `50000`
•	Select Distance `100 miles`
•	Enter Zip Code 60008
•	Click `Search`

2)	Validate using assertions that 4 filters are displayed next to `Clear All` 
•	Max Price is 50000
•	Selected Make is Honda
•	Selected Model is Pilot
•	Selected `Used`

3)	Select `New` radio button from New/Used
4)	Validate using assertion that the `New` filter is displayed and `Used` is NOT displayed
5)	Select Touring 8-Passemger from Trim 
6)	Validate using assertion that the `Touring 8-Passenger` filter is displayed
7)	Select the second available car
8)	Validate using assertions: 
•	Selected car title contains `Honda Pilot 8-Passenger For Sale`
•	`Check Availability` button is displayed 

9)	In the Contact Seller section enter:
•	First Name: Car
•	Last Name: Owner
•	Email: carowner@yahoo.com

10)	Scroll down to `Payment Calculator` and take a screenshot
![image](https://user-images.githubusercontent.com/35195359/114216927-c94bea00-9924-11eb-8865-a94e99d0ead0.png)
Getting Started:

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

Prerequisites:
Install latest IDE of choice (This project was created and executed on Eclipse IDE)
Install latest webdriver (chromedriver, geckodriver, iedriver, etc)
Install latest version of maven
Install latest version of cucumber
Install npm
Download and install this project to your local machine
Ensure the correct files are mapped in your correct source folders (Example, this test was created on a Mac)

From Command Line:
1. Download or clone this repo from gitlab
2. CD to project folder
3. Run npm install
4. Run npm test

High Level purpose:

The purpose of the following tests is to ensure a user can navigate to cars.com, perform a given search, ensure there search perameters are met, select a vehicle of choice, complete the contact form, and ensure the payment calculator is present. 

Test method:

These tests were written in a cucumber/gherkin syntax. Example: Given, When, Then. 
Given Browser is open and user navigate to cars website.
When Select "used cars" , "Honda" , "Pilot" , "50000" , "100 miles", "60008" and click and Assert filters
Then four filters are displayed next to Clear All and perform assertion

The methods are defined in the step definition file

@Given("Browser is open and user navigate to cars website.")
	public void browser_is_open_and_user_navigate_to_cars_website() throws MalformedURLException {
		initialization();
	    System.out.println("hello colorado");
	}
	@When("Select {string} , {string} , {string} , {string} , {string}, {string} and click and Assert filters")
	public void select_and_click_and_Assert_filters(String string, String string2, String string3, String string4, String string5, String string6) {
	    dashBoard = new dashBoardPage();
	    dashBoard.setDashboardFields("Used Cars", "Honda", "Pilot", "$50,000", "100 Miles from", "60008");
      
 Built With:
 
 Selenium 
 Maven
 Cucumber
 Eclipse
      
 



