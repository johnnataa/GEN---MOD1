package atividades_dia_8;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JOHNNATA SILVA
		// ATIVIDADE 3
		float salBruto, adNoturno, horasExtras, descontos, salLiquido;
		
				
		System.out.println("Salário bruto: ");
		Scanner sb = new Scanner(System.in);
		salBruto = sb.nextFloat();
		
		System.out.println("Adicional noturno: ");
		Scanner an = new Scanner(System.in);
		adNoturno = an.nextFloat();
		
		System.out.println("Horas extras: ");
		Scanner he = new Scanner(System.in);
		horasExtras = he.nextFloat();
		
		System.out.println("Descontos: ");
		Scanner de = new Scanner(System.in);
		descontos = de.nextFloat();
		
		salLiquido = (salBruto + adNoturno + (horasExtras*5) - descontos);
		System.out.println("Salário líquido: "+salLiquido);

	}

}
