import java.util.Scanner;
class InputScanner
{
Scanner s;
InputScanner(){s= new Scanner(System.in);}
}
abstract class shape extends InputScanner
{
double a;
double b;
abstract void getInput();
abstract void displayArea();
}
class Rectangle extends shape
  {
void getInput()
{
System.out.println("Enter dimensions of rectangle");
a=s.nextDouble();
b=s.nextDouble();
}
void displayArea()
{
System.out.println("Area of Rectangle="+(a*b));
  }
}
class Triangle extends shape
{
   void getInput()
{
System.out.println("Enter dimension of triangle=");
a=s.nextDouble();
b=s.nextDouble();
}
void displayArea()
{
System.out.println("Area of triangle="+(a*b*0.5));
}
}
class Circle extends shape
{
void getInput()
{
System.out.println("Enter dimesions of circle(radius):");
a=s.nextDouble();
}
void displayArea(){
System.out.println("Area of circle="+(3.14*a*a));
}
}
class Main
{
public static void main(String args[])
{
Rectangle r=new Rectangle();
Triangle t=new Triangle();
Circle c=new Circle();
r.getInput();
t.getInput();
c.getInput();
r.displayArea();
t.displayArea();
c.displayArea();
}
}

