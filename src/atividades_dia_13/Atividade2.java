package atividades_dia_13;

import java.util.Scanner;
import java.util.Stack;

public class Atividade2 {

	public static void main(String[] args) {
		// JOHNNATA SILVA
		// ATIVIDADE 2

		Scanner leia = new Scanner(System.in);

		Stack<String> pilhaLivros = new Stack<String>();
		int opcao;
		String nomeLivro;

		System.out.println("***************************************");
		System.out.println("1: Adicionar um novo livro na pilha\r\n" + "2: Listar todos os livros\r\n"
				+ "3: Retirar um livro da pilha \r\n" + "0: Sair");
		System.out.println("***************************************");

		do {
			System.out.println("\nEntre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do livro: ");
				nomeLivro = leia.nextLine();
				pilhaLivros.add(nomeLivro);
				System.out.println("\nLivro adicionado!\nPilha:\n");
				for (String livro : pilhaLivros) {
					System.out.println(livro);
				}
				break;
			case 2:
				if (pilhaLivros.isEmpty()) {
					System.out.println("Pilha de livros vazia");
				} else {
					System.out.println("\nLista de Livros na Pilha:\n");
					for (String livro : pilhaLivros) {
						System.out.println(livro);
					}
				}
				break;

			case 3:
				if (pilhaLivros.isEmpty()) {
					System.out.println("\nImpossível retirar.\nA pilha já está vazia!");
				} else {
					pilhaLivros.pop();
					System.out.println("\nPilha:");
					for (String livro : pilhaLivros) {
						System.out.println(livro);
					}
					System.out.println("\nUm livro foi retirado da pilha:");

				}
				break;

			case 0:
				System.out.println("Programa finalizado!!!");
				break;

			default:
				System.out.println("Insira um valor válido!");


			}
		} while (opcao != 0);

	}
}