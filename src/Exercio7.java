
import java.util.Scanner;

public class Exercio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10]; 

        System.out.println("mostrando 1° vetor ");

        for (int i = 0; i < vetor1.length; i++) {

            System.out.println("insira os valores do vetor 1");
            vetor1[i] = entrada.nextInt();

        }

        System.out.println("mostrando 2° vetor ");
        for (int x = 0; x < vetor2.length; x++) {

            System.out.println("insira os valores do vetor 2");
            vetor2[x] = entrada.nextInt();

        }

        System.out.println("multiplicando vetores ");
        for (int j = 0; j < vetor3.length; j++) {
            vetor3[j] = vetor1[j] * vetor2[j];
           System.out.println("Multiplicação de "+vetor1[j]+" por "+vetor2[j]+" = " +vetor3[j]);
        }

    }

}
