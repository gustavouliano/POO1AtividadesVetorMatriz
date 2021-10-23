package Vetores;
import java.util.Scanner;
import java.util.Arrays;

public class at05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char letra[] = new char[10];
		char consoante[];
		int qtdConsoante = 0;
		
		for (int i = 0; i < letra.length; i++) {
			System.out.print(i + 1 + "ª letra: ");
			letra[i] = sc.next().charAt(0);
			
			if (letra[i] != 'a' && letra[i] != 'e' && letra[i] != 'i' && letra[i] != 'o' && letra[i] != 'u')
				qtdConsoante++;
		}
		
		//Passando as consoantes do vetor letra para o vetor consoante
		
		consoante = new char[qtdConsoante];
		int contador = 0;
		
		for (int i = 0; i < letra.length; i++) {
			if (letra[i] != 'a' && letra[i] != 'e' && letra[i] != 'i' && letra[i] != 'o' && letra[i] != 'u')
				consoante[contador] = letra[i];
				contador++;
		}
		
		System.out.println("Consoantes lidas: " + qtdConsoante);
		System.out.println("Consoantes: " + Arrays.toString(consoante) );
		sc.close();
		
	}

}