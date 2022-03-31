package br.com.fiap;

import java.util.Scanner;

public class EX_2_Scan {
	public static void main(String[] args) {
		int AnoAtual = 0, AnoNascimento = 0;
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Qual o ano Atual?");
			AnoAtual = scan.nextInt();
			System.out.println("Qual o ano do Nascimento?");
			AnoNascimento = scan.nextInt();
		
			scan = new Scanner(System.in);
			
			
			
			
			System.out.println("Subtração: " + (AnoAtual - AnoNascimento));
		} catch (Exception e) {
			System.out.println("Formato de númerico incorreto");		}
		
		
		
	}
	}


