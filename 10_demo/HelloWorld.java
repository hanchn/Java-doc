import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    var a = sc.nextInt();
    System.out.println("You enter a number : " + a);
  }
}