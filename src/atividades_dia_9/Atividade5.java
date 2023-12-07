package atividades_dia_9;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		// JOHNNATA SILVA
		// ATIVIDADE 5
		int cod, quant;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("# ## ### #### Menu #### ### ## #");
		System.out.println("\n 1 - Cachorro quente");
		System.out.println(" 2 - X-Salada");
		System.out.println(" 3 - X-Bacon");
		System.out.println(" 4 - Bauru");
		System.out.println(" 5 - Refrigerante");
        System.out.println(" 6 - Suco de laranja");
		
		System.out.println("\nCódigo do produto: ");
		cod = leia.nextInt();
		
		System.out.println("\nQuantidade: ");
		quant = leia.nextInt();
		
		switch (cod) {
		case 1: System.out.println("Produto: Cachorro quente\n" + "Valor total: " + quant * 10);
		break;
		case 2: System.out.println("Produto: X-Salada\n" + "Valor total: " + quant * 15);
		break;
		case 3: System.out.println("Produto: X-Bacon\n" + "Valor total: " + quant * 18);
		break;
		case 4: System.out.println("Produto: Bauru\n" + "Valor total: " + quant * 12);
		break;
		case 5: System.out.println("Produto: Refrigerante\n" + "Valor total: " + quant * 8);
		break;
		case 6: System.out.println("Produto: Suco de laranja\n" + "Valor total: " + quant * 13);
		break;
		default: System.out.println("Opção inválida!");
		}
		

	}

}
