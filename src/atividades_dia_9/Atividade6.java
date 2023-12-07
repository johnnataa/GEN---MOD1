package atividades_dia_9;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		// JOHNNATA SILVA
		// ATIVIDADE 6
		String nome;
		int cod;
		float sal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nNome do colaborador: ");
		nome = leia.next();
		
		System.out.println("\n 1 - Gerente");
		System.out.println(" 2 - Vendedor");
		System.out.println(" 3 - Supervisor");
		System.out.println(" 4 - Motorista");
		System.out.println(" 5 - Estoquista");
        System.out.println(" 6 - Técnico de TI");
		
		System.out.println("\nCódigo do seu cargo: ");
		cod = leia.nextInt();
		
		System.out.println("\nSalário: ");
		sal = leia.nextFloat();
		
		switch (cod) {
		case 1: System.out.println("\nNome do colaborador: " + nome + "\nCargo: Gerente" + "\nSalário: R$ " + sal * 1.1);
		break;
		case 2: System.out.println("\nNome do colaborador: " + nome + "\nCargo: Vendedor" + "\nSalário: R$ " + sal * 1.07);
		break;
		case 3: System.out.println("\nNome do colaborador: " + nome + "\nCargo: Supervisor" + "\nSalário: R$ " + sal * 1.09);
		break;
		case 4: System.out.println("\nNome do colaborador: " + nome + "\nCargo: Motorista" + "\nSalário: R$ " + sal * 1.06);
		break;
		case 5: System.out.println("\nNome do colaborador: " + nome + "\nCargo: Estoquista" + "\nSalário: R$ " + sal * 1.05);
		break;
		case 6: System.out.println("\nNome do colaborador: " + nome + "\nCargo: Técnico de TI" + "\nSalário: R$ " + sal * 1.08);
		break;
		}

	}

}
