import java.util.*;
import java.math.*;
public class Quadratic
{
  public static void main (String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the value of a");
double a=in.nextDouble();
System.out.println("Enter the value of b ");
double b =in.nextDouble();
System.out.println("Enter the value of c");
double c=in.nextDouble();
if(a!=0)
{
double d=b*b-(4*a*c);
if(d>0.0)
{
double r1=(-b+Math.pow(d,0.5)/(2.0*a));
double r2=(-b-Math.pow(d,0.5)/(2.0*a));
System.out.println("The roots are real and distinct");
System.out.println("The roots are  " +r1+ " and "+r2);
}
else if (d==0.0)
{
double r1=-b/(2.0*a);
System.out.println("The roots are real and equal");
System.out.println("The root is "+r1);
}
else
{
System.out.println("The roots are imaginary");
}
}
else
{
System.out.println("Invalid Inputs");
}
}
}

