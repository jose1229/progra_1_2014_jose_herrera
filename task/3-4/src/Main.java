/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        
         int diames;
         int año;
              
        Scanner leer = new Scanner(System.in);
        System.out.println("digite el numero de mes del 1 al 12");
        diames =  leer.nextInt();
        System.out.println("digite el año");
        año = leer.nextInt();
        
        diames odiames= new diames();
       
        String operacion;

       

        switch (diames) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                operacion = odiames.operacion1(diames);
                System.out.println( operacion);
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                operacion = odiames.operacion2(diames);
                System.out.println( operacion);
                break;
            case 2:
                operacion = odiames.operacion3(diames);
                System.out.println( operacion);
                break;

        }// TODO code application logic here
    }

}
