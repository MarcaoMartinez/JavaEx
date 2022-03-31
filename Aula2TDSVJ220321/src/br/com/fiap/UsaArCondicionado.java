package br.com.fiap;

public class UsaArCondicionado {

	public static void main(String[] args) {
		
		ArCondicionado ac1 = new ArCondicionado();
		
		ac1.temperatura = 12;
		ac1.modo = "Ventilar";
		ac1.aumentarTemperatura();
		ac1.diminuirTemperatura();
		ac1.trocarModo("Gelado");

		
		ac1.mostrar();

	}

}
