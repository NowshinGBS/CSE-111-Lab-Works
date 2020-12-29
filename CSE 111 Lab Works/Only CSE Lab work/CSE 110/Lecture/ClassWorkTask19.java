
public class ClassWorkTask19 {
 public static void main(String[] args){
 int [] marks = {10,30,20,50,40};
 int max=marks[0],min=marks[0],sum=0,avg;
 
 int i=0;
 while(i<marks.length)
 {
  if(max<marks[i])
  {
   max=marks[i];
  }
  else if(min>marks[i])
  {
   min=marks[i];
  }
  
  sum=sum+marks[i];
  i++;
 }
 avg=(sum/marks.length);
 
 System.out.println(max);
 System.out.println(min);
 System.out.println(avg);
 

}
}