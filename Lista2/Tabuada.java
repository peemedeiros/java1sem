import java.util.Scanner;

class Tabuada {
  public static void main(String[] args){
    System.out.println("Esse programa calcula a tabuada do numero que o usuario escolher");

    Scanner leitura = new Scanner (System.in);
    System.out.println("digite um numero:");

    int numero = leitura.nextInt();

    int resultado1 = numero*1;
    System.out.println(numero+" X 1 = "+resultado1);
    int resultado2 = numero*2;
      System.out.println(numero+" X 2 = "+resultado2);
    int resultado3 = numero*3;
      System.out.println(numero+" X 3 = "+resultado3);
    int resultado4 = numero*4;
      System.out.println(numero+" X 4 = "+resultado4);
    int resultado5 = numero*5;
      System.out.println(numero+" X 5 = "+resultado5);
    int resultado6 = numero*6;
      System.out.println(numero+" X 6 = "+resultado6);
    int resultado7 = numero*7;
      System.out.println(numero+" X 7 = "+resultado7);
    int resultado8 = numero*8;
      System.out.println(numero+" X 8 = "+resultado8);
    int resultado9 = numero*9;
      System.out.println(numero+" X 9 = "+resultado9);
    int resultado10 = numero*10;
      System.out.println(numero+" X 10 = "+resultado10);

  }
}
