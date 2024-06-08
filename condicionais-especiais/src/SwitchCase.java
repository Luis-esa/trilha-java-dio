public class SwitchCase {
    public static void main(String[] args) throws Exception {
        //Switch case em um sistema de planos (B M T)
        String plano = "T";
        switch (plano) {
            case "T": {
                System.out.println("5gb de youtuber");
            }
            case "M": {
                System.out.println("Whats ilimitado");
            }
            case "B": {
                System.out.println("100 minutos de ligacao");
            }
        }
    }
}
