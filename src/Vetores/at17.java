package Vetores;
import java.util.Scanner;

public class at17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		String nome[] = {"João", "Gustavo", "Luiza", "Pedro", "Maria", "José", "Fernanda", "Luiz", "Carlão", "Beatriz"};
		String sobrenome[] = {"Paulo", "Silva", "Penesk", "Iutaq", "Luriaqu", "Mauri", "Xaulu", "Caraquisoba", "Ueti", "Dalasta"};
		String telefone[] = {"910101010", "910101011", "910101012", "910101013", "910101014", "910101015", "910101016", "910101017", "910101018", "910101019"};
		String email[] = {"j@gmail.com", "g@gmail.com", "l@gmail.com", "p@gmail.com", "m@gmail.com", "jose@gmail.com", "f@gmail.com", "lui@gmail.com", "carlao@gmail.com", "b@gmail.com" };
		String dataNascimento[] = {"01/01/2000", "02/02/2001", "03/03/2005", "04/04/2005", "05/05/2002", "06/06/2001", "07/07/2000", "08/08/2001", "09/09/2001", "10/12/1995"};
		
		boolean flag = true;
		int escolha = 0;
		boolean existe = false;
		char continuar = 'a';
		
		String escolhaNome = "";
		String escolhaSobrenome = "";
		String escolhaMes = "";
		
		do {
			System.out.println("====- AGENDA -====");
			System.out.println("[1] - Consulta por Nome");
			System.out.println("[2] - Consulta por Sobrenome");
			System.out.println("[3] - Aniversário do mês");
			System.out.println("[4] - Relatório completo");
			System.out.println("[5] - Sair");
			existe = false;
			
			do {
				System.out.print("Escolha: ");
				escolha = sc.nextInt();
			}while((escolha < 1) || (escolha > 5));
			System.out.println("===================");
			if (escolha == 1) {
				System.out.print("Nome: ");
				sc.nextLine();
				escolhaNome = sc.nextLine();
				for (int i = 0; i < nome.length; i++) {
					if (escolhaNome.equalsIgnoreCase(nome[i])) {
						System.out.println("Nome: " + nome[i]);
						System.out.println("Sobrenome: " + sobrenome[i]);
						System.out.println("Telefone: " + telefone[i]);
						System.out.println("E-mail: " + email[i]);
						System.out.println("Data de nascimento: " + dataNascimento[i]);
						existe = true;
					}
				}
			}else if (escolha == 2) {
				System.out.print("Sobrenome: ");
				sc.nextLine();
				escolhaSobrenome = sc.nextLine();
				for (int i = 0; i < sobrenome.length; i++) {
					if (escolhaSobrenome.equalsIgnoreCase(sobrenome[i])) {
						System.out.println("Nome: " + nome[i]);
						System.out.println("Sobrenome: " + sobrenome[i]);
						System.out.println("Telefone: " + telefone[i]);
						System.out.println("E-mail: " + email[i]);
						System.out.println("Data de nascimento: " + dataNascimento[i]);
						existe = true;
					}
				}
			}else if (escolha == 3) {
				System.out.print("Mês [01, 02, 03, etc]: ");
				sc.nextLine();
				escolhaMes = sc.nextLine();
				for (int i = 0; i < dataNascimento.length; i++) {
					if (escolhaMes.equalsIgnoreCase(dataNascimento[i].substring(3, 5))) {
						System.out.println("Nome: " + nome[i]);
						System.out.println("Sobrenome: " + sobrenome[i]);
						System.out.println("Telefone: " + telefone[i]);
						System.out.println("E-mail: " + email[i]);
						System.out.println("Data de nascimento: " + dataNascimento[i]);
						existe = true;
					}
				}
			}else if (escolha == 4) {
				System.out.println("Relatório completo");
				for (int i = 0; i < nome.length; i++) {
					System.out.println("Nome: " + nome[i]);
					System.out.println("Sobrenome: " + sobrenome[i]);
					System.out.println("Telefone: " + telefone[i]);
					System.out.println("E-mail: " + email[i]);
					System.out.println("Data de nascimento: " + dataNascimento[i]);
					System.out.println("=============================");
					
				}
				existe = true;
			} 
			if (escolha== 5) {
				flag = false;
			}else {		
				if (existe == false) {
					System.out.println("Não encontrado.");
				}
			
				System.out.println("Continuar? [s/n]");
				continuar = Character.toLowerCase(sc.next().charAt(0));
			
				if (continuar == 's')
					flag = true;
				else
					flag = false;
			}			
		}while(flag);
		
		
		sc.close();

	}

}