package SemanaUm;

import java.util.Random;

public class Exe01 {

	public static void main(String[] args) {
		
		Random numeroAleatorio = new Random();
		double numero = numeroAleatorio.nextDouble();
		
		//Não há necessidade de apresentar intervalo
		//no metodo nextDouble haja vista que este
		//retorna sempre numeros entre 0 e 1.
		
		System.out.println(numero);
	}
	
}
