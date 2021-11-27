import java.util.Scanner;

public class Multiplicador {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int n;
    int m;
    System.out.print("Ingrese el primer numero:");
    n = entrada.nextInt();

    System.out.print("Ingrese el segundo numero:");
    m = entrada.nextInt();

    for(int i = 1 ; i <= n; i++){
      int k = n * i;
      System.out.println(n + "x" + i + "=" + k);
    }
    for(int j = 1; j <= n; j++) {

    }
  }
}