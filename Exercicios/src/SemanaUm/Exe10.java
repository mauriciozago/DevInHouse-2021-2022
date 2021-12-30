package SemanaUm;

import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {
		
		System.out.println("Insira um numero inteiro e verifique se ele é primo:");
		Scanner leitor = new Scanner(System.in);
		int numero = leitor.nextInt();
		int cont = 0;
		leitor.close();
		
		for (int i = numero; i > 0; i--) {
			if (numero%i == 0) {
				cont++;
			}
		}
		
		if (cont == 2) {
			System.out.println("É primo!");
		} else {
			System.out.println("Não é primo!");
		}
	}
}
