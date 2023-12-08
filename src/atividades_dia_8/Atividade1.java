package atividades_dia_8;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JOHNNATA SILVA
		// ATIVIDADE 1
		float salario;
		System.out.println("\nDigite o valor do seu salário: \n");
		Scanner valor = new Scanner(System.in);
		salario = valor.nextFloat();
		
		float abono;
		System.out.println("\nDigite o valor do seu abono: \n");
		Scanner soma = new Scanner(System.in);
		abono = soma.nextFloat();
		
		float total = salario + abono;
		System.out.println("\nNovo salário: "+total);
		

	}

}
