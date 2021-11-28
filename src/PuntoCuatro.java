import java.util.Scanner;

public class PuntoCuatro {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int withdraw;
    int billeteCienMil;
    int billeteCincuentaMil;
    int billeteVeinteMil;
    int billeteDiezMil;
    int billeteCincoMil;
    int billeteDosMil;
    int billeteMil;
    int billeteQuinientos;
    int billeteDocientos;
    int billeteCien;

    System.out.print("Ingrese el valor a retirar:");
    withdraw = input.nextInt();

    for(int k = 1; k <= n; k-- ){
      if(withdraw >= 100000) {
        int y = withdraw - 100000;
        System.out.println(y);
      }
    }
  }
}
