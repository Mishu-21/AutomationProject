/*
 Test Case 15--->Reach till cart page without login in amazon application 


 Source Page Needed:
Home page,SearchProductResult page,Product Page,Cart page

 */

package Project1_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Project1_Source.Amazon_CartPage;
import Project1_Source.Amazon_HomePage;

import Project1_Source.Amazon_ProductPage;
import Project1_Source.Amazon_SearchProductResultPage;

public class TestCase15_ReachTillCartWithoutLogin {


	@Test
	public void testcase15() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		Amazon_HomePage h1=new Amazon_HomePage(driver);
		h1.searchBox_Shoe(driver);
		
		
		
		Amazon_SearchProductResultPage s1= new Amazon_SearchProductResultPage(driver);
		s1.Click_SearchedProduct(driver);
		
		
		Amazon_ProductPage p1=new Amazon_ProductPage(driver);
		p1.AddToCart_Click();
		
		Amazon_CartPage c1=new Amazon_CartPage(driver);
		c1.Click_on_cart();

	}
}
