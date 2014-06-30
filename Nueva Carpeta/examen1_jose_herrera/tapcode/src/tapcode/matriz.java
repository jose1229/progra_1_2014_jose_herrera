/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tapcode;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class matriz {
    

    

 private Scanner teclado;
    private char[][] mat;
    
    
    
      public void cargar() {
        teclado=new Scanner(System.in);
        mat=new char[6][6];
        char[][]let;
        
        System.out.println("Cargar la matriz por columna:");
        for(int c=0;c<6;c++) {        
           for(int f=0;f<6;f++) {
                System.out.print("Ingrese la letra de la fila " + f + " y la columna "+ c + " :");
             
        char[][]let=char.charAt(teclado.nextLine());
        
            }
        }
    }
    
    public void imprimir() {
        String punto="";
        for(int f=0;f<6;f++) {
            for(int c=0;c<6;c++) {
                System.out.print(mat[f][c]+".,.");
                punto=punto++;
            }
            
            
        }
    }
    
}
    
    
