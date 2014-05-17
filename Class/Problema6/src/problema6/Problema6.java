/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problema6;
import sun.security.krb5.Realm;
import java.util.Scanner; 
/**
 *
 * @author Jose Miguel
 */
public class Problema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Scanner leer = new Scanner(System.in);
        int B=0;
         System.out.println("Ingrese el valor de B: "); 
         B = leer.nextInt();
          
        
        if(B>=0){
        
        System.out.println("B es un numero positivo"); 
        }else{
        
        System.out.println("B es un numero negativo "); 
        }
        
        
    }
    
}
