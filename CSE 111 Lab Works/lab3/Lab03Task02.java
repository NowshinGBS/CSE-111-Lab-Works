import java.util.Scanner;
public class Lab03Task02
{
  public void main (String [] args)
  {
    Scanner fr = new Scanner(System.in);
    String b = fr.nextLine();
    int i;
    for(i=0; i<=b.length()-1; i++)
    {
      System.out.println(b.charAt(i));
    } 
  }
}
