Feature: Test feature scenario

Scenario: Selection of cars from cars website.
 
Given Browser is open and user navigate to cars website.
When Select "used cars" , "Honda" , "Pilot" , "50000" , "100 miles", "60008" and click and Assert filters
Then four filters are displayed next to Clear All and perform assertion
Then Select New from New/used and then apply assertion on filters
Then Select Touring 8-Passemger and then apply assertion on filters
Then Select second available car and apply assertion on availability and title
And  enter first name,last name and email
And  Scroll down to payment calculator and take screenshot

