package br.com.fiap;

import java.util.Scanner;

public class EX_1_Scan {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite a Nota 1");
			num1 = scan.nextInt();
			System.out.println("Digite a Nota 2");
			num2 = scan.nextInt();
			System.out.println("Digite a Nota 3");
			num3 = scan.nextInt();
			System.out.println("Digite a Nota 4");
			num4 = scan.nextInt();
			scan = new Scanner(System.in);
			
			
			
			
			System.out.println("Soma: " + (num1 + num2 + num3 + num4));
		} catch (Exception e) {
			System.out.println("Formato de númerico incorreto");		}
		
		
		
	}
	}


