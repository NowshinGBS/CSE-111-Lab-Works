import java.util.*;

public class Lab03Task01
{
  public static void main (String[] args){
    Scanner mine = new Scanner(System.in);
    System.out.println("enter a word");
      
    String s = mine.nextLine();
    int letternum = s.length();
    System.out.println(letternum);
  }
}