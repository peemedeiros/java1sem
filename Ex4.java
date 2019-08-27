public class Ex4{
	public static void main(String[] args){
		double valorDaCompra = 650.00;
		double porcentagemDoDesconto = 7.0;

		double valorDoDesconto = (valorDaCompra * porcentagemDoDesconto)/100;
		double totalAPagar = valorDaCompra - valorDoDesconto;

		System.out.println(" Valor do produto R$"+valorDaCompra+
		"\n Percentual do desconto "+porcentagemDoDesconto+"% "+"\n Total a pagar "+totalAPagar); 
	}
}