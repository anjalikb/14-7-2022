import java.util.*;
class clockwise_rotation
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

   System.out.println("enter the no");
   int num=sc.nextInt();
  
   for(j=0;j<num;j++)
   {
    int temp=a[0];
    for(i=0;i<a.length-1;i++)
    {
      a[i]=a[i+1];
    }

    a[a.length-1]=temp;
}
  System.out.println("clockwise rotation is");
  for(i=0;i<a.length;i++)
  {
    System.out.println(a[i]+" ");
  }
}
}