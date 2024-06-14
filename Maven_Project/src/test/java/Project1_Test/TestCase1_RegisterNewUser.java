/*
 Testcase1--> Test if a new user can successfully register


Source Page Needed:
 RegisterPage
 */


package Project1_Test;




import org.testng.annotations.Test;

import Project1_Source.Amazon_RegisterPage;

public class TestCase1_RegisterNewUser extends RegisterAmazon{

	@Test
	public void testCase1() throws InterruptedException
	{
	
		Amazon_RegisterPage a1=new Amazon_RegisterPage(driver);
		a1.username();
		a1.email();
		a1.Password();
		a1.ReEnter_Password();
		a1.Continue_Button(driver);
		
		//after clicking, puzzle come which cannot be automated
	}
	
}
