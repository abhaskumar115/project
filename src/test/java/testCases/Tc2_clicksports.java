package testCases;
import org.testng.annotations.Test;
import pageObjects.homePage;

public class Tc2_clicksports{
	homePage hm;
	
  @Test
  public void f() throws InterruptedException 
  {
	new Tc1_city();
	hm=new homePage(Tc1_city.driver);
	hm.clickSports();
	  

  }
}
