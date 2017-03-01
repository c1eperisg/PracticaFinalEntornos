package operacionesmatematicas;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Edgar
 */
public class CalculadoraTest {

    public CalculadoraTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test del metodo funcion method, de la classe Calculadora.
     */
    @Test
    public void testFuncion() throws Exception {
        System.out.println("funcion");
        Calculadora instance = new Calculadora();
        instance.suma();
        instance.resta();
        instance.multiplicar();
        instance.dividir();

    }

}
