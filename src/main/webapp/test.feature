Feature: XYZ

@Dev
Scenario: Create ABC


Given I open the application
  When I enter username as Rob
  And I enter password as xyz1
  Then I enter title as title1
  And press submit 
  When I enter username as Bob
  And I enter password as xyz2
  Then I enter title as title2
  And press submit
  
  Scenario: Some test scenario
  Given Bob is on "www.abc.com"
  			When Bob creates team "Test Team"	
  Then Bob sees message:
      """
      As the Team Captain you will be responsible for paying for the team after 
      registration closes. You will be emailed instructions at the close of 
      registration.
      """
And Bob clicks "Next" button
  
  

