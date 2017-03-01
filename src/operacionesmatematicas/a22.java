package operacionesmatematicas;

/**
 *
 * @author Edgar
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a22 {

    /**
     * @return opc
     */
    public int getOpc() {
        return opc;
    }

    /**
     * @param opc
     */
    public void setOpc(int opc) {
        this.opc = opc;
    }

    /**
     * @return  pi
     */
    public double getPi() {
        return pi;
    }

    /**
     * @param pi
     */
    public void setPi(double pi) {
        this.pi = pi;
    }

    /**
     * @return  r
     */
    public double getR() {
        return r;
    }

    /**
     * @param r
     */
    public void setR(double r) {
        this.r = r;
    }

    /**
     * @return  v1
     */
    public double getV1() {
        return v1;
    }

    /**
     * @param v1
     */
    public void setV1(double v1) {
        this.v1 = v1;
    }

    /**
     * @return h
     */
    public double getH() {
        return h;
    }

    /**
     * @param h
     */
    public void setH(double h) {
        this.h = h;
    }

    /**
     * @return  o
     */
    public String getO() {
        return o;
    }

    /**
     * @param o
     */
    public void setO(String o) {
        this.o = o;
    }

    private int opc = 6;
    private double pi = 3.1416;
    private double r;
    private double v1;
    private double h;
    private String o;

    /**Constructor vacio
     * 
     */
    public a22() {
    }
    /**Menu de navegacion
     * 
     * @throws IOException 
     */
    public void funcion() throws IOException {
        int a, b, c, v;
        int s = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        do {

            while (getOpc() < 1 || getOpc() > 5) {
                System.out.println("1. Volumen de un Paralelepipedo Rectangular");
                System.out.println("2. Volumen de una Esfera");
                System.out.println("3. Volumen de un Cilindro Recto");
                System.out.println("4. Volumen de un Cono Circular Recto");
                System.out.println("5. Salir");
                System.out.println("Seleccionar su opcion: ");
                setOpc(Integer.parseInt(in.readLine()));
            }
            switch (getOpc()) {
                case 1:
                    System.out.println("Ingresar la base, altura y ancho: ");
                    a = Integer.parseInt(in.readLine());
                    b = Integer.parseInt(in.readLine());
                    c = Integer.parseInt(in.readLine());
                    v = volumenParalepipedo(a, b, c);
                    System.out.println("El volumen es: " + v);
                    break;
                case 2:
                    System.out.println("Ingresar el radio: ");
                    setR(Integer.parseInt(in.readLine()));
                    setV1(volumenEsfera());
                    System.out.println("El volumen es: " + getV1());
                    break;
                case 3:
                    System.out.println("Ingresar el radio y la altura: ");
                    setR(Integer.parseInt(in.readLine()));
                    setH(Integer.parseInt(in.readLine()));
                    setV1(cilindroRecto());
                    System.out.println("El volumen es: " + getV1());
                    break;
                case 4:
                    System.out.println("Ingresar el radio y la altura: ");
                    setR(Integer.parseInt(in.readLine()));
                    setH(Integer.parseInt(in.readLine()));
                    setV1(ConoCircularRecto());
                    System.out.println("El volumen es: " + getV1());
                    break;
            }
            System.out.println("Deseas calcular otro volumen(s/n)?");
            setO(in.readLine());
            if ((getO().compareTo("n") == 0) || getO().compareTo("N") == 0) {
                s = 1;
            }
            setOpc(0);
        } while (s == 0);
    }
/**Funciones de calculo
 * 
 * @param a
 * @param b
 * @param c
 * @return 
 */
    public static int volumenParalepipedo(int a, int b, int c) {
        return a * b * c;
    }
/**Funciones de calculo
 * 
 * @return 
 */
    public double volumenEsfera() {
        return (getR() * getR() * getR()) * getPi() * (4 / 3);
    }
/**Funciones de calculo
 * 
 * @return 
 */
    public double cilindroRecto() {
        return getPi() * (getR() * getR()) * getH();
    }
/**Funciones de calculo
 * 
 * @return 
 */
    public double ConoCircularRecto() {
        return (cilindroRecto()) / 3;
    }

}
