/*
TestCase8----> Check if the products can be sorted by relevance,price ,rating etc


Source Page Needed:
 login page,Home page,SearchProductResult page
 */

package Project1_Test;

import org.testng.annotations.Test;

import Project1_Source.Amazon_HomePage;
import Project1_Source.Amazon_LoginPage;
import Project1_Source.Amazon_SearchProductResultPage;

public class TestCase8_SortByPriceAndRating extends LaunchQuit{

	@Test
	public void testcase8() throws InterruptedException
	{
		Amazon_LoginPage l1= new Amazon_LoginPage(driver);
		l1.username();
		l1.ContinueButton();
		l1.Password();
		l1.SignInButton();
		
		Amazon_HomePage h1=new Amazon_HomePage(driver);
		h1.searchBox_Shoe(driver);
		
		
		Amazon_SearchProductResultPage s1= new Amazon_SearchProductResultPage(driver);
		s1.sortBy_Price_LowToHigh(driver);
		s1.sortBy_Review(driver);
	}
		
}
