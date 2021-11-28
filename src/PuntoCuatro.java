import java.util.Scanner;

public class PuntoCuatro {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int withdraw;
    System.out.print("Ingrese el valor a retirar:");
    withdraw = input.nextInt();

    for(int k = 1; k <= withdraw; k-- ){
      int x =  withdraw - k;
      if(withdraw >= 100000) {
        int y = withdraw - k;
        System.out.println(y);
      }
      if(withdraw <= 50000){
        System.out.println();
      }
      if(withdraw <=  20000){
        System.out.println();
      }
     if(withdraw <= 10000){
        System.out.println();
      }
      if(withdraw <= 5000){
        System.out.println();
      }
      if(withdraw <= 2000){
        System.out.println();
      }
      if(withdraw <= 1000){
        System.out.println();
      }
      if(withdraw <= 500){
        System.out.println();
      }
      if(withdraw <= 100){
        System.out.println();
      }
    }
  }
}
