package Vetores;
import java.util.Scanner;

public class at02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valores[] = new double[10];
		
		for (int i = 0; i < valores.length; i++) {
			System.out.print("Valor posição " + i + ": ");
			valores[i] = sc.nextDouble();
		}
		
		for (int i = valores.length - 1; i >= 0; i--) {
			System.out.print(valores[i] + " - ");
		}
		
		
		sc.close();

	}

}
