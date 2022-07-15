import java.util.*;
class matrix2
{
  public static void main(String args[])
 {
   Scanner sc=new Scanner (System.in);
   int [][] a=new int[3][3];
   int [][] b=new int[3][3];
   int [][] c=new int[3][3];
   System.out.println("enter elements in array");
   for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
    a[i][j]=sc.nextInt();
  }
  
   System.out.println("enter elements in array");
   for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
    b[i][j]=sc.nextInt();
  }

  for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
    c[i][j]=a[i][j]+b[i][j];
  }

 System.out.println(" matrix 1");
   for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
   {
     System.out.print(a[i][j]+" ");
   }
     System.out.println();
   
  }

  System.out.println(" matrix2");
   for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
   {
     System.out.print(b[i][j]+" ");
   }
     System.out.println();
   
  }

  System.out.println("addition of matrix");
   for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
   {
     System.out.print(c[i][j]+" ");
   }
     System.out.println();
   
  }
}
}