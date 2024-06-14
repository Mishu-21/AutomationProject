package Project1_Source;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Amazon_CartPage {
    WebDriver driver;
	@FindBy(id="nav-cart-count-container")
	WebElement click_on_Cart;
	
	@FindBy(xpath="//select[@id='quantity']")
	WebElement update_quantity;
	
	//@FindBy(xpath="(//span[@class='a-size-small sc-action-delete']/span/input)[1]")
//	@FindBy(xpath="(//div[@class='sc-item-content-group']/div/span[2])[1]")
	@FindBy(xpath="(//input[@class='a-color-link'])[1]")
	WebElement click_Delete;
	
	@FindBy(xpath="(//span[@class='a-size-base'])[1]")
	WebElement delete_Text;
	
	@FindBy(xpath="//span[@id='sc-subtotal-label-buybox']")
	WebElement item_Cart;
	
	@FindBy(xpath="//span[@id='sc-subtotal-amount-buybox']")
	WebElement item_CartPrice;
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement proceed_ToBuy;
	
	@FindBy(xpath="//table[@id='subtotals-marketplace-table']/tbody/tr[4]/td[2]")
	WebElement TotalAmount_CheckoutPage;
	
	public void Click_on_cart()
	{
		click_on_Cart.click();
	}
	
	public void Update_quantity()
	{
		Select s1=new Select(update_quantity);
		s1.selectByVisibleText("5");
	}
	
	public void remove_Item() throws InterruptedException
	{Thread.sleep(1000);
		click_Delete.click();
	
	//System.out.println(delete_Text.getText());
		Assert.assertTrue(delete_Text.isDisplayed(),"Not deleted the item which was added in cart");
		
	}
	
	public void TotalItemInCart()
	{
		/*
		//System.out.println(item_Cart.getText());
		String s1=item_Cart.getText();
	//	System.out.println(s1.replaceAll("[A-Z,a-z]",""));
		String s2=s1.replaceAll("[A-Z,a-z,(,),:]","").trim();
		
		System.out.println("Total item in cart");
		System.out.println(s2);
		String s3=item_CartPrice.getText();
		String s4=s3.replaceAll(",", "").trim();
		System.out.println("Total Amount in Cart:");
		System.out.println(s4);
		proceed_ToBuy.click();
		//System.out.println(TotalAmount_CheckoutPage.getText());
		String s5=TotalAmount_CheckoutPage.getText();
		String s6=s5.replaceAll("[₹]","").replaceAll(",", "").trim();
		System.out.println("Total Amount in Checkout page");
		System.out.println(s6);
		
		*/
		
		String s1=item_Cart.getText();
		s1=s1.replaceAll("[A-Z,a-z,(,),:]","").trim();
		System.out.println("Total item in cart");
		System.out.println(s1);
		String s2=item_CartPrice.getText();
		s2=s2.replaceAll(",", "").trim();
		System.out.println("Total Amount in Cart:");
		System.out.println(s2);
		proceed_ToBuy.click();
		String s3=TotalAmount_CheckoutPage.getText();
		s3=s3.replaceAll("[₹]","").replaceAll(",", "").trim();
		System.out.println("Total Amount in Checkout page");
		System.out.println(s3);
		
		
		if(s2.equals(s3))
		{
			System.out.println("Amount in cart and checkout page is same which means same item are present in cart and checkout page");
			
		}
		else
		{
			System.out.println("Amount in cart and checkout page is not same which means  items present in cart and checkout page are different");

		}
	}
	
	public Amazon_CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
}
