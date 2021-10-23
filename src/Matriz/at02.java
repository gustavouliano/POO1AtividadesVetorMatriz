package Matriz;
import java.util.Scanner;

public class at02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int linha = 5, coluna = 5;
		
		double matriz[][] = new double[linha][coluna];
		
		double soma = 0;
		double mediap1 = 0, mediap2 = 0, mediap3 = 0, mediap4 = 0, mediap5 = 0;
		double somam1 = 0, somam2 = 0, somam3 = 0, somam4 = 0, somam5 = 0;
		
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.print("Preço produto " + (i + 1) + " no mercado " + (j + 1) + ": ");
				matriz[i][j] = sc.nextDouble();
				soma+= matriz[i][j];
				
				if (j == 0) {
					somam1+= matriz[i][j];
				}else if (j == 1) {
					somam2+= matriz[i][j];
				}else if (j == 2) {
					somam3+= matriz[i][j];
				}else if (j == 3) {
					somam4+= matriz[i][j];
				}else {
					somam5+= matriz[i][j];
				}
			}
			if (i == 0) {
				mediap1 = soma / coluna;
			}else if (i == 1) {
				mediap2 = soma / coluna;
			}else if (i == 2) {
				mediap3 = soma / coluna;
			}else if (i == 3) {
				mediap4 = soma / coluna;
			}else {
				mediap5 = soma / coluna;
			}
			
			soma = 0;
		}
		
		System.out.println("Mercado 1 | Mercado 2 | Mercado 3");
		for (int i = 0; i < linha; i ++) {
			System.out.print("Produto " + (i+1) + ": ");
			for (int j = 0; j < coluna; j++) {
				System.out.print(matriz[i][j] + " | ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Média produto 1: R$" + mediap1);
		System.out.println("Média produto 2: R$" + mediap2);
		System.out.println("Média produto 3: R$" + mediap3);
		System.out.println("Média produto 4: R$" + mediap4);
		System.out.println("Média produto 5: R$" + mediap5);
		System.out.println("Valor total mercado 1: R$" +somam1);
		System.out.println("Valor total mercado 2: R$" +somam2);
		System.out.println("Valor total mercado 3: R$" +somam3);
		System.out.println("Valor total mercado 4: R$" +somam4);
		System.out.println("Valor total mercado 5: R$" +somam5);
		
		if (somam1 >= somam2 && somam1 >= somam3 && somam1 >= somam4 && somam1 >= somam5) {
			System.out.println("Mercado 1 mais caro, total: R$" + somam1);
		}else if (somam2 >= somam1 && somam2 >= somam3 && somam2 >= somam4 && somam2 >= somam5) {
			System.out.println("Mercado 2 mais caro, total: R$" + somam2);
		}else if (somam3 >= somam1 && somam3 >= somam2 && somam3 >= somam4 && somam3 >= somam5) {
			System.out.println("Mercado 3 mais caro, total: R$" + somam3);
		}else if (somam4 >= somam1 && somam4 >= somam3 && somam4 >= somam2 && somam4 >= somam5) {
			System.out.println("Mercado 4 mais caro, total: R$" + somam4);
		}else {
			System.out.println("Mercado 5 mais caro, total: R$" + somam5);
		}
		
		if (somam1 <= somam2 && somam1 <= somam3 && somam1 <= somam4 && somam1 <= somam5) {
			System.out.println("Mercado 1 mais barato, total: R$" + somam1);
		}else if (somam2 <= somam1 && somam2 <= somam3 && somam2 <= somam4 && somam2 <= somam5) {
			System.out.println("Mercado 2 mais barato, total: R$" + somam2);
		}else if (somam3 <= somam1 && somam3 <= somam2 && somam3 <= somam4 && somam3 <= somam5) {
			System.out.println("Mercado 3 mais barato, total: R$" + somam3);
		}else if (somam4 <= somam1 && somam4 <= somam3 && somam4 <= somam2 && somam4 <= somam5) {
			System.out.println("Mercado 4 mais barato, total: R$" + somam4);
		}else {
			System.out.println("Mercado 5 mais barato, total: R$" + somam5);
		}
		
		sc.close();

	}

}