/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio7;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Jose Miguel
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int suma=0; 
System.out.println("Ingrese la cantidad de numeros: "); 
Scanner x=new Scanner (System.in); 
int dato=x.nextInt(); 
 int []  numeros=new int [100];
  int par=0;
  int impar=0;

for(int i=0;i<=dato-1;i++)
{
System.out.println("introduce el numero: "); 
Scanner x2=new Scanner (System.in); 
int dato2=x2.nextInt();   
    for (int j = 0; j < numeros.length; j++) {
        numeros[i]=dato2;
    }
    
    }


        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]==0){
            
            
            
            }else{ if(numeros[i]%2==0){
             par+=1;
             }else{
                 impar+=1;
                   }}
        }

System.out.println("Hay "+ par+" numero pares y "+impar+" impares.");
    }
    
}
