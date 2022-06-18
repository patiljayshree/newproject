package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.Loginpage;

public class LoginTest extends BaseTest
{
   Loginpage lp;
   
   @BeforeClass
   public void initObject()
   {
	   lp=new Loginpage(driver);
	   
   }
   @Test(priority=1)
   public void VerifyButton()
   {
	   System.out.println(lp.isbuttonPresent());
	   Assert.assertTrue(lp.isbuttonPresent());
   }
   @Test(priority=2)
   public void login()
   {
	   lp.login("Admin","admin123");
	   System.out.println(driver.getTitle());
	   Assert.assertEquals(driver.getTitle(),"OrangeHRM");
   }
   
   
   
}
