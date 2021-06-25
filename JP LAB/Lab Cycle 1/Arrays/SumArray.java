import java.util.*;
class SumArray
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n, i, sum = 0;
System.out.println("enter the size of the array n:");
n = sc.nextInt();
int a[] = new int[n];
System.out.println("enter the elements of the array");
for(i=0;i<n;i++)
{
a[i] = sc.nextInt();
}
for(i=0;i<n;i++)
{
sum += a[i];
}
System.out.println("sum of elements in the array: " +sum);
}
}




