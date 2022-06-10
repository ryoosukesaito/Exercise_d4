import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a word:");
    String msg1 = scan.nextLine();

    int num = msg1.length(); 
    
    System.out.println("-----------");

    for(int i = 1; i <= num; i++){
      System.out.println(msg1);
    }

    scan.close();

  }
}
