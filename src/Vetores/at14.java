package Vetores;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class at14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vetor1[] = new int[10];
		int vetor2[] = new int[10];
		
		for (int i = 0; i < vetor1.length; i++) {
			System.out.print((i+1) +"° número: ");
			vetor1[i] = sc.nextInt();
		}
		for (int i = 0; i < vetor2.length; i++) {
			System.out.print((i+1) +"° número: ");
			vetor2[i] = sc.nextInt();
		}
		
		int vetorTotal[] = new int[20];
		
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				vetorTotal[i] = vetor1[(i/2)];
			}else {
				vetorTotal[i] = vetor2[(int) Math.floor(i/2)];
			}
		}
		
		System.out.println(Arrays.toString(vetorTotal));
		
		sc.close();

	}

}