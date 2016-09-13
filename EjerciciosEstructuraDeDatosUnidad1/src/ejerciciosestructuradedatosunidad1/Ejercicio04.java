package ejerciciosestructuradedatosunidad1;

/**
 * Universidad Tecnologica del Norte de Guanajuato
 * @author Omar Uriel Rodriguez Castañeda
 * Estructura de datos
 * Profesor Jose de Jesus Eduardo Barrientos Avalos
 */

public class Ejercicio04 {
    static int Factorial(int n){
        if(n <= 1){
            return 1;
        }
        else{
            return n*Factorial(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(Factorial(5));
    }
}