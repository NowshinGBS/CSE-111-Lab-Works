import java.util.Scanner;
public class Lab03task06
{
public static void main (String[] args)
{
Scanner fr=new Scanner(System.in);
String word1 = fr.next();

String word3=word1.concat("\n").concat(word1+"==The End==").concat("\n").concat(word1);
System.out.println(word3);
}
}