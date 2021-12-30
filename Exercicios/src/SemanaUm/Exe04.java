package SemanaUm;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		
		System.out.println("Digite um número com 2 ou mais casas decimais:");
		Scanner leitor = new Scanner(System.in);
		double numero = leitor.nextDouble();
		leitor.close();
		
		int numeroInteiro = (int) numero;
		
		System.out.println("O numero depois de convertido fica: " + numeroInteiro);
		
	}
	
}
