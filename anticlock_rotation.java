import java.util.*;
class anticlock_rotation
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
    int temp=a[a.length-1];
    for(i=a.length-1;i>0;i--)
    {
      a[i]=a[i-1];
    }

    a[0]=temp;
}
  System.out.println("anticlockwise rotation is");
  for(i=0;i<a.length;i++)
  {
    System.out.println(a[i]+" ");
  }
}
}