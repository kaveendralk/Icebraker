
@Filter_Function
Feature: Filter/Sorting functionalities in listing pages.

Background: 
		Given Open the browser
		And I navigate to icebraker site

# This BDD test can be used as TDD by passing different data sets, as an example I used 2 data sets here.
  @Smoke
  Scenario Outline: Two filters with selecting one option for each.
    And I click on main category <main_category>
    And I click on sub category <sub_category>
    When I select price filter
    And I select size filter
    Then I validate the filtered outcomes
    And I close my browser
    
    Examples: 
      | main_category  | sub_category |  
      | Men 					 | New arrivals |  
     #| Men            | Best Sellers |  