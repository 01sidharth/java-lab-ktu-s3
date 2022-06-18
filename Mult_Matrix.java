import java.util.Scanner;
public class Mult_Matrix
{
    public static void main(String args[])
    {
        int p,q,m,n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of row in first matrix:");
        p=s.nextInt();
        System.out.print("Enter number of column in first matrix:");
        q=s.nextInt();
        System.out.print("Enter number of row in second matrix:");
        m=s.nextInt();
        System.out.print("Enter number of column in second matrix:");
        n=s.nextInt();
        if(p==n && q==m)
        {
          int a[][] = new int[p][q];
          int b[][] = new int[m][n];
          int c[][] = new int[p][n];

          System.out.println("Enter all the elements of first matrix:");
          for(int i=0;i<p;i++)
             for(int j=0;j<q;j++)
                a[i][j]=s.nextInt();
          System.out.println("Enter the all elements in second matrix:");
          for(int i=0;i<m;i++)
          {
             for(int j=0;j<n;j++)
             {
                b[i][j] = s.nextInt();
             }
          }
          System.out.println("First matrix:");
          for(int i=0;i<p;i++)
          {
             for(int j=0;j<q;j++)
             {
               System.out.print(a[i][j]+" ");
             }
             System.out.println(" ");
           }
          System.out.println("Second matrix:");
          for(int i=0;i<m;i++)
          {
             for(int j=0;j<n;j++)
             {
               System.out.print(b[i][j]+" ");
             }
             System.out.println(" ");
           }
          for(int i=0;i<m;i++)
          {
             for(int j=0;j<q;j++)
             {
               for(int k=0;k<p;k++)
                 c[i][j]=a[i][k]*b[k][j];
                 
              }
           }
          System.out.println("Multipied matrix:");
          for(int i=0;i<m;i++)
          {
             for(int j=0;j<q;j++)
             {
               System.out.print(c[i][j]+" ");
             }
             System.out.println(" ");
           }
       }
       else
       {
           System.out.println("Matrix cannot be multiplied");
       }
          
   }
}

