package ejerciciosestructuradedatosunidad1;

/**
 * Universidad Tecnologica del Norte de Guanajuato
 * @author Omar Uriel Rodriguez Castañeda
 * Estructura de datos
 * Profesor Jose de Jesus Eduardo Barrientos Avalos
 */

public class Ejercicio06 {
    private static int movimientos = 0;
    public static int mover(int n, char a, char b, char c) {
        if (n > 0) {
            mover(n - 1, a, c, b);
            System.out.println("mover disco " + a + " a " + c);
            movimientos++;
            mover(n - 1, b, a, c);
        }
            return movimientos;
    }
    public static void main(String[]args){
	java.util.Scanner leer = new java.util.Scanner(System.in);
	int movimientos;
	System.out.println("Numero de discos: ");
	int n=leer.nextInt();
	movimientos = Ejercicio06.mover(n, 'A', 'B', 'C');
	System.out.println("\nMovimientos efectuados: "+movimientos);
    }
}