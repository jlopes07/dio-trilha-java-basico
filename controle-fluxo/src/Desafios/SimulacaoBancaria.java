package Desafios;
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 
          
          //System.out.println("\nDigite o número correspondente à opção desejada: \n\n1. Depositar\n2. Sacar\n3. Consultar Saldo\n0. Encerrar");

            int opcao = scanner.nextInt(); 
            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            
        
        
            // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:  

            switch (opcao) {
            case 1:{
                //System.out.println("Informe o valor a ser depositado: ");
                double deposito = scanner.nextDouble();
                saldo = saldo + deposito;
                System.out.println("Saldo atual: " + saldo);
                break;
            }
            case 2:{
                //System.out.println("Informe o valor a ser sacado: ");
                double saque = scanner.nextDouble();
                if (saldo > 0 && saque < saldo){
                    saldo = saldo - saque;
                    System.out.println("Saldo atual: " + saldo);
                } else
                System.out.println("Saldo insuficiente.");
                break;
            }
            case 3:{
                System.out.println("Saldo atual: " + saldo);
                break;
            }
            case 0:{
                System.out.println("Programa encerrado.");
                return;
            }
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
            }
        }
    }
}