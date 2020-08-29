package livraria;

import livraria.models.Autor;
import livraria.models.Ebook;
import livraria.models.LivroFisico;

public class RegistroDeVendas {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Jhones Bazilio");
		
		LivroFisico livroFisico = new LivroFisico(autor);
		livroFisico.setNome("TDD");
		livroFisico.setValor(59.9);
		if(livroFisico.aplicaDescontodDe10PorCento()) {
			System.out.println("Valor agora é de: " + livroFisico.getValor());
		}
				
		Ebook ebook = new Ebook(autor);
		ebook.setNome("TDD");
		ebook.setValor(39.9);
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		carrinhoDeCompras.adiciona(livroFisico);
		carrinhoDeCompras.adiciona(ebook);
		
		System.out.println("Valor total: "+ carrinhoDeCompras.getTotal());
	}
}
