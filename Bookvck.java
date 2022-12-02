import java.util.*;
import java.lang.*;
class Book
{
  String name,author; int price,num_pages;
  void getval()
{
 Scanner sc=new Scanner(System.in);
  System.out.println("Enter the book name ");
  name=sc.next();
  System.out.println("Enter author name");
  author=sc.next();
  System.out.println("Enter price");
  price=sc.nextInt();
  System.out.println("Enter the number of pages");
  num_pages=sc.nextInt();
}
public String toString()
 {
  return name+""+author+""+price+""+num_pages+"";
}
void display(Book o)
{
System.out.println(o);
}
}
class Bookvck
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the no of book objects");
int n=in.nextInt();
Book[] ob=new Book[n];
for(int i=0;i<n;i++)
ob[i]=new Book();
for(int i=0;i<n;i++)
{ ob[i].getval();}
for(int i=0;i<n;i++)
{ob[i].display(ob[i]);}
}
} 

