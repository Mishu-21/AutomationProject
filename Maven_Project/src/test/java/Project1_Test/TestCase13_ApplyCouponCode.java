/*
 Test Case 13--->Check if user is able to apply for coupon code while ordering the products.
 
Source Page Needed:
 login page,Home page,SearchProductResult page,Product Page,Checkout Page


 
 */

package Project1_Test;

import org.testng.annotations.Test;

import Project1_Source.Amazon_CheckoutPage;
import Project1_Source.Amazon_HomePage;
import Project1_Source.Amazon_LoginPage;
import Project1_Source.Amazon_ProductPage;
import Project1_Source.Amazon_SearchProductResultPage;

public class TestCase13_ApplyCouponCode extends LaunchQuit{

	@Test
	public void testcase13() throws InterruptedException
	{
		Amazon_LoginPage l1= new Amazon_LoginPage(driver);
		l1.username();
		l1.ContinueButton();
		l1.Password();
		l1.SignInButton();
		
		Amazon_HomePage h1=new Amazon_HomePage(driver);
		h1.searchBox_Shoe(driver);
		
		
		
		Amazon_SearchProductResultPage s1= new Amazon_SearchProductResultPage(driver);
		s1.Click_SearchedProduct(driver);
		
		Amazon_ProductPage p1=new Amazon_ProductPage(driver);
		p1.AddToCart_Click();
		p1.ProceedToBuy_Click();
		
		
		Amazon_CheckoutPage c1=new Amazon_CheckoutPage(driver);
		c1.verify_Address();
		c1.Apply_CouponCode();
		
	}
	
}
