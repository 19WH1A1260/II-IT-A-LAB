public class MultipleCatch
{
public static void main(String args[])
{
try
{

int a[] = new int[10];
a[10] = 10/0;
}
catch(ArithmeticException e)
{
System.out.println("ArithmeticException occurs");
}
catch(ArrayIndexOutOfBoundsException e)  
{  
System.out.println("ArrayIndexOutOfBounds Exception occurs");  
}    
catch(Exception e)  
{  
System.out.println("Parent Exception occurs");  
}  
}
}           