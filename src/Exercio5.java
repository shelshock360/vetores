
import java.util.Scanner;


public class Exercio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner entrada = new Scanner(System.in);

        int[] vetor = {1000, 19, 29, 10, 90, 70, 100, 2721, 37, 999};
        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i] < menor) {

             menor= vetor[i];

            }

        }
        
        
        System.out.println("o menor elemento é " + menor);
    }
    
}
