package br.com.livraria.interfaces;

@FunctionalInterface
public interface Promocional {
	boolean aplicaDescontoDe(double porcentagem);
	
	default boolean aplicaDescontodDe10PorCento() {
		return aplicaDescontoDe(0.1);
	}
	
}
