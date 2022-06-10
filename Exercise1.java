import java.util.Scanner;

public class Exercise1 {
  public static void main(String[] args) {

    Scanner scan1 = new Scanner(System.in);
    System.out.println("Input the start: ");
    int num1 = scan1.nextInt();

    Scanner scan2 = new Scanner(System.in);
    System.out.println("Input the End: ");
    int num2 = scan2.nextInt();

    System.out.println("-----------------");
    for(int i = num1; i <= num2; i++){
      System.out.println(i);
    }
  }
  
}