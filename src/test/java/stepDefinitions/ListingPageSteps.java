package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ListingPage;

public class ListingPageSteps extends BaseClass{

	RemoteWebDriver driver = null;
	ListingPage listingpage;
	
	public ListingPageSteps() {
		super();
	}


	@Given("Open the browser")
	public void browserIsOpen() {
//		initialization();
		String projectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().window().maximize();
	}

	@And("I navigate to icebraker site")
	public void navigateToIcebraker() {
		listingpage = new ListingPage(driver);
		driver.navigate().to("https://www.icebreaker.com/en-us/home");		 
	}

	@And("I click on main category (.*)$")
	public boolean clickOnMainCategory(String mainCategory) throws Exception {
		return listingpage.clickOnMainCategory(mainCategory);
	}
	
	@And("I click on sub category (.*)$")
	public boolean clickOnSubCategory(String subCategory) throws Exception {
		return listingpage.clickOnSubCategory(subCategory);
	}
	
	@When("I select price filter")
	public boolean selectPriceFilter() throws Exception {
		return listingpage.selectPriceFilter();
	}
	
	@And("I select size filter")
	public boolean selectSizeFilter() throws Exception {
		return listingpage.selectSizeFilter();
	}
	
	@Then("I validate the filtered outcomes")
	public boolean validateResults() throws Exception {
		return listingpage.validateResults();
	}
	
	@And("I close my browser")
	public void closeBrowser() throws Exception {
		listingpage.closeBrowser();
	}	

}
