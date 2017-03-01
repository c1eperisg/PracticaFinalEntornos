package operacionesmatematicas;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edgar
 */
public class Ecuacion2gTest {
    
    public Ecuacion2gTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test del metodo discriminateCalc, de la clase Equacion2g.
     */
    @Test
    public void testDiscrminateCalc() {
        System.out.println("discrminateCalc");
        double expResult = 0.0;
        double result = Ecuacion2g.discrminateCalc();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test del metodo discriminate, de la clase Equacion2g.
     */
    @Test
    public void testDiscriminate() {
        System.out.println("discriminate");
        double discriminante = 0.0;
        Ecuacion2g instance = new Ecuacion2g();
        instance.discriminate(discriminante);
 
    }

    /**
     * Test del metodo pimag, de la clase Equacion2g.
     */
    @Test
    public void testPimag() {
        System.out.println("pimag");
        double discriminante = 0.0;
        double expResult = 0.0;
        double result = Ecuacion2g.pimag(discriminante);
    

    }

    /**
     * Test del metodo preal, de la clase Equacion2g.
     */
    @Test
    public void testPreal() {
        System.out.println("preal");
        double expResult = 0.0;
        double result = Ecuacion2g.preal();
       

    }

    /**
     * Test del metodo X2, de la clase Equacion2g.
     */
    @Test
    public void testX2() {
        System.out.println("x2");
        double discriminante = 0.0;
        double expResult = 0.0;
        double result = Ecuacion2g.x2(discriminante);
        

    }

    /**
     * Test del metodo X1, de la clase Equacion2g.
     */
    @Test
    public void testX1() {
        System.out.println("x1");
        double discriminante = 0.0;
        double expResult = 0.0;
        double result = Ecuacion2g.x1(discriminante);
  

    }
    
}
