package entidades;

public class Pizza {
	
 private Integer preco;
 
 public Pizza() {
	 
 }

 public Integer tamanhoP() {
	 this.preco = 35;
	 return preco;
 }
 public Integer tamanhoM() {
	 System.out.println("Pizza tamanho M - R$50"); 
	 this.preco = 50;
	 return preco;
 }
 
 public Integer tamanhoG() {
	 System.out.println("Pizza tamanho G - R$70"); 
	 this.preco = 70;
	 return preco;
 }

}