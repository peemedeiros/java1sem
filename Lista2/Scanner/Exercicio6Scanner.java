//Exercicio 6 lista 2 atualizada

import java.util.Scanner;


class Exercicio6Scanner {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.println("\nDigite sua idade: ");
		int idade = ler.nextInt();

		if (idade > 0 && idade <= 150){
			if (idade >= 18){
				System.out.println("Voce ja pode ser preso");
			}else {
				System.out.println("Menor idade esta acabando, cuidado ein!");
			}
		}else {
			System.out.println("Idade invalida");
		}
	}
}
