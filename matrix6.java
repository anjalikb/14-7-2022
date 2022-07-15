import java.util.*;
class matrix6
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
   
   System.out.println("Matrix is");
   for(i=0;i<3;i++)
  {
   for( j=0;j<3;j++)
   {
     	System.out.print(a[i][j]+" ");
   }
         System.out.println();
   } 
   
     System.out.println("enter the element");
     int el=sc.nextInt();
        for(i=0;i<3;i++)
      {
      for( j=0;j<3;j++)
{

        if(a[i][j]==el)
       
        System.out.println(el+"the no is found in matrix");
        else
        System.out.println(el+"the no is not found in matrix");
      
      
 }
}

    
