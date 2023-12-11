package atividades_dia_10;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// JOHNNATA SILVA
		// ATIVIDADE 4
		int funcao, idade, genero = 0, mulherCis = 0, homemCis = 0, naoBinario = 0;
		int mulherTrans = 0, homemTrans = 0, outros = 0, Backend = 0, frontend = 0, mobile = 0, fullStack = 0;
		int mulheresGeral = 0, homensGeral = 0, fullNaoBinario = 0, numPesquisa = 0, idadeTot = 0;
		String resp = "S";

		Scanner leia = new Scanner(System.in);

		while (resp.equals("S")) {

			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			numPesquisa++;

			idadeTot = idadeTot + idade;

			System.out.println("Selecione a sua identidade de gênero: \n" + "1 - Mulher Cis: \n" + "2 - Homem Cis: \n"
					+ "3 - Não Binário: \n" + "4 - Mulher Trans: \n" + "5 - Homem Trans: \n" + "6 - Outros: ");
			genero = leia.nextInt();

			switch (genero) {
			case 1:
				mulherCis++;
				break;
			case 2:
				homemCis++;
				break;
			case 3:
				naoBinario++;
				break;
			case 4:
				mulherTrans++;
				break;
			case 5:
				homemTrans++;
				break;
			case 6:
				outros++;
				break;
			default:
				System.out.println("Opção inválida");
			}

			System.out.println("Selecione a sua função: \n" + "1 - Backend: \n" + "2 - Frontend: \n" + "3 - Mobile: \n"
					+ "4 - FullStack: \n");
			funcao = leia.nextInt();

			switch (funcao) {
			case 1:				
				Backend++;
				break;
			case 2:				
				frontend++;
				if (genero == 1 || genero == 4) {
					mulheresGeral++;
				}
				break;
			case 3:				
				mobile++;
				if (idade > 40 && genero == 2 || idade > 40 && genero == 5) {
					homensGeral++;
				}
				break;
			case 4:				
				fullStack++;
				if (idade < 30 && genero == 3) {
					fullNaoBinario++;
				}
				break;
			default:
				System.out.println("Opção inválida");
			}

			System.out.println("Deseja responder novamente?: ");
			resp = leia.next();
		}

		System.out.println("Desenvolvedores Backend: " + Backend);
		System.out.println("Mulheres cis e trans desenvolvedoras Frontend: " + mulheresGeral);
		System.out.println("Homens cis e trans desenvolvedores mobile e maiores de 40 anos: " + homensGeral);
		System.out.println("Pessoas não binárias desenvolvedoras FullStack menores de 30 anos: " + fullNaoBinario);
		System.out.println("Número de pessoas que responderam a pesquisa: " + numPesquisa);
		System.out.println("Média de idade das pessoas que responderam a pesquisa: " + idadeTot / numPesquisa);

	}

}