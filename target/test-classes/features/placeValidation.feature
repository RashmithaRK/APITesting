Feature: Validating Place APIs
@AddPlace
Scenario Outline: Verify if Place is being successfully added using AddPlaceAPI
   Given Add Place Payload with "<name>" "<language>" "<address>"
   When user calls "AddPlaceAPI" with "POST" http request
   Then the api call is success with status code 200
   And "status" in response body is "OK"
   And "scope" in response body is "APP"
   And Verify place_Id created maps to "<name>" using "getPlaceAPI"
   
Examples:
   |name    |language  |address   |
   |AAhouse |English   |World cross centre|   
   |BBhouse |Spanish   |Cross centre      |

   
@DeletePlace
Scenario: Verify if Delete Place functionality is working

Given DeletePlace Payload
When user calls "deletePlaceAPI" with "POST" http request
Then the api call is success with status code 200

