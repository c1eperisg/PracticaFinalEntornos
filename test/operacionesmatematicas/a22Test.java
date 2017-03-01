package operacionesmatematicas;
import java.io.BufferedReader;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Edgar
 */
public class a22Test {
    
    public a22Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }


    /**
     * Test del metodo VolumenParalepipedo, de la classe a22.
     */
    @Test
    public void testVolumenParalepipedo() {
        System.out.println("volumenParalepipedo");
        int a = 0;
        int b = 0;
        int c = 0;
        int expResult = 0;
        int result = a22.volumenParalepipedo(a, b, c);
        assertEquals(expResult, result);
        
    }

    /**
     * Test del metodo volumenEsfera, de la classe a22.
     */
    @Test
    public void testVolumenEsfera() {
        System.out.println("volumenEsfera");
        a22 instance = new a22();
        double expResult = 0.0;
        double result = instance.volumenEsfera();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test del metodo CilindroRecto, de la classe a22.
     */
    @Test
    public void testCilindroRecto() {
        System.out.println("cilindroRecto");
        a22 instance = new a22();
        double expResult = 0.0;
        double result = instance.cilindroRecto();
        assertEquals(expResult, result, 0.0);
   
    }

    /**
     * Test del metodo ConoCircularRecto, de la classe a22.
     */
    @Test
    public void testConoCircularRecto() {
        System.out.println("ConoCircularRecto");
        a22 instance = new a22();
        double expResult = 0.0;
        double result = instance.ConoCircularRecto();
        assertEquals(expResult, result, 0.0);
       
    }
    
}
