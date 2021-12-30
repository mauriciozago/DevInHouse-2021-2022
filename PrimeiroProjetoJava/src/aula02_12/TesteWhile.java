package aula02_12;

import java.util.Random;
import java.util.Scanner;

public class TesteWhile {

	public static void main(String[] args) {
				
		int numeroSecreto = new Random().nextInt(6) + 5;
		int chuteComputador = new Random().nextInt(6) + 5;
				
		System.out.println("Tente adivinhar o número!");
		Scanner leitor = new Scanner(System.in);
		int tentativaUsuario = leitor.nextInt();
				
		while (numeroSecreto != chuteComputador) {
			System.out.println("Tente novamente!");
			tentativaUsuario = leitor.nextInt();
		}
		System.out.println("Muito bem!");
		leitor.close();
	}
	
}
