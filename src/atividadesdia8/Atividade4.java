package atividadesdia8;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JOHNNATA SILVA
		// ATIVIDADE 4
		float n1, n2, n3, n4, resultado;
		
		System.out.println("Número 1: ");
		Scanner num1 = new Scanner(System.in);
		n1 = num1.nextFloat();
		
		System.out.println("Número 2: ");
		Scanner num2 = new Scanner(System.in);
		n2 = num2.nextFloat();
		
		System.out.println("Número 3: ");
		Scanner num3 = new Scanner(System.in);
		n3 = num3.nextFloat();
		
		System.out.println("Número 4: ");
		Scanner num4 = new Scanner(System.in);
		n4 = num1.nextFloat();
		
		resultado = (n1 * n2) - (n3 * n4);
		System.out.println("O resultado é: " + resultado);

	}

}
