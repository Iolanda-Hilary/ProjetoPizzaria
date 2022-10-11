package entidades;

import java.util.ArrayList;

public class Cliente {

	private String nome;
	private String telefone;
	private String endereco;
	private int numcasa;
	private String complemento;
	
public Cliente(String nome, String telefone, String endereco, int numcasa, String complemento) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.numcasa = numcasa;
		this.complemento = complemento;
	}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public int getNumcasa() {
	return numcasa;
}

public void setNumcasa(int numcasa) {
	this.numcasa = numcasa;
}

public String getComplemento() {
	return complemento;
}

public void setComplemento(String complemento) {
	this.complemento = complemento;
}

@Override
public String toString() {
	return "Cliente: " + nome + ", Telefone: " + telefone + ", Endereco: " + endereco + ", Numero da casa:  " + numcasa
			+ ", Complemento:" + complemento;
}




	
}
