package aula01_12;

import java.util.Scanner;

public class TesteIf {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int idade = scanner.nextInt();
		
		if (idade >= 18) {
			System.out.println("Maior de Idade");
		} else {
			System.out.println("Menor de Idade");
		}		
		scanner.close();
	}
	
}
