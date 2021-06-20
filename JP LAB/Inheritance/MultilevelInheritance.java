//Multilevel inheritance
class Parent
{
void test()
{
System.out.println("Parent class");
}
}
class Child extends Parent
{
void demo()
{
System.out.println("Child class");
}
}
class ChildChild extends Child
{
void multi()
{
System.out.println("ChildChild class");
}
}
class MultilevelInheritance
{
public static void main(String args[])
{
ChildChild obj = new ChildChild();
obj.multi();
obj.demo();
obj.test();
}
}