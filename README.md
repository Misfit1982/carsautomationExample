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
Install latest Eclipse IDE 
Install latest chromedriver webdriver 
Install latest version of maven
Install latest version of cucumber
Download, unzip and install this project to your local machine from GitHub
Ensure the correct files are mapped in your correct source folders (Example, this test was created on a Mac)

From Eclipse IDE (Easiest)
*Ensure you have downloaded the applications outlined in prerequisites
1. Download the file from GitHub by right clicking the green "code" button and choosing to download the zip file.
2. Extract the zip file to a local folder
3. Open the main project from the file directory in Eclipse
4. Ensure the following paths are changed to the local path in the project 
	- myRunner.java line 10 local //Path(s)//
	- baseclass.java lines 39, 40, 54  webdriver.chrome.driver local //path(s)// *ghecko driver not used for this test
5. Save the project
6. Right click on the myRunner.java file below the src/test/java folder select to run as Junit test. 

From Command Line (Hard)
1. Download Eclipse IDE
2. Download the project from GitHub
3. Open the project from file directory in eclipse
4. Export the java project in to a Runnable jar - using Eclipse IDE
5. Select the main or running class file - Launch configuration
6. In Library handling - select the option [ Extract required libraries in to jar file ]
7. Open command prompt and CD to the directory where runnable jar is available
8. type > java -jar Runnable.jar

High Level purpose:

The purpose of the following tests is to ensure a user can navigate to cars.com, perform a given search, ensure there search perameters are met, select a vehicle of choice, complete the contact form, and ensure the payment calculator is present. 

Test method:

These tests were written in a cucumber/gherkin syntax. 
Example: Given, When, Then.

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
      
 



