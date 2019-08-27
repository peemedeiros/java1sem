    public class Ex2{
  public static void main(String[] args){

    int numero1 = 10;
    int numero2 = 2;

    double resultadoDaPotencia = Math.pow(numero1, 5);
    double resultadoDaSegundaPotencia = Math.pow(numero2, 5);
    int resultadoDaDivisao = numero1 / numero2;
    double resultadoDaRaizQuadrada1 = Math.sqrt(numero1);
    double resultadoDaRaizQuadrada2 = Math.sqrt(numero2);

    System.out.println(numero1+" elevado a 5 eh igual a "+resultadoDaPotencia);

    System.out.println(numero2+" elevado a 5 eh igual a "+resultadoDaSegundaPotencia);
    
    System.out.println(numero1+" dividido por "+numero2+" eh igual a "+resultadoDaDivisao);

    System.out.println("O resto da divisao "+numero1+" / "+numero2+" eh "+numero1 % numero2);

    System.out.println("O radicando de "+numero1+" eh "+resultadoDaRaizQuadrada1);

    System.out.println("O radicando de "+numero1+" eh "+resultadoDaRaizQuadrada2);


  }
}