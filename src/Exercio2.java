
import java.util.Scanner;


public class Exercio2 {

   
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner (System.in);
        int  vet[]= new int [10];
        
        System.out.println("prencha o vetor");
        for (int i = 0; i < vet.length; i++) {
            System.out.println("digite um numero ");
            vet[i]=entrada.nextInt();
            
        }
        
        
        
        System.out.println("mostrando numeros");
            for (int i = vet.length-1;  i>=0; i--) {
            
                System.out.print(vet[i]+" ");
         
            
            
        }
        
            System.out.println("fim do programa");
         
        }
    }
    

