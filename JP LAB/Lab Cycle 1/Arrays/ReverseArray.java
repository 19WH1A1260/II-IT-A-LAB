import java.util.*;
class ReverseArray
{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
System.out.print("Enter no of elements in array n: ");
int n= sc.nextInt();
int a[]=new int[n];
System.out.print("Enternelements into array: ");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.print("Reverse of Array: ");
for(int i = n-1;i>=0;i--)
{
System.out.print(a[i]+" ");
}
}
}
