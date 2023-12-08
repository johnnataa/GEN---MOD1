package atividades_dia_8;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JOHNNATA SILVA
		// ATIVIDADE 2
				float n1, n2, n3, n4;
				
				System.out.println("Digite a Nota 1: ");
				Scanner nota1 = new Scanner(System.in);
				n1 = nota1.nextFloat();
				
				System.out.println("Digite a Nota 2: ");
				Scanner nota2 = new Scanner(System.in);
				n2 = nota2.nextFloat();
				
				System.out.println("Digite a Nota 3: ");
				Scanner nota3 = new Scanner(System.in);
				n3 = nota3.nextFloat();
				
				System.out.println("Digite a Nota 4: ");
				Scanner nota4 = new Scanner(System.in);
				n4 = nota4.nextFloat();
				
				float media = (n1 + n2 + n3 + n4) / 4;
				
				System.out.println("Sua média final é: "+media);
						

	}

}
