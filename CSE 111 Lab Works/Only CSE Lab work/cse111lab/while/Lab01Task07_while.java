import java.util.Scanner;
public class Lab01Task07_while
  {
  public static void main (String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int line=sc.nextInt();
    
    int linecount=1;
    while(linecount<=line)
    {
      int columncount=1;
     while(columncount<=line+1)

        if(linecount==1  || columncount==1 || linecount==line || columncount==line+1)
      {
        System.out.print("*");
      columncount++;
      }
      else
      {
        System.out.print(" ");
        columncount++;
      }
      System.out.println(); 
      linecount++;
    }
  }
}

