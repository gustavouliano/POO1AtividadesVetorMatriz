package Matriz;
import java.util.Scanner;

public class at04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de atletas: ");
		int qtdAtleta = sc.nextInt();
		final int QTDSALTOS= 5;
		
		double salto[][] = new double[qtdAtleta][QTDSALTOS];
		
		for (int i = 0; i < qtdAtleta; i++) {
			System.out.println("Atleta " + (i+1));
			for (int j = 0; j < QTDSALTOS; j++) {
				System.out.print("Salto " + (j + 1) + ": ");
				salto[i][j] = sc.nextDouble();
			}
		}
		
		double somaSalto = 0;
		double menorSalto = 0;
		double mediaSalto = 0;
		double maiorMedia = 0;
		double menorMedia = 0;
		
		for (int i = 0; i < qtdAtleta; i++) {
			System.out.print("Atleta " + (i+1) + ": ");
			for (int j = 0; j < QTDSALTOS; j++) {
				System.out.print(salto[i][j] + " | ");
				somaSalto+= salto[i][j];
				if (j == 0) {
					menorSalto = salto[i][j];
				}else {
					if (salto[i][j] < menorSalto) {
						menorSalto = salto[i][j];
					}
				}
				
				if (j == QTDSALTOS - 1) {
					somaSalto-= menorSalto;
					mediaSalto = somaSalto / (QTDSALTOS - 1);
					System.out.println(" M�dia: " + mediaSalto);
					
					if (i == 0) {
						maiorMedia = mediaSalto;
						menorMedia = mediaSalto;
					}else {
						if (mediaSalto > maiorMedia) {
							maiorMedia = mediaSalto;
						}else if (mediaSalto < menorMedia) {
							menorMedia = mediaSalto;
						}
					}
				}
				
			}
			
			mediaSalto = 0;
			somaSalto = 0;
			
			System.out.println(" ");
		}
		
		System.out.println("M�dia do campe�o: " + maiorMedia);
		System.out.println("M�dia do �ltimo lugar: " + menorMedia);
		
		sc.close();

	}

}