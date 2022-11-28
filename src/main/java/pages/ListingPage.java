package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.BaseClass;

public class ListingPage extends BaseClass {

	WebDriver driver;
	public ListingPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "(//a[contains(text(),'Men')])[1]")
	WebElement lnkMainCategory;

	@FindBy(xpath = "(//a[contains(text(),'New arrivals')])[1]")
	WebElement lnkSubCategory;

	@FindBy(xpath = "//a[.='Computers']")
	WebElement lnkComputers;

	@FindBy(xpath = "//a[@id='SiteHeader_SiteTabs_sellLink']")
	WebElement lnkSell;

	@FindBy(xpath = "//a[.='General item']")
	WebElement lnkGeneralItem;
	
	@FindBy(xpath = "//label[contains(text(),'$49.99 and under')]")
	WebElement optPrice49;
	
	@FindBy(xpath = "//span[@aria-label = 'Size']/following::label[5]")
	WebElement optSizeXL;
	
	@FindBy(xpath = "//span[@aria-label = 'Size']")
	WebElement lblSize;
	
	@FindBy(xpath = "//span[@aria-label = 'Price']")
	WebElement lblPrice;
	
	@FindBy(xpath = "(//span[@class='product-tile__price-before'])[1]")
	WebElement lblItemPrice;
	
	
	/* Navigate to main Category */

	public boolean clickOnMainCategory(String mainCategory) throws InterruptedException {
		try {		
			lnkMainCategory.click();	 
			Thread.sleep(1000);
			return true;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return false;		  
	}

	/* Navigate to sub Category */

	public boolean clickOnSubCategory(String subCategory) {
		try {		
			lnkSubCategory.isDisplayed();				 
			return true;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return false;			
	}
	
	/* Select price filter*/

	public boolean selectPriceFilter() throws InterruptedException {
		try {		
			lblPrice.click();
			optPrice49.click();	
			Thread.sleep(1000);
			return true;
		} catch (NoSuchElementException e) {
			e.printStackTrace(); 
		}
		return false;			
	}
	
	/* Select size filter */

	public boolean selectSizeFilter() {
		try {	
			lblSize.click();
			optSizeXL.click();
			lblPrice.click();
			return true;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return false;			
	}
	
	/* Validate filtered items */

	public boolean validateResults() {
		try {	
			
			String price = lblItemPrice.getText();	
			if (price.contains("$45.00")) {
				return true;
			}
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return false;			
	}
	
	public void closeBrowser() {
		driver.close();
		driver.quit();		
	}

}
