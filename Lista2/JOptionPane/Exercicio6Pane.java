//Exercicio 6 lista 2 atualizada

import javax.swing.JOptionPane;

class Exercicio6Pane {
	public static void main(String[] args){
    int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));


		if (idade > 0 && idade <= 150){
			if (idade >= 18){
				JOptionPane.showMessageDialog(null, "Voce e maior de idade");
			}else {
				JOptionPane.showMessageDialog(null, "voce eh menor de idade");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Idade invalida!");
		}
	}
}
