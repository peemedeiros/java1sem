//A partir de um número inteiro, informar se este é par ou ímpar.

import java.util.Scanner;

class Exercicio4Scanner {
	public static void main(String[] args){

		Scanner leitura = new Scanner(System.in);

		System.out.println("Escreva um numero a seguir e o programa identificarah como par ou impar:");

		int numero = leitura.nextInt();

		int divisao = numero % 2;

		if (divisao == 0) {
			System.out.println("este numero eh par!");
		}else {
			System.out.println("este numero eh impar!");
		}
	}
}
