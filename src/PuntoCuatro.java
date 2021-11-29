import java.util.Scanner;

public class PuntoCuatro {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int withdraw;
    int [] values = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 100};

    System.out.print("Ingrese el valor a retirar:");
    withdraw = input.nextInt();

    int w1 = withdraw / 100000;

    if(withdraw - (w1 * values[0]) >= 0) {
      withdraw = withdraw - (w1 * values[0]);
      int w2 = withdraw / 50000;
      System.out.println(w1 + " Billete(s) de 100mil");

      if(withdraw - (w2 * values[1]) >= 0) {
        withdraw = withdraw - (w2 * values[1]);
        int w3 = (withdraw / 20000);
        System.out.println(w2 + " Billete(s) de 50mil");

        if(withdraw - (w3 * values[2]) >= 0) {
          withdraw = withdraw - (w3 * values[2]);
          int w4 = (withdraw / 10000);
          System.out.println(w3 + " Billete(s) de 20mil");

          if(withdraw - (w4 * values[3]) >= 0) {
            withdraw = withdraw - (w4 * values[3]);
            int w5 = (withdraw / 5000);
            System.out.println(w4 + " Billete(s) de 10mil");

            if(withdraw - (w5 * values[4]) >= 0) {
              withdraw = withdraw - (w5 * values[4]);
              int w6 = (withdraw / 2000);
              System.out.println(w5 + " Billete(s) de 5mil");

              if(withdraw - (w6 * values[5]) >= 0) {
                withdraw = withdraw - (w6 * values[5]);
                int w7 = (withdraw / 1000);
                System.out.println(w6 + " Billete(s) de 2mil");

                if(withdraw - (w7 * values[6]) >= 0) {
                  withdraw = withdraw - (w7 * values[6]);
                  int w8 = (withdraw / 500);
                  System.out.println(w7 + " Billete(s) de mil");

                  if(withdraw - (w8 * values[7]) >= 0) {
                    withdraw = withdraw - (w8 * values[7]);
                    int w9 = (withdraw / 100);
                    System.out.println(w8 + " Moneda(s) de 500");

                    if(withdraw - (w9 * values[8]) >= 0) {
                      withdraw = withdraw - (w9 * values[8]);
                      System.out.println(w9 + " Moneda(s) de 100");
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
