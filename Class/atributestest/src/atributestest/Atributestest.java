/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atributestest;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Atributestest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean validar=true;
        int opcion;
        char continuar;
        double monto;
        Account oAccount=new Account();
        Scanner teclado=new Scanner(System.in);
        
        
        
        while (validar) {
            System.out.println("digite 1 si quiere realizar un deposito y 2 si quiere realizar un retiro");
            opcion=Integer.parseInt(teclado.nextLine());
            
            if(opcion==1)
            {
                System.out.println("digite el monto a depositar");
                monto=Double.parseDouble(teclado.nextLine());
               
              
                {
                    System.out.println("el monto que usted va a retirar no puede ser retirado");
                    
                }
                
            }
            System.out.println("el saldo final es de "+oAccount.getSaldoInicial());
             System.out.println("desea continuar con otra transacion S/N");
             continuar=teclado.nextLine().charAt(0);
             if((continuar=='s')||(continuar=='S'))
             {
                 validar=true;
             }
             if((continuar=='N')||(continuar=='n'))
                 validar=false;
             
           
            
        }
        
    }
    
}
