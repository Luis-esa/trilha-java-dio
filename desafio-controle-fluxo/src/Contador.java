import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		try {
		  System.out.println("Digite o primeiro parâmetro");
		  int parametroUm = terminal.nextInt();
		  System.out.println("Digite o segundo parâmetro");
		  int parametroDois = terminal.nextInt();
		  System.out.println("--------------------------------------------------");
		  //chamando o método contendo a lógica de contagem
		  contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}finally {
			if(terminal != null){
			  	terminal.close();
			}
		}
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		else {
			int contagem = parametroDois - parametroUm;
			System.out.println("total de interacoes : "+contagem+" Imprimindo resultado...");
			//realizar o for para imprimir os números com base na variável contagem
			for (int contando = parametroUm ; contando <= parametroDois; contando++ ) {
				System.out.println(contando+"...");
			}
		}
	}
}