package atividades_dia_10;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		// JOHNNATA SILVA
		// ATIVIDADE 6
		Scanner leia = new Scanner(System.in);
		
	int num = 0, soma = 0, cont = 0, media;
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if (num % 3 == 0 && num != 0) {
				soma += num;
				cont++;
			}
		} while (num != 0);
		media = (soma / cont);
		System.out.println("A média de todos os números múltiplos de 3 é: " + media);
	} 


	}

