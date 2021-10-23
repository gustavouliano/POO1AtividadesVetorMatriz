package Vetores;
import java.util.Scanner;
import java.util.Arrays;

public class at04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double notas[] = new double[4];
		double soma = 0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print(i+1 + "ª nota: ");
			notas[i] = sc.nextDouble();
			
			soma = soma + notas[i];
		}
		
		double media = soma / notas.length;
		
		System.out.println("Notas: " + Arrays.toString(notas));
		System.out.println("Média: " + media);
		
		sc.close();
		
	}

}