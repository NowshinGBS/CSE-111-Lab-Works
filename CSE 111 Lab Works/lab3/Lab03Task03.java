import java.util.Scanner;
public class Lab03Task03
{
  public static void main (String [] args)
  {
    Scanner fr= new Scanner(System.in);
    System.out.println("enter a word");
    String word= fr.nextLine();
 int i;
 for(i=0; i<=word.length()-1; i++)
 {
 int askingcode= (int)word.charAt(i);
 System.out.println(word.charAt(i)+" : "+askingcode);
 }
  }
}