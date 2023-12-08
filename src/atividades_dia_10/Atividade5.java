package atividades_dia_10;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		// JOHNNATA SILVA
		// ATIVIDADE 5
		Scanner leia = new Scanner(System.in);
		int num = 0, soma = 0;
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if (num > 0) {
				soma += num;
			}
		} while (num != 0);
		
		System.out.println("A soma dos números positivos é: " + soma);


	}

}
