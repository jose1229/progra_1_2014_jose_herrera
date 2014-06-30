/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */

   

  
     public class Matrz{
    private Scanner teclado;
    private int[][] mat;
    
    
      public void cargar() {
        teclado=new Scanner(System.in);
        mat=new int[2][5];
        System.out.println("Cargar la matriz por columna:");
        for(int c=0;c<5;c++) {        
           for(int f=0;f<2;f++) {
                System.out.print("Ingrese el tamaño de la fila " + f + " y la columna "+ c + " :");
                mat[f][c]=teclado.nextInt();
            }
        }
    }
    
    public void imprimir() {
        for(int f=0;f<2;f++) {
            for(int c=0;c<5;c++) {
                System.out.print(mat[f][c]+" ");
            }
            System.out.println();
        }
    }
    
    
}
