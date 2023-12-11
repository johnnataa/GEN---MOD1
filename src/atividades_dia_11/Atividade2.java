package atividades_dia_11;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// JOHNNATA SILVA
		// ATIVIDADE 2
		
		Scanner leia = new Scanner (System.in);
		
		int vetorInteiros[] = new int[10];
		
		for (int indice = 0; indice < 10; indice++) {
			System.out.println("Digite o " + (indice + 1) + "° número: ");
			vetorInteiros[indice] = leia.nextInt();
		}
		System.out.println("Elementos nos índices ímpares: " + vetorInteiros[1] + " " + vetorInteiros[3] + " " + vetorInteiros[5] + " " + vetorInteiros[7] + " " + vetorInteiros[9]);

	}

}
