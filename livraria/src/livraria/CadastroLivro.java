package livraria;

public class CadastroLivro {
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.nome = "Jhones Bazilio dos Santos";
		autor.email = "bazsant@github.com";
		autor.cpf = "607060706-70";
		
		Livro livro = new Livro();
		
		livro.nome = "Java Prático";
		livro.descricao = "Novos recursos de linguagem";
		livro.valor = 59.9;
		livro.isbn = "978-85-66250-46-6";
		livro.autor = autor;

		livro.mostrarDetalhes();
		
		Livro outroLivro = new Livro();
		outroLivro.nome = "Lógica de programação";
		outroLivro.descricao = "Crie seus proprios programas";
		outroLivro.valor = 59.9;
		outroLivro.isbn = "978-85-66250-46-7";
		outroLivro.autor = autor;
		
		outroLivro.mostrarDetalhes();
		
		
	}

}
