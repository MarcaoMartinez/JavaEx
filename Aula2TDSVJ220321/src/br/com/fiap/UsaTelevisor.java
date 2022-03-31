package br.com.fiap;

import java.util.Scanner;

public class UsaTelevisor {

	public static void main(String[] args) {
			Televisor televisor1 = new Televisor();
			
			/*televisor1.canal = 5;
			televisor1.volume = 8;
			televisor1.aumentarVolume();
			televisor1.aumentarVolume();
			televisor1.trocarCanal(7);
			
			televisor1.mostrar();*/
			
			Scanner scan;
			int canal = 0, volume = 0;
			try {
				
				scan = new Scanner(System.in);
				System.out.println("Escolha um canal");
				canal = scan.nextInt();
				System.out.println("Escolha o volume");
				volume = scan.nextInt();
				televisor1.trocarCanal(canal);
				televisor1.volume = volume;
				televisor1.mostrar();
			
			} catch (Exception e) {
				System.out.println(e.getMessage());

			} 
			
			
		}

	}


