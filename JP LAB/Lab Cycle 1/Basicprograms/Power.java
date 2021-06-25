//power of a number
import java.util.*;
class Power
{
public static void main(String[] args) 
{
int a, b, pow=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter base value 'a':");
a = sc.nextInt();
System.out.println("Enter exponent value 'b':");
b = sc.nextInt();
while(b!=0)
{
pow = pow * a;
b--;
}
System.out.println("a power b  = " + pow);
}
}

