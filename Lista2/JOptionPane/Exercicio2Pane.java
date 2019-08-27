//Para um número qualquer, informar se este é maior ou menor que 10.

import javax.swing.JOptionPane;

class Exercicio2Pane {
	public static void main (String[] args){

		double numeroQualquer = Double.parseDouble(JOptionPane.showInputDialog("Informe um numero qualquer:"));

//Estrutura de descisão 1
		if (numeroQualquer > 10){

			JOptionPane.showMessageDialog(null, "Esse numero eh maior que 10");
//Estrutura de descisão 2
		}else if ( numeroQualquer < 10){

		JOptionPane.showMessageDialog(null, "Esse numero eh menor que 10");
		}else {

		JOptionPane.showMessageDialog(null, "Esse numero eh o 10");
		}
	}
}
