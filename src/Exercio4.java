
import java.util.Scanner;

public class Exercio4 {

    public static void main(String[] args) {
//Criar todas as variáveis e objetos que precisamos
        Scanner entrada = new Scanner(System.in);

        int[] vetor = {2, 6, 1, 10, 90, 70, 100, 2721, 37, 999};
        int maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i] > maior) {

                maior = vetor[i];

            }

        }
        
        
        System.out.println("o maior elemento é " + maior);
    }

}
