import java.util.*;
class Tokenizer 
{
   public static void main(String args[]) 
    {
        int num;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers with one space gap:");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        System.out.println("Th number are:");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            num = Integer.parseInt(temp);
            System.out.println(num);
            sum = sum + num;
        }
        System.out.println("sum is: " + sum);
        sc.close();
    }
}
