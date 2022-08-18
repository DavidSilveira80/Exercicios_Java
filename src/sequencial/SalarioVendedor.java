package sequencial;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class SalarioVendedor {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o nome do vendador: ");
        String vendedor = entrada.nextLine();
        
        System.out.print("Digite o salário do vendedor: ");
        double salario = entrada.nextDouble();
        
        System.out.print("Entre com o total de vendas em dinheiro:R$ ");
        double total_vendas_dinheiro = entrada.nextDouble();
        
        double comissao_sob_total_de_vendas = total_vendas_dinheiro * (0.15 / 100);
        
        double salario_final = salario + comissao_sob_total_de_vendas;
        
        System.out.println(vendedor);
        System.out.printf("Seu salário fixo é de: R$ %.3f.\n", salario);
        System.out.printf("Seu total de vendas no mês é de:R$ %.3f.\n", total_vendas_dinheiro);
        System.out.printf("Sua comissão de 15 por cento sob o total de vendas no mês é:R$ %.3f.\n", comissao_sob_total_de_vendas);
        System.out.printf("O seu salário final é:R$ %.3f.\n", salario_final);
    }
    
}
