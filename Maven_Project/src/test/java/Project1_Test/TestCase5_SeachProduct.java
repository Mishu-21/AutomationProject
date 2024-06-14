/*

 TestCase5--->TestSearching for products using its name like shoe 


Source Page Needed:
 login page,Home page
 */

package Project1_Test;

import org.testng.annotations.Test;

import Project1_Source.Amazon_HomePage;
import Project1_Source.Amazon_LoginPage;

public class TestCase5_SeachProduct extends LaunchQuit {

	@Test
	public void testcase5() throws InterruptedException
	{
		Amazon_LoginPage l1= new Amazon_LoginPage(driver);
		l1.username();
		l1.ContinueButton();
		l1.Password();
		l1.SignInButton();
		
		Amazon_HomePage h1=new Amazon_HomePage(driver);
		h1.searchBox_Shoe(driver);
		
		
		
	}
}
