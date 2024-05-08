import java.util.Locale;
import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            double saldo = 0;
            // Loop infinito para manter o programa em execução até que o usuário decida sair
            while (true) { 

                System.out.println("Digite a opção desejada\n1.Deposito\n2.Saque\n3.Consulte Saldo\n0.Encerrar");
                int opcao = scanner.nextInt(); 
                
                switch (opcao) {
                    
                    case 1://DEPOSITO
                    System.out.println("Opcao escolhida: Deposito\nQual valor deseja depositar?:");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("O deposito de RS"+ deposito + " foi realizado com sucesso.\nSaldo atual:RS"+ saldo);
                    break;
                    
                    case 2://SAQUE
                    System.out.println("Opcao escolhida: SAQUE\nQual valor voce deseja sacar?");
                    double saque = scanner.nextDouble();
                    if(saque > saldo){
                        System.out.println("\nSALDO INSUFICIENTE\n");
                        break;
                    }
                    else{
                        saldo -=saque;
                        System.out.println("\nSaque efetuado com sucesso\nSaldo Atual: RS"+saldo);
                        break;
                    }
                    
                    
                    case 3://CONSULTAR SALDO
                    System.out.println("\nOpcao escolhida: Consultar Saldo\nSeu saldo atual eh: RS"+saldo +"\n ");
                    break;
                    
                    case 0:// ENCERRAR O PROGRAMA
                    System.out.println("\nObrigado por nos escolher hoje!\n");
                    scanner.close();
                    System.exit(opcao);
                    break;
            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
                default:
                        System.out.println("\nOpção inválida. Tente novamente.\n");
                }  
            }
        }
        }
        
    }