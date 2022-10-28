package entidades;

public class Pedido {
	
	private int numPedido;
	private int quantidade;
	private Pizza pizza;
	
	public Pedido() {
		
	}
	
public Pedido(int numPedido, int quantidade,Pizza pizza) {
		
		this.numPedido = numPedido;
		this.quantidade = quantidade;
		this.pizza = pizza;
		
		
	}



public int getNumPedido() {
	return numPedido;
}

public void setNumPedido(int numPedido) {
	this.numPedido = numPedido;
}

public int getQuantidade() {
	return quantidade;
}

public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}

public Pizza getPizza() {
	return pizza;
}

public void setPizza(Pizza pizza) {
	this.pizza = pizza;
}
	

}
