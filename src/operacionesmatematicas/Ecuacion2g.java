package operacionesmatematicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Edgar
 */
public class Ecuacion2g {

    /**
     * @return a
     */
    public static double getA() {
        return a;
    }

    /**
     * @param para hacer set a
     */
    public static void setA(double aA) {
        if (aA == 0) {
            System.out.println("NO puede ser 0");
        } else {
            a = aA;
        }
    }

    /**
     * @return b
     */
    public static double getB() {
        return b;
    }

    /**
     * @param para hacer set b
     */
    public static void setB(double aB) {
        b = aB;
    }

    /**
     * @return c
     */
    public static double getC() {
        return c;
    }

    /**
     * @param para hacer set c
     */
    public static void setC(double aC) {
        c = aC;
    }
    private static double a;               // Coeficiente de grado 2
    private static double b;               // Coeficiente de grado 1
    private static double c;               // Coeficiente de grado 0

    /**Constructor
     * 
     */
    public Ecuacion2g() {
        a = 0.0;
        b = 0.0;
        c = 0.0;
    }
    /**Menu principal
     * 
     * @throws IOException 
     */
    public void funcion() throws IOException {

        double discriminante;   // Discriminante
        double x1;              // Primera raiz real
        double x2;              // Segunda raiz real
        double preal;           // Parte real de la raiz compleja
        double pimag;           // Parte imaginaria de la raiz compleja
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el coeficiente a de la ecuación:");
        setA(Double.parseDouble(lector.readLine()));
        System.out.println("Introduce el coeficiente b de la ecuación:");
        setB(Double.parseDouble(lector.readLine()));
        System.out.println("Introduce el coeficiente c de la ecuación:");
        setC(Double.parseDouble(lector.readLine()));
        discriminante = discrminateCalc();
        discriminate(discriminante);

    }
    /**Calcula la discriminacion de las equaciones
     * 
     * @return discriminacion
     */
    public static double discrminateCalc() {
        return getB() * getB() - 4 * getA() * getC();
    }

    public void discriminate(double discriminante) {
        double x1;
        double x2;
        double preal;
        double pimag;
        if (getA() == 0) {
            System.out.println("Te he dicho que no puede ser 0");
        } else if (discriminante > 0) {
            // Dos raices reales
            x1 = x1(discriminante);
            x2 = x2(discriminante);
            System.out.print("Soluciones de la ecuacion de segundo grado: ");
            System.out.println(getA() + "x2 + " + getB() + "x + " + getC());
            System.out.println("Tiene dos raices reales");
            System.out.println("La primera raiz es x1 = " + x1);
            System.out.println("La segunda raiz es x2 = " + x2);
        } else if (discriminante < 0) {
            // Dos raices imaginarias
            preal = preal();
            pimag = pimag(discriminante);
            System.out.print("Soluciones de la ecuacion de segundo grado: ");
            System.out.println(getA() + "x2 + " + getB() + "x + " + getC());
            System.out.println("Tiene dos raices complejas");
            System.out.println("La primera raiz es x1 = " + preal + "+i" + pimag);
            System.out.println("La segunda raiz es x2 = " + preal + "-i" + pimag);
        } else {
            // Dos raices iguales
            x1 = preal();
            System.out.print("Soluciones de la ecuacion de segundo grado: ");
            System.out.println(getA() + "x2 + " + getB() + "x + " + getC());
            System.out.println("Dos raices identicas, x1 = x2 = " + x1);
        }
    }
/** Calculo parte imaginaria
 * 
 * @param discriminante
 * @return 
 */
    public static double pimag(double discriminante) {
        return Math.sqrt(-discriminante) / (2 * getA());
    }
/**Calculo de la parte real
 * 
 * @return 
 */
    public static double preal() {
        return (-getB()) / (2 * getA());
    }
/**Funciones de analisis dentro de discriminate
 * 
 * @param discriminante
 * @return 
 */
    public static double x2(double discriminante) {
        return (-getB() - Math.sqrt(discriminante)) / (2 * getA());
    }

   /** Funciones de analisis dentro de discriminate
    * 
    * @param discriminante
    * @return 
    */
    public static double x1(double discriminante) {
        return (-getB() + Math.sqrt(discriminante)) / (2 * getA());
    }

}
