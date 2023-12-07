package atividades_dia_9;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// JOHNNATA SILVA
		// ATIVIDADE 1
		int va, vb, vc, sab;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nValor A: ");
		va = leia.nextInt();
		
		System.out.println("Valor B: ");
		vb = leia.nextInt();
		
		System.out.println("Valor C: ");
		vc = leia.nextInt();
		sab = va + vb;
		
		if ((va + vb) > vc) {
			System.out.println(va + " + " + vb + " = " + sab + " > " + vc  + "\nA soma de A + B é MAIOR que C");
		} else if ((va + vb) < vc) {
			System.out.println(va + " + " + vb + " = " + sab + " < " + vc  + "\nA soma de A + B é MENOR que C");
		} else {
			System.out.println(va + " + " + vb + " = " + sab + " = " + vc  + "\nA soma de A + B é IGUAL a C");
		}

	}

}
