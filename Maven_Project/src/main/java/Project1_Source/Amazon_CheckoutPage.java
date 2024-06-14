package Project1_Source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amazon_CheckoutPage {

	WebDriver driver;
	
	@FindBy(xpath="//span[@id='shipToThisAddressButton']")
	WebElement Address_Button;
	
	@FindBy(xpath="//div[@class='a-column a-span10']")
	WebElement Address_Text;
	
	//@FindBy(xpath="//span[@id='orderSummaryPrimaryActionBtn']")
	//@FindBy(xpath="//span[@data-action='buy-button-as-primary-action']")
	//@FindBy(xpath="//span[@id='orderSummaryPrimaryActionBtn']/span/span")
	@FindBy(xpath="//span[.='Use this payment method']")
	WebElement payment_button;
	
	@FindBy(xpath="//input[@name='placeYourOrder1']")
	WebElement Order_Button;
	
	@FindBy(xpath="//input[@placeholder='Enter Code']")
	WebElement coupon_Code;
	
	@FindBy(xpath="//p[.='The promotional code you entered is not valid.']")
	WebElement coupon_Apply_Text;
	
	public void verify_Address()
	{
	
		Assert.assertEquals(Address_Text.getText(),"1 Select a delivery address","Address not verified");
		Address_Button.click();
	}
	
	public void verify_Payement() throws InterruptedException
	{
		//As we directly clicking on payment button so by default it will choose cod only if the amount of cart is less
		//so keep cart amt less
	
		Thread.sleep(5000);
		//System.out.println(payment_Text.getText());
	//	Assert.assertEquals(payment_Text.getText(),"2 Select a payment method","Payment not verified");
		//payment_button.click();
		
		boolean b1=payment_button.isEnabled();
		if(b1==true)
		{
			payment_button.click();
		}
		else
		{
			System.out.println(b1);
		}
	}
	
	public void Apply_CouponCode() throws InterruptedException
	{
		Thread.sleep(2000);
		coupon_Code.sendKeys("123456789");
		coupon_Code.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		boolean b1=coupon_Apply_Text.isDisplayed();
		if(b1==true)
		{
			System.out.println("Able to apply coupon");
		}
		else
		{
			System.out.println("Not Able to apply coupon");
		}
	}
	
	public void ReviewOrder() throws InterruptedException
	{
		Thread.sleep(3000);
		Assert.assertTrue(Order_Button.isDisplayed(),"Order button not display");
	}
	
	public Amazon_CheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

