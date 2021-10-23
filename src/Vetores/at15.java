package Vetores;
import java.util.Scanner;

public class at15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int TAM = 3;
		
		int idade[] = new int[TAM];
		double altura[] = new double[TAM];

		double somaAltura = 0;
		
		for (int i = 0; i < TAM; i++) {
			System.out.println((i+1) + "° aluno: ");
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
				
			somaAltura+= altura[i];
			
		}
		
		double mediaAltura = somaAltura / (double)TAM;
		int contCondicao = 0;
		
		for (int i = 0; i < TAM; i++) {
			if (idade[i] > 13 && altura[i] < mediaAltura) {
				contCondicao++;
			}
		}
		
		System.out.println("Média de altura: " + mediaAltura);
		System.out.println(contCondicao + " aluno(s) com mais de 13 anos e altura inferior à média");

		sc.close();
		
	}

}
