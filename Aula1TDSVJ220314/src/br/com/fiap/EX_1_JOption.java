package br.com.fiap;

import javax.swing.JOptionPane;

public class EX_1_JOption {
	public static void main(String[] args) {
		int num1 =0, num2 = 0, num3 = 0, num4 = 0;
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite a Nota 1");
				num1 = Integer.parseInt(aux);	
			aux = JOptionPane.showInputDialog("Digite a Nota 2");
				num2 = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite a Nota 3");
				num3 = Integer.parseInt(aux);	
			aux = JOptionPane.showInputDialog("Digite a Nota 4");
				num4 = Integer.parseInt(aux);
					
				JOptionPane.showMessageDialog(null,
						"valor1: " + num1 + "\nvalor 2: "
 + num2	+ "\nvalor 3: " + num3	+ "\nvalor 2: " + num4	+ "\nsoma dos valores = " 
								+ (num1 + num2 + num3 + num4));
				
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Formato de número incorreto");
		}
		
	}

}
