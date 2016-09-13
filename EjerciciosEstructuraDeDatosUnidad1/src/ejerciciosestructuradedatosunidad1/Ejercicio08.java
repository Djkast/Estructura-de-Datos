package ejerciciosestructuradedatosunidad1;

/**
 * Universidad Tecnologica del Norte de Guanajuato
 * @author Omar Uriel Rodriguez Castañeda
 * Estructura de datos
 * Profesor Jose de Jesus Eduardo Barrientos Avalos
 */

public class Ejercicio08 {
public static int Mayor (int numeros[], int posicion){
        int aux;
        if (posicion == 0){
            return numeros [posicion];
        }
        else{
            aux = Mayor (numeros, posicion - 1);
            if(numeros [posicion] > aux){
                return numeros [posicion];
            }
            else{
                return Mayor(numeros, posicion - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arreglo[]= {4,5,2,10,9,8,5,-9,5};
        System.out.println("Numero mayor del arreglo: " + (Mayor(arreglo, arreglo.length - 1)));
    }
    
}