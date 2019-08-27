public class Ex3{
	public static void main(String[] args){
		int variavel1 = 10;
		int variavel2 = 15;

		System.out.println("Variavel 1: "+variavel1);
		System.out.println("Variavel 2: "+variavel2);

		System.out.println("Trocando as posições:");
		
		int salvarVariavel1 = variavel1;
		variavel1 = variavel2 ;
		variavel2 = salvarVariavel1;

		System.out.println("Variavel 1 depois da troca é: "+variavel1);
		System.out.println("Variavel 2 depois da troca é: "+variavel2);

	}
}