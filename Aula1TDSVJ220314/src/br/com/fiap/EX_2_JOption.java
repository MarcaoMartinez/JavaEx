package br.com.fiap;

import javax.swing.JOptionPane;

public class EX_2_JOption {

		public static void main(String[] args) {
			int AnoAtual =0, AnoNascimento = 0;
			String aux;
			try {
				aux = JOptionPane.showInputDialog("Qual o ano você está?");
					AnoAtual = Integer.parseInt(aux);	
				aux = JOptionPane.showInputDialog("Que ano você Nasceu?");
					AnoNascimento = Integer.parseInt(aux);
				
						
					JOptionPane.showMessageDialog(null,
							"valor 1: " + AnoAtual + "\nvalor 2: "
	  + AnoNascimento + "\nsoma dos valores = " 
									+ (AnoAtual - AnoNascimento));
					
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Formato de número incorreto");
			}
			
		}

	}



