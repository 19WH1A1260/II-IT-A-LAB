import java.util.*;
class Even implements Runnable 
{
public int n;
public Even(int n) 
{
this.n = n;
}
public void run() 
{
System.out.println("New Thread "+ n +" is even and Square of " + n + " is: " + n * n);
}
}
class Odd implements Runnable
{
public int n;
public Odd(int n)
{
this.n = n;
}
public void run()
{
System.out.println("New Thread "+ n +" is ODD and Cube of " + n + " is: " + n * n * n);
}
}
class A extends Thread 
{
public void run() 
{
int a = 0;
Random r = new Random();
try 
{
for (int i = 0; i< 5; i++)        
{
a = r.nextInt(100);
System.out.println("Main Thread and Generated Number is " + a);
if(a % 2 == 0)
{
Thread t1 = new Thread(new Even(a));
t1.start();
} 
else 
{
Thread t2 = new Thread(new Odd(a));
t2.start();
}
Thread.sleep(1000);
System.out.println(" ");
}
}
catch (Exception e)
{
System.out.println(e.getMessage());
}
}
}
public class MultiThreading
{
public static void main(String[] args) 
{
A obj = new A();
obj.start();
}
}
