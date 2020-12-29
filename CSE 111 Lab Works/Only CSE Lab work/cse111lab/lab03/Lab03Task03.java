import java.util.*;

public class Lab03Task03
{
  public static void main (String[] args){
    Scanner fr = new Scanner(System.in);
    System.out.println("enter a word");
    String word = fr.nextLine();
   
     for (int c=0; c<
          word.length(); c++)
     {
       //char askingletter = word.charAt;
       int askingcode = (int) word.charAt(c);
       System.out.println(word.charAt(c)+":"+askingcode);
     }
  }
}