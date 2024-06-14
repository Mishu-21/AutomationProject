/*
 Test Case 11--->Validate the entire checkout process,including address selection,payement method selection,and order review.

 
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

public class TestCase11_VerifyCheckoutPage extends LaunchQuit{
	
	@Test
	public void testcase11() throws InterruptedException
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
		c1.verify_Payement();
		c1.ReviewOrder();
	}
	
	
}
