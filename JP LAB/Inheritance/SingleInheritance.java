//single inheritance
class Parent
{
void Test()
{
System.out.println("Parent class");
}
}
class Child extends Parent
{
void Demo()
{
System.out.println("Child class");
}
}
class SingleInheritance
{
public static void main(String args[])
{
Child obj = new Child();
obj.Demo();
obj.Test();
}
}
