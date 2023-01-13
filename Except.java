import java.util.Scanner;
class fatherAgeException extends Exception 
{
 public String toString(){
  return("Father's age is less than 0");
 }
}
class sonAgeException extends Exception{
 int a;
 sonAgeException(int age){
  a=age;
}
public String toString(){
  if(a<0)
   return ("Son's age is less than 0");
else
  return ("Son's age is more than Father's age");
}
}
class Father{
int age;
Scanner in=new Scanner(System.in);
Father(){
System.out.print("Enter the father's age");
age=in.nextInt();
}
void ex1() throws fatherAgeException
{
if(age<0)
throw new fatherAgeException();
}
}
class Son extends Father{
int age;
Son(){
System.out.println("Enter the age of son:");
age=in.nextInt();
}
void ex2() throws sonAgeException{
if(age<0||age>super.age){
throw new sonAgeException(age);
}
}
}
class Except{
public static void main(String[]args){
Son s=new Son();
try{
s.ex1();
}
catch(fatherAgeException e){
System.out.println(e);
}
try{
s.ex2();
}
catch(sonAgeException e){
System.out.println(e);
}
}
}

