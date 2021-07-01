//Convert char to string and string to char
public class CharStringConversions
{
public static void main(String args[])
{
char[] ch={'T', 'o', 'm', 'h', 'i', 'd', 'd', 'l', 'e', 's', 't', 'o', 'n'};
String str=new String(ch);
System.out.println("string: "+str);
String s = "Harry potter";
for(int i=0; i<s.length();i++)
{
char c = s.charAt(i);
System.out.println("Character at "+i+" Position: "+c);
}
}
}
