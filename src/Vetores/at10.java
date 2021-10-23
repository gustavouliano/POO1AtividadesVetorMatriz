package Vetores;
import java.util.Scanner;
import java.util.Arrays;

public class at10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um texto: ");
		String texto = sc.nextLine();
		
		char vetorCaractere[] = new char[texto.length()];
		
		for (int i = 0; i < vetorCaractere.length; i++) {
			vetorCaractere[i] = texto.charAt(i);
		}
		
		System.out.println(Arrays.toString(vetorCaractere));
		
		sc.close();
		
	}

}