//check whether input character is vowel or consonant
import java.util.*;
public class VowCons
{
public static void main(String args[])
{
System.out.println("Enter a character");
Scanner sc = new Scanner(System.in);
char ch = sc.next().charAt(0);
if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
{
System.out.println(ch + " is vowel");
}
else
{
System.out.println(ch + " is consonant");
}
}
}
