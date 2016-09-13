package ejerciciosestructuradedatosunidad1;

/**
 * Universidad Tecnologica del Norte de Guanajuato
 * @author Omar Uriel Rodriguez Castañeda
 * Estructura de datos
 * Profesor Jose de Jesus Eduardo Barrientos Avalos
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Ejercicio02 {
    static final String DATA_PATH="datosEjercicio01.txt";
    public static void main(String[] args){
        Scanner fileReader = null;
        try{
            fileReader = new Scanner(new File(DATA_PATH));
            System.out.println("Archivo Abierto: " + DATA_PATH);
        }
        catch(FileNotFoundException e){
            System.out.println("El archivo " + DATA_PATH + " No se encuentra");
            System.out.println("Programa Terminado");
            System.exit(0);
        }
        int contador = 1;
        int datoLeido1;
        int datoLeido2;
        System.out.println("Palas Cargadoras 78345");
        while(fileReader.hasNextInt()){
            datoLeido1 = fileReader.nextInt();
            datoLeido2 = fileReader.nextInt();
            System.out.println(contador + ": prodcuto: " + datoLeido1 + " serie: " + datoLeido2);
            contador++;
        }
    }
}
