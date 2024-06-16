import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) throws Exception {
        try{ 
            try(Scanner usuario = new Scanner(System.in).useLocale(Locale.US)){
            //Criando um objeto Scanner.
            System.out.println("Digite seu primeiro nome: ");
            String nome = usuario.next();
            System.out.println("Digite sua idade: ");
            int idade = usuario.nextInt();
            System.out.println("Digite sua altura: ");
            double h = usuario.nextDouble();
            //Imprimindo
            System.out.println("Olá, me chamo : "+nome+", tenho "+idade+" anos e "+h+" de altura");
            }
            //Prever o erro e solucionar o que serar impresso.
        }
        catch (InputMismatchException erro){
        }
    }
}
