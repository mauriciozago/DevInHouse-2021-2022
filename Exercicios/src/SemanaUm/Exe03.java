package SemanaUm;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual o seu sobrenome?");
		String sobrenome = leitor.nextLine();
		System.out.println("Qual o seu nome?");
		String nome = leitor.nextLine();
		
		leitor.close();
		System.out.println("Seu nome completo é: " + nome + " " + sobrenome);
		
	}
	
}
