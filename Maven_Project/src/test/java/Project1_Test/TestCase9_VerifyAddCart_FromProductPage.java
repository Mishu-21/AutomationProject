/*
TestCase 9----> Verify that items can be added to the shopping cart from product pages


Source Page Needed:
 login page,Home page,SearchProductResult page,Product Page

 */


package Project1_Test;

import org.testng.annotations.Test;

import Project1_Source.Amazon_HomePage;
import Project1_Source.Amazon_LoginPage;
import Project1_Source.Amazon_ProductPage;
import Project1_Source.Amazon_SearchProductResultPage;

public class TestCase9_VerifyAddCart_FromProductPage extends LaunchQuit{

	@Test
	public void testcase9() throws InterruptedException
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

	}
}
