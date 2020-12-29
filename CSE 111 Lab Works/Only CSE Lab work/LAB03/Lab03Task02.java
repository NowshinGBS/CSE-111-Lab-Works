import java.util.*;

public class Lab03Task02
{
  public static void main (String[] args){
    Scanner mine = new Scanner(System.in);
    System.out.println("enter a word");
    String word = mine.nextLine();
    
    for(int count=0 ; count<word.length() ; count++){
      System.out.println(word.charAt(count));
    }
    
  }
}