package atividades_dia_11;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// JOHNNATA SILVA
		// ATIVIDADE 3
		int matrizInteiros[][] = new int[3][3];
		Scanner leia = new Scanner(System.in);

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite um valor para a posição [ " + linha + " ][ " + coluna + " ]:");
				matrizInteiros[linha][coluna] = leia.nextInt();
			}

		}
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Elementos da Diagonal Principal: ");
				System.out.println("Elementos da Diagonal Secundária: "  );
				System.out.println("Soma dos Elementos da Diagonal Principal: "  );
				System.out.println("Soma dos Elementos da Diagonal Secundária: "  );
			}

		}

	}
}
