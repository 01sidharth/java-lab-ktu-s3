import java.util.Random;
class Square extends Thread
/{
 int x;
 Square(int n)
 {
  x=n;
 }

 public void run()
 {
  try
  {
   Thread.currentThread().setName("Square");
   int sqr = x*x;
   System.out.println(Thread.currentThread().getName() + " is running");
   System.out.println("Square of "+x+" = "+sqr);
   Thread.sleep(500);
  }

  catch(InterruptedException e)
  {
   System.out.println("Main thread interrupted");
  }
 
 System.out.println("Square Exiting");
 }
}


class Cube extends Thread
{
 int x;
 Cube(int n)
 {
  x=n;
 }

 public void run()
 {
  try
  {
   Thread.currentThread().setName("Cube");
   int cub = x*x*x;
   System.out.println(Thread.currentThread().getName() + " is running");
   System.out.println("Cube of "+x+" = "+cub);
   Thread.sleep(500);
  }
  catch(InterruptedException e)
  {
   System.out.println("Main thread interrupted");
  }
  System.out.println("Cube Exiting");
 }
}

class Num extends Thread
{
 public void run()
 {
   Thread.currentThread().setName("Random");
   System.out.println(Thread.currentThread().getName() + " is running");
   Random r = new Random();

   for(int i=0; i<5; i++)
   {
    int n = r.nextInt(50);
    System.out.println("Random number generated : "+n);

    if(n%2==0)
    {
     Square s = new Square(n);  
     s.start();
     try
     {
      s.join();   
     }
     catch(InterruptedException e)
     {
      System.out.println("Main thread interrupted");
     }
    }

    else
    {
     Cube c = new Cube(n);  
     c.start();
     try
     {
      c.join();   
     }
     catch(InterruptedException e)
     {
      System.out.println("Main thread interrupted");
     }
    }
   }
  }
}

public class MultiThreadNumbers
{
 public static void main(String[] args)
 {
  Num n = new Num();
  n.start();
  try
  {
   n.join();
  }
  catch(InterruptedException e)
  {
   System.out.println("Main thread interrupted");
  }
 }
}