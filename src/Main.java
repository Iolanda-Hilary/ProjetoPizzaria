import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Pedido;

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
			System.out.println("Numero da casa:");
			int numcasa = sc.nextInt();
			System.out.println("Complemento");
			String complemento = sc.next();
			
			Cliente cliente = new Cliente(nome, telefone, endereco, numcasa, complemento);
			lista.add(cliente);
			System.out.println(lista);
			System.out.println("------------------------------------------");
			System.out.println("Agradecemos pelo cadastro! Aproveite o cupom de 1º compra");
			System.out.println("------------------------------------------");
			
		try { System.out.println("Deseja fazer o primeiro pedido? S/N");
		String resp = sc.next();
		
		if ( resp != "N") {
			
			List<Pedido> pedidolist = new ArrayList<>();
			Random random = new Random();
			System.out.println("Pedido Nº #" + random.nextInt(50));
			//Com banco de dados calcularia de acordo com a demanda
			
			
			Pedido pedido = new Pedido(numcasa, numcasa, null, null);
		}
		else {
			
			System.out.println("Obrigadx pela visita!");
			
		}
		
		
			
		}
		finally {}
	}

}
