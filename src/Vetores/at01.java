package Vetores;
import java.util.Scanner;
import java.util.Arrays;

public class at01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Número na posição " + i + ": ");
			num[i] = sc.nextInt();
			
		}
		
		for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + " | ");
		}
		
		System.out.println("\n" + Arrays.toString(num));
		
		sc.close();

	}

}
