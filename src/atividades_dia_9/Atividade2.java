package atividades_dia_9;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// JOHNNATA SILVA
		// ATIVIDADE 2
		int v1;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite um valor inteiro: ");
		v1 = leia.nextInt();
		
		if (v1 % 2 == 0 && v1 > 0) {
			System.out.println("O Número " + v1 + " é par e positivo");
		} else if (v1 % 2 == 1 && v1 > 0) {
			System.out.println("O Número " + v1 + " é ímpar e positivo");
	    } else if (v1 % 2 == 0 && v1 < 0) {
			System.out.println("O Número " + v1 + " é par e negativo");
	    } else if (v1 % 2 == -1 && v1 < 0) {
			System.out.println("O Número " + v1 + " é ímpar e negativo");
	    } 

}
}