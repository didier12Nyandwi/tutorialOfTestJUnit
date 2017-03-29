package testsjunit4;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.hamcrest.core.IsSame;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import entities.Operations;
import entities.TestLogger;

public class TestOperations {
	static Logger  logger;

	@Before
	public void setUp() throws Exception {
		this.logger = Logger.getLogger(TestOperations.class);
	}

	@Test
	public void testAdditionner(){
		PropertyConfigurator.configure("log4j.properties");
		logger.info(" input the test method : testAdditionner");
		final long  add= Operations.additionner(12,3);
		logger.info("the output resuldat of value  add = "+add);
		Assert.assertEquals(add, 15);
		}
	
	 @Test
	    public void additionAvecCinqNombres() {
		 PropertyConfigurator.configure("log4j.properties"); 
		 logger.info(" input the test method : additionAvecCinqNombres");
	       final long lAddition = Operations.additionner(256, 512, 1024, 2048, 4096);
			logger.info("the output resuldat of value add = "+lAddition);
          Assert.assertEquals(7936, lAddition);
	    }
	 @Test
	    public void addition_Parms_IS_ZERO() {
		 PropertyConfigurator.configure("log4j.properties"); 
		 logger.info(" input the test method : addition_Parms_IS_Zero");
	       final long lAddition = Operations.additionner(0);
			logger.info("the output resuldat of value add = "+lAddition);
       Assert.assertNull(null);
	    }
	 
	 @Test
	    public void addition_In_Parms_WITH_Char() {
		 PropertyConfigurator.configure("log4j.properties"); 
		 logger.info(" input the test method :  addition_In_Parms_WITH_Char");
	     final long lAddition = Operations.additionner('a');
		 logger.info("the output resuldat of value add = "+lAddition);
         Assert.assertEquals(97, lAddition);
   
	    }
	 
	 @Test
	    public void mutiplicationAvecDeuxNombres() {
	        final long lMultiplication = Operations.multiplier(10, 20);
	        Assert.assertEquals(200, lMultiplication);
	    }
	 @Test
	 public void testMutiplicationAvecCinqNombres() {
	        final long lMultiplication = Operations.additionner(256, 512, 1024, 2048, 4096);
	        logger.info("resultat of testMutiplicationAvecCinqNombres : "+lMultiplication);
	        Assert.assertEquals(7936, lMultiplication);
	    }
	 
	 
	 @Test(expected=IllegalArgumentException.class)
	 public void testDevisionDeuxNombre(){
		Operations.diviser(0);
     }
	 
	 @Ignore
	 @Test(expected=ArithmeticException.class)
	    public void divisionAvecDeuxNombresArithmeticException() {
	        Operations.diviser(10, 5);
	    }
	 
	 @Test(timeout=1000)
	    public void dureeRespectee() {
	        
	    }
         
	    @Ignore
	    @Test(timeout=10000)
	    public void dureeNonRespectee() throws InterruptedException {
	        Thread.sleep(10000);
	    }
	    @Test
	    public void nonIgnore1() {
	        
	    }
        
	     @Ignore
	    @Test
	    public void nonIgnore2() {
	        Assert.fail("Echec");
	    }

	    @Ignore
	    @Test
	    public void ignore() {
	        Assert.fail("Echec ignoré");
	    }
	    
	    @Test
	    public void pareil() {
	        // Remarque : c'est la même instance à cause du cache
		   Assert.assertThat("texte", IsSame.sameInstance("texte"));
	    }
	    @Test 
	    public void egal1(){
	    	Assert.assertThat("Texte",IsEqual.equalTo("Texte"));
	    }
	    
	    @Test 
	    public void egal2(){
	    	logger.info("new String(Texte)"+new String("Texte"));
	    	Assert.assertThat(new String("Texte"),IsEqual.equalTo("Texte"));
	    }
	    
	    @Test 
	    public void testValueIsnull(){
	    	String val1= "Se" ; 
	    	Assert.assertThat(val1, IsNull.notNullValue());
	    }
	    
	   
	    
	 
	
	 


}
