package livraria;

public class CalculadoraDeEstoque {
	public static void main(String[] args) {
		double livroJava = 59.90;
		double livroTDD = 59.90;
		
		double soma = livroJava + livroTDD;
				
		VerificarSomaEEstoque(soma);
		
		System.out.println("\nVamos de novo, agora com loop while");
		
		soma = 0;
		int contador = 0;
		
		while (contador < 35) {
			double valorDoLivro = 59.9;
			soma += valorDoLivro;
			contador++;
		}
		
		VerificarSomaEEstoque(soma);
		
		System.out.println("\nVamos de novo, agora com loop for");
		
		soma = 0;
		for (int i = 0; i < 35; i++) {
			soma += 59.9;
		}
		
		VerificarSomaEEstoque(soma);
		
		System.out.println("\nFor com continue no 7");
		for (int i = 0; i < 10; i++) {
			if(i == 7) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("\nFor com break no 7");
		for (int i = 0; i < 10; i++) {
			if(i == 7) {
				break;
			}
			System.out.println(i);
		}
	}

	private static void VerificarSomaEEstoque(double soma) {

		System.out.println("O total em estoque é: "+ soma);
		
		if (soma > 2000) {
			System.out.println("Seu estoque está muito alto!!");
		} else if (soma >= 150) {
			System.out.println("Seu estoque está bom");
		} else {
			System.out.println("Seu estoque está baixo");			
		}		
	}
}
