package CucumberPageObjectModel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class dashBoardPage extends baseclass {

@FindBy(css = "select[name='stockType']") WebElement stokeType;
@FindBy(css = "select[name='makeId']") WebElement makeId;

@FindBy(css = "select[name='modelId']") WebElement modelId;
@FindBy(css = "select[name='priceMax']") WebElement priceMax;
@FindBy(css = "select[name='radius']") WebElement radius;
@FindBy(css = "input[name='zip']") WebElement zip;
@FindBy(css = "input[value='Search']") WebElement searchbutton;

@FindBy(css = ".filter-header .breadcrumb[data-dimension-id='prMx'] label") WebElement priceMaxLabel;
@FindBy(css = ".filter-header .breadcrumb[data-dimension-id='stkTypId'] label") WebElement stockLabel;
@FindBy(css = ".filter-header .breadcrumb[data-dimension-id='mkId'] label") WebElement makeLabel;
@FindBy(css = ".filter-header .breadcrumb[data-dimension-id='mdId'] label") WebElement modelLabel;
@FindBy(css = ".filter-header .breadcrumb[data-dimension-id='trId'] label") WebElement trLabel;

@FindBy(css = ".refinements #stkTypId-28880~label") WebElement filterIdNew;
@FindBy(css = "#trId-36434822~label") WebElement touring8passenger;

@FindBy(css = "#listing-836761935") WebElement available2ndCar;

@FindBy(css = ".vehicle-info__title.cui-heading-2--secondary") WebElement available2ndCarTitle;

@FindBy(css = "input[name='fname']") WebElement fname;
@FindBy(css = "input[name='lname']") WebElement lname;
@FindBy(css = "input[name='email']") WebElement email;
@FindBy(css = ".page-section__title--sub.cui-heading-2.calculator-title") WebElement paymentCalculator;



	public dashBoardPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void setDashboardFields(String stockTypeInput,String makeIdInput,String modelIdInput,String priceMaxInput,String radiusInput,String zipInput) {
		clickevent(stokeType);
		sendkeystoSelectorElement(stokeType, stockTypeInput);
		clickevent(makeId);
		sendkeystoSelectorElement(makeId, makeIdInput);
		clickevent(modelId);
		sendkeystoSelectorElement(modelId, modelIdInput);
		clickevent(priceMax);
		sendkeystoSelectorElement(priceMax, priceMaxInput);
		clickevent(radius);
		sendkeystoSelectorElement(radius, radiusInput);
		clickevent(radius);
		
		SendKeysevent(zip, zipInput);
		clickevent(searchbutton);
		
		String prxlbl = priceMaxLabel.getText().substring(15);
		
		Assert.assertEquals(priceMaxInput,prxlbl );
		Assert.assertEquals(stockTypeInput.substring(0, 4),stockLabel.getText() );
		Assert.assertEquals(modelIdInput, modelLabel.getText());
		Assert.assertEquals(makeIdInput,makeLabel.getText() );
		
	}
	public void moreNewFilters() throws InterruptedException {
//		JSMovetoElement(filterIdNew);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", filterIdNew);
//		Thread.sleep(1500);
		clickevent(filterIdNew);
		Thread.sleep(1500);
	}
	
	public void assertNewFilters() throws InterruptedException {
		String stkId = filterIdNew.getText().trim().trim();
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.cssSelector(".filter-header .breadcrumb[data-dimension-id='stkTypId'] label")));
//		JSMovetoElement(driver.findElement(By.cssSelector(".filter-header .breadcrumb[data-dimension-id='stkTypId'] label")));
		Thread.sleep(1500);
		Assert.assertEquals(stkId, driver.findElement(By.cssSelector(".filter-header .breadcrumb[data-dimension-id='stkTypId'] label")).getText());
	}
	public void clickonTrimAssert() throws InterruptedException {
		JSMovetoElement(touring8passenger);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", touring8passenger);
		Thread.sleep(500); 
		clickevent(touring8passenger);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", trLabel);
		Assert.assertEquals(touring8passenger.getText().trim().trim(), driver.findElement(By.cssSelector(".filter-header .breadcrumb[data-dimension-id='trId'] label")).getText());
	}
	public void clickon2ndCarAssert() {
		clickevent(available2ndCar);
		Assert.assertEquals("2020 Honda Pilot Touring 8-Passenger", available2ndCarTitle.getText());
		if(driver.findElement(By.cssSelector("button[name='submit']")).isDisplayed()) {
			assertTrue(true);
		}
		else {
		assertFalse(false);
		}
	}
	
	public void contactSeller(String f_Name,String L_Name,String Email)
	{
		SendKeysevent(fname, f_Name);
		SendKeysevent(lname, L_Name);
		SendKeysevent(email, Email);
		
		
	}
	public void moveToPaymentCalculatorandScreenshot() throws IOException {
		JSMovetoElement(paymentCalculator);
		capturescreenshot("paymentCalculator");
	}
	
}
