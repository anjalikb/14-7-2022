import java.util.*;
class max_no
{
  public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int[] a=new int[10];
   int i,j,k;
   System.out.println("enter the elments in array");
   for(i=0;i<a.length;i++)
   {
      a[i]=sc.nextInt();
   }
   for(i=0;i<a.length;i++)
   {
    for(j=i+1;j<a.length;j++)
     {
        if(a[i]>a[j])
       {
           k=a[j];
           a[j]=a[i];
           a[i]=k;
        }
     }
   }
  
   System.out.println("the sorted array is");
   for(i=0;i<a.length;i++)
   {
     System.out.print(a[i]+" ");
   }
   System.out.print("maximum no in array");
   System.out.println(a[9]);
   
}
}