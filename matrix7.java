import java.util.*;
class matrix7
{
  public static void main(String args[])
 {
   Scanner sc=new Scanner (System.in);
   int [][] a={
                {1,2,3}, 
                {4,5,6},
                {7,8,9}
               };
    int i;
    int j;
   int sum=0;
   System.out.println("Matrix is");
   for(i=0;i<3;i++)
  {
   for( j=0;j<3;j++)
   {
     	System.out.print(a[i][j]+" ");
   }
         System.out.println();
   }
    System.out.println("sum of two elements");
   for(i=0;i<3;i++)
  {
   for( j=0;j<3;j++)
   {
     	sum=a[0][1]+a[1][0];
   }
         System.out.println(sum+"= this is sum of two elements");
   }
   
}
}
    