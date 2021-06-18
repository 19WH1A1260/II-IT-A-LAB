import java.io.*;
import java.util.*;
class ThrowsException
{
public static void validatevote(int age) throws ArithmeticException
{
if(age<18)
{
throw new ArithmeticException("not valid the vote");
}
else
{
System.out.println("Can cast the vote");
}
}
public static void main(String args[])
{
System.out.println("Enter the age");
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
validatevote(age);
System.out.println("rest of the code");
}
}

