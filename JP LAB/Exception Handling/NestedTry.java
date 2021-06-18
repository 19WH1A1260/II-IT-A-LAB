public class NestedTry
{
public static void main(String args[])
{
try
{
try
{
int a = 30/0;
}
catch(ArithmeticException e)
{
System.out.println(e);
}
try
{
int b[] = new int[10];
b[10] = 40;
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
System.out.println("other statement");
}
catch(Exception e)
{
System.out.println("parent class Exception");
}
System.out.println("normal flow");
}
}

