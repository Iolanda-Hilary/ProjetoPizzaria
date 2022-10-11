package entidades;

public class Pedido {
	
	private int numPedido;
	private int quantidade;
	private Double valor;
	private Double taxa;
	
public Pedido(int numPedido, int quantidade, Double valor, Double taxa) {
		
		this.numPedido = numPedido;
		this.quantidade = quantidade;
		this.valor = valor;
		this.taxa = taxa;
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

public Double getValor() {
	return valor;
}

public void setValor(Double valor) {
	this.valor = valor;
}

public Double getTaxa() {
	return taxa;
}

public void setTaxa(Double taxa) {
	this.taxa = taxa;
}
	

}
