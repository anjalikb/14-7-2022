import java.util.*;
class delete
{
  public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int[] a=new int[10];
   int i,j;
   System.out.println("enter the elments in array");
   for(i=0;i<a.length;i++)
   {
      a[i]=sc.nextInt();
   }
  System.out.println("print unsorted array");
   for(i=0;i<a.length;i++)
  {
   System.out.print(a[i]+" ");
  }

   System.out.println("enter the elemnt you have deleted in array");
   int el=sc.nextInt();
  
   for(i=0;i<a.length;i++)
   {
       if(a[i]==el)
    {
     int p=i;
     for(i=p;i<a.length-1;i++)
      a[i]=a[i+1];
    }
  }
  System.out.println("elements after deleting in array");
  for(i=0;i<a.length-1;i++)
  System.out.print(a[i]+" ");
 }
}
      
      