package br.com.fiap;

public class ArCondicionado {


	public int temperatura;
	public String modo;
	
	public void aumentarTemperatura () {
		temperatura++; }
		
	public void diminuirTemperatura() {
		temperatura--;
	}
		
	public void trocarModo(String m) {
		modo = m;
		
	}
	
	public void mostrar() {
		System.out.println("Temperatura: " + temperatura + "\nModo: " + modo);
	
	}
}

