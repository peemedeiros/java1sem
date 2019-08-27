//Para um número qualquer, informar se este é maior ou menor que 10.

import java.util.Scanner;

class Exercicio2Scanner {
	public static void main (String[] args){

		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite qualquer numero:");

		double numeroQualquer = leitura.nextInt();
//Estrutura de descisão 1
		if (numeroQualquer > 10){

			System.out.println("Esse numero eh maior que 10");
//Estrutura de descisão 2
		}else if ( numeroQualquer < 10){

			System.out.println("Esse numero eh menor que 10");
		}else {

			System.out.println("Esse numero eh o 10");
		}
	}
}
