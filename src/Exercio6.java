
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Exercio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
             Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[10];

        int par =0;
        int impar=0;
        for (int i = 0; i < 10; i++) {

            System.out.println("digite numero");
            vetor[i] = entrada.nextInt();
            
        
           

        }
        
        
        

        System.out.println("mostrando");
        
        
        for (int i = 0; i< 10; i++) {
            
                
              if(vetor[i]%2==0){
                  
                 par++;
                  
              }else{
                 
                  impar++;
              }
                     
        }
        
          System.out.println("total de numeros pares "+par);
          System.out.println("total de numeros impares "+impar);
    }
    
}
