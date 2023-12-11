package atividades_dia_11;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// JOHNNATA SILVA
		// ATIVIDADE 3
		
		int somaPrincipal = 0, somaSecundaria = 0;
		int matrizInteiros[][] = new int[3][3];
		
		Scanner leia = new Scanner(System.in);

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite um valor para a posição [ " + linha + " ][ " + coluna + " ]:");
				matrizInteiros[linha][coluna] = leia.nextInt();
			}

		}
		        somaPrincipal = matrizInteiros[0][0] + matrizInteiros[1][1] + matrizInteiros[2][2];
		        somaSecundaria = matrizInteiros[0][2] + matrizInteiros[1][1] + matrizInteiros[2][0];

		        System.out.println("Elementos da Diagonal Principal: " + matrizInteiros[0][0] + " " + matrizInteiros[1][1] + " " + matrizInteiros[2][2] );
				System.out.println("Elementos da Diagonal Secundária: " + matrizInteiros[0][2] + " " + matrizInteiros[1][1] + " " + matrizInteiros[2][0] );
				System.out.println("Soma dos Elementos da Diagonal Principal: " + somaPrincipal);
				System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaSecundaria);
			}
	}
