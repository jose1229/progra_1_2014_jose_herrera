/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problema5;
import sun.security.krb5.Realm;
import java.util.Scanner; 
/**
 *
 * @author Jose Miguel
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int A=0;
         System.out.println("Ingrese el valor de A: "); 
         A = leer.nextInt();
          
        A= A%2;
        if(A==0){
        
        System.out.println("A es un numero par"); 
        }else{
        
        System.out.println("A es un numero impar "); 
        }
        
        
        
        
    }
    
}
