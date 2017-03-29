package testsjunit4;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hamcrest.core.IsSame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import entities.Operations;
import junit.framework.Assert;


public class TestApresAvant {

	final static Logger  logger =Logger.getLogger(TestApresAvant.class);
     
	@Before
	public void start(){
		 PropertyConfigurator.configure("log4j.properties"); 
	}
    @BeforeClass
    public static void avantTests() {
        System.out.println("------------------------");
        System.out.println("Avant Tests");
        System.out.println("------------------------");
    }
    
    @AfterClass
    public static void apresTests() {
        System.out.println("------------------------");
        System.out.println("Après Tests");
        System.out.println("------------------------");
    }
	    
	   
	    
	   @Test
	   public void TestSoutration(){
		   
		   double  result= Operations.soustraire(3,2);
		   logger.info( "Resultat : " +Operations.soustraire(3,1));	
		   Assert.assertEquals(1, result,0);
	   }
	   
	   @Test
	    public void valeursAvecUneDifferenceTropImportante() {
	        final double lResultat = Operations.soustraire(71.19, 98);
	        Assert.assertEquals(-26.81, lResultat, 0.001);
	    }
	   
	 
	    
}
