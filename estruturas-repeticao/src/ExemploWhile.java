import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0) {
            //Enquanto(condicao logica)    
            double valorDoce = valorAleatorio();
            if (valorDoce>mesada)
            valorDoce = mesada;
            System.out.println("Doce do valor: "+valorDoce+" Adicionado ao carrinho");
            mesada = (mesada - valorDoce);
        }
    System.out.println("Mesada : "+mesada);
    System.out.println("Toda mesada foi gasta em doces");
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,14);
    }
}
