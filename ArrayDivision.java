import java.util.Scanner;
class ArrayDivision
{
    public static void main(String args[]) throws ArrayIndexOutOfBoundsException
    {
        int s1,s2,r=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        s1 = sc.nextInt();
        System.out.println("Enter the size of second array:");
        s2 = sc.nextInt();
        int[] arr1;
        int[] arr2;
        arr1 = new int[s1];
        arr2 = new int[s2];
        for(int i=0;i<s1;i++)
        {
            System.out.println("Enter data to first array index : "+(i+1));
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<s2;i++)
        {
            System.out.println("Enter data to second array index : "+(i+1));
            arr2[i] = sc.nextInt();
        }
        try
        {
            if(s1>s2)
            {
                for(int i=0;i<s1;i++)
                {
                    r = (arr1[i]/arr2[i]);
                    System.out.println(r);
                }
            }
            else
            {
                for(int i=0;i<s2;i++)
                {
                    r = (arr1[i]/arr2[i]);
                    System.out.println(r);
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index is Out of Bounds"+e);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't divide a number by zero "+e);  
        }
        catch(Exception e)
        {
            System.out.println("Some other Exception"+e);
        }
        finally
        {
            System.out.println("Operation Completed");
        }
    }
}
