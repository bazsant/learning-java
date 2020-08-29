package livraria;

import livraria.models.Autor;
import livraria.models.LivroFisico;

public class AplicarDesconto {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Jhones Bazilio");
		
		LivroFisico livro = new LivroFisico(autor);
		livro.adicionarValor(59.9);
		
		System.out.println("Valor atual:" + livro.retornaValor());
		
		if(!livro.aplicaDescontoDe(0.1)) {
			System.out.println("Desconto não pode ser maior que 30%");
		}
		
		System.out.println("Valor com desconto:"+ livro.retornaValor());
	}
}
