//hierarchial inheritance
class Parent
{
void test()
{
System.out.println("Parent class");
}
}
class Child1 extends Parent
{
void demo()
{
System.out.println("Child1 class");
}
}
class Child2 extends Parent
{
void multi()
{
System.out.println("Child2 class");
}
}
class HierarchialInheritance
{
public static void main(String args[])
{
Child2 obj = new Child2();
obj.multi();
obj.test();
}
}