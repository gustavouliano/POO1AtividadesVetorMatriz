package Vetores;
import java.util.Scanner;
import java.util.Arrays;

public class at12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite palavras (separadas por ;): ");
		String texto = sc.nextLine();
		
		String palavras[] = texto.split(";");
		
		System.out.println(Arrays.toString(palavras));
		
		sc.close();	

	}

}
