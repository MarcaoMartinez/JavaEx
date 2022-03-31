package br.com.fiap;

import java.util.Scanner;

public class EX_3_Scan {

	public static void main(String[] args) {
		
		final double PI = 3.14;
		double raio = 0.0, area = 0.0;
		
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o valor do raio: ");
			raio = scan.nextDouble();
			area = PI * raio * raio;
		
			System.out.println("A Área do Círculo é: " + area);
					} catch (Exception e) {
			System.out.println("Formato de númerico incorreto");		
			}	
	}
	}