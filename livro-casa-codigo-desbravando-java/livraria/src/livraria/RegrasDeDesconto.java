package livraria;

public class RegrasDeDesconto {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Jhones Bazilio dos Santos");
		
		Livro livro = new Livro(autor);
		livro.setValor(59.9);
		
		if(!livro.aplicaDescontoDe(0.3)) {
			System.out.println("Desconto não pode ser maior que 30%");
		} else {
			System.out.println("Valor do livro com desconto: " + livro.getValor());
		}
		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(39.9);
		
		if(!ebook.aplicaDescontoDe(0.3)) {
			System.out.println("Desconto não pode ser maior que 15%");
		} else {
			System.out.println("Valor do ebook com desconto: " + ebook.getValor());
		}
	}
}
