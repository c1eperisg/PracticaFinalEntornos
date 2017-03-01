/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmatematicas;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
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
     * Test of discrminateCalc method, of class Ecuacion2g.
     */
    @Test
    public void testDiscrminateCalc() {
        System.out.println("discrminateCalc");
        double expResult = 0.0;
        double result = Ecuacion2g.discrminateCalc();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of discriminate method, of class Ecuacion2g.
     */
    @Test
    public void testDiscriminate() {
        System.out.println("discriminate");
        double discriminante = 0.0;
        Ecuacion2g instance = new Ecuacion2g();
        instance.discriminate(discriminante);
 
    }

    /**
     * Test of pimag method, of class Ecuacion2g.
     */
    @Test
    public void testPimag() {
        System.out.println("pimag");
        double discriminante = 0.0;
        double expResult = 0.0;
        double result = Ecuacion2g.pimag(discriminante);
    

    }

    /**
     * Test of preal method, of class Ecuacion2g.
     */
    @Test
    public void testPreal() {
        System.out.println("preal");
        double expResult = 0.0;
        double result = Ecuacion2g.preal();
       

    }

    /**
     * Test of x2 method, of class Ecuacion2g.
     */
    @Test
    public void testX2() {
        System.out.println("x2");
        double discriminante = 0.0;
        double expResult = 0.0;
        double result = Ecuacion2g.x2(discriminante);
        

    }

    /**
     * Test of x1 method, of class Ecuacion2g.
     */
    @Test
    public void testX1() {
        System.out.println("x1");
        double discriminante = 0.0;
        double expResult = 0.0;
        double result = Ecuacion2g.x1(discriminante);
  

    }
    
}
