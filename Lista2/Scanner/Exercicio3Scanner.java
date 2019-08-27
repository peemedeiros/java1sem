//Para dois números, determinar qual é o maior entre eles imprimindo na tela: O primeiro é
//o maior ou O segundo é o maior.

import java.util.Scanner;

class Exercicio3Scanner {
	public static void main(String[] args){

		Scanner leitura = new Scanner(System.in);

		System.out.println("Digite um numero");
		double numero1 = leitura.nextDouble();

		System.out.println("Digite mais um numero");
		double numero2 = leitura.nextDouble();


		if(numero1 > numero2) {

			System.out.println("o primeiro numero eh maior");

		}else if(numero1 < numero2) {

			System.out.println("o segundo numero eh maior");

		}else {

			System.out.println("os dois numeros sao iguais");

		}
	}
}
