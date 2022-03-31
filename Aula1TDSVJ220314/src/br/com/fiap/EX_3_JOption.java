package br.com.fiap;

import javax.swing.JOptionPane;

public class EX_3_JOption {
	public static void main(String[] args) {
		final double PI = 3.14;
		double raio = 0.0, area = 0.0;
		
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite o valor do raio: ");
				raio = Integer.parseInt(aux);	
				area = PI * raio * raio;
				
					
				JOptionPane.showMessageDialog(null,
						"A Área do cículo é: " + area);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Formato de número incorreto");
		}
		
	}

}
