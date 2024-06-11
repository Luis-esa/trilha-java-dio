import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) {
        int num, soma=0;
        String continua;

        try (Scanner digitado = new Scanner(System.in)) {
            do{
            System.out.println("Digite um numero");    
            num = digitado.nextInt();
            soma += num;
            System.out.println("Quer continuar(S/N)? ");
            continua = digitado.next();
            }while (continua.equals("S"));
        }
        System.out.println("Soma dos números digitados: "+soma);
    }
}