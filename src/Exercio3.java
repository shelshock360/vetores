
import java.util.Scanner;



public class Exercio3 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
       double [] vetor = new double [6];
       double soma=0;
       
        for (int x = 0; x < 6; x++) {
            
            System.out.println("digite valor");
            vetor[x]=entrada.nextDouble();
            
            
        }
        
        
            for (int x = 0; x < 6; x++) {
            
            soma= soma+vetor[x];
            
            
        }
            
            System.out.println("a soma dos vetores"+soma);
        
            
            
    }
    
}
