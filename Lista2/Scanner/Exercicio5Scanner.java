//Informe se usuário é menor ou maior de idade.

import java.util.Scanner;

class Exercicio5Scanner {
	public static void main(String[] args){
		Scanner leitura = new Scanner(System.in);
		System.out.println("Informe sua idade:");

		int idadeDoUsuario = leitura.nextInt();
///Estrutura de descisão
		if (idadeDoUsuario >= 18) {

			System.out.println("Idade confirmada, usuario maior de idade.");
		} else {

			System.out.println("Bloqueado, motivo: usuario menor de idade.");
		}
	}
}
