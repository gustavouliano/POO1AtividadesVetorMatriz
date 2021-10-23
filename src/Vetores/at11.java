package Vetores;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class at11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // declaro a formatação

		System.out.print("Data (dd/mm/aaaa): ");
		String data = sc.nextLine();
		boolean validacao;
		
		try {			
			sdf.setLenient(false); // não aceita datas falsas
			sdf.parse(data); // aqui converte a data do tipo string para tipo data, se der certo, abaixo valida como true
			validacao = true;
		}catch(ParseException ex){
			validacao = false;
		}
		
		if (validacao) {
			
			String dataSeparada[] = data.split("/"); // guardo os valores da data num vetor string, sabe que é indíce novo pois corta o /
			
			int vetorDataInt[] = new int[dataSeparada.length];
			
			for (int i = 0; i < dataSeparada.length; i++) {
				vetorDataInt[i] = Integer.parseInt(dataSeparada[i]); // transforma a string do indíce para int e guarda no vetor int
			}
			
			System.out.println(Arrays.toString(vetorDataInt));
			
		}else {
			System.out.println("Data inválida.");
		}
		
		sc.close();
	
	}

}
