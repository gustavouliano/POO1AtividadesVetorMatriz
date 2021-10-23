package Vetores;
import java.util.Scanner;

public class at07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double mediaAluno[] = new double[10];
		double nota = 0, soma = 0, calculoMedia = 0;
		
		for (int i = 0; i < mediaAluno.length; i++) {
			System.out.println("Aluno " + (i+1) + ": ");
			for (int j = 1; j <= 4; j++) {
				System.out.print(j + "ª nota: ");
				nota = sc.nextDouble();
				
				soma = soma + nota;
			}
			
			calculoMedia = soma / 4;
			mediaAluno[i] = calculoMedia;
			
			calculoMedia = 0;
			soma = 0;
			
		}
		
		int qtdAcima = 0;
		String textAcima = "";
		
		for (int i = 0; i < mediaAluno.length; i++) {
			if (mediaAluno[i] >= 7) {
				qtdAcima++;
				textAcima = textAcima + mediaAluno[i] + " | ";
			}
		}
		
		System.out.println("Quantidade alunos acima da média: " + qtdAcima);
		System.out.println("Notas acima da média: " + textAcima);
		
		
		
		sc.close();

	}

}
