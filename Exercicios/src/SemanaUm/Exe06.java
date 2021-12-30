package SemanaUm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe06 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do semestre:");
		double nota1 = leitor.nextDouble();
		System.out.println("Digite a primeira nota do semestre:");
		double nota2 = leitor.nextDouble();
		System.out.println("Digite a primeira nota do semestre:");
		double nota3 = leitor.nextDouble();
		
		leitor.close();
		
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("##.00");
		
		System.out.println("Sua média final é: " + df.format((nota1+nota2+nota3)/3));
	}
	
}
