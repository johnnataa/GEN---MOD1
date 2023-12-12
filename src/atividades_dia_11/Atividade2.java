package atividades_dia_11;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// JOHNNATA SILVA
		// ATIVIDADE 2

		Scanner leia = new Scanner(System.in);

		int soma = 0;
		float media = 0;
		int vetorInteiros[] = new int[10];

		for (int indice = 0; indice < 10; indice++) {
			System.out.println("Digite o " + (indice + 1) + "° número: ");
			vetorInteiros[indice] = leia.nextInt();
			soma += vetorInteiros[indice];
			media = soma / 10;
		}

		System.out.println("\nElementos nos índices ímpares: ");
		for (int indice = 0; indice < 10; indice++) {
			if (indice % 2 == 1) {
				System.out.print(vetorInteiros[indice] + " ");
			}
		}

		System.out.println("\n\nElementos pares: ");
		for (int indice = 0; indice < 10; indice++) {
			if (vetorInteiros[indice] % 2 == 0) {
				System.out.print(vetorInteiros[indice] + " ");
			}
		}
		System.out.println("\n\nSoma: " + soma);
		System.out.println("\nMédia: " + media);
	}
}
