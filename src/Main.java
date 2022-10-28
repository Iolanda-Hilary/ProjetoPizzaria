import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Pagamento;
import entidades.Pizza;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		List<Cliente> lista = new ArrayList<>();
		System.out.println("Bem vindo a X pizzaria, primeiro, realize seu cadastro");
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("Telefone: ");
		String telefone = sc.next();
		System.out.print("Endereco: ");
		String endereco = sc.next();
		System.out.print("Numero da casa:");
		int numcasa = sc.nextInt();
		System.out.print("Complemento");
		String complemento = sc.next();

		Cliente cliente = new Cliente(nome, telefone, endereco, numcasa, complemento);
		lista.add(cliente);
		System.out.println(lista);
		System.out.println("------------------------------------------");
		System.out.println("Agradecemos pelo cadastro! Aproveite o cupom de 1º compra");
		System.out.println("------------------------------------------");

		try {
			System.out.println("Deseja fazer o primeiro pedido? S/N");
			String resp = sc.next();

			if (resp != "n") {

				System.out.println("Quantidade");
				int quantidade = sc.nextInt();
				try {
				System.out.print("Qual tamanho de pizza você deseja?");
				System.out.println("1-P R$35 2-M R$50 3-G R$70");
				} 
			
				
				catch (RuntimeException e){
					System.out.println("Digite um número equivalente ao tamanho");
					}
	
				Pizza pizza = new Pizza();
				int tamanho = sc.nextInt();
				
				switch (tamanho) {
				case 1: 
					int P =pizza.tamanhoP(); 
					break;	
				case 2:
					int M = pizza.tamanhoM();
					break;
				case 3: 
					int G = pizza.tamanhoG();
					
				default: System.out.println("Digite um numero equivalente ao tamanho");
				}
				
				int total = tamanho;
				
				System.out.println(total);
				System.out.println("por favor informe a forma de pagamento:");
				System.out.println("1 -PIX    2-CREDITO   3-DEBITO");

				int pagamento = sc.nextInt();
				switch (pagamento) {
				case 1:
					System.out.println("Pix selecionado");
					
					break;

				case 2:
					System.out.println("Credito selecionado");
					
					break;

				case 3:
					System.out.println("Debito selecionado");
					
					break;

				default:
					System.out.println("Escolha uma forma válida");
					break;
				}
				System.out.println("Aplicar cupom de 1º compra?");
				
				
				}
			} finally{
				sc.close();
			}
				
			}
	{ 
}

	
		

}
	
