//Para dois números, determinar qual é o maior entre eles imprimindo na tela: O primeiro é
//o maior ou O segundo é o maior.

import javax.swing.JOptionPane;

class Exercicio3Pane {
	public static void main(String[] args){


		double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero:"));

		double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero:"));


		if(numero1 > numero2) {
			JOptionPane.showMessageDialog(null, "o primeiro numero eh maior");
		}else if(numero1 < numero2) {
			JOptionPane.showMessageDialog(null, "o segundo numero eh maior");
		}else {
			JOptionPane.showMessageDialog(null, "os dois numeros sao iguais");
		}
	}
}
