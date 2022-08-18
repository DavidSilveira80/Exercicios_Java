package sequencial;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class TrocaDeValores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entre com valor da variável A: ");
        String A = entrada.nextLine();
        System.out.print("entre com valor da variável B: ");
        String B = entrada.nextLine();
        
        System.out.printf("A = %s B = %s.\n", A, B);
        
        String aux = A;
        A = B;
        B = aux;
        
        System.out.println("Agora valores trocados:");
        System.out.printf("A = %s B = %s.\n", A, B);
        
        /*
        Ou simplesmente sem precisar trocar de variáveis
        System.out.printf("A = %s B = %s.\n", B, A);
        */
    }
    
}
