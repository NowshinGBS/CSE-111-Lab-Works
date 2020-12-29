import java.util.Scanner;
public class Task20
{public static void main(String[] args)
  {Scanner k=new Scanner(System.in);
  int []marks=new int[] {40,30,20,10,50};
  int sum=0;
  for(int c=0;c<marks.length;c++)
  {
   sum=sum+marks[c];
  }
 int avg=sum/marks.length;
 int l=0;
 for(int c=0;c<marks.length;c++)
 {
   if(avg<marks[c])
   {
     
     l++;
   }
 }
 System.out.println(l+" Students got more than average");
 System.out.println("They received the following marks");
 for(int c=0;c<marks.length;c++)
 {
 if (avg<marks[c])
 System.out.println(marks[c]);
 }
 
 
}
}