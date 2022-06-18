abstract class Shape
{
  abstract void numberofSides();
}
class Rectangle extends Shape
{
void numberofSides()
{
System.out.println("Number of sides of Rectangle = 4");
}
}
class Triangle extends Shape
{
void numberofSides()
{
System.out.println("Number of sides of Triangle = 3");
}
}
class Hexagon extends Shape
{
void numberofSides()
{
System.out.println("Number of sides of Hexagon = 6");
}
}
class Shapes1
{
public static void main(String[] args)
{
Rectangle r = new Rectangle();
Triangle t = new Triangle();
Hexagon h = new Hexagon();

r.numberofSides();
t.numberofSides();
h.numberofSides();
}
}