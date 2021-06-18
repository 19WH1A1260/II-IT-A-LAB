class StringMethods
{
public static void main(String args[])
{
String str1  = "what";
String str2 = "is the time?";
String str = "harry";
String str3 = "HARRY";
str1 = str1.concat(" is the time?");				//concat()
System.out.println(str1);
int length = str2.length();					//length()
System.out.println("length of the str: " +length);
char ch = str2.charAt(5);					//charAt()
System.out.println("character at 5th index is: "+ch);
int n = str.compareTo("harry");					//compareTo()
System.out.println("compareTo: " +n);
boolean x = str.equals(str3);					//equals()
System.out.println("str = str3? " +x);
boolean y = str.equalsIgnoreCase(str3);				//equalsIgnoreCase()
System.out.println("str = str3? with the Ignorecase? " +y);
boolean a = str2.startsWith("the", 3);				//startsWith()
System.out.println(a);
boolean b = str2.endsWith("time?");				//endsWith()
System.out.println(b);
int c = str1.indexOf("is");					//indexOf()
System.out.println(c);
int d = str1.lastIndexOf("the");				//lastIndexOf()
System.out.println(d);				
String s = str.substring(2,4);					//substring()
System.out.println(s);
str3 = str3.toLowerCase();					//toLowerCase()
System.out.println(str3);
str = str.toUpperCase();					//toUpperCase()
System.out.println(str);
String str4 = "    lets get it    ";
str4 = str4.trim();						//trim()
System.out.println(str4);
String m[] = str.split("");
for(String i:m)
{
System.out.println(i);						//split()
}
str3 = str3.replace('h', 'g');					//replace()
System.out.println(str3);





}
}