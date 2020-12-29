import java.util.*;

public class Test02Task03
{
  public static void main (String[] args){
    Scanner mine= new Scanner(System.in);
    System.out.println("enter a number");
    int inp1 = mine.nextInt();
     System.out.println("enter a number");
     int inp2 = mine.nextInt();
     inp1 = inp1 + inp2 ;
    inp2 = inp1 - inp2 ;
    inp1 = inp1 - inp2 ;

     System.out.println(inp1);
     System.out.println(inp2);
  }
}