package Vetores;
import java.util.Scanner;
import java.util.Arrays;

public class at08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numeros[] = new int[5];
		int soma = 0, multiplicacao = 1;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print((i+1) + "° número: ");
			numeros[i] = sc.nextInt();
			
			soma+= numeros[i];
			multiplicacao*= numeros[i];
			
		}
		
		System.out.println("Números: " + Arrays.toString(numeros));
		System.out.println("Soma: " + soma);
		System.out.println("Multiplicação: " + multiplicacao);
		
		sc.close();
		
	}

}