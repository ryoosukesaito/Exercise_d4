import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Input the N: ");
    int num = scan.nextInt();

    int result = 0;
    for(int i = 1; i <= num; i++){

      result = result + i;
      
    }
    
    System.out.printf("The sum of 1 to %d is %d",num,result);
    scan.close();
  }
  
}