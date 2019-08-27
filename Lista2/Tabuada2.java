import javax.swing.JOptionPane;

class Tabuada2 {
  public static void main(String[] args){
    JOptionPane.showMessageDialog(null, "Esse programa calcula a tabuada do numero que o usuario escolher");


    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));

    int resultado1 = numero*1;

    int resultado2 = numero*2;

    int resultado3 = numero*3;

    int resultado4 = numero*4;

    int resultado5 = numero*5;

    int resultado6 = numero*6;

    int resultado7 = numero*7;

    int resultado8 = numero*8;

    int resultado9 = numero*9;

    int resultado10 = numero*10;

    JOptionPane.showMessageDialog(null, numero+" X 1 = "+resultado1+"\n"+
      numero+" X 2 = "+resultado2+"\n"+numero+" X 3 = "+resultado3+"\n"+numero+" X 4 = "+resultado4+"\n"+
      numero+" X 5 = "+resultado5+"\n"+numero+" X 6 = "+resultado6+"\n"+numero+" X 7 = "+resultado7+"\n"+
      numero+" X 8 = "+resultado8+"\n"+numero+" X 9 = "+resultado9+"\n"+numero+" X 10 = "+resultado10+"\n");

  }
}
