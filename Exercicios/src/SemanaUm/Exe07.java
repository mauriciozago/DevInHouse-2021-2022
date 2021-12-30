package SemanaUm;

import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {
		
		System.out.println("Insira um numero inteiro: ");
	    
		Scanner leitor = new Scanner(System.in);
		int numero = leitor.nextInt();
		while (!(numero >= 0 && numero <= 10)) {
			System.out.println("Por favor digite um numero entre 0 e 10!");
			numero = leitor.nextInt();
		}
		leitor.close();
		
		int fatorial = 1;
		for (int i = numero; i > 0; i--) {
			fatorial *= i;
		}
		
		System.out.println("O fatorial de " + numero + " é " + fatorial);
		
	}
	
}
