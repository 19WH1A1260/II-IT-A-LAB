class StringBufferDemo
{
public static void main(String args[])
{
StringBuffer s = new StringBuffer("harry potter");
int a = s.length();			// length()
System.out.println(a);
int b = s.capacity();			//capacity()
System.out.println(b);
s.append(" is from Gryffindor");	//append()
System.out.println(s);
s.insert(16, "not ");			//insert()
System.out.println(s);
s.delete(16, 20);			//delete()
System.out.println(s);
s.deleteCharAt(0);			//deletecharAt()
System.out.println(s);
s.reverse();				//reverse()
System.out.println(s);
s.reverse();
s.replace(0,4,"hello!");		//replace()
System.out.println(s);
char ch = s.charAt(9);			//charAt()
System.out.println(ch);
int c = s.indexOf("i");			//indexOf()
System.out.println(c);
int d = s.lastIndexOf("i");		//lastIndexOf()
System.out.println(d);
System.out.println(s.substring(2,5));	//substring()
}
}
