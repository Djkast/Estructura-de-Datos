package ejerciciosestructuradedatosunidad1;

/**
 * Universidad Tecnologica del Norte de Guanajuato
 * @author Omar Uriel Rodriguez Castañeda
 * Estructura de datos
 * Profesor Jose de Jesus Eduardo Barrientos Avalos
 */

public class Ejercicio05 {
    static int MCD(int a, int b) {
        if(b==0){
            return a;
        }
        else{
            return MCD(b, a % b);
        }
    }
    public static void main(String[] args) {
        System.out.println(MCD(5,3));
    }    
}