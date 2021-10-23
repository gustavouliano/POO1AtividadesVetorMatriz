package Vetores;
import java.util.Scanner;

public class at16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int TAM = 3;
		int valor[] = new int[TAM];
		
		for (int i = 0; i < TAM; i ++) {
			do {
				System.out.print((i+1) + "° valor entre 0 e 20: ");
				valor[i] = sc.nextInt();
				
			}while(valor[i] < 0 || valor[i] > 20);
		}
		
		String cerquilha = "#";
		
		for (int i = 0; i < TAM ; i++) {
			System.out.println(valor[i] + ": " + cerquilha.repeat(valor[i]));
		}
		
		sc.close();
		
	}

}