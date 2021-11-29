import java.util.Scanner;

public class PuntoCuatro {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int withdraw;

    System.out.print("Ingrese el valor a retirar:");
    withdraw = input.nextInt();

    for(int k = 1; k <= withdraw; k-- ){
      if(withdraw >= 100000) {
        int x = withdraw / 100000;
        System.out.print(x + " Billetes de 100mil, ");
      }
      if(withdraw >= 50000) {
        int y = withdraw / 50000;
        System.out.print(y + " Billetes de 50mil, ");
      }
      if(withdraw >= 20000) {
        int z = withdraw / 20000;
        System.out.print(z + " Billetes de 20mil, ");
      }
      if(withdraw >= 10000) {
        int w = withdraw / 10000;
        System.out.println(w + " Billetes de 10mil, ");
      }
      if(withdraw >= 5000) {
        int v = withdraw / 100000;
        System.out.print(v + " Billetes de 5mil, ");
      }
      if(withdraw >= 2000) {
        int n = withdraw / 2000;
        System.out.print(n + " Billetes de 2mil, ");
      }
      if(withdraw >= 1000) {
        int m = withdraw / 1000;
        System.out.print(m + " Billetes de mil, ");
      }
      if(withdraw >= 500) {
        int p = withdraw / 500;
        System.out.print(p + " Billetes de 500, ");
      }
      if(withdraw >= 100) {
        int i = withdraw / 100;
        System.out.print(i + " Billetes de 100, ");
        break;
      }
    }
  }
}
