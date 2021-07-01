//leap year
import java.util.*;
public class Leap
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a year: ");
int n = sc.nextInt();
if(n%4==0)
{
System.out.print("Leap year");
}
else
{
System.out.print("Not a leap year");
}
}
}