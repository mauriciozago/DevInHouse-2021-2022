package SemanaUm;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		
		System.out.println("Digite o seu nome: ");
		Scanner leitor = new Scanner(System.in);
		String nome = leitor.nextLine();
		leitor.close();
		
		System.out.println("O seu nome tem " + nome.length() + " letras");
		
	}
	
}
