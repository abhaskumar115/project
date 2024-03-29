package testCases;
import org.testng.annotations.Test;
import pageObjects.movieTickets;

public class Tc3_movies 
{
	movieTickets mt;
	
  @Test(priority=1)
  public void test1() throws InterruptedException 
  {

	  new Tc1_city();
	  mt=new movieTickets(Tc1_city.driver);
	  Thread.sleep(5000);
	  mt.clickMovies();
  }
  
  @Test(priority=2)
  public void test2()
  {
	  mt.language();
  }
}
