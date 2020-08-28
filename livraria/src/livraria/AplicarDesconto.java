package livraria;

public class AplicarDesconto {
	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.valor = 59.9;
		
		System.out.println("Valor atual:" + livro.valor);
		
		livro.aplicaDescontoDe(0.1);
		
		System.out.println("Valor com desconto:"+ livro.valor);
	}
}
