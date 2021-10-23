package Vetores;
import java.util.Scanner;
import java.util.Random;

public class at09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		char letras[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
				'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int tamanhoSenha = 0;
		String senha = "";
		char randomLetra;
		
		do {
			System.out.print("Tamanho da senha: ");
			tamanhoSenha = sc.nextInt();
		}while (tamanhoSenha > letras.length);
		
		for (int i = 0; i < tamanhoSenha; i++) {
			if (i % 2 == 0) {  
				// pega consoante
				do {
					randomLetra = letras[random.nextInt(26)];  // numero aleatorio entre 0 e 26
				}while (randomLetra == 'a' || randomLetra == 'e' || randomLetra == 'i' || randomLetra == 'o' || randomLetra == 'u');
					
				senha+= randomLetra;
			}else { 
				// pega vogal
				do {
					randomLetra = letras[random.nextInt(26)];
				}while (randomLetra != 'a' && randomLetra != 'e' && randomLetra != 'i' && randomLetra != 'o' && randomLetra != 'u');
					
				senha+= randomLetra;
				}
		}
		
		System.out.println("Senha: " + senha);
		
		sc.close();

	}

}