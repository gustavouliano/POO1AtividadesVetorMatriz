package Matriz;
import java.util.Scanner;
import java.util.Random;

public class at05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		final int TAM = 3;
		
		int loteria[][] = new int[TAM][TAM];
		
		for (int i = 0; i < TAM; i++) {
			for (int j = 0; j < TAM; j++) {
				loteria[i][j] = random.nextInt((60 - 1) + 1) + 1;   // gera aleatório entre 1 e 60
			}
		}
		
		System.out.print("Quantas cartelas deseja preencher? ");
		int qtdCartela = sc.nextInt();
		
		int cartela[] = new int[(TAM * TAM) * qtdCartela];
		
		for (int i = 0; i < cartela.length; i++) {
			System.out.print((i + 1)+"° valor: ");
			cartela[i] = sc.nextInt();
		}
		
		System.out.println("Loteria: ");
		for (int i = 0; i < TAM; i++) {
			for (int j = 0; j < TAM; j++) {
				System.out.print(loteria[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Acertos: ");
		for (int i = 0; i < cartela.length; i ++) {
			for (int j = 0; j < TAM; j++) {
				for (int k = 0; k < TAM; k++) {
					if (loteria[j][k] == cartela[i]) {
						System.out.print(cartela[i] + " | ");
					}
				}
			}	
		}
		
		sc.close();

	}

}