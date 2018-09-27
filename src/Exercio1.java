
import java.util.Arrays;
import java.util.Scanner;

public class Exercio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[15];

        for (int i = 0; i < 15; i++) {

            System.out.println("digite numero");
            vetor[i] = entrada.nextInt();
            
        

        }
        
        
        

        System.out.println("mostrando");
        
        
        for (int i = 0; i< 15; i++) {
            
                

            System.out.println(vetor[i] + " ");

            

        }
    }

}
