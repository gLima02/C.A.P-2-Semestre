package aplicacao;
import java.util.Scanner;

import arvores.ABBint;

public class Exercicio1 {
	public static void main(String[] args) {
		ABBint abb = new ABBint();
		Scanner teclado = new Scanner(System.in);
		int opcao=0;
		
		do {
		System.out.println("0 - sair");
		System.out.println("1 - inserir");
		//.....
		opcao = teclado.nextInt();
		switch(opcao) {
		case 0: 
			System.out.println("Encerrando o programa");
			break;
		case 1: System.out.println("Informe o valor: ");
			int info = teclado.nextInt();
			abb.root = abb.inserir(abb.root, info);
			break;
		case 2: 
			System.out.println("Apresentando os valores");
			abb.listaEmOrdem(abb.root);
			System.out.println();
			break;
		}
			
		}while(opcao != 0);
		
		
		abb.root = abb.inserir(abb.root, 6);
		abb.root = abb.inserir(abb.root, 10);
		abb.root = abb.inserir(abb.root, 7);
		abb.root = abb.inserir(abb.root, 4);
		
		System.out.println("Apresentando os valores");
		abb.listaEmOrdem(abb.root);
	}
}
