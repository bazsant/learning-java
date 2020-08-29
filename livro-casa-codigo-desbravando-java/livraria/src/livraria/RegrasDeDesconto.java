package livraria;

import livraria.models.Autor;
import livraria.models.Ebook;
import livraria.models.MiniLivro;

public class RegrasDeDesconto {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Jhones Bazilio dos Santos");
		
		MiniLivro livro = new MiniLivro(autor);
		livro.setValor(59.9);
		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(39.9);
		
		if(!ebook.aplicaDescontoDe(0.3)) {
			System.out.println("Desconto não pode ser maior que 15%");
		} else {
			System.out.println("Valor do ebook com desconto: " + ebook.getValor());
		}
	}
}
