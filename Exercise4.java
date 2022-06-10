
import java.util.Scanner;

public class Exercise4 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("How many integers will be added?");
    int times = scan.nextInt();
    
    int sum = 0;

    for(int i = 1; i <= times; i++){
      Scanner scan1 = new Scanner(System.in);

      System.out.println("Enter an integer: ");
      sum = sum + scan1.nextInt();

    }
    
    System.out.printf("The sum is %d",sum);
    scan.close();
  }
}
