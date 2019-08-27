//A partir de um número inteiro, informar se este é par ou ímpar.

import javax.swing.JOptionPane;

class Exercicio4Pane {
	public static void main(String[] args){

		JOptionPane.showMessageDialog(null, "Escreva um numero a seguir e o programa identificarah como par ou impar:");

		int numero =  Integer.parseInt(JOptionPane.showInputDialog("Informe um numero inteiro:"));



		int divisao = numero % 2;

		if (divisao == 0) {
			JOptionPane.showMessageDialog(null, "este numero eh par!");
		}else {
			JOptionPane.showMessageDialog(null, "este numero eh impar!");
		}
	}
}
