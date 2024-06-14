/*

 Test Case 12--->Check if user is able to count the total number of items in the cart and on going to the payment page,the same number of items are exactly being displayed  is able to select payment method
 
 */

package Project1_Test;

import org.testng.annotations.Test;

import Project1_Source.Amazon_CartPage;
import Project1_Source.Amazon_HomePage;
import Project1_Source.Amazon_LoginPage;
import Project1_Source.Amazon_ProductPage;
import Project1_Source.Amazon_SearchProductResultPage;

public class TestCase12_ItemInCartAndCheckoutSame extends LaunchQuit{
	@Test
	public void testcase10() throws InterruptedException
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
		
		Amazon_CartPage c1=new Amazon_CartPage(driver);
		c1.Click_on_cart();
		c1.TotalItemInCart();
	}
	
	

}
