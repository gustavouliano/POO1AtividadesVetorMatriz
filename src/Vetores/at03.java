package Vetores;
import java.util.Scanner;

public class at03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número de valores que deseja digitar: ");
		int n = sc.nextInt();
		int soma = 0, maior = 0, menor = 0; 
		String acimaMedia = "", abaixoMedia = "", par = "", impar = "";
		double media = 0;
		
		int valores[] = new int [n];

		for (int i = 0; i < valores.length; i++) {
			System.out.print(i+1 + "° valor: " );
			valores[i] = sc.nextInt();
			if (i == 0) {
				maior = valores[i]; 
				menor = valores[i];
			}else {
				if (valores[i] > maior) {
					maior = valores[i];
				}
				else if (valores[i] < menor) {
					menor = valores[i];
				}
			}
			
			soma = soma + valores[i];
			
			if (valores[i] % 2 == 0) {
				par = par + valores[i] + " - ";
			}else {
				impar = impar + valores[i] + " - ";
			}
			
			if (i == valores.length - 1) {
				
				media = soma / valores.length;
				
				for (int j = 0; j < valores.length; j++) {
					if (valores[j] > media) {
						acimaMedia = acimaMedia + valores[j] + " - ";
					}else if (valores[j] < media) {
						abaixoMedia = abaixoMedia + valores[j] + " - ";
					}
					
				}
				
			}
			
		}
		
		System.out.println("Soma: " + soma
				+ "\nMédia: " + media
				+ "\nMaior: " + maior
				+ "\nMenor: " + menor
				+ "\nPares: " + par
				+ "\nÍmpares: " + impar
				+ "\nNúmeros acima da média: " + acimaMedia
				+ "\nNúmeros abaixo da média: " + abaixoMedia);
		
		sc.close();
		
	}

}