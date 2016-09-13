package ejerciciosestructuradedatosunidad1;

/**
 * Universidad Tecnologica del Norte de Guanajuato
 * @author Omar Uriel Rodriguez Castañeda
 * Estructura de datos
 * Profesor Jose de Jesus Eduardo Barrientos Avalos
 */

public class Ejercicio07 {

    int Separar(int n) {
        int num = n;
        if (n == 0) {      //caso base
            return n;
        } else {
            num = n % 10;
            if (num == 0) {
                System.out.println(" cero ");
            }
            if (num == 1) {
                System.out.println(" uno ");
            }
            if (num == 2) {
                System.out.println(" dos ");
            }
            if (num == 3) {
                System.out.println(" tres ");
            }
            if (num == 4) {
                System.out.println(" cuatro ");
            }
            if (num == 5) {
                System.out.println(" cinco ");
            }
            if (num == 6) {
                System.out.println(" seis ");
            }
            if (num == 7) {
                System.out.println(" siete ");
            }
            if (num == 8) {
                System.out.println(" ocho ");
            }
            if (num == 9) {
                System.out.println(" nueve ");
            }
            return Separar(n / 10);
        }
    }

    public static void main(String[] args) {
        Ejercicio07 obj = new Ejercicio07();
        obj.Separar(12345);

    }

}
