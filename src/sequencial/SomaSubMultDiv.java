package sequencial;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class SomaSubMultDiv {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entre com o primeiro número: ");
        int A = entrada.nextInt();
        System.out.print("Entre com segundo número: ");
        int B = entrada.nextInt();
        
        int soma = A + B;
        int sub = A - B;
        int mult = A * B;
        float div = A / B;
        
        System.out.printf("A soma de %d e $d é: %d.\n", A, B, soma);
        System.out.printf("A subtração entre %d e %d é: %d.\n", A, B, sub);
        System.out.printf("O produto de %d e %d é: %d.\n", A, B, mult);
        System.out.printf("A divisão de %d e %d é: %.1f.\n", A, B, div);
    }
}
