# Icebraker Assignment
 
## Icebraker Automation Test Prototype

### Tools/tech used :
Selenium web driver, Java, Cucumber, Maven, TestNG, Junit

### Description :
Written this prototype framework to validate only for filter/sort functionality.

I have written 2 features. 

FilterListing_Smoke.feature - Runnable, You can run this feature using in production environment https://www.icebreaker.com/

FilterListing.feature - Prototype level, Can not run successfully.

### How to install the solution:

You can download from GIT repository – https://github.com/kaveendralk/Icebraker

Import the project in to your IDE. You should have Cucumber and TestNG installed.

MAVEN use for build the project.

pom.xml includes all the dependencies required to build with MAVEN.

### How to run tests:

•To run features,
Select FIlterListingRunner.java > Right click > Run as Junit Test OR Select FilterListing_Smoke.feature > Right click > Run as Cucumber feature

> Test report can be seen in - \target\cucumber-reports (https://github.com/kaveendralk/Icebraker/blob/main/Test_Report.jpg)

Right click and open with system editor.


## What is your approach to reviewing this feature and what clarifying questions would you have?

1.	The order of the filters configured in business manager.  Is there a separate business management module/page which is accessible to business manager? And what sort of order of the filters can be made? Is there a way to keep pre-defined order of the filters?

2.	Do we need to test this functionality in separate mobile app or designed as a responsive web application to cater all the devices?

3.	Accessibility is considered for all interactions. So we need to consider cross browser testing. Do we have any list of browsers and versions should be specifically considered. And also any of the browsers should not be considered.

4.	Cross platform testing – For web application, are we consider only latest Mac and Windows OS versions or some of the previous versions as well? If we need to test this functionality in a mobile app, basically we need to test on both Android and iOS devices. So is there any pre decided list of devices to test?

5.	Do you need to test on real devices or using simulator?  Also can use Browserstack or similar one.  If so we can use same for cross browser testing and mobile automated testing.

6.	Are there any pad licenses for Icebreaker? or we are going with free open source tools.

7.	Do we need to plan nonfunctional testing for this functionality (Performance test to measure page loading time before and after applying filters)?

8.	Data architecture on filter attributes – Can you provide data architecture design document in advance to plan tests.

9.	What are the combinations of filter attributes (e.g. size & fit and series)? Could you provide any specific combination/s should be focused? It helps to manage good set of test data in TCs. What is the relationship with the order of the filters managed by business manager?


## Test plan (Web) – Filter Icebraker listing page.

1.	Filter section is applicable for all the listings.

2.	Scroll down the page, filter bar is stick to the page and should display on top of the page.

3.	Scroll up the page, reveals semi- sticky bar (along with main nav) and filter should stick to its original position.

4.	Click more filters link, additional filters will display. Then click less filters link, additional filters gets invisible.

5.	Select each filter option along, then the grid will automatically update. Validate filtered items in the grid and the number of items filtered in filter bar.

6.	Select each filter with more than one options, then the grid will automatically update. Validate filtered items in the grid and the number of items filtered in filter bar.

7.	All filters applied and their values associated with the configuration should display under filter section after the clear button.

8.	Click the clear link, all the filters should be cleared.

9.	Click the ‘x’ in front of the values associated with the filter, the specific filter should be cleared.

10.	Set combinations of filters then the grid will automatically update. Validate filtered items in the grid and the number of items filtered in filter bar. When select more filter options, result should be more specific.

11.	Scroll down the page and select a filter option/s, then update the grid and scroll back to top.

12.	Change the order of filters in Business Manager and validate the display order of filters in the listing.

13.	Select each sort option, grid will update according to sort option automatically.

14.	Select display of grid type, grid will update as the grid type you selected.

15.	Test responsiveness for all screen sizes.

16.	Test for browser compatibility. 
 
 
## Test plan (Mobile) – Filter Icebraker listing page.

1.	Filter section is applicable for all the listings.

2.	Scroll down the page, filter bar is stick to the page and should display on top of the page.

3.	Scroll up the page, reveals semi- sticky bar (along with main nav) and filter should stick to its original position.

4.	Click filter/sort, the drawer will stay open

5.	Select each filter option along and click on Apply button, then the grid will update.

6.	Click close (‘x’) button, drawer will close.

7.	Validate filtered items in the grid and the number of items filtered in filter bar.

8.	All filters applied and their values associated with the configuration should display under filter section after the clear button.

9.	Click the clear link, all the filters should be cleared.

10.	Click the ‘x’ in front of the values associated with the filter, the specific filter should be cleared.

11.	Set combinations of filters and click on Apply button then the grid will update. Validate filtered items in the grid and the number of items filtered in filter bar.

12.	Change the order of filters in Business Manager and validate the display order of filters in the listing.

13.	Select each sort option, grid will update according to sort option automatically.

14.	Select display of grid type, grid will update as the grid type you selected.

15.	Test responsiveness for all screen sizes.

16.	Test for browser compatibility.
