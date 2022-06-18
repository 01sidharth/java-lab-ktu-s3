import java.util.Scanner;
public class Frequency1
 {
   public static void main(String args[])
   {
     int flag=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a text");
     String str=sc.nextLine();
     System.out.println("Enter the characterto be searched");
     char ch=sc.next().charAt(0);
     for (int i=0;i<str.length();i++)
     {
       if(str.charAt(i)==ch)
       {
         System.out.println("The character "+ch+" is found at the position"+(i+1));
         flag=flag+1;
       }
     }
     if (flag==0)
     System.out.println("No characterfound");
     else
     System.out.println ("The frequecy count of "+ch+" is " +flag);
   }
 }
