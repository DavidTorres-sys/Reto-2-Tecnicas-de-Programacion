import java.util.Scanner;

public class Reto2 {

  public static void main(String[] args) {
    Scanner Entrada = new Scanner (System.in);
    int opcion;
    do{
      System.out.println("1. Punto 1");
      System.out.println("2. Punto 2");
      System.out.println("3. Punto 3");
      System.out.println("4. Punto 4");
      System.out.println("5. Salir");
      System.out.print("Ingrese que punto desea ver:");
      opcion = Entrada.nextInt();
    } while (opcion<1||opcion>5);

    switch(opcion){

      //------------------------PUNTO 1----------------------//

      case 1:
        System.out.println("Ingresar primer número");
        int n;
        n = Entrada.nextInt();
        System.out.println("Ingresar segundo número");
        int m;
        m = Entrada.nextInt();

        for(int i = 1 ; i <= n; i++){
          for(int k = 1; k <= m; k++) {
            int w = i * k;
            System.out.println(i + "x" + k + "=" + w);
          }
        }
        break;

      //---------------------PUNTO 2-----------------------//

      case 2:
        int num;
        System.out.println("Número que desea elevar al cuadrado");
        num = Entrada.nextInt();

        int impar = 1;
        int acum = 0;
        int i;
        for (i=1;i<=num;i++){
          acum = acum + impar;
          System.out.println("Impar"+i+" es: "+impar);
          impar = impar+2;

        }
        System.out.println("El cuadrado de "+num+" es: "+acum);
        break;

      //------------------------PUNTO 3----------------------//
      case 3:
        int numero;
        System.out.println("Número que desea elevar al cubo");
        numero = Entrada.nextInt();

        int impar1;
        impar1 = (numero*(numero-1))+1;
        int acumulado = 0;
        int k;
        for(k=1;k <=numero; k++  ){
          acumulado = acumulado + impar1;
          System.out.println("Impar"+k+" es: "+impar1);
          impar1=impar1+2;
        }
        System.out.println("el cubo de "+numero+" es: "+acumulado);
        break;

      //------------------------PUNTO 4----------------------//
      case 4:


        System.out.println("Ingresar el valor que desea retirar");
        int withdraw;
        int [] values = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 100};


        withdraw = Entrada.nextInt();

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
        break;

      //------------------------PUNTO 5----------------------//
      case 5:
        System.exit(0);
        break;
    }
  }
}
