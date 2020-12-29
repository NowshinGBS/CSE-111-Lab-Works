import java.util.*;

public class Lab03Task03
{
  public static void main (String[] args){
    Scanner mine = new Scanner(System.in);
    System.out.println("enter a word");
    String word = mine.nextLine();
    
     for (int m=0; m<
          word.length(); m++)
     {
       //char askingletter = word.charAt;
       int askingcode = (int) word.charAt(m);
       System.out.println(askingcode);
     }
  }
}