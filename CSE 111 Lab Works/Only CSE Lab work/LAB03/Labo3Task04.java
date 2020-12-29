import java.util.*;

public class Labo3Task04
{
  public static void main (String[] args){
    Scanner mon = new Scanner(System.in);
    System.out.println("enter a word in capital");
    String word = mon.nextLine();
     int[] count = new int [91];
     int index;
     for(int counter = 0; counter<word.length(); counter++){
       index = (int)word.charAt(counter);
       count[index] = count[index] +1;
       
     }
     for(int counter=0; counter<91; counter++){
     System.out.println((char)counter + " which is " + counter + " is found " + count[counter] + " times ");
     }
  }
}