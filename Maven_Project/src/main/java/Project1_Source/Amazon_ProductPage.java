package Project1_Source;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class Amazon_ProductPage {

	
	WebDriver driver;
	
	@FindBy(xpath="(//span[@class='a-price-whole'])[1]")
	WebElement price;
	
	@FindBy(xpath="(//h2[normalize-space()='Product description'])[1]")
	WebElement discription;
	
	@FindBy(xpath="(//h2[normalize-space()='Customer reviews'])[1]")
	WebElement review;
	

	@FindBy(id="add-to-cart-button")
	WebElement add_To_Cart;
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement Proceed_To_Buy;
	
	@FindBy(xpath=" //h1[normalize-space()='Added to Cart']")
	WebElement Verify_ItemIsAddedToCart;
	
	@FindBy(xpath="//h1[normalize-space()='Checkout']")
	WebElement Verify_ReachedCheckout;
	 
	
	
	public void price_display() throws InterruptedException
	{
		
		//title can keep on changing so title wala wait mt use karo  
		/*
		 * WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
		 * w1.until(ExpectedConditions.
		 * titleIs("Buy ASIAN Wonder-13 Grey Firozi Running,Sports,Walking Shoes for Men UK-9 at Amazon.in"
		 * ));
		 */
		
		//use thread.sleep time
		Thread.sleep(1000);
		boolean b= price.isDisplayed();
		System.out.println("Price displayed is=" +b);
	}
	
	
	public void discription_display() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean b= discription.isDisplayed();
		System.out.println("discription displayed is=" +b);
	}
	
	
	public void review_display() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean b= review.isDisplayed();
		System.out.println("Review displayed is=" +b);
	}
	
	public void AddToCart_Click() throws InterruptedException
	{
		Thread.sleep(1000);
		add_To_Cart.click();
		Thread.sleep(1000);
		boolean b1=Verify_ItemIsAddedToCart.isDisplayed();
		if(b1==true)
		{
			System.out.println("Item is added successfully");
		}
		else
		{
			System.out.println("Item is not added successfully");
		}	
		
	}
	
	public void ProceedToBuy_Click() throws InterruptedException
	{
		Proceed_To_Buy.click();
		Thread.sleep(1000);
		Assert.assertTrue(Verify_ReachedCheckout.isDisplayed(),"Not Reached Chckout Page");
		
	}
	
	public Amazon_ProductPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
}
