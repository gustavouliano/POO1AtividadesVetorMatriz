package Vetores;
import java.util.Scanner;

public class at13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade[] = new int[5];
		double altura[] = new double[5];
		
		int idadeVelho = 0, idadeNovo = 0, idadeBaixo = 0, idadeAlto = 0;
		double alturaVelho = 0, alturaNovo = 0, alturaBaixo = 0, alturaAlto = 0;
		
		int somaIdade = 0;
		double somaAltura = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println((i+1) + "ª pessoa: ");
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			
			if (i == 0) {
				idadeVelho = idade[i];
				idadeNovo = idade[i];
				idadeBaixo = idade[i];
				idadeAlto = idade[i];
				alturaVelho = altura[i];
				alturaNovo = altura[i];
				alturaBaixo = altura[i];
				alturaAlto = altura[i];
			}else {
				if (idade[i] > idadeVelho) {
					idadeVelho = idade[i];
					alturaVelho = altura[i];
				}else if (idade[i] < idadeNovo) {
					idadeNovo = idade[i];
					alturaNovo = altura[i];
				}
				if (altura[i] > alturaAlto) {
					alturaAlto = altura[i];
					idadeAlto = idade[i];
				}else if (altura[i] < alturaBaixo) {
					alturaBaixo = altura[i];
					idadeBaixo = idade[i];
				}
			}
			
			somaIdade+= idade[i];
			somaAltura+= altura[i];
			
		}
		
		
		System.out.print("Idade (ordem inversa): ");
		for (int i = idade.length - 1; i >= 0; i--) {
			System.out.print(idade[i] + " | ");
		}
		System.out.print("Altura (ordem inversa): ");
		for (int i = altura.length - 1; i >= 0; i--) {
			System.out.print(altura[i] + " | ");
		}
		
		double mediaIdade = somaIdade / idade.length;
		double mediaAltura = somaAltura / altura.length;
		
		System.out.println("\nMédia idade: " + mediaIdade);
		System.out.println("Média altura: " + mediaAltura);
		
		for (int i = 0; i < idade.length; i++) {
			if ((idade[i] > mediaIdade) && (altura[i] > mediaAltura)) {
				System.out.println("Idade: " + idade[i] + " e altura: " + altura[i] + " acima da média");
			}else if ((idade[i] < mediaIdade) && (altura[i] < mediaAltura)) {
				System.out.println("Idade: " + idade[i] + " e altura: " + altura[i] + " abaixo da média");
			}
		}

		System.out.println("Mais novo: " + idadeNovo + " anos e " + alturaNovo + " de altura");
		System.out.println("Mais velho: " + idadeVelho + " anos e " + alturaVelho + " de altura");
		System.out.println("Mais alto: " + idadeAlto + " anos e " + alturaAlto + " de altura");
		System.out.println("Mais baixo: " + idadeBaixo + " anos e " + alturaBaixo + " de altura");
		
		sc.close();

	}

}
