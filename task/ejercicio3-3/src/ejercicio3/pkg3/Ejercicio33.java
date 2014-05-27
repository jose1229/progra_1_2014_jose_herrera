/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio3.pkg3;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in=new Scanner(System.in);
        System.out.println("Ingrese un numero:");
       
        Operciones  ooperaciones= new Operciones();
        int resultado;
        int numero=in.nextInt();
       
        int numero2=numero%10;
        
        switch(numero2){
            case 2: 
                resultado=ooperaciones.opcion1(numero) ;
                System.out.println("El cuadrado del numero es: "+resultado); 
                break;
            case 4: 
                resultado=ooperaciones.opcion2(numero) ;
                System.out.println("EL numero multipido * 5 es: "+resultado);
                break;      
            case 5:  
                resultado=ooperaciones.opcion1(numero);
                System.out.println("El cuadrado del numero es: "+resultado);
            break;
            case 7:  
                resultado=ooperaciones.opcion2(numero);
                System.out.println("EL numero multipido * 5 es: "+resultado); 
            break;
            case 8:  
                resultado=ooperaciones.opcion1(numero);
                System.out.println("El cuadrado del numero es: "+resultado);
            break;
            case 9:  
                resultado=ooperaciones.opcion2(numero);
                System.out.println("EL numero multipido * 5 es: "+resultado);
            break;
            default:
                resultado=ooperaciones.opcion3(numero);
                System.out.println("EL numero es: "+resultado);
            
        }
        
        
        
        
        
    }
    
}
