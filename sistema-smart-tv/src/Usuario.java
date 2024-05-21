public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
            System.out.println("Novo status -> TV ligada ? " +smartTv.ligada);
        System.out.println("TV ligada ? " +smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume(); 
        System.out.println("Volume atual : " +smartTv.volume);

        smartTv.mudarCanal(13);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal atual : " +smartTv.canal);
        
        smartTv.desligar();
            System.out.println("Novo status -> TV ligada ? " +smartTv.ligada);


    }
}