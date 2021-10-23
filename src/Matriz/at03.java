package Matriz;
import java.util.Scanner;

public class at03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de alunos: ");
		int qtdAluno = sc.nextInt();
		int qtdNota = 2;
		
		double notas[][] = new double[qtdAluno][qtdNota];
		String nomeAluno[] = new String[qtdAluno];
		
		for (int i = 0; i < qtdAluno; i++) {
			System.out.println("Aluno " + (i+1));
			System.out.print("Nome: ");
			sc.nextLine();
			nomeAluno[i] = sc.nextLine();			
			for (int j = 0; j < qtdNota; j++) {
				System.out.print("Nota " + (j + 1) + ": ");
				notas[i][j] = sc.nextDouble();
			}
		}
		
		double soma = 0;
		double somaTotal = 0;
		double media = 0;
		double maiorNota = 0, menorNota = 0;
		String maiorNotaNome = "" , menorNotaNome = "";
		double maiorMedia = 0, menorMedia = 0;
		String maiorMediaNome = "", menorMediaNome = "";
		
		 for (int i = 0; i < qtdAluno; i++) {
			 System.out.print("Aluno " + nomeAluno[i] + ": ");
			 for (int j = 0; j < qtdNota; j++) {
		            System.out.print(notas[i][j] + " | ");
		            soma+= notas[i][j];
		            somaTotal+= notas[i][j];
		            
		            if (i == 0 & j == 0) {
		            	maiorNota = notas[i][j];
		            	menorNota = notas[i][j];
		            	maiorNotaNome = nomeAluno[i];
		            	menorNotaNome = nomeAluno[i];
		            }else {
		            	if (notas[i][j] > maiorNota) {
		            		maiorNota = notas[i][j];
		            		maiorNotaNome = nomeAluno[i];
		            	}else if (notas[i][j] < menorNota) {
		            		menorNota = notas[i][j];
		            		menorNotaNome = nomeAluno[i];
		            	}
		            }
		            
		            if (j == qtdNota - 1) {
		            	media = soma / qtdNota;
		            	System.out.print(" Média: " + media);
		            	
		            	if (i == 0) {
		            		maiorMedia = media;
		            		menorMedia = media;
		            		maiorMediaNome = nomeAluno[i];
		            		menorMediaNome = nomeAluno[i];
		            	}else {
		            		if (media > maiorMedia) {
		            			maiorMedia = media;
		            			maiorMediaNome = nomeAluno[i];
		            		}else if (media < menorMedia) {
		            			menorMedia = media;
		            			menorMediaNome = nomeAluno[i];
		            		}
		            	}
		            	
		            }
		     }
			 soma = 0;
			 media = 0;
			 System.out.println("  ");
		 }
		 
		 double mediaGeral = somaTotal / (qtdAluno *  qtdNota);
		 
		 System.out.println("Maior nota: " + maiorNota + " do aluno " + maiorNotaNome);
		 System.out.println("Menor nota: " + menorNota + " do aluno " + menorNotaNome);
		 System.out.println("Maior media: " + maiorMedia + " do aluno " + maiorMediaNome);
		 System.out.println("Menor media: " + menorMedia + " do aluno " + menorMediaNome);
		 System.out.println("Média geral da turma: " + mediaGeral);
		 
		 System.out.println("Acima da média: ");
		 for (int i = 0; i < qtdAluno; i++) {
			 soma = 0;
			 media = 0;
			 for (int j = 0; j < qtdNota; j++) {
				 soma+= notas[i][j]; 
			 }
			 
			 media = soma / qtdNota;
			 if (media > mediaGeral) {
				 System.out.print(nomeAluno[i] + " | ");
			 }
		 }
		 
		 System.out.println("\nAbaixo da média: ");
		 for (int i = 0; i < qtdAluno; i++) {
			 soma = 0;
			 media = 0;
			 for (int j = 0; j < qtdNota; j++) {
				 soma+= notas[i][j]; 
			 }
			 
			 media = soma / qtdNota;
			 if (media < mediaGeral) {
				 System.out.print(nomeAluno[i] + " | ");
			 }
		 }
		
		sc.close();

	}

}