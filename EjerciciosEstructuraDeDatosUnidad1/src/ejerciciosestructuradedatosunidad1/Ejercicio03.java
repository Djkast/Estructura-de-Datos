package ejerciciosestructuradedatosunidad1;

/**
 * Universidad Tecnologica del Norte de Guanajuato
 * @author Omar Uriel Rodriguez Castañeda
 * Estructura de datos
 * Profesor Jose de Jesus Eduardo Barrientos Avalos
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio03 {
    
    String tipoEmple[];
    String Nombre[];
    int Horas [];
    int Pago[];
    Scanner fileReader = null;
    int tam;
    int TotalPagado = 0;
    float PromedioPago;
    
    public void definirArreglo() {
        
        try{
            fileReader = new Scanner(new File("datosEjercicio03.txt"));
            System.out.println("Archivo Abierto");
        }
        catch(FileNotFoundException e){
            System.out.println("El archivo no se encuentra");
            System.out.println("Programa Terminado");
            System.exit(0);
        }
        int tam = fileReader.nextInt();
        tipoEmple = new String [tam];
        Nombre = new String [tam];
        Horas = new int [tam];
        Pago = new int [tam];
    }
    
    public void recorrerArreglo(){
        for(int i = 1; i < tipoEmple.length; i++ ){
            tipoEmple[i] = fileReader.next();
            Nombre[i] = fileReader.next();
            Horas[i] = fileReader.nextInt();
        }
    }
    
    public void imprimirDatos(){
        for(int i = 1; i < tipoEmple.length; i++ ){
            System.out.print(tipoEmple[i] + " --> ");
            System.out.print(Nombre[i] + " --> ");
            System.out.print(Horas[i] + " --> ");
            System.out.println(Pago[i] + "");
        }
    
    }
    
    public void PagoTraba (){
        for(int i = 1; i < tipoEmple.length; i++ ){
            if("A".equalsIgnoreCase(tipoEmple[i])){
                 Pago[i]=Horas[i]*150;
            }
            else{
                if("B".equalsIgnoreCase(tipoEmple[i])){
                 Pago[i]=Horas[i]*250;
                }
                else{
                    if("C".equalsIgnoreCase(tipoEmple[i])){
                    Pago[i]=Horas[i]*500;
                    }
                }
            }
        
        
        }
    }
    
    public void Promedio(){
        for(int i = 1; i < tipoEmple.length; i++ ){
            TotalPagado = TotalPagado + Pago[i];
            PromedioPago = TotalPagado/tipoEmple.length;
        }
        System.out.println("El promedio de pago es de: " + PromedioPago);
    }
    
    public void defineMayor(){
        float mayor = Pago[0];
        int ValMay = 0;
        for (int i=0; i<Pago.length; i++){
            if(Pago[i]>=mayor){
                mayor = Pago[i];
                ValMay = i;
            }
        }
        System.out.println("El mayor pago es de: " + Nombre[ValMay] + " con: " + Pago[ValMay]);
    }  
    
    public void defineMenor(){
        float menor =Pago[1];
        int ValMen = 0;
        for (int i=0; i < Pago.length; i++){
            if(Pago[i] < menor){
                menor = Pago[i];
                ValMen = i;
            }
        }
        System.out.println("El pago menor es de: " + Nombre[ValMen] + " con: " + Pago[ValMen]);
    }
    
    public static void main(String[] args) {
        Ejercicio03 obj = new Ejercicio03();
        obj.definirArreglo();
        obj.recorrerArreglo();
        obj.PagoTraba();
        obj.imprimirDatos();
        System.out.println("");
        obj.defineMayor();
        obj.defineMenor();
        obj.Promedio();
        
    }
}
