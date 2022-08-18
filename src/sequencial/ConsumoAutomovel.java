package sequencial;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class ConsumoAutomovel {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entre com a distância percorrida em Km: ");
        int distancia_percorrida = entrada.nextInt();
        System.out.print("Entre com o combustivel gasto em litros: ");
        int combustivel_gasto = entrada.nextInt();
        
        double consumo_medio = distancia_percorrida / combustivel_gasto;
        
        System.out.printf("Você percorreu com seu veículo uma distância de %d Km.\n", distancia_percorrida);
        System.out.printf("Com um gasto de %d litros de combustivel.\n", combustivel_gasto);
        System.out.printf("Seu veículo teve um consumo médio de combustivel na viagem de: %.1f Km/L.\n", consumo_medio);
    }
    
}
