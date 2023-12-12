package atividades_dia_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// JOHNNATA SILVA
		// ATIVIDADE 1

		Scanner leia = new Scanner(System.in);
		String cor;

		ArrayList<String> aCores = new ArrayList<String>();

		for (int indice = 0; indice < 5; indice++) {
			System.out.println("Digite o nome da " + (indice + 1) + "ª cor: ");
			cor = leia.nextLine();
			aCores.add(cor);
		}
		System.out.println("Listar todas as cores: " + aCores);
		Collections.sort(aCores);
		System.out.println("Ordenar as cores: " + aCores);

	}
}
