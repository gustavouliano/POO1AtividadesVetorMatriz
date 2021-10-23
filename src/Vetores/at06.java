package Vetores;
import java.util.Scanner;
import java.util.Arrays;

public class at06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		final int TAM = 20;
		
		int num[] = new int[TAM];
		int qtdPar = 0;
		int qtdImpar = 0;
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(i + 1 + "° número: ");
			num[i] = sc.nextInt();
			
			if (num[i] % 2 == 0)
				qtdPar++;
			else
				qtdImpar++;
		}
		
		int par[] = new int[qtdPar];
		int impar[] = new int[qtdImpar];
		qtdPar = 0;
		qtdImpar = 0;
				
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				par[qtdPar] = num[i];
				qtdPar++;
			}else {
				impar[qtdImpar] = num[i];
				qtdImpar++;
			}
		}
		
		System.out.println("Números: " + Arrays.toString(num));
		System.out.println("Pares: " + Arrays.toString(par));
		System.out.println("Ímpares: " + Arrays.toString(impar));
		
		sc.close();

	}

}