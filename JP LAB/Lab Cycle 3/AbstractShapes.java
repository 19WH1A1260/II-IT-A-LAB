import java.util.*;
abstract class Shape 
{
public int a, b;
public abstract void printArea();
}
class Rectangle extends Shape 
{
public void printArea() 
{
    float area;
    area= a * b;
System.out.println("Area of Rectangle is " +area);
}
}
class Triangle extends Shape 
{
public void printArea()
{
    float area;
    area= (a * b) / 2;
System.out.println("Area of Triangle is " + area);
}
}
class Circle extends Shape 
{
public void printArea()
{
    float area;
    area=(22 * a * a) / 7;
System.out.println("Area of Circle is " + area);
}
}
public class AbstractShapes
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the dimensions a, b: ");
int x1 = sc.nextInt();
int y1 = sc.nextInt();
        Rectangle r = new Rectangle();
r.a = x1; 
r.b = y1;
r.printArea();
        Triangle t = new Triangle();
t.a = x1; 
t.b = y1;
t.printArea();
        Circle c = new Circle();
c.a = x1;
c.printArea();
}
}
