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
public class Ejercicio01 {
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
    int datoLeido = fileReader.nextInt();
    System.out.println("Palas Cargadoras 78345");
    while (datoLeido==78345){
        datoLeido=fileReader.nextInt();
        System.out.println(contador + ": serie: " + datoLeido);
        datoLeido=fileReader.nextInt();
        contador++;
    }
    System.out.println("Retroexcavadoras 33287");
    while (datoLeido==33287){
        datoLeido=fileReader.nextInt();
        System.out.println(contador + ": serie: " + datoLeido);
        datoLeido=fileReader.nextInt();
        contador++;
    }
    System.out.println("Dumpers 63287");
    while (datoLeido==63287){
        datoLeido=fileReader.nextInt();
        System.out.println(contador + ": serie: " + datoLeido);
        try{
            datoLeido=fileReader.nextInt();
        }
        catch(Exception e){
            System.out.println("Se termino el archivo");
        }
        contador++;
    }
    }
    
}
