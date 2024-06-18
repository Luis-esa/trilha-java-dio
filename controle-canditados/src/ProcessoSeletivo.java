import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
       selecaoCandidatos();
    }
    static void selecaoCandidatos() {
        String [] candidatos = { "FELIPE ", "MARCIA ", "JULIA ", "PAULO ", "AUGUSTO ", "MONICA ", "FABRICIO ", "MIRELLA ", "DANIELA ", "JORGE "};

        int candidatoSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatoSelecionado <5 && candidatoAtual < candidatos.length){
            String candidato = candidatos [candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println( "O candidato  "+candidato+ " Solicitou o valor de:  "+salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println( "O candidato  "+candidato+ " foi selecionado para vaga ");
                candidatoSelecionado++;
            }
            candidatoAtual++;
        }
    } 
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
}
