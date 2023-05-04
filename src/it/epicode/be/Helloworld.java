package it.epicode.be;

import java.util.Arrays;
import java.util.Scanner;

public class Helloworld {

  public static void main(String[] args) {
    moltiplica(5, 5);
    concatena("tizio", 20);
    inserisciInArray(arr, "sei");
    perimetroRettangolo(5.3, 10.6);
    pariDispari(7);
    perimetroTriangolo(15, 12);
    areaTriangolo(2, 5, 6);
    areaTriangolo2(3, 8, 9);

    Scanner sc = new Scanner(System.in);
    System.out.print("Inserisci qualcosa uno:");
    String stringaUno = sc.nextLine();
    System.out.print("Inserisci qualcosa due:");
    String stringaDue = sc.nextLine();
    System.out.print("Inserisci qualcosa tre:");
    String stringaTre = sc.nextLine();
    System.out.println(stringaUno + ' ' + stringaDue + ' ' + stringaTre);
    System.out.println(stringaTre + ' ' + stringaDue + ' ' + stringaUno);
  }

  public static void moltiplica(int n1, int n2) {
    System.out.println(n1 * n2);
  }

  public static void concatena(String name, int number) {
    System.out.println(name + " is " + number + " years old");
  }

  static String arr[] = { "uno", "due", "tre", "quattro", "cinque" };
  
  

  public static void inserisciInArray(String arr[], String n) {
    String newArr[] = { arr[0], arr[1], n, arr[2], arr[3], arr[4] };
    System.out.println(Arrays.toString(newArr));
  }

  public static void perimetroRettangolo(double l1, double l2) {
    System.out.println((l1 + l2) * 2);
  }

  public static void pariDispari(int number) {
    System.out.println((number % 2));
  }

  public static void perimetroTriangolo(double base, double altezza) {
    System.out.println((base * altezza) / 2);
  }

  public static void areaTriangolo(double latoA, double latoB, double latoC) {
    double semiPerimetro = (latoA + latoB + latoC) / 2;
    double area = Math.sqrt(
      semiPerimetro *
      (semiPerimetro - latoA) *
      (semiPerimetro - latoB) *
      (semiPerimetro - latoC)
    );
    System.out.println("Area Triangolo: " + area);
  }

  public static void areaTriangolo2(double latoA, double latoB, double latoC) {
    double semiPerimetro = (latoA + latoB + latoC) / 2;
    double area = Math.sqrt(
      semiPerimetro *
      (semiPerimetro - latoA) *
      (semiPerimetro - latoB) *
      (semiPerimetro - latoC)
    );
    System.out.println("Area Triangolo: " + area);
  }
}
