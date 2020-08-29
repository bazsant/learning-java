package br.com.livraria;

import br.com.livraria.models.Autor;
import br.com.livraria.models.Ebook;
import br.com.livraria.models.LivroFisico;

public class CadastroLivro {
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Jhones Bazilio dos Santos");
		autor.setEmail("bazsant@github.com");
		autor.setCpf("607060706-70");
		
		LivroFisico livro = new LivroFisico(autor);
		
		livro.setNome("Java Prático");
		livro.setDescricao("Novos recursos de linguagem");
		livro.adicionarValor(59.9);
		livro.setIsbn("978-85-66250-46-6");

		livro.mostrarDetalhes();
		
		Ebook outroLivro = new Ebook(autor);
		outroLivro.setNome("Logica de programacao");
		outroLivro.setDescricao("Faca seu proprio programa");
		outroLivro.adicionarValor(59.9);
		outroLivro.setIsbn("978-85-66250-46-7");
		
		outroLivro.mostrarDetalhes();
		
		
	}

}
