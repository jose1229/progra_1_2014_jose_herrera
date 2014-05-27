/*
 *•	Ingresar una letra entre a y e y reportar el mensaje de acuerdo a:
A excelente
B bueno
C regular
D malo
E pésimo

 */

package ejercicio3.pkg2;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class Ejercicio32 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         System.out.println("digite una letra:a, b, c, d o e ");
         char letra;
         letra=in.nextLine().charAt(0);
          Letras oletra=new Letras();
          String resultado;
        
          switch(letra){
            case ('a'): 
                resultado=oletra.a();
                System.out.println(resultado); 
                break;
            case 'b': 
                resultado=oletra.b();
                System.out.println(resultado);
                break;      
            case 'c':  
                resultado=oletra.c();
                System.out.println(resultado);
            break;
            case 'd':  
                resultado=oletra.d();
                System.out.println(resultado); 
            break;
            case 'e':  
                resultado=oletra.e();
                System.out.println(resultado);
            break;
                
            default:
                System.out.println("digite una letra:a, b, c, d o e");
            
                
        }
    }
    
}
