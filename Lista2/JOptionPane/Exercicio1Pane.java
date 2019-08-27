// A partir de um número inteiro, informar se este é positivo ou negativo.

import javax.swing.JOptionPane;

class Exercicio1Pane {
	public static void main (String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero qualquer:"));
//Estrutura de decisão 1
		if(numero > 0){

			JOptionPane.showMessageDialog(null, "Este numero eh positivo");
//Estrutura de decisão 2
		}else if(numero < 0) {

			JOptionPane.showMessageDialog(null, "Este numero eh negativo");
		}else{

			JOptionPane.showMessageDialog(null, "numero ZERO");
		}
	}
}
