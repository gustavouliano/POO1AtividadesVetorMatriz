package Matriz;
import java.util.Scanner;
import java.text.DecimalFormat;

public class at01 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.00");
		Scanner sc = new Scanner(System.in);
		
		int valorMatriz = 0;
		
		do {
			System.out.print("Valor inteiro impar entre 3 e 11: ");
			valorMatriz = sc.nextInt();
		}while((valorMatriz % 2 == 0) || (valorMatriz < 3) || (valorMatriz > 11) );
		
		int matriz[][] = new int[valorMatriz][valorMatriz];
		int somaTotal = 0, somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;
		int maior = 0, menor = 0;
		int qtdPar = 0, qtdImpar = 0;
		
		
		for (int i = 0; i < valorMatriz; i++) {
			for (int j = 0; j < valorMatriz; j++) {
				System.out.print("Valor da linha " + (i + 1) + " da coluna " + (j + 1) + ": " );
				matriz[i][j] = sc.nextInt();
				somaTotal = somaTotal + matriz[i][j];
		
				if (i == 0) {
					maior = matriz[i][j];
					menor = matriz[i][j];
				}else {
					if (matriz[i][j] > maior) {
						maior = matriz[i][j];
					}else if (matriz[i][j] < menor) {
						menor = matriz[i][j];
					}
				}
				
				if (matriz[i][j] % 2 == 0) {
					qtdPar++;
				}else {
					qtdImpar++;
				}
				
				if (i == j) {
					somaDiagonalPrincipal+= matriz[i][j];
				}	
			}
		}
		
		double media = (double)somaTotal / (double)(valorMatriz * valorMatriz);
		
		int coluna = matriz.length - 1;
		for (int i = 0; i < matriz.length; i++) {   //soma da diagonal secundária			
			somaDiagonalSecundaria+= matriz[i][coluna];
			coluna--;
		}
		
		System.out.println("Soma dos elementos: " + somaTotal);
		System.out.println("Média: " + df.format(media));
		System.out.println("Maior valor: " + maior);
		System.out.println("Menor valor: " + menor);
		System.out.println("Quantidade de pares: " + qtdPar);
		System.out.println("Quantidade de ímpares: " + qtdImpar);
		System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);
		System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);
		
		 for (int i = 0; i < valorMatriz; i++) {    // mostra a matriz formatada
		        for (int j = 0; j < valorMatriz; j++) {
		            System.out.print(matriz[i][j] + "   ");
		        }
		        System.out.println("");
		 } 
		 
		 sc.close();

	}

}
