package atividades_dia_10;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// JOHNNATA SILVA
		// ATIVIDADE 2
		Scanner leia = new Scanner(System.in);
		
		int numero, par = 0, impar = 0;
		
		
		for (int i = 1; i < 11; i ++) {
			System.out.println("Digite o " + i + "° número:");
			numero = leia.nextInt();
			if (numero % 2 == 0) {
				par ++;
			}
			else if (numero % 2 == 1){
				impar ++;
			}
		}
		System.out.println("Total de números pares: " + par);
		System.out.println("Total de números ímpares: " + impar);
	}

}

