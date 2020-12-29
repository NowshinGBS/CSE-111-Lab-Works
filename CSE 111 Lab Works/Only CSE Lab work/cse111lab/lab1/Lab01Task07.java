import java.util.Scanner;
public class Lab01Task07
{
  public static void main (String [] args)
  {
    Scanner fr=new Scanner(System.in);
    int line= fr.nextInt();
     int column= fr.nextInt(); 
    
    int linecount;
    for(linecount=1; linecount<=line; linecount++) 
    { 
       int colcount;
        for(colcount=1; colcount<=column; colcount++)
          if(linecount==1 || colcount==1 || colcount==column || linecount==line)
        {
          System.out.print("*");
        }
    else
    {
    System.out.print(" ");
    }
     System.out.println();
      
    }
  }
}