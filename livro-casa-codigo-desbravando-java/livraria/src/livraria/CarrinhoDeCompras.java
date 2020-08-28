package livraria;

public class CarrinhoDeCompras {

	private double total;
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public void adiciona(Livro livro) {		
		System.out.println("Adicionado: " + livro);		
		livro.aplicaDescontoDe(0.05);
		this.setTotal(this.getTotal() + livro.getValor());
	}
	
}
