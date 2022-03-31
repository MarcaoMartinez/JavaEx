// Marco Antonio L. Martinez Filho - 1 TDSVJ - Manhã


package br.com.fiap;

import java.util.Scanner;

public class UsaGeometria {


	public static void main(String[] args) {
		Scanner scan;
		float lado;
		float altura;
		float raio;
		float PI;
		
		scan = new Scanner(System.in);
		
		try {
			System.out.println("Digite um valor para Lado: ");
			lado = scan.nextFloat();
			System.out.println("Digite um valor para Altura: ");
			altura = scan.nextFloat();
			System.out.println("Digite um valor para Raio: ");
			raio = scan.nextFloat();
			System.out.println("Digite um valor para : PI");
			PI = scan.nextFloat();
			
			System.out.println("O resultado da Área do Quadrado é: " + lado * altura);
			System.out.println("O resultado da Área do Retângulo é: " + lado * altura);
			System.out.println("O resultado da Área do Triângulo é: " + (lado * altura) /2);
			System.out.println("O resultado da Área do Círculo é: " + PI * raio * raio);

		} catch (Exception e) {
			System.out.println("Escreva um número correto!");
		}
		
		
	}

}

