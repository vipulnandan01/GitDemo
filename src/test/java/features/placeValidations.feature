Feature: Validating Place API's

@AddPlace @Regression
Scenario Outline: Verify if Place is being Successfully added using AddPlaceAPI
	Given Add Place Payload with "<name>" "<language>" "<address>"
	When user calls "AddPlaceAPI" with "post" http request
	Then the API call is success with status code 200
	And "status" in response body is "OK"
	And "scope" in response body is "APP"
	And verify place_Id created maps to "<name>" using "getPlaceAPI"
	
	
Examples:
	|name 		 | |language| |address			 |
	|Ramesh Kumar| |English | |World Cross Center|
	|Suresh Kumar| |Spanish | |World City Center|

@DeletePlace @Regression
Scenario: Verify if DeletePlace functionality is working
	Given DeletePlace payload
	When user calls "deletePlaceAPI" with "post" http request
	Then the API call is success with status code 200
	And "status" in response body is "OK"