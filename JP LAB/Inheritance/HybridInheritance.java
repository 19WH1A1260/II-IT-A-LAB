//Hybrid Inheritance
class C
{
public void test()
{
System.out.println("C");
}
}

class A extends C
{
public void demo()
{
System.out.println("A");
}
}

class B extends C
{
public void display()
{
System.out.println("B");
}
}
class D extends A
{
public void disp()
{
System.out.println("D");
}
}
class HybridInheritance
{
public static void main(String args[])
{
D obj = new D();
obj.disp();
obj.demo();
obj.test();
}
}