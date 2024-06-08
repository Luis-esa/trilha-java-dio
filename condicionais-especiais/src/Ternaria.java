public class Ternaria{
    public static void main(String[] args) throws Exception {
        //Condicional ternaria para saber o resultado do aluno
        int nota = 5;
        String resultado = nota >=7 ? "Aprovado" : nota>=5 && nota<7 ? "recuperacao":"reprovado";
        System.out.println(resultado);
    }
}
