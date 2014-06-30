
package ciclos;

import java.util.Scanner;
                                                                                                                                           
public class Ciclos {

    
    public static void main(String[] args) {
        
        /**
         * ciclo for
         * 
         */
        int cantidad;
        int suma = 0;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("digite el# de impresiones que desea ver");
        cantidad=Integer.parseInt(teclado.nextLine());
        
        System.out.print("\n");
        
        for (int i = 1; i <= cantidad;  i++) {
        System.out.println(i);
        }
        System.out.print("\n");
        System.out.println("inverso");
        System.out.print("\n");        
        for (int i =  cantidad-1; i> -1; i--) {
           System.out.println(i);
          
        }
        
        /**
         * ciclo while
         *
         */
        while(suma<=cantidad)
        {
            System.out.print(suma);
            System.out.print("-");
            suma=suma+1;
             
        }
        System.out.print("\n");
        suma=cantidad;
        
        while(suma>=0)
        {
            System.out.print(suma);
            System.out.print("-");
            suma=suma-1;
        }
        /**
         * ciclo do while
         * 
         */
        
         System.out.print("\n");
         
         suma=0;
         do{
        
           System.out.print(suma);
           System.out.print("_");
           suma=suma+1;
        }while(suma<cantidad);
         
          System.out.print("\n");
         
          suma=cantidad;
          
          
        do{        
           System.out.print(suma);
           System.out.print("_");
           suma=suma-1;
        }while(suma>0);
    }
    
}
