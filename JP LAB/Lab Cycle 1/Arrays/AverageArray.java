import java.util.*;
class AverageArray
{
public static void main(String[] args)
{
int n, i;
double avg, sum=0;
Scanner sc =new Scanner(System.in);
System.out.print("Enter the Size of array: ");
n = sc.nextInt();
int a[]=new int[n];
System.out.print("Enter elements into array: ");
for(i=0;i<n;i++)
{
a[i] = sc.nextInt();
}
for(i=0;i<n;i++)
{
sum = sum +a[i];
}
avg = sum/n;
System.out.print("Average of Array elements : "+avg);
}
}