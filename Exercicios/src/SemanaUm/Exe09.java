package SemanaUm;

import java.util.Scanner;

public class Exe09 {

	public static void main(String[] args) {
		
		System.out.println("Seja bem vindo � Zago's Pizzaria!");
		System.out.println("Nosso rod�zio hoje tem:");
		System.out.println("1 - Pizza de Mussarela");
		System.out.println("2 - Pizza de Calabresa");
		System.out.println("3 - Pizza Portuguesa");
		System.out.println("Fatia de qual pizza voce aceita primeiro?");
		
		Scanner leitor = new Scanner(System.in);
		int opcao = leitor.nextInt();
		
		int contMussarela = 0;
		int contCalabresa = 0;
		int contPortuguesa = 0;
		
		while (opcao != 0) {			
			if (opcao == 1) {
				contMussarela++;
			}
			else if (opcao == 2) {
				contCalabresa++;
			}
			else if (opcao == 3) {
				contPortuguesa++;
			}
			else {
				System.out.println("N�o existe essa op��o, tente denovo");
			}
			
			System.out.println("E agora? Digite 0 se satisfeito.");
			opcao = leitor.nextInt();
		}
		leitor.close();
		System.out.println("Voce comeu " + contMussarela + " peda�os de mussarela");
		System.out.println("Voce comeu " + contCalabresa + " peda�os de calabresa");
		System.out.println("Voce comeu " + contPortuguesa + " peda�os de portuguesa");
	}
	
}
