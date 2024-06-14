/*

 TestCase 6--->Verify that searching with filters (eg. category,pricerange) yields accurate result


 Source Page Needed:
 login page,Home page,SearchProductResult page
 
 */

package Project1_Test;

import org.testng.annotations.Test;

import Project1_Source.Amazon_HomePage;
import Project1_Source.Amazon_LoginPage;
import Project1_Source.Amazon_SearchProductResultPage;

public class TestCase6_SearchingWithFilter extends LaunchQuit {
	@Test
	public void testcase6() throws InterruptedException
	{
		Amazon_LoginPage l1= new Amazon_LoginPage(driver);
		l1.username();
		l1.ContinueButton();
		l1.Password();
		l1.SignInButton();
		
		Amazon_HomePage h1=new Amazon_HomePage(driver);
		h1.searchBox_Shoe(driver);
		
		Amazon_SearchProductResultPage s1= new Amazon_SearchProductResultPage(driver);
			   s1.filter_By_Category(driver);
		        s1.filter_By_price_WhichIsSlider();
		        
	}
}
