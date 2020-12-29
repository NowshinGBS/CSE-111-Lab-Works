import java.util.Scanner;
public class Lab03Task01
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);

    System.out.println("Type");
    int x=sc.nextInt();
 
    System.out.println("Type odd if you want to sort numbers at odd position or type even  or all number to sor");
    String s=sc.nextLine();
    if(s.length()==3)
    {
      System.out.println("Thik ache");
    }
  }
}