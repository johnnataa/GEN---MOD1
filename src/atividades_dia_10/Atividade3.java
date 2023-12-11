package atividades_dia_10;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// JOHNNATA SILVA
		// ATIVIDADE 3
		Scanner leia = new Scanner(System.in);

		int idade = 0, cri = 0, idoso = 0;

		while (idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();

			if (idade > 50) {
				idoso++;
			}
			else if (idade < 21 && idade > 0) {
				cri++;
			}
		}
		System.out.println("Total de pessoas menores de 21 anos: " + cri);
		System.out.println("Total de pessoas maiores de 50 anos: " + idoso);

	}
}
