import java .util.Scanner;
class Bms extends Thread{
synchronized public void run(){
try{
int i =0;
while(i<5){
sleep(2000);
System.out.println("BMS college of engineering");
i++;
}
}catch(Exception e){
}
}
}
class Cse extends Thread{
synchronized public void run(){
try{
int i=0;
while(i<5)
{
sleep(10000);
System.out.println("Computer science engineering");
i++;
}
}catch(Exception e){
}
}
}
class Main1{
public static void main(String args[]){
Bms t1=new Bms();
Cse t2=new Cse();
t1.start();
t2.start();
}
}
