package livraria;

public class Livro {
	String nome;
	String descricao;
	Double valor;
	String isbn;
	Autor autor;
	
	public Livro() {
		System.out.println("Livro criado");
	}
	
	public void mostrarDetalhes() {
		System.out.println("\nMostrando detalhes do livro");		
		System.out.println(nome);
		System.out.println(descricao);
		System.out.println(valor);
		System.out.println(isbn);
		if(this.temAutor()) {
			autor.mostrarDetalhes();
		}
	}

	private boolean temAutor() {
		return this.autor != null;
	}

	public void aplicaDescontoDe(double desconto) {
		this.valor -= this.valor * desconto;
	}
	
	
}
