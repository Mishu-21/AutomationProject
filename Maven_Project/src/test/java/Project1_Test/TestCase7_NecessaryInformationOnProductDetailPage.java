/*


 Test Case7-->ensure that product detail page  display all necessary information(price,review,description) 


  Source Page Needed:
 login page,Home page,SearchProductResult page,Product Page
 */



package Project1_Test;

import org.testng.annotations.Test;

import Project1_Source.Amazon_HomePage;
import Project1_Source.Amazon_LoginPage;
import Project1_Source.Amazon_ProductPage;
import Project1_Source.Amazon_SearchProductResultPage;

public class TestCase7_NecessaryInformationOnProductDetailPage extends LaunchQuit {
	
	@Test
	public void testcase7() throws InterruptedException
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
		p1.price_display();
		p1.discription_display();
		p1.review_display();
	}

}
