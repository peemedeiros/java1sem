/*A partir do peso e altura de uma pessoa, calcule o IMC indice de massa corpóreo indicando
o estado dessa pessoa baseado na tabela abaixo */

import java.util.Scanner;

class Exercicio7Scanner {
	public static void main (String[] args){

		System.out.println("Calculadora de IMC");

		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite o seu peso:");
		double peso = leitura.nextDouble();

		Scanner leitura2 = new Scanner(System.in);
		System.out.println("Digite o sua altura:");
		double altura = leitura2.nextDouble();



		double imc = peso / Math.pow(altura, 2);


//Estrutura de decisão 1
		if (imc < 17){

			System.out.println("IMC: "+imc+" Peso muito baixo!");
//Estrutura de decisão 2
		} else if (imc >= 17 && imc<= 18.49) {

			System.out.println("IMC: "+imc+" Abaixo do peso");
//Estrutura de decisão 3
		} else if (imc >= 18.5 && imc<= 24.99) {

			System.out.println("IMC: "+imc+" Seu peso esta otimo!");
//Estrutura de decisão 4
		} else if (imc >= 25 && imc <= 29.99) {

			System.out.println("IMC: "+imc+" Acima do peso");
//Estrutura de decisão 5
		} else if (imc >= 30 && imc <= 34.99) {

			System.out.println("IMC: "+imc+" Obesidade I");
//Estrutura de decisão 6
		} else if (imc >= 35 && imc <= 39.99) {

			System.out.println("IMC: "+imc+" Obesidade II (severa)");
		} else {

			System.out.println("IMC: "+imc+" Obesidade III (morbida)");

		}
	}
}
