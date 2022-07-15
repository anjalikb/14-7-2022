import java.util.*;
class avg_small_large
{
public static void main(String args[])
 {
   int[] a={7,5,2,15,6,12,11};
   int max=a[0];
   int min=a[0];
   int sum=a[0];

   for(int i=0;i<a.length;i++)
   {
        sum=sum+a[i];
        if(a[i]>max)
         max=a[i];
        else if(a[i]<min)
          min=a[i];
    } 
       
   
  System.out.println("this is minimun no"+min);
  System.out.println("this is maximum no"+max);
  float avg=(sum-min-max)/(a.length-2);
  System.out.println("This is avg of excepted no = "+avg);
}
}


