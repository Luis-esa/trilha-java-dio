import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println(" Banco DIO ");
            System.out.println(" Selecione a opcao desejada: ");
            System.out.println(" 1 para DEPOSITAR ");
            System.out.println(" 2 para SACAR ");
            System.out.println(" 3 para CONSULTAR SALDO ");
            System.out.println(" 0 para ENCERRAR ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(" Qual valor deseja depositar? ");
                    saldo = scanner.nextDouble();
                    System.out.printf("Saldo atual: %.1f",saldo);
                    break;
                case 2:
                    System.out.println(" Qual valor deseja Sacar? ");
                    double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                        System.out.println(" Saque realizado com sucesso! ");
                        saldo = saldo - saque;
                        System.out.printf(" Saldo atual: %.1f",saldo);
                    }else {
                        System.out.println(" Saldo insuficiente. ");
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f",saldo);
                    break;
                case 0:
                    System.out.println(" Programa encerrado. ");
                    continuar = false;
                    break;
                default:
                    System.out.println(" Opção inválida. Tente novamente. ");
            }
        }
        scanner.close();
    }
}