import java.util.Scanner;
import java.lang.Math;



class account 
{
	String name=new String();
	int accno;
	double bal;
	Scanner s=new Scanner(System.in);
		void set()
		{
			System.out.println("Enter customer name");
			name=s.nextLine();
			System.out.println("Enter "+name+"'s account number");
			accno=s.nextInt();
			System.out.println("Enter balance amount ");
			bal=s.nextDouble();
		}
		void display()
		{
			System.out.println("Customer Name:"+name);
			System.out.println("Your account number:"+accno);
			System.out.println("Your Account Balance:"+bal);
		}
	account(){}
}

class savacct extends account
{
	Scanner s=new Scanner(System.in);
	savacct()
	{
		System.out.println("Cheque Facility not available ");
	}
	void deposit()
	{
		int ch;
		double amt;
		System.out.println("Press 1 to deposit "); 
		ch=s.nextInt();
		if(ch==1)
		{
			System.out.println("Enter amount to be deposited ");
			amt=s.nextDouble();
			bal=bal+amt;
		}
		else 
			System.out.println("Invalid Input");
	}
	void in()
	{
		System.out.println("Enter rate of interest ");
		double r=s.nextDouble();
		System.out.println("Enter number of times interest applied per time period");
		int n=s.nextInt();
		System.out.println("Enter number of time periods");
		int t=s.nextInt();
		double x=bal*(1+(r/n));
		double ci=Math.pow(x,n*t);
		System.out.println("Interest amount="+ci+" \nBalance amount without interest is"+bal);
		bal=bal+ci;
		System.out.println("Available balance after updating is"+bal);
	}
	void wd()
	{
		System.out.println("Press 1 to withdraw ammount");
		int ch=s.nextInt();
		if(ch==1)
		{
		System.out.println("Enter the amount to be withdrawn ");
		double wdraw=s.nextDouble();
		bal=bal-wdraw;
		System.out.println("Available Balance:"+bal);}
		else System.out.println("Invalid input");
	}		
}

class curacct extends account
{
	Scanner s=new Scanner(System.in);
	curacct()
	{
		System.out.println("Cheque Facility available ");
	}
	void deposit()
	{
		int ch;
		double amt;
		System.out.println("Press 1 to deposit "); 
		ch=s.nextInt();
		if(ch==1)
		{
			System.out.println("Enter amount to be deposited ");
			amt=s.nextDouble();
			bal=bal+amt;
		}
		else 
			System.out.println("Invalid Input");
	}
void wd()
	{
		System.out.println("Press 1 to withdraw ammount");
		int ch=s.nextInt();
		if(ch==1)
		{
		System.out.println("Enter the amount to be withdrawn ");
		double wdraw=s.nextDouble();
		bal=bal-wdraw;
		System.out.println("Available Balance:"+bal);}
		else System.out.println("Invalid input");
		if(bal<1000)
		{
			System.out.println("You are running out of minimum balance \nAmount of rs 50 has been credited as service charge for having low balance");
			bal=bal-50;
			System.out.println("Your Available Balance:"+bal);	
		}	
	}

}

public class Lab5
{
public static void main(String xx[])
{
	Scanner s=new Scanner(System.in);
	int ch;
	System.out.println("\n\nPress\n1. if your account is savings account \n2. if your account is current account");
	ch=s.nextInt();
	switch(ch)
	{
		case 1:
				savacct s1=new savacct();
				s1.set();
				s1.display();
				s1.deposit();
				s1.in();
				s1.wd();
				break; 
		case 2:
				curacct c1=new curacct();
				c1.set();
				c1.display();
				c1.deposit();
				c1.wd();
				break;  
		default :    System.exit(0);
	}
}
}