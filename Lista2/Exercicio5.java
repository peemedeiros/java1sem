//Informe se usuário é menor ou maior de idade.

import javax.swing.JOptionPane;

class Exercicio5 {
	public static void main(String[] args){
		int idadeDoUsuario = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
///Estrutura de descisão
		if (idadeDoUsuario >= 18) {

			JOptionPane.showMessageDialog(null, "Idade confirmada, usuario maior de idade.");
		} else {

			JOptionPane.showMessageDialog(null, "Bloqueado, motivo: usuario menor de idade.");
		}
	}
}
