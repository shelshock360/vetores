
import java.util.Scanner;

public class Exercio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {

            for (int h = 0; h < matriz.length; h++) {

                System.out.println("insira os valores do vetor: ");
                matriz[i][h] = entrada.nextInt();

            }

        }
        int maior = matriz[0][0];
        int menor = matriz[0][0];
        int soma = 0;
        int media = 0;
        int par = 0;
        int impar = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int h = 0; h < matriz.length; h++) {

                if (matriz[i][h] > maior) {

                    maior = matriz[i][h];

                }

            }

        }

        for (int i = 0; i < matriz.length; i++) {

            for (int h = 1; h < matriz.length; h++) {

                if (matriz[i][h] < menor) {

                    menor = matriz[i][h];

                }

            }
        }

        for (int i = 0; i < matriz.length; i++) {

            for (int h = 0; h < matriz.length; h++) {
                soma = soma + matriz[i][h];
                media = soma / 9;

            }

        }

        for (int i = 0; i < matriz.length; i++) {

            for (int h = 0; h < matriz.length; h++) {

                if (matriz[i][h] % 2 == 0) {

                    par++;

                } else {

                    impar++;
                }

            }

        }

        int maiorL3 = 0;

        for (int i = 0; i < matriz[2].length; i++) {

            if (matriz[2][i] > maiorL3) {

                maiorL3 = matriz[2][i];

            }

        }

        String diagonal = "";

        for (int i = 0; i < matriz.length; i++) {

            for (int h = 0; h < matriz.length; h++) {

                if (matriz[i] == matriz[h]) {

                    diagonal = diagonal + matriz[i][h] + " ";

                }

            }

        }

        String meio = " ";

        for (int i = 0; i < matriz.length; i++) {

            for (int h = 0; h < matriz.length; h++) {

                if (h == 1) {

                    meio =meio +matriz[i][h]+" ";
                }
            }

        }

        System.out.println("a soma dos vetores" + soma);
        System.out.println("a media de todos os numeros do vetor é" + media);
        System.out.println("total de numeros pares " + par);
        System.out.println("total de numeros impares " + impar);
        System.out.println("o maior elemento da matriz é " + maior);
        System.out.println("o menor elemento da matriz é " + menor);
        System.out.println("o maior numero da ultima linha da matriz é" + maiorL3);
        System.out.println("a diagonal ṕrincipal é" + diagonal);
        System.out.println("a coluna do meio da matriz é"+meio);
        System.out.println("fim programa!");

        
    } 

}
