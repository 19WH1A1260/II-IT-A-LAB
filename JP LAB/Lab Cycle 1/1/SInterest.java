//simple interest
import java.util.*;
class SInterest
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
double interest = (principal * time * rate) / 100;
System.out.println("Simple Interest: " + interest);
}
}