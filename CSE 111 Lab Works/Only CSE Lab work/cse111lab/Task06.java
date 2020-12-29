
import java.util.Scanner;

public class Task06 {
  public static void main(String args[]) {
    
    Scanner max=new Scanner(System.in);
    System.out.println("Enter a word or line to concat using CONCAT method:");
    String userLine=max.nextLine();
    
    System.out.println(userLine);
    System.out.println(userLine.concat("==THE END=="));
    System.out.println(userLine);
  }
}