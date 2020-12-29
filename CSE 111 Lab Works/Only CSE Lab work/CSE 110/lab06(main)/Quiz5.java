 public class Quiz5
 {  
   public static void main(String args[])
   {
     String test = "";
     int i = 0, j = 0, k = 15;
     while (i < 5){
      test = "-->";
       j = --k;
       while (j > 10 ){
         test = test + i + j;
         System.out.println(test);
         j--;
       }
       i++;
     }
   }
 }
