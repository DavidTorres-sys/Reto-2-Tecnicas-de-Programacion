import java.util.Scanner;

public class Punto1 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int n;
    int m;
    System.out.print("Ingrese el primer numero:");
    n = input.nextInt();

    System.out.print("Ingrese el segundo numero:");
    m = input.nextInt();

    for(int i = 1 ; i <= n; i++){
      int x = n * i;
      for(int k = 1; k <= m; k++) {
        int y = n * k;
        int w = i * k;
        System.out.println(i + "x" + k + "=" + w);
      }
    }
  }
}