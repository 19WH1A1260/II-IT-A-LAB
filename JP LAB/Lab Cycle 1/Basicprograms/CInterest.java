//compound interest
import java.util.*;
class CInterest
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter principal amount: ");
double principal = sc.nextDouble();
System.out.print("Enter rate: ");
double rate = sc.nextDouble();
System.out.print("Enter time: ");
double time = sc.nextDouble();
System.out.print("Enter number of times interest is compounded n: ");
int n = sc.nextInt();
double interest = principal * (Math.pow((1 + rate/100), (time * n))) - principal;
System.out.println("Compound Interest: " + interest);
}
}
