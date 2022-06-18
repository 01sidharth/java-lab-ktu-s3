import java.util.Scanner;
public class Largestelement
{  
    public static void main(String args[])
    { int temp=0,r=0;
      int a[]=new int[10];
     Scanner sc =new Scanner (System.in);
     System.out.println("Enter the number of elements in the array");
     int n=sc.nextInt();
     System.out.println("Enter the elements of the array");
for(int i=0;i<n;i++)
{
 a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(a[i]>=temp)
{   temp=a[i];
    r=i+1;
}
else
   continue;
}
System.out.println("Largest element is\t"+temp+" in position\t"+r);
}
}
       
     