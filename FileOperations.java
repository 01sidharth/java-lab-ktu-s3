import java.io.*;
import java.util.Scanner;
public class FileOperations
{
    public static void main(String[] args)throws IOException
    {
        String data;
        int ch,i;
        int count = 0;
        char c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data :");
        data=sc.nextLine();
       
        FileWriter fw=null;
        FileReader fr=null;
        try
        {
            fw=new FileWriter("Input.txt");
            for(i=0;i<data.length();i++)
                fw.write(data.charAt(i));
           System.out.println("Writing successful!");
        }
        catch(IOException e)
        {
            System.out.println("Error when writing the program!"+e);
        }
        finally
        {
            fw.close();
        }
       
          System.out.print("Enter character to find count: ");
        c = sc.next().charAt(0);

        try {
            fr = new FileReader("input.txt");
            fw = new FileWriter("output.txt");

            System.out.println("\nCopying from input.txt to output.txt!\n");
            while ((ch = fr.read()) != -1) {
                fw.write((char)ch);

                if ((char)ch == c)
                    count++;
            }

            fw.write("\nOccurence of \'" + c + "\': " + (int)count);
        }
        catch (FileNotFoundException fe) {
            System.out.println("File not found!" + fe);
        }
        finally {
            fr.close();
            fw.close();
        }

        try {
            fr = new FileReader("output.txt");

            System.out.println("Printing output.txt :-");
            while ((ch = fr.read()) != -1)
                System.out.print((char)ch);
            
            System.out.println("\n");
        }
        catch (FileNotFoundException fe) {
            System.out.println("File not found!" + fe);
        }
        finally {
            fr.close();
        }
    }
}