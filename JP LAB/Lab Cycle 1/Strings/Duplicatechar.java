//Find duplicate characters in a string
public class Duplicatechar
{
public static void main(String args[])
{
String str = "Harry potter";
char a[] = str.toCharArray();
for(int i=0; i<str.length();i++)
{
for(int j=1;j<i;j++)
{
if(a[i] == a[j])
{
System.out.println("Duplicate Character is " +a[j]);
}
}
}
}
}
