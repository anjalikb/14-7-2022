import java.util.*;
class matrix5
{
  public static void main(String args[])
 {
   Scanner sc=new Scanner (System.in);
   int [][] a=new int[3][3];
   System.out.println("enter the elements in array");
  for(int i=0;i<3;i++)
  {
  for(int j=0;j<3;j++)
   a[i][j]=sc.nextInt();
  }
   System.out.println("Original matrix");
   for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
  System.out.print(a[i][j]+" ");

  System.out.println();
  }

    System.out.println("Indix Of Matrix");
   for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
  System.out.print("["+i+"]"+"["+j+"]"+a[i][j]+" ");

  System.out.println();
  }
 }
}