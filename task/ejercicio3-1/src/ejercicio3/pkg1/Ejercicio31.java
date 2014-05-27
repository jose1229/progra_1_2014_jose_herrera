/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio3.pkg1;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class Ejercicio31 {

    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Ingrese un numero 1-12:");
       
        Meses  omeses= new Meses();
        String resultado;
      int mes=in.nextInt();
        
        
        
        
        switch(mes){
            case 1: 
                resultado= omeses.enero();
                System.out.println(resultado); 
                break;
            case 2: 
                resultado= omeses.febrero();
                System.out.println(resultado);
                break;      
            case 3:  
                resultado=omeses.marzo();
                System.out.println(resultado);
            break;
            case 4:  
                resultado=omeses.abril();
                System.out.println(resultado); 
            break;
            case 5:  
                resultado=omeses.mayo();
                System.out.println(resultado);
            break;
            case 6:  
                resultado=omeses.junio();
                System.out.println(resultado);
            break;
            case 7:  
                resultado=omeses.julio();
                System.out.println(resultado); 
            break;
            case 8:  
                resultado=omeses.agosto();
                System.out.println(resultado);
            break;
            case 9:  
                resultado=omeses.setiembre();
                System.out.println(resultado); 
            break;
            case 10: 
                resultado=omeses.octubre();
                System.out.println(resultado); 
            break;
            case 11: 
                resultado=omeses.noviembre();
                System.out.println(resultado);
            break;
            case 12: 
                resultado=omeses.diciembre();
                System.out.println(resultado); 
            break;
            default:
                System.out.println("ingrese un numero del 1 al 12");
            
        }
       
    }
}

    
    

