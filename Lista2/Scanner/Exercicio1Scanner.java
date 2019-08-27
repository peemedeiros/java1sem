// A partir de um número inteiro, informar se este é positivo ou negativo.

import java.util.Scanner;

class Exercicio1Scanner {
	public static void main (String[] args) {

		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numero = leitura.nextInt();

//Estrutura de decisão 1
		if(numero > 0){

			System.out.println( numero+" Este numero eh positivo");
//Estrutura de decisão 2
		}else if(numero < 0) {

			System.out.println( numero+" Este numero eh negativo");
		}else{

			System.out.println( numero+" Este numero eh o ZERO");
		}
	}
}
