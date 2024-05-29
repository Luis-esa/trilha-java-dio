import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        //Criando o objeto
        Scanner sc = new Scanner(System.in).useLocale(Locale.US); 

        System.out.println("Nome do cliente : ");
        String nome = sc.nextLine();
        
        System.out.println("Digite o número da conta ");
        int conta = sc.nextInt();

        System.out.println("Digite o número da sua agência");
        String agencia = sc.next();

        System.out.println("informe o valor do seu 1° depósito: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá, "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo de R$"+saldo+" já está disponível para saque.");
    }
}
